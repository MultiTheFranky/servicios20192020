package es.unican.ss.typesservice;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="equipo")
public class Equipo {

	private String nombre;

	private int puntos;

	private int partidosGanados;

	private int partidosPerdidos;

	private int partidosJugados;

	private List<Jugador> jugadores;

	public Equipo() {

	}
	
	public Equipo(String nombre, int puntos, int partidosGanados, int partidosPerdidos, int partidosJugados,
			List<Jugador> jugadores) {
		this.nombre = nombre;
		this.puntos = puntos;
		this.partidosGanados = partidosGanados;
		this.partidosPerdidos = partidosPerdidos;
		this.partidosJugados = partidosJugados;
		this.jugadores = jugadores;
	}
	
	public Equipo(String nombre, int puntos, int partidosGanados, int partidosPerdidos, int partidosJugados) {
		this.nombre = nombre;
		this.puntos = puntos;
		this.partidosGanados = partidosGanados;
		this.partidosPerdidos = partidosPerdidos;
		this.partidosJugados = partidosJugados;
	}


	@XmlElement
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@XmlElement
	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	@XmlElement
	public int getPartidosGanados() {
		return partidosGanados;
	}

	public void setPartidosGanados(int partidosGanados) {
		this.partidosGanados = partidosGanados;
	}
		
	@XmlElement
	public int getPartidosPerdidos() {
		return partidosPerdidos;
	}

	public void setPartidosPerdidos(int partidosPerdidos) {
		this.partidosPerdidos = partidosPerdidos;
	}

	@XmlElement
	public int getPartidosJugados() {
		return partidosJugados;
	}

	public void setPartidosJugados(int partidosJugados) {
		this.partidosJugados = partidosJugados;
	}
	
	@XmlElement
	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

}
