package es.unican.ss.representations;

import java.util.List;

import javax.ws.rs.core.UriInfo;

import es.unican.ss.types.Jugador;

public class GoleadoresRepresentation {

	private AtomLink previous;
	private AtomLink next;
	private List<NestedJugador> jugadoresToReturn;

	public GoleadoresRepresentation(UriInfo uriInfo, List<Jugador> jugadores, int indiceIni) {
		String nuevoIndice = Integer.toString(indiceIni + 5);
		String nextURI = uriInfo.getAbsolutePathBuilder().replaceQueryParam("indiceIni", nuevoIndice).toString();
		next = new AtomLink("next", nextURI);

		for (int i = indiceIni; i < indiceIni + 5; i++) {
			NestedJugador nestedJugador = new NestedJugador(uriInfo, jugadores.get(i).getDorsal());
			jugadoresToReturn.add(nestedJugador);
		}

	}

	public AtomLink getPrevious() {
		return previous;
	}

	public void setPrevious(AtomLink previous) {
		this.previous = previous;
	}

	public AtomLink getNext() {
		return next;
	}

	public void setNext(AtomLink next) {
		this.next = next;
	}

	public List<NestedJugador> getJugadoresToReturn() {
		return jugadoresToReturn;
	}

	public void setJugadoresToReturn(List<NestedJugador> jugadoresToReturn) {
		this.jugadoresToReturn = jugadoresToReturn;
	}

}
