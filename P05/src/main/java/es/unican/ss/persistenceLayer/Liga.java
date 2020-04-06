package es.unican.ss.persistenceLayer;

import java.util.ArrayList;
import java.util.List;

public class Liga {
	private List<Equipo> equipos = new ArrayList<Equipo>();

	public List<Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(List<Equipo> equipos) {
		this.equipos = equipos;
	}

}
