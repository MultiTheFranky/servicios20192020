package es.unican.ss.representations;

import java.util.List;

import javax.ws.rs.core.UriInfo;

import es.unican.ss.types.Jugador;

public class RankingRepresentation {

	private AtomLink previous;
	private AtomLink next;
	private List<NestedJugador> jugadores;

	private final int NUM_JUGADORES=5;

	public RankingRepresentation(List<Jugador> players, UriInfo uriInfo, int index) {

		for (int i = index; i<index+NUM_JUGADORES; i++) {
			Jugador jugador = new Jugador(uriInfo, players.get(i).getDorsal());
			jugadores.add(jugador);
		}

		UriBuilder uriSelf= uriInfo.getBaseUriBuilder().path("jugadores").queryParam("index", index);
		self= new AtomLink("self", uriSelf.build().toString());
		
		int indexNext = index+NUM_JUGADORES;
		UriBuilder uriNext= uriInfo.getBaseUriBuilder().path("jugadores").queryParam("index", indexNext);
		next= new AtomLink("self", uriNext.build().toString());
		
		int indexPrevious = index-NUM_JUGADORES;
		UriBuilder uriPrevious= uriInfo.getBaseUriBuilder().path("jugadores").queryParam("index", indexPrevious);
		next= new AtomLink("self", uriPrevious.build().toString());
	}

	@XmlElement
	public AtomLink getPrevious() {
		return previous;
	}

	public void setPrevious(AtomLink previous) {
		this.previous = previous;
	}

	@XmlElement
	public AtomLink getNext() {
		return next;
	}

	public void setNext(AtomLink next) {
		this.next = next;
	}

	@XmlElement
	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadoresToReturn(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

}
