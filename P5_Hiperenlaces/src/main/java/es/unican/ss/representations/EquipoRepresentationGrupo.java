package es.unican.ss.representations;

import javax.ws.rs.core.UriInfo;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import es.unican.ss.types.Equipo;

@XmlRootElement(name = "equipo")
public class EquipoRepresentationGrupo {

	private String nombreEquipo;
	private int partidosGanados;
	private int partidosPerdidos;
	private int partidosJugados;
	private int puntos;

	private AtomLink self;
	
	public EquipoRepresentationGrupo() {}

	public EquipoRepresentationGrupo(UriInfo uriInfo, Equipo equipo) {
		nombreEquipo = equipo.getNombre();
		puntos = equipo.getPuntos();
		partidosJugados = equipo.getPartidosJugados();
		partidosGanados = equipo.getPartidosGanados();
		partidosPerdidos = equipo.getPartidosPerdidos();
		String selfURI = uriInfo.getBaseUriBuilder().path("clasificacion/"+equipo.getNombre()).toString();
		setSelf(new AtomLink("self", selfURI));
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
	@XmlElement
	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	public AtomLink getSelf() {
		return self;
	}

	public void setSelf(AtomLink atomLink) {
		this.self = atomLink;
	}

}
