package es.unican.ss.persistenceLayer;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ranking")
public class Ranking {
	private List<Jugador> jugadores;

	public Ranking(List<Jugador> jugadores, String nombreEquipo) {
		this.jugadores = new ArrayList<Jugador>();

	}

	public List<Jugador> getJugadores() {
		return jugadores;
	}

}
