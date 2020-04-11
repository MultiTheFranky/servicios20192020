package es.unican.ss.liga;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import es.unican.ss.persistenceLayer.Equipo;
import es.unican.ss.persistenceLayer.ILigaDAO;
import es.unican.ss.persistenceLayer.Jugador;
import es.unican.ss.persistenceLayer.LigaDAOImpl;

@Path("/liga")
public class LigaSantander {

	private ILigaDAO ligaSantander;
	private List<Equipo> equipos;

	public LigaSantander() {
		ligaSantander = new LigaDAOImpl();
		equipos = new ArrayList<Equipo>();
	}

	@GET
	@Produces("aplication/xml")
	public Response getLiga() {
		System.out.println("GET LIGA");
		Response.ResponseBuilder builder;
		List<Equipo> equipos = ligaSantander.getEquipos();
		Collections.sort(equipos);
		if (equipos.size() != 0) {
			builder = Response.ok(equipos);
		} else {
			builder = Response.status(Response.Status.NOT_FOUND);
		}
		return builder.build();
	}

	@GET
	@Path("/{nombreEquipo}")
	@Produces("aplication/xml")
	public Response getEquipo(@PathParam("nombreEquipo") String nombre, @Context UriInfo uriInfo) {
		Response.ResponseBuilder builder;
		Equipo e = ligaSantander.getEquipo(nombre);
		if (e != null) {
			builder = Response.ok(e);
		} else {
			builder = Response.status(Response.Status.NOT_FOUND);
		}
		return builder.build();
	}

	@PUT
	@Path("/{nombreEquipo}")
	@Produces("aplication/xml")
	public Response putEquipo(@PathParam("nombreEquipo") String nombre, Equipo nuevoEquipo, @Context UriInfo uriInfo) {
		Response.ResponseBuilder builder;
		Equipo equipo = ligaSantander.getEquipo(nombre);
		if (equipo == null) {
			builder = Response.status(Response.Status.NOT_FOUND);
		} else if (!equipo.getNombre().equals(nuevoEquipo.getNombre())) { // Si el equipo no se llama igual
			builder = Response.status(Response.Status.CONFLICT);
		} else {
			equipo.setPuntos(nuevoEquipo.getPuntos());
			equipo.setPartidosJugados(nuevoEquipo.getPartidosJugados());
			equipo.setPartidosGanados(nuevoEquipo.getPartidosGanados());
			equipo.setPartidosPerdidos(nuevoEquipo.getPartidosPerdidos());
			ligaSantander.actualizaEquipo(equipo);
			builder = Response.ok(equipo);
		}
		return builder.build();
	}

	@GET
	@Path("/{nombreEquipo}/{dorsal}")
	@Produces("aplication/xml")
	public Response getJugador(@PathParam("nombreEquipo") String nombre, @PathParam("dorsal") int dorsal,
			@Context UriInfo uriInfo) {
		Response.ResponseBuilder builder;
		Equipo e = ligaSantander.getEquipo(nombre);
		Jugador j = ligaSantander.getJugador(nombre, dorsal);
		if (e == null) {
			builder = Response.status(Response.Status.NOT_FOUND);
		} else if (j == null) {
			builder = Response.status(Response.Status.NOT_FOUND);
		} else {
			builder = Response.ok(j);
		}
		return builder.build();
	}

	@PUT
	@Path("/{nombreEquipo}/{dorsal}")
	@Produces("aplication/xml")
	public Response putJugador(@PathParam("nombreEquipo") String nombre, @PathParam("dorsal") int dorsal,
			Jugador nuevoJugador, @Context UriInfo uriInfo) {
		Response.ResponseBuilder builder;
		Equipo e = ligaSantander.getEquipo(nombre);
		Jugador j = ligaSantander.getJugador(nombre, dorsal);
		if (e == null) {
			builder = Response.status(Response.Status.NOT_FOUND);
		} else if (j == null) {
			e.getJugadores().add(nuevoJugador);
			ligaSantander.actualizaEquipo(e);
			UriBuilder linkBuilder = uriInfo.getAbsolutePathBuilder();
			linkBuilder.path(nuevoJugador.getDorsal());
			URI location = linkBuilder.build();
			builder = Response.created(location);
		} else {
			j.setGoles(nuevoJugador.getGoles());
			j.settRojas(nuevoJugador.gettRojas());
			j.settAmarillas(nuevoJugador.gettAmarillas());
			e.getJugadores().remove(j);
			e.getJugadores().add(j);
			ligaSantander.actualizaEquipo(e);
			builder = Response.ok(e);
		}
		return builder.build();
	}

	@DELETE
	@Path("/{nombreEquipo}/{dorsal}")
	@Produces("aplication/xml")
	public Response deleteJugador(@PathParam("nombreEquipo") String nombre, @PathParam("dorsal") int dorsal,
			@Context UriInfo uriInfo) {
		Response.ResponseBuilder builder;
		Equipo e = ligaSantander.getEquipo(nombre);
		Jugador j = ligaSantander.getJugador(nombre, dorsal);
		if (e == null) {
			builder = Response.status(Response.Status.NOT_FOUND);
		} else if (j == null) {
			builder = Response.status(Response.Status.NOT_FOUND);
		} else {
			e.getJugadores().remove(j);
			ligaSantander.actualizaEquipo(e);
			builder = Response.ok(j);
		}
		return builder.build();
	}

	@GET
	@Path("/clasificacion/id_grupo/ranking")
	@Produces("application/xml,application/json")
	public Response getRankingPorEquipo(@QueryParam("nombreEquipo") String equipo, @Context UriInfo uriInfo) {
		Response.ResponseBuilder builder;
		List<Jugador> jugadores = null;
		if (ligaSantander.getEquipo(equipo) == null) {
			builder = Response.status(Response.Status.NOT_FOUND);
		} else {
			jugadores = ligaSantander.getEquipo(equipo).getJugadores();
			jugadores.sort(new Comparator<Jugador>() {
                public int compare(Jugador o1, Jugador o2) {
                    return o1.getGoles() - o2.getGoles();
                };
            });
			builder = Response.ok(jugadores);
		}
		return builder.build();
	}

	@GET
	@Path("/clasificacion/id_grupo/ranking")
	@Produces("application/xml,application/json")
	public Response getRanking(@PathParam("nombreEquipo") String nombre, @Context UriInfo uriInfo) {
		Response.ResponseBuilder builder;
		List<Jugador> jugadores = null;
		
		
		if (nombre == null) {
			jugadores = ligaSantander.getJugadores();
			Collections.sort(jugadores);
			builder = Response.ok(jugadores);
		} else if (ligaSantander.getEquipo(nombre) == null) {
			builder = Response.status(Response.Status.NOT_FOUND);
		} else {
			jugadores = ligaSantander.getEquipo(nombre).getJugadores();
			Collections.sort(jugadores);
			builder = Response.ok(jugadores);
		}
		return builder.build();
	}

}
