package es.unican.ss.types;

import javax.xml.bind.annotation.XmlAttribute;

public class Gol {

	private String dorsal;
	private String minuto;

	public Gol() {

	}
	@XmlAttribute(name = "dorsal")
	public String getDorsal() {
		return dorsal;
	}

	public void setDorsal(String dorsal) {
		this.dorsal = dorsal;
	}
	@XmlAttribute(name = "minuto")
	public String getMinuto() {
		return minuto;
	}

	public void setMinuto(String minuto) {
		this.minuto = minuto;
	}

}
