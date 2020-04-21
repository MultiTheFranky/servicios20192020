package es.unican.ss.services;

import java.net.URI;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import es.unican.ss.daos.IClasificacionDAO;
import es.unican.ss.daosImpl.ClasificacionDAO;
import es.unican.ss.representations.EquipoRepresentation;
import es.unican.ss.representations.GrupoRepresentation;
import es.unican.ss.representations.JugadorRepresentation;
import es.unican.ss.representations.RankingRepresentation;
import es.unican.ss.types.Equipo;
import es.unican.ss.types.Grupo;
import es.unican.ss.types.Jugador;
import es.unican.ss.types.Ranking;

@Path("/")
public class Clasificacion {

	private IClasificacionDAO clasificacionDao;

	public Clasificacion() {
		clasificacionDao = new ClasificacionDAO();
	}
	//Get clasificacion de un grupo
	@GET
	@Path("clasificacion/{nombreGrupo}")
	@Produces("application/xml, application/json")
	public Response getClasificacionEquipos(@PathParam("nombreGrupo") String idGrupo, @Context UriInfo uriInfo) {

		Grupo grupo = clasificacionDao.getGrupo(idGrupo);
		Response response = null;
		if(grupo != null) {
			grupo.getEquipos().sort(new Comparator<Equipo>() {
				public int compare(Equipo o1, Equipo o2) {
					return o2.getPuntos() - o1.getPuntos();
				};
			});
			
			GrupoRepresentation grupoRep = new GrupoRepresentation(uriInfo, grupo);
			Response.ResponseBuilder builder;
			builder = Response.ok(grupoRep);
			response = builder.build();
		}
		return response;
		
	}
	// Consultar los datos de un equipo
	@GET
	@Path("clasificacion/{nombreGrupo}/{nombreEquipo}")
	@Produces("application/xml, application/json")
	public Response getEquipoPorNombre(@Context UriInfo uriInfo,@PathParam("nombreGrupo") String nombreGrupo,@PathParam("nombreEquipo") String nombreEquipo) {

		Response.ResponseBuilder builder;
		Equipo e = clasificacionDao.getEquipo(nombreGrupo,nombreEquipo);

		if (e == null) {
			builder = Response.status(Response.Status.NOT_FOUND);
		} else {
			EquipoRepresentation equipoRep = new EquipoRepresentation(uriInfo,e);
			builder = Response.ok(equipoRep);
		}

		return builder.build();
	}
	// Consultar los datos de un jugador
	@GET
	@Path("clasificacion/{nombreEquipo}/{dorsal}/getJugadorPorDorsal")
	@Produces("application/xml, application/json")
	public Response getJugadorPorDorsal(@Context UriInfo uriInfo,@PathParam("nombreEquipo") String nombreEquipo,@PathParam("dorsal") String dorsal) {

		Response.ResponseBuilder builder;
		Response response = null;
		Jugador j = clasificacionDao.getJugador(nombreEquipo, Integer.parseInt(dorsal));

		if (j == null) {
			builder = Response.status(Response.Status.NOT_FOUND);
		} else {
			builder = Response.ok(new JugadorRepresentation(uriInfo, j));
		}

		response = builder.build();

		return response;
	}
	//Añadir jugador a equipo
	@PUT
	@Path("clasificacion/{nombreEquipo}/{dorsal}/add")
	@Consumes("application/xml, application/json")
	@Produces("application/xml, application/json")
	public Response anhadeJugadorAEquipo(@PathParam("nombreEquipo") String nombreEquipo, Jugador jugador,
			@Context UriInfo uriInfo) {

		Response.ResponseBuilder builder;
		Response response = null;
		Jugador j = clasificacionDao.getJugador(nombreEquipo, jugador.getDorsal());
		if (j != null) {
			builder = Response.status(Response.Status.CONFLICT);
		} else {
			Equipo equipo = clasificacionDao.getEquipo(nombreEquipo);
			equipo.getJugadores().add(jugador);
			clasificacionDao.actualizaEquipo(equipo);
			UriBuilder linkBuilder = uriInfo.getAbsolutePathBuilder();
			linkBuilder.path(String.valueOf(jugador.getDorsal()));
			URI location = linkBuilder.build();
			builder = Response.created(location);
		}
		response = builder.build();
		return response;
	}
	//Eliminar jugador del equipo
	@DELETE
	@Path("clasificacion/{nombreEquipo}/{dorsal}")
	@Produces("application/xml, application/json")
	public Response eliminaJugadorEquipo(@PathParam("nombreEquipo") String nombreEquipo,
			@PathParam("dorsal") String dorsal) {

		Response.ResponseBuilder builder;
		Response response = null;
		Equipo equipo = clasificacionDao.getEquipo(nombreEquipo);

		Jugador j = clasificacionDao.getJugador(nombreEquipo, Integer.parseInt(dorsal));

		if (j == null) {
			builder = Response.status(Response.Status.NOT_FOUND);
		} else {
			equipo.getJugadores().remove(j);
			clasificacionDao.actualizaEquipo(equipo);
			builder = Response.ok(equipo);
		}

		response = builder.build();

		return response;
	}

	//Actualizar un equipo
	@PUT
	@Path("clasificacion/{nombreGrupo}/{nombreEquipo}")
	@Consumes("application/xml, application/json")
	@Produces("application/xml, application/json")
	public Response putEquipo(@Context UriInfo uriInfo,Equipo equipo) {
		Response.ResponseBuilder builder;
		Response response = null;
		Equipo e = clasificacionDao.actualizaEquipo(equipo);
		if (e == null) {
			builder = Response.status(Response.Status.NOT_FOUND);
		} else {
			builder = Response.ok(new EquipoRepresentation(uriInfo,e));
		}
		response = builder.build();
		return response;
	}

	@PUT
	@Path("clasificacion/{nombreGrupo}/{nombreEquipo}/update")
	@Consumes("application/xml, application/json")
	@Produces("application/xml, application/json")
	public Response actualizaEquipoJornada(@Context UriInfo uriInfo,@PathParam("nombreEquipo") String nombreEquipo, Equipo equipoActualizado) {

		Response.ResponseBuilder builder;
		Response response = null;
		Equipo equipo = clasificacionDao.getEquipo(nombreEquipo);
		// Primero comprobamos si existe alguien con el dorsal a añadir y si existe,
		// lo eliminamos

		if (equipo == null) {
			builder = Response.status(Response.Status.NOT_FOUND);
		} else if (!(equipo.getNombre().equals(equipoActualizado.getNombre()))) { // Si el equipo no se llama igual
			builder = Response.status(Response.Status.CONFLICT);
		} else {
			// Actualizamos el equipo (con los valores recibidos) que hemos obtenido a
			// partir del nombre para una mayor seguridad
			equipo.setPuntos(equipoActualizado.getPuntos());
			equipo.setPartidosGanados(equipoActualizado.getPartidosGanados());
			equipo.setPartidosJugados(equipoActualizado.getPartidosJugados());
			equipo.setPartidosPerdidos(equipoActualizado.getPartidosPerdidos());
			
			for (int i = 0; i < equipo.getJugadores().size(); i++) {
				Jugador j = equipo.getJugadores().get(i);
				Jugador newJ = equipoActualizado.getJugadores().get(i);
				//System.out.println("Jugador "+j.getNombre()+" Goles: "+j.getGoles() + " -> "+newJ.getGoles() +" Amarillas: "+j.getTarjetasAmarillas() + " -> "+newJ.getTarjetasAmarillas() +" Rojas: "+j.getTarjetasRojas() + " -> "+newJ.getTarjetasRojas());
				j.setGoles(newJ.getGoles());
				j.setTarjetasAmarillas(newJ.getTarjetasAmarillas());
				j.setTarjetasRojas(newJ.getTarjetasRojas());
			}

			// Actualizamos en la DAO
			clasificacionDao.actualizaEquipo(equipo);
			builder = Response.ok(new EquipoRepresentation(uriInfo,equipo));

		}

		response = builder.build();

		return response;

	}
	//Actualizar datos jugador
	@PUT
	@Path("clasificacion/{nombreEquipo}/actualiza-jugador/{dorsal}")
	@Consumes("application/xml, application/json")
	@Produces("application/xml, application/json")
	public Response actualizaDatosJugador(@Context UriInfo uriInfo,@PathParam("nombreEquipo") String nombreEquipo,
			@PathParam("dorsal") String dorsal, Jugador jugadorActualizado) {

		Response.ResponseBuilder builder;
		Response response = null;
		Jugador jugador = null;
		Equipo equipo = clasificacionDao.getEquipo(nombreEquipo);

		if (equipo == null) {
			builder = Response.status(Response.Status.NOT_FOUND);
		} else {
			jugador = clasificacionDao.getJugador(nombreEquipo, Integer.parseInt(dorsal));
		}

		// Primero comprobamos si existe alguien con el dorsal a añadir y si existe,
		// lo eliminamos

		if (jugador == null) {
			builder = Response.status(Response.Status.NOT_FOUND);
		} else if (!(jugador.getNombre().equals(jugadorActualizado.getNombre()))
				|| !(equipo.getNombre().equals(nombreEquipo))) { // Si el equipo o el jugador no se llama igual
			builder = Response.status(Response.Status.CONFLICT);
		} else {
			// Actualizamos los datos del jugador
			clasificacionDao.actualizaJugador(nombreEquipo, jugadorActualizado);
			clasificacionDao.actualizaEquipo(equipo);
			builder = Response.ok(new EquipoRepresentation(uriInfo,equipo));
		}

		response = builder.build();

		return response;

	}

	//Consultar ranking de goleadores por grupo pasandole un grupo (global)
	@GET
	@Path("clasificacion/{nombreGrupo}/ranking")
	@Produces("application/xml,application/json")
	public Response getRankingPorGrupo(@Context UriInfo uriInfo,@PathParam("nombreGrupo") String nombreGrupo) {
		Response.ResponseBuilder builder;
		List<Jugador> jugadores = new ArrayList<Jugador>();
		Grupo g = clasificacionDao.getGrupo(nombreGrupo);
		if (g == null) {
			builder = Response.status(Response.Status.NOT_FOUND);
		}else {
			for (Equipo e : g.getEquipos()) {
				for (Jugador jugador : e.getJugadores()) {
					jugadores.add(jugador);
				}
			}
			jugadores.sort(new Comparator<Jugador>() {
				public int compare(Jugador o1, Jugador o2) {
					return o2.getGoles() - o1.getGoles();
				};
			});
			Ranking r = new Ranking();
			r.setJugadores(jugadores);
			RankingRepresentation rr = new RankingRepresentation(r, uriInfo, 0);
			for (JugadorRepresentation jugador : rr.getJugadores()) {
				System.out.println(jugador.getNombre());
			}
			builder = Response.ok(rr);
		}
		return builder.build();
	}


	//Consultar ranking de goleadores por grupo pasandole un equipo
	@GET
	@Path("clasificacion/{nombreGrupo}/{nombreEquipo}/ranking/")
	@Produces("application/xml,application/json")
	public Response getRankingPorEquipo(@PathParam("nombreEquipo") String equipo, @Context UriInfo uriInfo) {
		Response.ResponseBuilder builder;
		List<Jugador> jugadores = null;
		if (clasificacionDao.getEquipo(equipo) == null) {
			builder = Response.status(Response.Status.NOT_FOUND);
		} else {
			jugadores = clasificacionDao.getEquipo(equipo).getJugadores();
			jugadores.sort(new Comparator<Jugador>() {
				public int compare(Jugador o1, Jugador o2) {
					return o2.getGoles() - o1.getGoles();
				};
			});
			Ranking r = new Ranking();
			r.setJugadores(jugadores);
			RankingRepresentation rr = new RankingRepresentation(r, uriInfo, 0);
			for (JugadorRepresentation jugador : rr.getJugadores()) {
				System.out.println(jugador.getNombre());
			}
			builder = Response.ok(rr);
		}
		return builder.build();
	}
}
