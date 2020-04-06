package es.unican.ss.servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.ws.rs.core.UriInfo;
import javax.xml.bind.annotation.XmlRootElement;

import es.unican.ss.liga.Liga;
import es.unican.ss.persistenceLayer.Jugador;

@XmlRootElement(name = "ranking")
public class RankingDTO {
	private List<AtomLink> jugadores;
	private AtomLink next;
	private AtomLink previous;

	public RankingDTO(List<Jugador> jugadores, UriInfo uri, AtomLink next, AtomLink previous, int startIndex) {
		this.next = next;
		this.previous = previous;
		this.jugadores = new ArrayList<AtomLink>();
		Collections.sort(jugadores);
		for (int i = startIndex; i < Math.min(startIndex + Liga.MAXNUMJUGADORES, jugadores.size()); i++) {
			this.jugadores.add(new AtomLink("jugador",
					uri.getBaseUriBuilder()
							.path("liga/" + jugadores.get(i).getNombreEquipo() + "/" + jugadores.get(i).getDorsal())
							.build().toString()));
		}
	}

	public List<AtomLink> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<AtomLink> jugadores) {
		this.jugadores = jugadores;
	}

	public AtomLink getNext() {
		return next;
	}

	public void setNext(AtomLink next) {
		this.next = next;
	}

	public AtomLink getPrevious() {
		return previous;
	}

	public void setPrevious(AtomLink previous) {
		this.previous = previous;
	}

}
