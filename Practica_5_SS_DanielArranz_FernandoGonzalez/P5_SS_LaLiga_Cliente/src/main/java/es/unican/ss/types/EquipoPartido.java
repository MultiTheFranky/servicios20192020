package es.unican.ss.types;

import java.util.ArrayList;
import java.util.List;

public class EquipoPartido {

	private String nombreEquipo;
	private List<Gol> goles;
	private List<Tarjeta> tarjetas;
	private int numGoles;

	public EquipoPartido() {
		goles = new ArrayList<Gol>();
		tarjetas = new ArrayList<Tarjeta>();
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public List<Gol> getGoles() {
		return goles;
	}

	public void setGoles(List<Gol> goles) {
		this.goles = goles;
	}

	public List<Tarjeta> getTarjetas() {
		return tarjetas;
	}

	public void setTarjetas(List<Tarjeta> tarjetas) {
		this.tarjetas = tarjetas;
	}

	public int getNumGoles() {
		return numGoles;
	}

	public void setNumGoles(int numGoles) {
		this.numGoles = numGoles;
	}
	
}
