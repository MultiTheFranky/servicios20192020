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

import es.unican.ss.types.Gol;
import es.unican.ss.types.Jornada;
import es.unican.ss.types.Partido;
import es.unican.ss.types.Tarjeta;
import es.unican.ss.types.TipoTarjeta;
import es.unican.ss.typesservice.Equipo;
import es.unican.ss.typesservice.Jugador;

public class Cliente {

	public static void main(String[] args) {

		JAXBContext jaxbctx;
		Jornada jornada = null;
		try {
			jaxbctx = JAXBContext.newInstance(Jornada.class);
			InputStream xml = Cliente.class.getClassLoader().getResourceAsStream("jornada37.xml");

			Unmarshaller unmarshaller = jaxbctx.createUnmarshaller();
			jornada = (Jornada) unmarshaller.unmarshal(xml);

		} catch (JAXBException e) {
			e.printStackTrace();

		}

		int golesEquipoLocal, golesEquipoVisitante;
		Equipo equipoLocal = null, equipoVisitante = null;
		for (Partido partido : jornada.getPartidos()) {
			golesEquipoLocal = partido.getEquipoLocal().getNumGoles();
			golesEquipoVisitante = partido.getEquipoVisitante().getNumGoles();

			// EQUIPO LOCAL
			Client clientLocal = ClientBuilder.newClient();
			WebTarget baseLocal = clientLocal.target("http://localhost:8080/P5_Servidor-0.0.1-SNAPSHOT/");
			WebTarget resourceLocal = baseLocal.path("liga/" + partido.getEquipoLocal().getNombreEquipo());
			Invocation.Builder invocationBuilderLocal = resourceLocal.request(MediaType.APPLICATION_XML);
			invocationBuilderLocal.accept(MediaType.APPLICATION_XML);
			Response responseLocal = invocationBuilderLocal.get();

			switch (responseLocal.getStatus()) {
			case 200:
				System.out.println("200: EQUIPO LOCAL");
				equipoLocal = responseLocal.readEntity(Equipo.class);
				break;

			case 404:
				System.out.println("ERROR 404: Equipo Local not Found");
				break;

			default:
				System.out.println("ERROR Unknown");
				break;
			}

			// EQUIPO VISITANTE
			Client clientVisitante = ClientBuilder.newClient();
			WebTarget baseVisitante = clientVisitante
					.target("http://localhost:8080/P5_Servidor-0.0.1-SNAPSHOT/");
			WebTarget resourceVisitante = baseVisitante.path("liga/" + partido.getEquipoVisitante().getNombreEquipo());
			Invocation.Builder invocationBuilderVisitante = resourceVisitante.request(MediaType.APPLICATION_XML);
			invocationBuilderVisitante.accept(MediaType.APPLICATION_XML);
			Response responseVisitante = invocationBuilderVisitante.get();

			switch (responseVisitante.getStatus()) {
			case 200:
				System.out.println("200: EQUIPO VISITANTE");
				equipoVisitante = responseVisitante.readEntity(Equipo.class);
				break;

			case 404:
				System.out.println("ERROR 404: Equipo Local not Found");
				break;

			default:
				System.out.println("ERROR Unknown");
				break;
			}

			// ACTUALIZAMOS RESULTADO JORNADA

			equipoLocal.setPartidosJugados(equipoLocal.getPartidosJugados() + 1);
			equipoVisitante.setPartidosJugados(equipoVisitante.getPartidosJugados() + 1);

			if (golesEquipoLocal > golesEquipoVisitante) { // GANA EQUIPO LOCAL
				equipoLocal.setPartidosGanados(equipoLocal.getPartidosGanados() + 1);
				equipoLocal.setPuntos(equipoLocal.getPuntos() + 3);
				equipoVisitante.setPartidosPerdidos(equipoVisitante.getPartidosPerdidos() + 1);
			} else if (golesEquipoLocal < golesEquipoVisitante) {
				equipoVisitante.setPartidosGanados(equipoVisitante.getPartidosGanados() + 1);
				equipoVisitante.setPuntos(equipoVisitante.getPuntos() + 3);
				equipoLocal.setPartidosPerdidos(equipoLocal.getPartidosPerdidos() + 1);
			} else {
				equipoLocal.setPuntos(equipoLocal.getPuntos() + 1);
				equipoVisitante.setPuntos(equipoVisitante.getPuntos() + 1);
			}

			// ACTUALIZAMOS TARJETAS

			// EQUIPO LOCAL
			for (Tarjeta tarjeta : partido.getEquipoLocal().getTarjetas()) {
				for (Jugador jugador : equipoLocal.getJugadores()) {
					if (jugador.getDorsal().equalsIgnoreCase(tarjeta.getDorsal())) {
						if (tarjeta.getTipoTarjeta() == TipoTarjeta.AMARILLA) {
							jugador.setTarjetasAmarillas(jugador.getTarjetasAmarillas() + 1);
						} else if (tarjeta.getTipoTarjeta() == TipoTarjeta.ROJA) {
							jugador.setTarjetasRojas(jugador.getTarjetasRojas() + 1);
						}
					}
				}
			}

			// EQUIPO VISITANTE
			for (Tarjeta tarjeta : partido.getEquipoVisitante().getTarjetas()) {
				for (Jugador jugador : equipoLocal.getJugadores()) {
					if (jugador.getDorsal().equalsIgnoreCase(tarjeta.getDorsal())) {
						if (tarjeta.getTipoTarjeta() == TipoTarjeta.AMARILLA) {
							jugador.setTarjetasAmarillas(jugador.getTarjetasAmarillas() + 1);
						} else if (tarjeta.getTipoTarjeta() == TipoTarjeta.ROJA) {
							jugador.setTarjetasRojas(jugador.getTarjetasRojas() + 1);
						}
					}
				}
			}

			// ACTUALIZAMOS GOLES

			// EQUIPO LOCAL
			for (Gol gol : partido.getEquipoLocal().getGoles()) {
				for (Jugador jugador : equipoLocal.getJugadores()) {
					if (jugador.getDorsal().equalsIgnoreCase(gol.getDorsal())) {
						jugador.setGoles(jugador.getGoles() + 1);
					}
				}
			}

			// EQUIPO VISITANTE
			for (Gol gol : partido.getEquipoVisitante().getGoles()) {
				for (Jugador jugador : equipoVisitante.getJugadores()) {
					if (jugador.getDorsal().equalsIgnoreCase(gol.getDorsal())) {
						jugador.setGoles(jugador.getGoles() + 1);
					}
				}
			}

			// GUARDAR LOS DATOS ACTUALIZADOS
			// EQUIPO LOCAL
			Client clientLocalPut = ClientBuilder.newClient();
			WebTarget baseLocalPut = clientLocalPut
					.target("http://localhost:8080/P5_Servidor-0.0.1-SNAPSHOT/");
			WebTarget resourceLocalPut = baseLocalPut.path("liga/" + partido.getEquipoLocal().getNombreEquipo());
			Invocation.Builder invocationBuilderLocalPut = resourceLocalPut.request();
			Response responseLocalPut = invocationBuilderLocalPut.put(Entity.xml(equipoLocal));

			switch (responseLocalPut.getStatus()) {
			case 200:
				System.out.println("200: UPDATE LOCAL TEAM");
				break;

			case 404:
				System.out.println("ERROR 404: Equipo Local not Found");
				break;

			default:
				System.out.println("ERROR Unknown");
				break;
			}

			// EQUIPO VISITANTE
			Client clientVisitantePut = ClientBuilder.newClient();
			WebTarget baseVisitantePut = clientVisitantePut
					.target("http://localhost:8080/P5_Servidor-0.0.1-SNAPSHOT/");
			WebTarget resourceVisitantePut = baseVisitantePut
					.path("liga/" + partido.getEquipoVisitante().getNombreEquipo());
			Invocation.Builder invocationBuilderVisitantePut = resourceVisitantePut.request();
			Response responseVisitantePut = invocationBuilderVisitantePut.put(Entity.xml(equipoVisitante));

			switch (responseVisitantePut.getStatus()) {
			case 200:
				System.out.println("200: UPDATE LOCAL TEAM");
				break;

			case 404:
				System.out.println("ERROR 404: Equipo Visitante not Found");
				break;

			default:
				System.out.println("ERROR Unknown");
				break;
			}

		}
	}

}
