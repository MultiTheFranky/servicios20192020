package es.unican.ss.representations;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import es.unican.ss.types.Ranking;
@XmlRootElement(name = "ranking")
public class RankingRepresentationEquipo {

	private AtomLink previous;
	private AtomLink self;
	private AtomLink next;
	private List<JugadorRepresentation> jugadores;

	private final int NUM_JUGADORES=5;
	
	public RankingRepresentationEquipo() {}

	public RankingRepresentationEquipo(Ranking ranking, UriInfo uriInfo, int index, String grupo) {
		jugadores = new ArrayList<JugadorRepresentation>();
		int limit = 0;
		if(index > ranking.getJugadores().size()) { //Eliminar si la funcionalidad requerida es que no se vean jugadores si el index es superior al numero de jugadores
			index = 0;
		}
		if((NUM_JUGADORES + index) > ranking.getJugadores().size()) {
			limit = ranking.getJugadores().size();
		}else {
			limit = NUM_JUGADORES + index;
		}
		for (int i = index; i<limit; i++) {
			JugadorRepresentation jugador = new JugadorRepresentation(uriInfo, ranking.getJugadores().get(i));
			jugadores.add(jugador);
		}

		UriBuilder uriSelf= uriInfo.getBaseUriBuilder().path("clasificacion/"+grupo+"/"+ranking.getEquipo().getNombre()+"/ranking").queryParam("index", index);
		self= new AtomLink("self", uriSelf.build().toString());
		
		int indexNext = index+NUM_JUGADORES;
		UriBuilder uriNext= uriInfo.getBaseUriBuilder().path("clasificacion/"+grupo+"/"+ranking.getEquipo().getNombre()+"/ranking").queryParam("index", indexNext);
		next= new AtomLink("self", uriNext.build().toString());
		
		int indexPrevious = index-NUM_JUGADORES;
		UriBuilder uriPrevious= uriInfo.getBaseUriBuilder().path("clasificacion/"+grupo+"/"+ranking.getEquipo().getNombre()+"/ranking").queryParam("index", indexPrevious);
		previous= new AtomLink("self", uriPrevious.build().toString());
	}
	
	@XmlElement
	public AtomLink getSelf() {
		return self;
	}

	public void setSelf(AtomLink self) {
		this.self = self;
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
	public List<JugadorRepresentation> getJugadores() {
		return jugadores;
	}

	public void setJugadoresToReturn(List<JugadorRepresentation> jugadores) {
		this.jugadores = jugadores;
	}

}
