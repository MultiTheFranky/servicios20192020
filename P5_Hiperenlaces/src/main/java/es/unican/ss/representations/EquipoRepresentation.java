package es.unican.ss.representations;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.UriInfo;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import es.unican.ss.types.Equipo;
import es.unican.ss.types.Jugador;

@XmlRootElement(name = "equipo")
public class EquipoRepresentation {

	private List<JugadorRepresentation> jugadores;
	private String nombreEquipo;
	private int partidosGanados;
	private int partidosPerdidos;
	private int partidosJugados;
	private int puntos;

	private AtomLink atomLink;
	
	public EquipoRepresentation() {}

	public EquipoRepresentation(UriInfo uriInfo, Equipo equipo) {
		jugadores = new ArrayList<>();
		nombreEquipo = equipo.getNombre();
		puntos = equipo.getPuntos();
		partidosGanados = equipo.getPartidosGanados();
		partidosPerdidos = equipo.getPartidosPerdidos();
		partidosJugados = equipo.getPartidosJugados();

		for (Jugador j : equipo.getJugadores()) {
			jugadores.add(new JugadorRepresentation(uriInfo, j));
		}
	}
	@XmlElement(name="equipo")
	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
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
	@XmlElement(name = "jugadores")
	public List<JugadorRepresentation> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<JugadorRepresentation> jugadores) {
		this.jugadores = jugadores;
	}
	@XmlElement
	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	public AtomLink getAtomLink() {
		return atomLink;
	}

	public void setAtomLink(AtomLink atomLink) {
		this.atomLink = atomLink;
	}

}
