package es.unican.ss.representations;

import java.net.URI;
import java.util.List;

import javax.ws.rs.core.UriInfo;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import es.unican.ss.types.Equipo;

@XmlRootElement(name = "clasificacion")
public class ClasificacionRepresentation {
	
	@XmlElement(name = "link")
	private List<AtomLink> equipos;

	public ClasificacionRepresentation(UriInfo uriInfo, List<Equipo> equiposClasificacion) {
		AtomLink atomLink = null;
		for (Equipo e : equiposClasificacion) {
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
