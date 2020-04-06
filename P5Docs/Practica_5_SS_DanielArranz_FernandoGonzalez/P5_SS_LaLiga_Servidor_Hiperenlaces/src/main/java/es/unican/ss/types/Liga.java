package es.unican.ss.types;

import java.util.ArrayList;
import java.util.List;

public class Liga {
	
	private List<Equipo> equipos;
	
	public Liga() {
		equipos = new ArrayList<>();
	}

	public List<Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(List<Equipo> equipos) {
		this.equipos = equipos;
	}
	
	
	
}
