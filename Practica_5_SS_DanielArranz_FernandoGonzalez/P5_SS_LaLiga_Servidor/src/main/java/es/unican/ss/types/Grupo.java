package es.unican.ss.types;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="grupo")
public class Grupo {
	
	private String ID;
	private List<Equipo> equipos;
	
	public Grupo() {
		equipos = new ArrayList<>();
	}
	@XmlElement
	public List<Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(List<Equipo> equipos) {
		this.equipos = equipos;
	}
	@XmlElement
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}
}