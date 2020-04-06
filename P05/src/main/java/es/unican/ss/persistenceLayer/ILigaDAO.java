package es.unican.ss.persistenceLayer;

import java.util.List;

public interface ILigaDAO {

	/**
	 * Retorna la lista de equipos inscritos en la Liga
	 * 
	 * @return Lista de equipos de la liga
	 */
	public List<Equipo> getEquipos();

	/**
	 * Retorna el equipo cuyo nombre se pasa como parámetro
	 * 
	 * @param equipo
	 * @return El equipo o null si no existe
	 */
	public Equipo getEquipo(String equipo);

	/**
	 * Actualiza el equipo con los datos que se pasan como parámetro
	 * 
	 * @param e
	 *            Nuevos datos del equipo
	 * @return El equipo actualizado o null si no se puede actualizar
	 */

	public Equipo actualizaEquipo(Equipo e);

	/**
	 * Retorna la lista completa de jugadores de la liga
	 * 
	 * @return Lista de jugadores inscritos en la liga
	 */
	public List<Jugador> getJugadores();

	/**
	 * Retorna el jugador cuyo equipo y dorsal se pasan como parámetros
	 * 
	 * @return Jugador
	 */
	public Jugador getJugador(String equipo, int dorsal);

	/**
	 * Actualiza el jugador cuyo equipo se pasa como parámetros
	 * 
	 * @return Jugador actualizado
	 */
	public Jugador actualizaJugador(String equipo, Jugador j);

}
