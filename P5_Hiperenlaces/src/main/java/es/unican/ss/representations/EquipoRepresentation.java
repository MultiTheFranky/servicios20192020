package es.unican.ss.representations;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.UriInfo;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import es.unican.ss.types.Equipo;
import es.unican.ss.types.Jugador;

@XmlRootElement(name = "equipo")
public class EquipoRepresentation {

	@XmlElement(name = "link")
	private List<AtomLink> jugadores;
	private String nombreEquipo;
	private int partidosGanados;
	private int partidosPerdidos;
	private int partidosJugados;
	private int puntos;

	private AtomLink atomLink;

	public EquipoRepresentation(UriInfo uriInfo, Equipo equipo) {
		jugadores = new ArrayList<>();
		nombreEquipo = equipo.getNombre();
		puntos = equipo.getPuntos();
		partidosGanados = equipo.getPartidosGanados();
		partidosPerdidos = equipo.getPartidosPerdidos();
		partidosJugados = equipo.getPartidosJugados();

		for (Jugador j : equipo.getJugadores()) {
			URI uri = uriInfo.getAbsolutePathBuilder().path(String.valueOf(j.getDorsal())).build();
			atomLink = new AtomLink("jugador", uri.toString());
			jugadores.add(atomLink);
		}
	}
	@XmlElement
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
	@XmlElement
	public List<AtomLink> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<AtomLink> jugadores) {
		this.jugadores = jugadores;
	}
	@XmlElement
	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	@XmlElement
	public AtomLink getAtomLink() {
		return atomLink;
	}

	public void setAtomLink(AtomLink atomLink) {
		this.atomLink = atomLink;
	}

}
