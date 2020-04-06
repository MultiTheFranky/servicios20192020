package es.unican.ss.datosJornada;

import java.util.ArrayList;
import java.util.List;

public class EquipoJuega {
	private String nombre;
	private List<Gol> goles;
	private int numeroGoles;
	private List<Tarjeta> tarjetas;

	public EquipoJuega() {
		goles = new ArrayList<Gol>();
		tarjetas = new ArrayList<Tarjeta>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Gol> getGoles() {
		return goles;
	}

	public void setGoles(List<Gol> goles) {
		this.goles = goles;
	}

	public int getNumeroGoles() {
		return numeroGoles;
	}

	public void setNumeroGoles(int numeroGoles) {
		this.numeroGoles = numeroGoles;
	}

	public List<Tarjeta> getTarjetas() {
		return tarjetas;
	}

	public void setTarjetas(List<Tarjeta> tarjetas) {
		this.tarjetas = tarjetas;
	}

}
