package es.unican.ss.representations;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.UriInfo;
import javax.xml.bind.annotation.XmlElement;

import es.unican.ss.types.Equipo;
import es.unican.ss.types.Grupo;

public class GrupoRepresentation {
	
	@XmlElement(name = "link")
	private List<AtomLink> equipos;

	private String nombre;
	private String id;
	
	
	public GrupoRepresentation(UriInfo uriInfo, Grupo g) {
		AtomLink atomLink = null;
		equipos = new ArrayList<>();
		for (Equipo e : g.getEquipos()) {
			URI uri = uriInfo.getAbsolutePathBuilder().path(e.getNombre()).build();
			atomLink = new AtomLink("equipo", uri.toString());
			equipos.add(atomLink);
		}
	}

	public List<AtomLink> getGrupos() {
		return equipos;
	}

	public void setGrupos(List<AtomLink> grupos) {
		this.equipos = grupos;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
