package es.unican.ss.datosJornada;

public class Partido {
	private EquipoJuega equipoLocal;
	private EquipoJuega equipoVisitante;

	public Partido(EquipoJuega equipoLocal, EquipoJuega equipoVisitante) {
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
	}

	public EquipoJuega getEquipoLocal() {
		return equipoLocal;
	}

	public void setEquipoLocal(EquipoJuega equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	public EquipoJuega getEquipoVisitante() {
		return equipoVisitante;
	}

	public void setEquipoVisitante(EquipoJuega equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}

}
