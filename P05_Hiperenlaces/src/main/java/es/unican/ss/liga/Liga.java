package es.unican.ss.liga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import es.unican.ss.persistenceLayer.Equipo;
import es.unican.ss.persistenceLayer.ILigaDAO;
import es.unican.ss.persistenceLayer.LigaDAOImpl;

@Path("/liga")
public class Liga {

	public static final int MAXNUMEQUIPOS = 20;
	public static final int MAXNUMJUGADORES = 21;
	private ILigaDAO ligaSantander;
	private List<Equipo> equipos;

	public Liga() {
		ligaSantander = new LigaDAOImpl();
		equipos = new ArrayList<Equipo>();
	}

	@GET
	@Produces("aplication/xml")
	public Response getLiga() {
		Response.ResponseBuilder builder;
		List<Equipo> equipos = ligaSantander.getEquipos();
		Collections.sort(equipos);
		if (equipos.size() != 0) {
			builder = Response.ok(equipos);
		} else {
			builder = Response.status(Response.Status.NOT_FOUND);
		}
		return builder.build();
	}

	@GET
	@Path("/{nombreEquipo}")
	@Produces("aplication/xml")
	public Response getEquipo(@PathParam("nombreEquipo") String nombre, @Context UriInfo uriInfo) {
		Response.ResponseBuilder builder;
		Equipo e = ligaSantander.getEquipo(nombre);
		if (e != null) {
			builder = Response.ok(e);
		} else {
			builder = Response.status(Response.Status.NOT_FOUND);
		}
		return builder.build();
	}

	@GET
	@Path("/{nombreEquipo}")
	@Produces("aplication/xml")
	public Response putEquipo(@PathParam("nombreEquipo") String nombre, @Context UriInfo uriInfo) {
		Response.ResponseBuilder builder;
		Equipo e = ligaSantander.getEquipo(nombre);
		if (e != null) {
			builder = Response.ok(e);
		} else {
			builder = Response.status(Response.Status.NOT_FOUND);
		}
		return builder.build();
	}

	public void setEquipos(List<Equipo> equipos) {
		this.equipos = equipos;
	}

}
