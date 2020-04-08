package es.unican.ss.types;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="jugador")
public class Jugador {

	private String nombre;

	private int dorsal;

	private int goles;

	private int tarjetasAmarillas;

	private int tarjetasRojas;

	public Jugador() {

	}
	

	public Jugador(String nombre, int dorsal, int goles, int tarjetasAmarillas, int tarjetasRojas) {
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.goles = goles;
		this.tarjetasAmarillas = tarjetasAmarillas;
		this.tarjetasRojas = tarjetasRojas;
	}


	@XmlElement
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@XmlElement
	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	
	@XmlElement
	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}
	
	@XmlElement
	public int getTarjetasAmarillas() {
		return tarjetasAmarillas;
	}

	public void setTarjetasAmarillas(int tarjetasAmarillas) {
		this.tarjetasAmarillas = tarjetasAmarillas;
	}
	
	@XmlElement
	public int getTarjetasRojas() {
		return tarjetasRojas;
	}

	public void setTarjetasRojas(int tarjetasRojas) {
		this.tarjetasRojas = tarjetasRojas;
	}

}
