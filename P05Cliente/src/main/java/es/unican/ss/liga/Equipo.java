package es.unican.ss.liga;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="equipo")
public class Equipo implements Comparable<Equipo>{
	private String nombre;
	private int puntos;
	private int partidosGanados;
	private int partidosPerdidos;
	private int partidosJugados;
	private List<Jugador> jugadores;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	public int getPartidosGanados() {
		return partidosGanados;
	}
	public void setPartidosGanados(int partidosGanados) {
		this.partidosGanados = partidosGanados;
	}
	public int getPartidosPerdidos() {
		return partidosPerdidos;
	}
	public void setPartidosPerdidos(int partidosPerdidos) {
		this.partidosPerdidos = partidosPerdidos;
	}
	public int getPartidosJugados() {
		return partidosJugados;
	}
	public void setPartidosJugados(int partidosJugados) {
		this.partidosJugados = partidosJugados;
	}
	public List<Jugador> getJugadores() {
		return jugadores;
	}
	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	public int compareTo(Equipo e) {
		return Integer.compare(puntos, e.getPuntos());
	}
	
	
}
