package es.unican.ss.representations;

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
	
	private List<EquipoRepresentationGrupo> equipos;

	private String nombre;
	private String id;

	public GrupoRepresentation() {}
	
	
	public GrupoRepresentation(UriInfo uriInfo, Grupo g) {
		id = g.getId();
		nombre = g.getNombre();
		equipos = new ArrayList<>();
		for (Equipo e : g.getEquipos()) {
			equipos.add(new EquipoRepresentationGrupo(uriInfo, e));
		}
	}
	@XmlElement(name = "equipo")
	public List<EquipoRepresentationGrupo> getEquipos() {
		return equipos;
	}

	public void setEquipos(List<EquipoRepresentationGrupo> equipos) {
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
