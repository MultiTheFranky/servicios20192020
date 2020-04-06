package es.unican.ss.liga;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="jugador")
public class Jugador {
	private String dorsal;
	private int goles;
	private String nombre;
	private int tAmarillas;
	private int tRojas;
	private String nombreEquipo;
	
	public Jugador() {}
	
	public String getDorsal() {
		return dorsal;
	}
	public void setDorsal(String dorsal) {
		this.dorsal = dorsal;
	}
	public int getGoles() {
		return goles;
	}
	public void setGoles(int goles) {
		this.goles = goles;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int gettAmarillas() {
		return tAmarillas;
	}
	public void settAmarillas(int tAmarillas) {
		this.tAmarillas = tAmarillas;
	}
	public int gettRojas() {
		return tRojas;
	}
	public void settRojas(int tRojas) {
		this.tRojas = tRojas;
	}
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}
	
	
}
