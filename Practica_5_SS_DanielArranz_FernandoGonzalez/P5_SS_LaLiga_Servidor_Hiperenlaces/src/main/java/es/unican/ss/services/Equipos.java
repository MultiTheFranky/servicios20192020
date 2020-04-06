package es.unican.ss.services;

import java.net.URI;
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
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import es.unican.ss.daos.ILigaDAO;
import es.unican.ss.daosImpl.LigaDAO;
import es.unican.ss.representations.ClasificacionRepresentation;
import es.unican.ss.representations.EquipoRepresentation;
import es.unican.ss.types.Equipo;
import es.unican.ss.types.Jugador;

@Path("/equipos")
public class Equipos {

	private List<Equipo> equipos;
	private ILigaDAO ligaDAO;

	public Equipos() {

		ligaDAO = new LigaDAO();
		equipos = new LinkedList<Equipo>();

	}

	// Retornando Response

	// Como es la uribase, no ponemos path
	@GET
	@Produces("application/xml, application/json")
	public Response getClasificacionEquipos(@Context UriInfo uriInfo) {

		equipos = ligaDAO.getEquipos();

		Response.ResponseBuilder builder;
		Response response = null;
		ordenaEquiposPorPuntos(equipos);

		ClasificacionRepresentation result = new ClasificacionRepresentation(uriInfo, equipos);
		builder = Response.ok(result);
		response = builder.build();

		return response;
	}

	@Path("/{nombreEquipo}")
	@GET
	@Produces("application/xml, application/json")
	public Response getEquipoPorNombre(@PathParam("nombreEquipo") String nombreEquipo, @Context UriInfo uriInfo) {

		Response.ResponseBuilder builder;
		Response response = null;
		Equipo e = ligaDAO.getEquipo(nombreEquipo);

		if (e == null) {
			builder = Response.status(Response.Status.NOT_FOUND);
		} else {
			EquipoRepresentation result = new EquipoRepresentation(uriInfo, e);
			builder = Response.ok(result);
		}

		response = builder.build();

		return response;
	}

	@Path("/{nombreEquipo}")
	@POST
	@Produces("application/xml, application/json")
	public Response anhadeJugadorAEquipo(@PathParam("nombreEquipo") String nombreEquipo, Jugador jugador,
			@Context UriInfo uriInfo) {

		Response.ResponseBuilder builder;
		Response response = null;
		Equipo equipo = ligaDAO.getEquipo(nombreEquipo);
		// Primero comprobamos si existe alguien con el dorsal a añadir y si NO existe,
		// lo añadimos

		Jugador j = getJugadorPorDorsal(equipo, jugador.getDorsal());

		if (j != null) {
			builder = Response.status(Response.Status.CONFLICT);
		} else {
			equipo.getJugadores().add(jugador);
			ligaDAO.actualizaEquipo(equipo);
			UriBuilder linkBuilder = uriInfo.getAbsolutePathBuilder();
			linkBuilder.path(jugador.getDorsal());
			URI location = linkBuilder.build();
			builder = Response.created(location);
		}

		response = builder.build();

		return response;
	}

	@Path("/{nombreEquipo}/{dorsal}")
	@DELETE
	@Produces("application/xml, application/json")
	public Response eliminaJugadorEquipo(@PathParam("nombreEquipo") String nombreEquipo,
			@PathParam("dorsal") String dorsal) {

		Response.ResponseBuilder builder;
		Response response = null;
		Equipo equipo = ligaDAO.getEquipo(nombreEquipo);
		// Primero comprobamos si existe alguien con el dorsal a añadir y si existe,
		// lo eliminamos

		Jugador j = getJugadorPorDorsal(equipo, dorsal);

		if (j == null) {
			builder = Response.status(Response.Status.NOT_FOUND);
		} else {
			equipo.getJugadores().remove(j);
			ligaDAO.actualizaEquipo(equipo);
			builder = Response.ok(equipo);
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

			// Actualizamos en la DAO
			ligaDAO.actualizaEquipo(equipo);

			// TODO: También hay que cambiarlo aquí?
			builder = Response.ok(equipo);

		}

		response = builder.build();

		return response;

	}

	@Path("/{nombreEquipo}/{dorsal}")
	@PUT
	@Produces("application/xml, application/json")
	public Response actualizaDatosJugador(@PathParam("nombreEquipo") String nombreEquipo,
			@PathParam("dorsal") String dorsal, Jugador jugadorActualizado) {

		Response.ResponseBuilder builder;
		Response response = null;
		Jugador jugador = null;
		Jugador jugadorAntiguo = null;
		Equipo equipo = ligaDAO.getEquipo(nombreEquipo);

		if (equipo == null) {
			builder = Response.status(Response.Status.NOT_FOUND);
		} else {
			jugador = getJugadorPorDorsal(equipo, dorsal);
			jugadorAntiguo = jugador;
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
			jugador.setGoles(jugadorActualizado.getGoles());
			jugador.setTarjetasAmarillas(jugadorActualizado.getTarjetasAmarillas());
			jugador.setTarjetasRojas(jugadorActualizado.getTarjetasRojas());

			equipo.getJugadores().remove(jugadorAntiguo);
			equipo.getJugadores().add(jugador);

			// Actualizamos en la DAO
			ligaDAO.actualizaEquipo(equipo);

//			TODO: También hay que cambiarlo aquí?
			builder = Response.ok(equipo);

		}

		response = builder.build();

		return response;

	}

	private Jugador getJugadorPorDorsal(Equipo equipo, String dorsal) {

		for (Jugador j : equipo.getJugadores()) {
			if (j.getDorsal().equals(dorsal)) {
				return j;
			}
		}

		return null;
	}

	private void ordenaEquiposPorPuntos(List<Equipo> equipos) {
		Collections.sort(equipos, new Comparator<Equipo>() {
			@Override
			public int compare(Equipo e, Equipo temp) {
				if (e.getPuntos() < temp.getPuntos()) {
					return 1;
				} else {
					// TODO: Golaveraje
					return -1;
				}

			}
		});
	}

}
