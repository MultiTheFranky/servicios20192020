package es.unican.ss.servicio;

import java.net.URI;
import java.util.List;

import javax.ws.rs.core.UriInfo;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import es.unican.ss.persistenceLayer.Equipo;
import es.unican.ss.persistenceLayer.Jugador;

@XmlRootElement(name = "equipo")
public class EquipoDTO {

	@XmlElement(name = "link")
	private List<AtomLink> jugadores;
	private String nombre;
	private int partidosJugados;
	private int partidosGanados;
	private int partidosPerdidos;

	public EquipoDTO(UriInfo uriInfo, Equipo equipo) {
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPartidosJugados() {
		return partidosJugados;
	}

	public void setPartidosJugados(int partidosJugados) {
		this.partidosJugados = partidosJugados;
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

}
