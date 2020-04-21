package es.unican.ss.types;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="ranking")
public class Ranking {
	private List<Jugador> jugadores;
	private Grupo grupo;
	private Equipo equipo;
	
	public Ranking() {
		jugadores = new ArrayList<Jugador>();
	}
	public Ranking(Grupo g) {
		jugadores = new ArrayList<Jugador>();
		grupo = g;
	}
	public Ranking(Equipo e) {
		jugadores = new ArrayList<Jugador>();
		equipo = e;
	}
	@XmlElement
	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	public Equipo getEquipo() {
		return equipo;
	}
	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	
}
