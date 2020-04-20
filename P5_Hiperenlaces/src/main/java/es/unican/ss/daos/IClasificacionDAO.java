package es.unican.ss.daos;

import java.util.List;

import es.unican.ss.types.Equipo;
import es.unican.ss.types.Grupo;
import es.unican.ss.types.Jugador;

public interface IClasificacionDAO {

	/**
	 * Retorna el grupo cuyo identificador se pasa como parametro
	 * 
	 * ** este metodo sustituye a getEquipos del ejemplo de moodle para facilitar
	 * nuestro codigo
	 * 
	 * @param grupo
	 * @return El grupo o null si no existe
	 */
	public Grupo getGrupo(String grupo);

	/**
	 * Retorna el equipo cuyo nombre se pasa como parametro y su grupo como ayuda
	 * para buscarlo
	 * 
	 * @param equipo Nombre de equipo
	 * @return El equipo o null si no existe
	 */
	public Equipo getEquipo(String grupo, String equipo);

	/**
	 * Retorna el equipo cuyo nombre se pasa como parametro
	 * 
	 * @param equipo
	 * @return El equipo o null si no existe
	 */
	public Equipo getEquipo(String equipo);

	/**
	 * Actualiza el equipo con los datos que se pasan como parametro
	 * 
	 * @param e Nuevos datos del equipo
	 * @return El equipo actualizado o null si no se puede actualizar
	 */

	public Equipo actualizaEquipo(Equipo e);

	/**
	 * Retorna la lista completa de jugadores de un grupo de la clasificacion
	 * 
	 * @return Lista de jugadores inscritos en la clasificacion
	 */
	public List<Jugador> getJugadores(String grupo);

	/**
	 * Retorna el jugador cuyo equipo y dorsal se pasan como parametros
	 * 
	 * @return Jugador
	 */
	public Jugador getJugador(String equipo, int dorsal);

	/**
	 * Actualiza el jugador cuyo equipo se pasa como par�metro
	 * 
	 * @return Jugador actualizado
	 */
	public Jugador actualizaJugador(String equipo, Jugador j);

	/**
	 * Elimina el jugador del equipo con dorsal
	 * 
	 * @param equipo Nombre del equipo donde esta el jugador
	 * @param dorsal Dorsal del jugador
	 * @return Si se ha podido borrar o no
	 */
	public boolean eliminaJugador(String equipo, int dorsal);

	/**
	 * Obtiene el ranking de jugadores
	 * 
	 * @param grupo
	 * @return lista de jugadores ordenada por goles
	 */
	public List<Jugador> getRanking(String grupo);

}