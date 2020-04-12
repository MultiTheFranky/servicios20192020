package es.unican.ss.types;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class EquipoPartido {

	private String nombreEquipo;
	private List<Gol> goles;
	private List<TarjetaAmarilla> tarjetasAmarillas;
	private List<TarjetaRoja> tarjetasRojas;

	public EquipoPartido() {
		goles = new ArrayList<Gol>();
		tarjetasAmarillas = new ArrayList<TarjetaAmarilla>();
		tarjetasRojas = new ArrayList<TarjetaRoja>();
	}
	@XmlAttribute(name = "nombre")
	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}
	@XmlElement(name = "gol")
	public List<Gol> getGoles() {
		return goles;
	}

	public void setGoles(List<Gol> goles) {
		this.goles = goles;
	}
	@XmlElement(name = "tAmarillas")
	public List<TarjetaAmarilla> getTarjetasAmarillas() {
		return tarjetasAmarillas;
	}
	public void setTarjetasAmarillas(List<TarjetaAmarilla> tarjetasAmarillas) {
		this.tarjetasAmarillas = tarjetasAmarillas;
	}
	@XmlElement(name = "tRojas")
	public List<TarjetaRoja> getTarjetasRojas() {
		return tarjetasRojas;
	}
	public void setTarjetasRojas(List<TarjetaRoja> tarjetasRojas) {
		this.tarjetasRojas = tarjetasRojas;
	}
	
	
	
}
