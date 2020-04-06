package es.unican.ss.servicio;

import javax.ws.rs.core.UriInfo;

public class NestedJugador {
	private AtomLink self;

	public NestedJugador(UriInfo uriInfo, String dorsal) {
		String selfUri = uriInfo.getAbsolutePathBuilder().path(dorsal).toString();
		setSelf(new AtomLink("self", selfUri));
	}

	public AtomLink getSelf() {
		return self;
	}

	public void setSelf(AtomLink self) {
		this.self = self;
	}

}
