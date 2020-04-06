package es.unican.ss.datosJornada;

public class Gol {
	private String dorsal;
	private String minuto;

	public Gol(String dorsal, String minuto) {
		this.dorsal = dorsal;
		this.minuto = minuto;
	}

	public String getDorsal() {
		return dorsal;
	}

	public void setDorsal(String dorsal) {
		this.dorsal = dorsal;
	}

	public String getMinuto() {
		return minuto;
	}

	public void setMinuto(String minuto) {
		this.minuto = minuto;
	}
}
