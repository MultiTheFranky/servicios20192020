package es.unican.ss.representations;

import java.net.URI;
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

	public EquipoRepresentation(UriInfo uriInfo, Equipo equipo) {

		// Informacion adicional
		nombreEquipo = equipo.getNombre();
		partidosGanados = equipo.getPartidosGanados();
		partidosPerdidos = equipo.getPartidosPerdidos();
		partidosJugados = equipo.getPartidosJugados();

		AtomLink atomLink = null;
		for (Jugador j : equipo.getJugadores()) {
			URI uri = uriInfo.getAbsolutePathBuilder().path(j.getDorsal()).build();
			atomLink = new AtomLink("jugador", uri.toString());
			jugadores.add(atomLink);
		}

	}

	public List<AtomLink> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<AtomLink> jugadores) {
		this.jugadores = jugadores;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
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

}
