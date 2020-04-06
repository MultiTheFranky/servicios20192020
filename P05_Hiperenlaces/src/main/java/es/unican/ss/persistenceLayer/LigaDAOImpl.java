package es.unican.ss.persistenceLayer;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import es.unican.ss.liga.Liga;

public class LigaDAOImpl implements ILigaDAO {

	public List<Equipo> getEquipos() {
		JAXBContext jaxbctx;
		List<Equipo> equipos = new ArrayList<Equipo>();
		try {
			jaxbctx = JAXBContext.newInstance(Liga.class);
			Unmarshaller unmarshaller = jaxbctx.createUnmarshaller();
			Liga ligaSantander = (Liga) unmarshaller.unmarshal(this.getClass().getClassLoader().getResourceAsStream(
					"D:\\Universidad\\Cuarto\\Segundo_Cuatrimestre\\Servicios_Software\\Practicas\\P05\\src\\main\\webapp\\WEB-INF\\primeraDivision.xml"));
			for (Equipo e : ligaSantander.getEquipos()) {
				equipos.add(e);
			}
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return equipos;
	}

	public Equipo actualizaEquipo(Equipo e) {
		JAXBContext jaxbctx;
		try {
			jaxbctx = JAXBContext.newInstance(Liga.class);
			Unmarshaller unmarshaller = jaxbctx.createUnmarshaller();
			Liga ligaSantander = (Liga) unmarshaller.unmarshal(this.getClass().getClassLoader().getResourceAsStream(
					"D:\\Universidad\\Cuarto\\Segundo_Cuatrimestre\\Servicios_Software\\Practicas\\P05\\src\\main\\webapp\\WEB-INF\\primeraDivision.xml"));
			for (int i = 0; i < ligaSantander.getEquipos().size(); i++) {
				Equipo eq = ligaSantander.getEquipos().get(i);
				if (eq.getNombre().equals(e.getNombre())) {
					ligaSantander.getEquipos().set(i, e);
				}
			}
			// Actualiza el xml
			Marshaller marshaller = jaxbctx.createMarshaller();
			marshaller.marshal(ligaSantander, new File(
					"D:\\Universidad\\Cuarto\\Segundo_Cuatrimestre\\Servicios_Software\\Practicas\\P05\\src\\main\\webapp\\WEB-INF\\primeraDivision.xml"));
		} catch (JAXBException j) {
			j.printStackTrace();
		}
		return e;
	}

	public Equipo getEquipo(String equipo) {
		List<Equipo> equipos = new ArrayList<Equipo>();
		Equipo e = null;
		for (Equipo eq : equipos) {
			if (eq.getNombre().equals(equipo)) {
				e = eq;
			}
		}
		return e;
	}

	public List<Jugador> getJugadores() {
		JAXBContext jaxbctx;
		List<Jugador> jugadores = new ArrayList<Jugador>();
		try {
			jaxbctx = JAXBContext.newInstance(Liga.class);
			Unmarshaller unmarshaller = jaxbctx.createUnmarshaller();
			Liga liga = (Liga) unmarshaller.unmarshal(this.getClass().getClassLoader().getResourceAsStream(
					"D:\\Universidad\\Cuarto\\Segundo_Cuatrimestre\\Servicios_Software\\Practicas\\P05\\src\\main\\webapp\\WEB-INF\\primeraDivision.xml"));
			for (Equipo e : liga.getEquipos()) {
				for (Jugador j : e.getJugadores()) {
					jugadores.add(j);
				}
			}
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return jugadores;
	}

	public Jugador getJugador(String equipo, int dorsal) {
		Jugador j = null;
		Equipo e = getEquipo(equipo);
		for (Jugador ju : e.getJugadores()) {
			if (ju.getDorsal().equals(String.valueOf(dorsal))) {
				j = ju;
			}
		}
		return j;
	}

	public Jugador actualizaJugador(String equipo, Jugador j) {
		JAXBContext jaxbctx;
		try {
			jaxbctx = JAXBContext.newInstance(Liga.class);
			Unmarshaller unmarshaller = jaxbctx.createUnmarshaller();
			Liga ligaSantander = (Liga) unmarshaller.unmarshal(this.getClass().getClassLoader().getResourceAsStream(
					"D:\\Universidad\\Cuarto\\Segundo_Cuatrimestre\\Servicios_Software\\Practicas\\P05\\src\\main\\webapp\\WEB-INF\\primeraDivision.xml"));
			Equipo e = getEquipo(equipo);
			for (int i = 0; i < e.getJugadores().size(); i++) {
				Jugador ju = e.getJugadores().get(i);
				if (j.getNombre().equals(ju.getNombre())) {
					e.getJugadores().set(i, j);
				}
			}
			// Actualiza el xml
			Marshaller marshaller = jaxbctx.createMarshaller();
			marshaller.marshal(ligaSantander, new File(
					"D:\\Universidad\\Cuarto\\Segundo_Cuatrimestre\\Servicios_Software\\Practicas\\P05\\src\\main\\webapp\\WEB-INF\\primeraDivision.xml"));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return j;
	}
}
