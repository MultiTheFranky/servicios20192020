package es.unican.ss.cliente;

import java.io.InputStream;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import es.unican.ss.datosJornada.Gol;
import es.unican.ss.datosJornada.JornadaLiga;
import es.unican.ss.datosJornada.Partido;
import es.unican.ss.datosJornada.Tarjeta;
import es.unican.ss.liga.Equipo;
import es.unican.ss.liga.Jugador;


public class Cliente {
	public static void main(String[] args) {

		JAXBContext jaxbctx;
		JornadaLiga jornada = null;
		try {
			jaxbctx = JAXBContext.newInstance(JornadaLiga.class);
			InputStream jornada37 = Cliente.class.getClassLoader().getResourceAsStream("jornada37.xml");
			Unmarshaller unmarshaller = jaxbctx.createUnmarshaller();
			jornada = (JornadaLiga) unmarshaller.unmarshal(jornada37);
		} catch (JAXBException e) {
			e.printStackTrace();
		}

		int golesLocal, golesVisitante;
		Equipo equipoLocal = null, equipoVisitante = null;

		for (Partido p : jornada.getPartidos()) {
			golesLocal = p.getEquipoLocal().getNumeroGoles();
			golesVisitante = p.getEquipoVisitante().getNumeroGoles();
			
			//Cliente equipo local
			Client clienteLocal = ClientBuilder.newClient();
			WebTarget bL = clienteLocal.target("http://localhost:8080/P05-0.0.1-SNAPSHOT/");
			WebTarget rL = bL.path("liga/" + p.getEquipoLocal().getNombre());
			Invocation.Builder invocationBuilderLocal = rL.request(MediaType.APPLICATION_XML);
			invocationBuilderLocal.accept(MediaType.APPLICATION_XML);
			Response responseLocal = invocationBuilderLocal.get();

			switch (responseLocal.getStatus()) {
			case 200:
				equipoLocal = responseLocal.readEntity(Equipo.class);
				System.out.println("Operación correcta");
				break;
			case 404:
				System.out.println("Error 404. Equipo no existe");
				break;
			default:
				break;
			}
			
			//Cliente equipo visitante
			Client clienteVisitante = ClientBuilder.newClient();
			WebTarget bV = clienteVisitante.target("http://localhost:8080/P05-0.0.1-SNAPSHOT/");
			WebTarget rV = bV.path("liga/" + p.getEquipoVisitante().getNombre());
			Invocation.Builder invocationBuilderVisitante = rV.request(MediaType.APPLICATION_XML);
			invocationBuilderVisitante.accept(MediaType.APPLICATION_XML);
			Response responseVisitante = invocationBuilderVisitante.get();

			switch (responseVisitante.getStatus()) {
			case 200:
				equipoVisitante = responseVisitante.readEntity(Equipo.class);
				System.out.println("Operación correcta");
				break;
			case 404:
				System.out.println("Error 404. Equipo no existe");
				break;
			default:
				break;
			}

			//Tarjetas equipo local
			for (Tarjeta t : p.getEquipoLocal().getTarjetas()) {
				for (Jugador j : equipoLocal.getJugadores()) {
					if (j.getDorsal().equals(t.getDorsal())) {
						if (t.getTarjeta().equals("Amarilla")) {
							j.settAmarillas(j.gettAmarillas() + 1);
						} else if (t.getTarjeta().equals("Roja")) {
							j.settRojas(j.gettRojas() + 1);
						}
					}
				}
			}
			//Tarjetas equipo visitante
			for (Tarjeta t : p.getEquipoVisitante().getTarjetas()) {
				for (Jugador j : equipoVisitante.getJugadores()) {
					if (j.getDorsal().equals(t.getDorsal())) {
						if (t.getTarjeta().equals("Amarilla")) {
							j.settAmarillas(j.gettAmarillas() + 1);
						} else if (t.getTarjeta().equals("Roja")) {
							j.settRojas(j.gettRojas() + 1);
						}
					}
				}
			}
			//Goles equipo local
			for (Gol g : p.getEquipoLocal().getGoles()) {
				for (Jugador j : equipoLocal.getJugadores()) {
					if (j.getDorsal().equals(g.getDorsal())) {
						j.setGoles(j.getGoles() + 1);
					}
				}
			}
			//Goles equipo visitante
			for (Gol g : p.getEquipoVisitante().getGoles()) {
				for (Jugador j : equipoVisitante.getJugadores()) {
					if (j.getDorsal().equals(g.getDorsal())) {
						j.setGoles(j.getGoles() + 1);
					}
				}
			}
			//Clasificacion de la liga
			equipoLocal.setPartidosJugados(equipoLocal.getPartidosJugados() + 1);
			equipoVisitante.setPartidosJugados(equipoVisitante.getPartidosJugados() + 1);

			if (golesLocal > golesVisitante) {
				equipoLocal.setPartidosGanados(equipoLocal.getPartidosGanados() + 1);
				equipoLocal.setPuntos(equipoLocal.getPuntos() + 3);
				equipoVisitante.setPartidosPerdidos(equipoVisitante.getPartidosPerdidos() + 1);
			} else if (golesLocal < golesVisitante) {
				equipoVisitante.setPartidosGanados(equipoVisitante.getPartidosGanados() + 1);
				equipoVisitante.setPuntos(equipoVisitante.getPuntos() + 3);
				equipoLocal.setPartidosPerdidos(equipoLocal.getPartidosPerdidos() + 1);
			} else if (golesLocal == golesVisitante) {
				equipoLocal.setPuntos(equipoLocal.getPuntos() + 1);
				equipoVisitante.setPuntos(equipoVisitante.getPuntos() + 1);
			}

			//Guardamos el equipo local
			Client clienteLocalG = ClientBuilder.newClient();
			WebTarget bLG = clienteLocalG.target("http://localhost8080/P05-0.0.1-SNAPSHOT/");
			WebTarget rLG = bLG.path("liga/" + p.getEquipoLocal().getNombre());
			Invocation.Builder invocationBuilderLocalG = rLG.request();
			Response responseLocalG = invocationBuilderLocalG.put(Entity.xml(equipoLocal));
			switch (responseLocalG.getStatus()) {
			case 200:
				System.out.println("Operacion correcta");
				break;
			case 404:
				System.out.println("Error 404. Equipo no existe");
				break;
			default:
				break;
			}

			//Guardamos equipo visitante
			Client clienteVisitanteG = ClientBuilder.newClient();
			WebTarget bVG = clienteVisitanteG.target("http://localhost8080/P05-0.0.1-SNAPSHOT/");
			WebTarget rVG = bVG.path("liga/" + p.getEquipoVisitante().getNombre());
			Invocation.Builder invocationBuilderVisitanteG = rVG.request();
			Response responseVisitanteG = invocationBuilderVisitanteG.put(Entity.xml(equipoVisitante));
			switch (responseVisitanteG.getStatus()) {
			case 200:
				System.out.println("Operacion correcta");
				break;
			case 404:
				System.out.println("Error 404. Equipo no existe");
				break;
			default:
				break;
			}

		}
	}
}