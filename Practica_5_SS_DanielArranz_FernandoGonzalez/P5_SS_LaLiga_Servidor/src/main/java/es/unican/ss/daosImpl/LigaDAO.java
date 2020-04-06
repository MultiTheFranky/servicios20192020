package es.unican.ss.daosImpl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import es.unican.ss.daos.ILigaDAO;
import es.unican.ss.types.Equipo;
import es.unican.ss.types.Jugador;
import es.unican.ss.types.Liga;

public class LigaDAO implements ILigaDAO {

	Equipo equipo_0;
	Equipo equipo_1;
	Equipo equipo_2;
	Equipo equipo_3;

	public LigaDAO() {

		/**
		 * equipo_0 = new Equipo("Rayito", 30, 10, 0, 10); equipo_1 = new Equipo("FCB",
		 * 27, 9, 1, 10); equipo_2 = new Equipo("RMCF", 0, 0, 10, 10); equipo_3 = new
		 * Equipo("VCF", 15, 5, 0, 5);
		 */
	}

	public List<Equipo> getEquipos() {
		// Creación del JAXBContext
		JAXBContext jaxbctx;
		List<Equipo> equipos = new ArrayList<>();
		try {
			jaxbctx = JAXBContext.newInstance(Liga.class);

			// Procesamos el documento (Unmarshall)
			Unmarshaller unmarshaller = jaxbctx.createUnmarshaller();
			Liga liga = (Liga) unmarshaller.unmarshal(this.getClass().getClassLoader()
					.getResourceAsStream("C:\\Users\\ferna\\Archivos_p5\\primeraDivision.xml"));

			// getPersona == getClientes
			for (Equipo e : liga.getEquipos()) {
				equipos.add(e);
			}

		} catch (JAXBException e) {
			e.printStackTrace();
		}

		/**
		 * equipos.add(equipo_0); equipos.add(equipo_1); equipos.add(equipo_2);
		 * equipos.add(equipo_3);
		 */

		return equipos;
	}

	public Equipo getEquipo(String equipo) {
		// Creación del JAXBContext
		JAXBContext jaxbctx;
		Equipo result = null;
		try {
			jaxbctx = JAXBContext.newInstance(Liga.class);

			// Procesamos el documento (Unmarshall)
			Unmarshaller unmarshaller = jaxbctx.createUnmarshaller();
			Liga liga = (Liga) unmarshaller.unmarshal(this.getClass().getClassLoader()
					.getResourceAsStream("C:\\Users\\ferna\\Archivos_p5\\primeraDivision.xml"));

			// getPersona == getClientes
			for (Equipo e : liga.getEquipos()) {
				if (e.getNombre().equalsIgnoreCase(equipo)) {
					result = e;
				}
			}

		} catch (JAXBException e) {
			System.out.println("Error JAXB");
			e.printStackTrace();

		}

		return result;
	}

	public Equipo actualizaEquipo(Equipo e) {
		// Creación del JAXBContext
		JAXBContext jaxbctx;
		Liga liga = null;
		try {

			jaxbctx = JAXBContext.newInstance(Liga.class);

			// Obtenemos la liga
			Unmarshaller unmarshaller = jaxbctx.createUnmarshaller();
			liga = (Liga) unmarshaller.unmarshal(this.getClass().getClassLoader()
					.getResourceAsStream("C:\\Users\\ferna\\Archivos_p5\\primeraDivision.xml"));

			// Modificamos el equipo
			// Se actualizan los datos del equipo
			Equipo aux = null;
			for (int i = 0; i < liga.getEquipos().size(); i++) {
				aux = liga.getEquipos().get(i);
				if (aux.getNombre().equalsIgnoreCase(e.getNombre())) {
					liga.getEquipos().set(i, e);
				}
			}

			// Procesamos el documento (marshall)
			Marshaller marshaller = jaxbctx.createMarshaller();
			marshaller.marshal(liga, new File("C:\\Users\\ferna\\Archivos_p5\\primeraDivision.xml"));

		} catch (JAXBException ex) {
			System.out.println("Error JAXB");
			ex.printStackTrace();

		}

		return e;
	}

	public List<Jugador> getJugadores() {
		// Creación del JAXBContext
		JAXBContext jaxbctx;
		List<Jugador> jugadores = new ArrayList<>();
		try {
			jaxbctx = JAXBContext.newInstance(Liga.class);

			// Procesamos el documento (Unmarshall)
			Unmarshaller unmarshaller = jaxbctx.createUnmarshaller();
			Liga liga = (Liga) unmarshaller.unmarshal(this.getClass().getClassLoader()
					.getResourceAsStream("C:\\Users\\ferna\\Archivos_p5\\primeraDivision.xml"));

			// getPersona == getClientes
			for (Equipo e : liga.getEquipos()) {
				for (Jugador j : e.getJugadores()) {
					jugadores.add(j);
				}
			}

		} catch (JAXBException e) {
			System.out.println("Error JAXB");
			e.printStackTrace();

		}

		return jugadores;
	}

	/**
	 * Lo traemos actualizado (marshal)
	 */
	public Jugador actualizaJugador(String nombreEquipo, Jugador j) {
		// Creación del JAXBContext
		JAXBContext jaxbctx;
		Liga liga = null;
		try {

			jaxbctx = JAXBContext.newInstance(Liga.class);

			// Obtenemos la liga
			Unmarshaller unmarshaller = jaxbctx.createUnmarshaller();
			liga = (Liga) unmarshaller.unmarshal(this.getClass().getClassLoader()
					.getResourceAsStream("C:\\Users\\ferna\\Archivos_p5\\primeraDivision.xml"));

			// Obtenemos el equipo
			Equipo equipo = getEquipo(nombreEquipo);
			// Modificamos el equipo
			// Se actualizan los datos del equipo
			Jugador jugador = null;
			for (int i = 0; i < equipo.getJugadores().size(); i++) {
				jugador = equipo.getJugadores().get(i);
				if (jugador.getNombre().equalsIgnoreCase(j.getNombre())) {
					equipo.getJugadores().set(i, j);
				}
			}

			// Actualizamos el equipo
			actualizaEquipo(equipo);

			// Procesamos el documento (marshall)
			Marshaller marshaller = jaxbctx.createMarshaller();
			marshaller.marshal(liga, new File("C:\\Users\\ferna\\Archivos_p5\\primeraDivision.xml"));

		} catch (JAXBException ex) {
			System.out.println("Error JAXB");
			ex.printStackTrace();

		}

		return j;
	}

	public List<Jugador> getJugadoresEquipo(String nombreEquipo) {
		// Creación del JAXBContext
		JAXBContext jaxbctx;
		List<Jugador> jugadores = new ArrayList<>();
		try {
			jaxbctx = JAXBContext.newInstance(Liga.class);

			// Procesamos el documento (Unmarshall)
			Unmarshaller unmarshaller = jaxbctx.createUnmarshaller();
			Liga liga = (Liga) unmarshaller.unmarshal(this.getClass().getClassLoader()
					.getResourceAsStream("C:\\Users\\ferna\\Archivos_p5\\primeraDivision.xml"));

			// getPersona == getClientes
			for (Equipo e : liga.getEquipos()) {
				if (e.getNombre().equalsIgnoreCase(nombreEquipo)) {
					for (Jugador j : e.getJugadores()) {
						jugadores.add(j);
					}
				}
			}

		} catch (JAXBException e) {
			System.out.println("Error JAXB");
			e.printStackTrace();

		}

		return jugadores;
	}

	@Override
	public Jugador getJugador(String nombreEquipo, int dorsal) {
		Jugador result = null;
		Equipo equipo = getEquipo(nombreEquipo);
		for (Jugador j : equipo.getJugadores()) {
			if (j.getDorsal().equalsIgnoreCase(String.valueOf(dorsal))) {
				result = j;
			}
		}

		return result;
	}

}
