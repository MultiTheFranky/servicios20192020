package es.unican.ss.representations;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.UriInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import es.unican.ss.types.Equipo;
import es.unican.ss.types.Grupo;
@XmlRootElement(name = "grupo")
@XmlAccessorType(value = XmlAccessType.PROPERTY)
public class GrupoRepresentation {
	
	private List<AtomLink> equipos;

	private String nombre;
	private String id;
	
	public GrupoRepresentation() {}
	
	
	public GrupoRepresentation(UriInfo uriInfo, Grupo g) {
		AtomLink atomLink = null;
		equipos = new ArrayList<>();
		id = g.getId();
		nombre = g.getNombre();
		for (Equipo e : g.getEquipos()) {
			URI uri = uriInfo.getAbsolutePathBuilder().path(e.getNombre()).build();
			atomLink = new AtomLink("equipo", uri.toString());
			equipos.add(atomLink);
		}
	}
	@XmlElement(name = "equipo")
	public List<AtomLink> getEquipos() {
		return equipos;
	}

	public void setEquipos(List<AtomLink> equipos) {
		this.equipos = equipos;
	}
	@XmlElement
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@XmlElement
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
