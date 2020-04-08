package es.unican.ss.services;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import es.unican.ss.daos.IClasificacionDAO;
import es.unican.ss.daosImpl.ClasificacionDAO;
import es.unican.ss.types.Equipo;
import es.unican.ss.types.Grupo;
import es.unican.ss.types.Jugador;

@Path("/clasificacion")
public class Clasificacion {

	private IClasificacionDAO clasificacionDao;

	public Clasificacion() {
		clasificacionDao = new ClasificacionDAO();
	}
	//Get clasificacion de un grupo
	@Path("/{nombreGrupo}")
	@GET
	@Produces("application/xml, application/json")
	public Response getClasificacionEquipos(@PathParam("nombreGrupo") String nombreGrupo) {

		Grupo grupo = clasificacionDao.getGrupo(nombreGrupo);

		grupo.getEquipos().sort(new Comparator<Equipo>() {
			public int compare(Equipo o1, Equipo o2) {
				return o1.getPuntos() - o2.getPuntos();
			};
		});

		Response.ResponseBuilder builder;
		Response response = null;
		builder = Response.ok(grupo.getEquipos());
		response = builder.build();

		return response;
	}
	// Consultar los datos de un equipo
	@Path("/{nombreGrupo}/{nombreEquipo}")
	@GET
	@Produces("application/xml, application/json")
	public Response getEquipoPorNombre(@PathParam("nombreGrupo") String nombreGrupo,@PathParam("nombreEquipo") String nombreEquipo) {

		Response.ResponseBuilder builder;
		Response response = null;
		Equipo e = clasificacionDao.getEquipo(nombreGrupo,nombreEquipo);

		if (e == null) {
			builder = Response.status(Response.Status.NOT_FOUND);
		} else {
			builder = Response.ok(e);
		}

		response = builder.build();

		return response;
	}
	// Consultar los datos de un jugador
	@Path("/{nombreEquipo}/{dorsal}")
	@GET
	@Produces("application/xml, application/json")
	public Response getJugadorPorDorsal(@PathParam("nombreEquipo") String nombreEquipo,@PathParam("nombreEquipo") String dorsal) {

		Response.ResponseBuilder builder;
		Response response = null;
		Jugador j = clasificacionDao.getJugador(nombreEquipo, Integer.parseInt(dorsal));

		if (j == null) {
			builder = Response.status(Response.Status.NOT_FOUND);
		} else {
			builder = Response.ok(j);
		}

		response = builder.build();

		return response;
	}
	//A�adir jugador a equipo
	@Path("/{nombreEquipo}")
	@POST
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
	@Path("/{nombreEquipo}/{dorsal}")
	@DELETE
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
	@Path("/{nombreGrupo}/{nombreEquipo}")
	@PUT
	@Produces("application/xml, application/json")
	public Response putEquipo(Equipo equipo) {
		Response.ResponseBuilder builder;
		Response response = null;
		Equipo e = clasificacionDao.actualizaEquipo(equipo);
		if (e == null) {
			builder = Response.status(Response.Status.NOT_FOUND);
		} else {
			builder = Response.ok(e);
		}
		response = builder.build();
		return response;
	}


	@GET
	@Path("/{nombreEquipo}/{dorsal}")
	@Produces("application/xml, application/json")
	public Response getJugadorEquipo(@PathParam("nombreEquipo") String nombreEquipo,
			@PathParam("nombreEquipo") String dorsal) {
		Response.ResponseBuilder builder;

		Jugador jug = ligaDAO.getJugador(nombreEquipo, Integer.parseInt(dorsal));

		if (jug == null) {
			builder = Response.status(Response.Status.NOT_FOUND);
			return builder.build();
		}

		builder = Response.ok(jug);
		return builder.build();
	}

	@Path("/{nombreEquipo}")
	@PUT
	@Produces("application/xml, application/json")
	public Response actualizaEquipoJornada(@PathParam("nombreEquipo") String nombreEquipo, Equipo equipoActualizado) {

		Response.ResponseBuilder builder;
		Response response = null;
		Equipo equipo = ligaDAO.getEquipo(nombreEquipo);
		// Primero comprobamos si existe alguien con el dorsal a a�adir y si existe,
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

			// Actualizamos en la DAO
			ligaDAO.actualizaEquipo(equipo);
			builder = Response.ok(equipo);

		}

		response = builder.build();

		return response;

	}
	//Actualizar datos jugador
	@Path("/{nombreEquipo}/{dorsal}")
	@PUT
	@Produces("application/xml, application/json")
	public Response actualizaDatosJugador(@PathParam("nombreEquipo") String nombreEquipo,
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

		// Primero comprobamos si existe alguien con el dorsal a a�adir y si existe,
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
			builder = Response.ok(equipo);
		}

		response = builder.build();

		return response;

	}

	//Consultar ranking de goleadores por grupo pasandole un grupo (global)
	@GET
	@Path("/{nombreGrupo}/ranking")
	@Produces("application/xml,application/json")
	public Response getRankingPorGrupo(@PathParam("nombreGrupo") String nombreGrupo, @Context UriInfo uriInfo) {
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
					return o1.getGoles() - o2.getGoles();
				};
			});
			builder = Response.ok(jugadores);
		}
		return builder.build();
	}


	//Consultar ranking de goleadores por grupo pasandole un equipo
	@GET
	@Path("/{nombreGrupo}/ranking")
	@Produces("application/xml,application/json")
	public Response getRankingPorEquipo(@QueryParam("nombreEquipo") String equipo, @Context UriInfo uriInfo) {
		Response.ResponseBuilder builder;
		List<Jugador> jugadores = null;
		if (clasificacionDao.getEquipo(equipo) == null) {
			builder = Response.status(Response.Status.NOT_FOUND);
		} else {
			jugadores = clasificacionDao.getEquipo(equipo).getJugadores();
			jugadores.sort(new Comparator<Jugador>() {
				public int compare(Jugador o1, Jugador o2) {
					return o1.getGoles() - o2.getGoles();
				};
			});
			builder = Response.ok(jugadores);
		}
		return builder.build();
	}
}