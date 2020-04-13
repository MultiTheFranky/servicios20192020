package es.unican.ss.types;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="tercera")
public class Clasificacion {
	
	private List<Grupo> grupos;
	
	public Clasificacion() {
		grupos = new ArrayList<>();
	}
	
	public List<Grupo> getGrupo() {
		return grupos;
	}

	public void setGrupo(List<Grupo> grupos) {
		this.grupos = grupos;
	}
}
