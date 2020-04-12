package es.unican.ss.representations;

import javax.ws.rs.core.UriInfo;

public class JugadorRepresentation {

	private AtomLink self;

	private int dorsal;
	private int goles;
	private String nombre;
	private int tarjetasAmarillas;
	private int tarjetasRojas;

	public JugadorRepresentation(UriInfo uriInfo, Jugador jugador) {
		String selfURI = uriInfo.getAbsolutePathBuilder().path(dorsal).toString();
		setSelf(new AtomLink("self", selfURI));

		dorsal = jugador.getDorsal();
		goles = jugador.getGoles();
		nombre = jugador.getNombre();
		tarjetasAmarillas = jugador.getTarjetasAmarillas();
		tarjetasRojas = jugador.getTarjetasRojas();

	}

	@XmlElement
	public AtomLink getSelf() {
		return self;
	}

	public void setSelf(AtomLink self) {
		this.self = self;
	}

}
