package es.unican.ss.representations;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.UriInfo;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import es.unican.ss.types.Grupo;

@XmlRootElement(name = "clasificacion")
public class ClasificacionRepresentation {
	
	@XmlElement(name = "link")
	private List<AtomLink> grupos;

	public ClasificacionRepresentation(UriInfo uriInfo, List<Grupo> listaGrupos) {
		AtomLink atomLink = null;
		grupos = new ArrayList<>();
		for (Grupo g : listaGrupos) {
			URI uri = uriInfo.getAbsolutePathBuilder().path(g.getNombre()).build();
			atomLink = new AtomLink("equipo", uri.toString());
			grupos.add(atomLink);
		}
	}

	public List<AtomLink> getGrupos() {
		return grupos;
	}

	public void setGrupos(List<AtomLink> grupos) {
		this.grupos = grupos;
	}
}
