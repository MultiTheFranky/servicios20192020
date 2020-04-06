package es.unican.ss.datosJornada;

import java.util.ArrayList;
import java.util.List;

public class JornadaLiga {

	private String numeroJornada;
	private List<Partido> partidos;

	public JornadaLiga(String numeroJornada) {
		this.numeroJornada = numeroJornada;
		partidos = new ArrayList<Partido>();
	}

	public String getNumeroJornada() {
		return numeroJornada;
	}

	public void setNumeroJornada(String numeroJornada) {
		this.numeroJornada = numeroJornada;
	}

	public List<Partido> getPartidos() {
		return partidos;
	}

	public void setPartidos(List<Partido> partidos) {
		this.partidos = partidos;
	}

}
