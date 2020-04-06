package es.unican.ss.types;

public class Partido {

	private EquipoPartido equipoLocal;
	private EquipoPartido equipoVisitante;

	public Partido() {

	}

	public EquipoPartido getEquipoLocal() {
		return equipoLocal;
	}

	public void setEquipoLocal(EquipoPartido equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	public EquipoPartido getEquipoVisitante() {
		return equipoVisitante;
	}

	public void setEquipoVisitante(EquipoPartido equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}

}
