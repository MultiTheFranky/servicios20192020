package es.unican.ss.representations;

import javax.ws.rs.core.UriInfo;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import es.unican.ss.types.Jugador;
@XmlRootElement(name="jugador")
public class JugadorRepresentation {

	private AtomLink self;

	private int dorsal;
	private int goles;
	private String nombre;
	private int tarjetasAmarillas;
	private int tarjetasRojas;
	
	
	public JugadorRepresentation() {}

	public JugadorRepresentation(UriInfo uriInfo, Jugador jugador) {
		dorsal = jugador.getDorsal();
		goles = jugador.getGoles();
		nombre = jugador.getNombre();
		tarjetasAmarillas = jugador.getTarjetasAmarillas();
		tarjetasRojas = jugador.getTarjetasRojas();
		System.out.println(jugador.getEquipo());
		String selfURI = uriInfo.getBaseUriBuilder().path("jugador/"+jugador.getEquipo().getNombre()+"/"+dorsal).toString();
		setSelf(new AtomLink("self", selfURI));
	}

	@XmlElement
	public AtomLink getSelf() {
		return self;
	}

	public void setSelf(AtomLink self) {
		this.self = self;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
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

	public int getTarjetasAmarillas() {
		return tarjetasAmarillas;
	}

	public void setTarjetasAmarillas(int tarjetasAmarillas) {
		this.tarjetasAmarillas = tarjetasAmarillas;
	}

	public int getTarjetasRojas() {
		return tarjetasRojas;
	}

	public void setTarjetasRojas(int tarjetasRojas) {
		this.tarjetasRojas = tarjetasRojas;
	}
	
	

}
