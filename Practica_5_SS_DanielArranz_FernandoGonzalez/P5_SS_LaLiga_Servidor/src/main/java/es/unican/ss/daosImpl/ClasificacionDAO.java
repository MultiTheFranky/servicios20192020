package es.unican.ss.daosImpl;

import java.io.File;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import es.unican.ss.daos.IClasificacionDAO;
import es.unican.ss.types.Clasificacion;
import es.unican.ss.types.Equipo;
import es.unican.ss.types.Grupo;
import es.unican.ss.types.Jugador;

public class ClasificacionDAO implements IClasificacionDAO {

	public ClasificacionDAO() {

	}

	@Override
	public Grupo getGrupo(String grupo) {
		JAXBContext jaxbctx;
		Grupo result = null;
		try {
			jaxbctx = JAXBContext.newInstance(Clasificacion.class);

			Unmarshaller unmarshaller = jaxbctx.createUnmarshaller();
			Clasificacion clasificacion = (Clasificacion) unmarshaller
					.unmarshal(getClass().getResourceAsStream("/clasificacion.xml"));
			for (Grupo g : clasificacion.getGrupo()) {
				if (g.getId().equals(grupo)) {
					result = g;
				}
			}

		} catch (JAXBException e) {
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public Equipo getEquipo(String grupo, String equipo) {
		Equipo result = null;
		Grupo g = getGrupo(grupo);
		System.out.println(g);
		if (g != null) {
			for (Equipo e : g.getEquipos()) {
				if (e.getNombre().equals(equipo)) {
					result = e;
				}
			}
		}
		return result;
	}

	@Override
	public Equipo getEquipo(String equipo) {
		JAXBContext jaxbctx;
		Equipo result = null;
		try {
			jaxbctx = JAXBContext.newInstance(Clasificacion.class);
			Unmarshaller unmarshaller = jaxbctx.createUnmarshaller();
			Clasificacion clasificacion = (Clasificacion) unmarshaller
					.unmarshal(getClass().getResourceAsStream("/clasificacion.xml"));
			for (Grupo g : clasificacion.getGrupo()) {
				for (Equipo e : g.getEquipos()) {
					if (e.getNombre().equals(equipo)) {
						result = e;
					}
				}
			}
		} catch (JAXBException j) {
			j.printStackTrace();
		}
		return result;
	}

	@Override
	public Equipo actualizaEquipo(Equipo e) {
		JAXBContext jaxbctx;
		try {
			jaxbctx = JAXBContext.newInstance(Clasificacion.class);
			Unmarshaller unmarshaller = jaxbctx.createUnmarshaller();
			Clasificacion clasificacion = (Clasificacion) unmarshaller
					.unmarshal(getClass().getResourceAsStream("/clasificacion.xml"));
			for (Grupo g : clasificacion.getGrupo()) {
				for (int i = 0; i < g.getEquipos().size(); i++) {
					Equipo eq = g.getEquipos().get(i);
					if (eq.getNombre().equals(e.getNombre())) {
						g.getEquipos().set(i, e);
					}
				}
			}

			// Actualiza el xml
			Marshaller marshaller = jaxbctx.createMarshaller();
			try {
				marshaller.marshal(clasificacion, new File(getClass().getResource("/clasificacion.xml").toURI()));
			} catch (URISyntaxException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (JAXBException j) {
			j.printStackTrace();
		}
		return e;
	}

	@Override
	public List<Jugador> getJugadores(String grupo) {
		List<Jugador> lista = new ArrayList<Jugador>();

		Grupo g = getGrupo(grupo);

		for (Equipo e : g.getEquipos()) {
			for (Jugador j : e.getJugadores()) {
				lista.add(j);
			}
		}

		return lista;
	}

	@Override
	public Jugador getJugador(String equipo, int dorsal) {
		Jugador j = null;
		Equipo e = getEquipo(equipo);
		for (Jugador jugador : e.getJugadores()) {
			if (jugador.getDorsal() == dorsal) {
				j = jugador;
			}
		}
		return j;
	}

	@Override
	public Jugador actualizaJugador(String equipo, Jugador j) {
		JAXBContext jaxbctx;
		try {
			jaxbctx = JAXBContext.newInstance(Clasificacion.class);
			Unmarshaller unmarshaller = jaxbctx.createUnmarshaller();
			Clasificacion clasificacion = (Clasificacion) unmarshaller
					.unmarshal(getClass().getResourceAsStream("/clasificacion.xml"));
			Equipo e = getEquipo(equipo);
			for (int i = 0; i < e.getJugadores().size(); i++) {
				Jugador jugador = e.getJugadores().get(i);
				if (j.getNombre().equals(jugador.getNombre())) {
					e.getJugadores().set(i, j);
				}
			}
			// Actualiza el xml
			Marshaller marshaller = jaxbctx.createMarshaller();
			try {
				marshaller.marshal(clasificacion, new File(getClass().getResource("/clasificacion.xml").toURI()));
			} catch (URISyntaxException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return j;
	}

	@Override
	public boolean eliminaJugador(String equipo, int dorsal) {
		JAXBContext jaxbctx;
		Boolean result = false;
		try {
			jaxbctx = JAXBContext.newInstance(Clasificacion.class);
			Unmarshaller unmarshaller = jaxbctx.createUnmarshaller();
			Clasificacion liga = (Clasificacion) unmarshaller.unmarshal(
					this.getClass().getClassLoader().getResourceAsStream("C:\\Users\\Franky\\P5\\clasificacion.xml"));
			Jugador jugador = getJugador(equipo, dorsal);
			Equipo e = getEquipo(equipo);
			for (int i = 0; i < e.getJugadores().size(); i++) {
				Jugador j = e.getJugadores().get(i);
				if (j.getNombre().equals(jugador.getNombre())) {
					e.getJugadores().remove(i);
					result = true;
				}
			}

			// Actualiza el xml
			Marshaller marshaller = jaxbctx.createMarshaller();
			marshaller.marshal(liga, new File("C:\\Users\\Franky\\P5\\clasificacion.xml"));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<Jugador> getRanking(String grupo) {
		JAXBContext jaxbctx;
		List<Jugador> jugadores = new ArrayList<>();
		try {
			jaxbctx = JAXBContext.newInstance(Clasificacion.class);

			Unmarshaller unmarshaller = jaxbctx.createUnmarshaller();
			Clasificacion clasificacion = (Clasificacion) unmarshaller
					.unmarshal(getClass().getResourceAsStream("/clasificacion.xml"));
			for (Grupo g : clasificacion.getGrupo()) {
				if (g.getId().equals(grupo)) {
					for (Equipo e : g.getEquipos()) {
						for (Jugador jugador : e.getJugadores()) {
							jugadores.add(jugador);
						}
					}
				}
			}

			jugadores.sort(new Comparator<Jugador>() {
				public int compare(Jugador o1, Jugador o2) {
					return o2.getGoles() - o1.getGoles();
				};
			});

		} catch (JAXBException e) {
			System.out.println("Error JAXB");
			e.printStackTrace();

		}

		return jugadores;
	}

	}

	