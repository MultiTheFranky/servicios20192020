package es.unican.ss.services;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import es.unican.ss.types.Jugador;

@XmlRootElement(name = "jugadores")
public class ListaJugadores {

	private List<Jugador> jugadores;

	public ListaJugadores() {
	}

	public ListaJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public void setUsuarios(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

}
