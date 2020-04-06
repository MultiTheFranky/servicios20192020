package es.unican.ss.servicio;

import java.net.URI;
import java.util.List;

import javax.ws.rs.core.UriInfo;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import es.unican.ss.persistenceLayer.Equipo;

@XmlRootElement(name = "clasificacion")
public class ClasificacionDTO {

	@XmlElement(name = "link")
	private List<AtomLink> equipos;

	public ClasificacionDTO(UriInfo uriInfo, List<Equipo> equiposLiga) {
		AtomLink atomLink = null;
		for (Equipo e : equiposLiga) {
			URI uri = uriInfo.getAbsolutePathBuilder().path(e.getNombre()).build();
			atomLink = new AtomLink("equipo", uri.toString());
			equipos.add(atomLink);
		}
	}

	public List<AtomLink> getEquipos() {
		return equipos;
	}

	public void setEquipos(List<AtomLink> equipos) {
		this.equipos = equipos;
	}

}
