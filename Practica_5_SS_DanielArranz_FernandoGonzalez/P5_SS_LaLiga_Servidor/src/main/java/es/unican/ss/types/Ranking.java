package es.unican.ss.types;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="ranking")
public class Ranking {
	private List<Jugador> jugadores;
	
	public Ranking() {
		jugadores = new ArrayList<Jugador>();
	}
	@XmlElement
	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	
	
}
