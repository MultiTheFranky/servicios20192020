package es.unican.ss.types;

import java.util.ArrayList;
import java.util.List;

public class Clasificacion {
	
	private String nombreLiga;
	private List<Grupo> grupos;
	
	public Clasificacion(String nombreLiga) {
		this.nombreLiga = nombreLiga;
		grupos = new ArrayList<>();
	}

	public List<Grupo> getGrupo() {
		return grupos;
	}

	public void setGrupo(List<Grupo> grupos) {
		this.grupos = grupos;
	}

	public String getNombreClasificacion() {
		return nombreLiga;
	}

	public void setNombreClasificacion(String nombreLiga) {
		this.nombreLiga = nombreLiga;
	}
	
}
