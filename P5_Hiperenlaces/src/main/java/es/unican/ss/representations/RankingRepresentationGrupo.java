package es.unican.ss.representations;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import es.unican.ss.types.Ranking;
@XmlRootElement(name = "ranking")
public class RankingRepresentationGrupo {

	private AtomLink previous;
	private AtomLink self;
	private AtomLink next;
	private List<JugadorRepresentation> jugadores;

	private final int NUM_JUGADORES=5;
	
	public RankingRepresentationGrupo() {}

	public RankingRepresentationGrupo(Ranking ranking, UriInfo uriInfo, int index) {
		jugadores = new ArrayList<JugadorRepresentation>();
		for (int i = index; i<index+NUM_JUGADORES; i++) {
			JugadorRepresentation jugador = new JugadorRepresentation(uriInfo, ranking.getJugadores().get(i));
			jugadores.add(jugador);
		}

		UriBuilder uriSelf= uriInfo.getBaseUriBuilder().path("clasificacion/"+ranking.getGrupo().getId()+"/ranking").queryParam("index", index);
		self= new AtomLink("self", uriSelf.build().toString());
		
		int indexNext = index+NUM_JUGADORES;
		UriBuilder uriNext= uriInfo.getBaseUriBuilder().path("clasificacion/"+ranking.getGrupo().getId()+"/ranking").queryParam("index", indexNext);
		next= new AtomLink("self", uriNext.build().toString());
		
		int indexPrevious = index-NUM_JUGADORES;
		UriBuilder uriPrevious= uriInfo.getBaseUriBuilder().path("clasificacion/"+ranking.getGrupo().getId()+"/ranking").queryParam("index", indexPrevious);
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
