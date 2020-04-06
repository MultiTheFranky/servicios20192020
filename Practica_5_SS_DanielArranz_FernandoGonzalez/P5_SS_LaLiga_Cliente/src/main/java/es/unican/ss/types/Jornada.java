package es.unican.ss.types;

import java.util.ArrayList;
import java.util.List;

public class Jornada {
	
	private String numJornada;
	
	private List<Partido> partidos;

	public Jornada() {
		partidos = new ArrayList<Partido>();
	}

	public List<Partido> getPartidos() {
		return partidos;
	}

	public void setPartidos(List<Partido> partidos) {
		this.partidos = partidos;
	}

	public String getNumJornada() {
		return numJornada;
	}

	public void setNumJornada(String numJornada) {
		this.numJornada = numJornada;
	}

}
