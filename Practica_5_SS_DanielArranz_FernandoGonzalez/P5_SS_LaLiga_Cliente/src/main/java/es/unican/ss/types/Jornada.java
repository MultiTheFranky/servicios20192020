package es.unican.ss.types;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Jornada {
	
	private String numJornada;
	private String grupo;
	
	private List<Partido> partidos;

	public Jornada() {
		partidos = new ArrayList<Partido>();
	}
	@XmlElement(name = "partido")
	public List<Partido> getPartidos() {
		return partidos;
	}

	public void setPartidos(List<Partido> partidos) {
		this.partidos = partidos;
	}
	@XmlAttribute(name = "num")
	public String getNumJornada() {
		return numJornada;
	}

	public void setNumJornada(String numJornada) {
		this.numJornada = numJornada;
	}
	@XmlAttribute(name = "grupo")
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	
	

}
