package es.unican.ss.representations;

import javax.ws.rs.core.UriInfo;

public class NestedJugador {

	private AtomLink self;

	public NestedJugador(UriInfo uriInfo, String dorsal) {
		String selfURI = uriInfo.getAbsolutePathBuilder().path(dorsal).toString();
		setSelf(new AtomLink("self", selfURI));
	}

	public AtomLink getSelf() {
		return self;
	}

	public void setSelf(AtomLink self) {
		this.self = self;
	}

}
