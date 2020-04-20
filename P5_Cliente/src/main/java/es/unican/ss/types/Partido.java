package es.unican.ss.types;

import javax.xml.bind.annotation.XmlElement;

public class Partido {

	private EquipoPartido equipoLocal;
	private EquipoPartido equipoVisitante;

	public Partido() {

	}
	@XmlElement(name = "local")
	public EquipoPartido getEquipoLocal() {
		return equipoLocal;
	}

	public void setEquipoLocal(EquipoPartido equipoLocal) {
		this.equipoLocal = equipoLocal;
	}
	@XmlElement(name = "visitante")
	public EquipoPartido getEquipoVisitante() {
		return equipoVisitante;
	}

	public void setEquipoVisitante(EquipoPartido equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}

}
