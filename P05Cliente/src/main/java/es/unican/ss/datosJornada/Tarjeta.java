package es.unican.ss.datosJornada;

public class Tarjeta {
	private String tarjeta;
	private String dorsal;

	public Tarjeta(String tarjeta, String dorsal) {
		this.tarjeta = tarjeta;
		this.dorsal = dorsal;
	}

	public String getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(String tarjeta) {
		this.tarjeta = tarjeta;
	}

	public String getDorsal() {
		return dorsal;
	}

	public void setDorsal(String dorsal) {
		this.dorsal = dorsal;
	}

}
