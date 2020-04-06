package es.unican.ss.services;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import es.unican.ss.daos.ILigaDAO;
import es.unican.ss.daosImpl.LigaDAO;
import es.unican.ss.types.Equipo;
import es.unican.ss.types.Jugador;

@Path("/equipos")
public class Goleadores {

	private List<Jugador> goleadores;
	private ILigaDAO ligaDAO;

	public Goleadores() {
		// En un servicio real los usuarios se obtendrían
		// de una BBDD
		goleadores = new LinkedList<Jugador>();
		ligaDAO = new LigaDAO();

		goleadores = ligaDAO.getJugadores();

	}

	// Retornando Response

	// Como es la uribase, no ponemos path
	@GET
	@Produces("application/xml, application/json")
	public Response getGoleadoresOrdenadosPorGolesResponse(@QueryParam("nombreEquipo") String nombreEquipo) {

		Response.ResponseBuilder builder;
		Equipo equipo;
		ListaJugadores jugadoresOrdenadosPorGoles = null;
		Response response = null;

		if (nombreEquipo == null) {
			ordenaJugadoresPorGoles(goleadores);
			jugadoresOrdenadosPorGoles = new ListaJugadores(goleadores);
			builder = Response.ok(jugadoresOrdenadosPorGoles);
		} else {
			// Obtenemos el equipo
			equipo = ligaDAO.getEquipo(nombreEquipo);
			// Si no se ha encontrado, el equipo no existe y se notifica
			if (equipo == null) {
				builder = Response.status(Response.Status.NOT_FOUND);
			} else {
				jugadoresOrdenadosPorGoles = new ListaJugadores(equipo.getJugadores());
				// Ordenar jugsdores
				ordenaJugadoresPorGoles(jugadoresOrdenadosPorGoles.getJugadores());
				builder = Response.ok(jugadoresOrdenadosPorGoles);
			}

		}

		response = builder.build();

		return response;
	}

	private void ordenaJugadoresPorGoles(List<Jugador> jugadores) {
		Collections.sort(jugadores, new Comparator<Jugador>() {
			@Override
			public int compare(Jugador j, Jugador temp) {
				if (j.getGoles() < temp.getGoles()) {
					return 1;
				} else {
					return -1;
				}

			}
		});
	}

	public List<Jugador> getGoleadores() {
		return goleadores;
	}

}
