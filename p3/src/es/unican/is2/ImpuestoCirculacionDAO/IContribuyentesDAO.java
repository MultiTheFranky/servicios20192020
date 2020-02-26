package es.unican.is2.ImpuestoCirculacionDAO;

import java.util.List;

import es.unican.ss.impuestocirculacion.Contribuyente;


/**
 * Interfaz DAO para los veh�culos
 */
public interface IContribuyentesDAO  {
	
	/** 
	 * Persite un nuevo contribuyente
	 * @param c contribuyente a a�adir
	 * @return El contribuyente una vez a�adido
	 */
	public Contribuyente creaContribuyente(Contribuyente c);
	
	/**
	 * Elimina el veh�culo cuyo dni se pasa
	 * como par�metro
	 * @param dni
	 * @return El veh�culo eliminado
	 */
	public Contribuyente contribuyente(String dni);
	
	/**
	 * Actualiza el estado del contribuyente que se pasa
	 * como par�metro
	 * @param nuevo Nuevo estado del contribuyente
	 * @return El contribuyente actualizado
	 */
	public Contribuyente actualizaContribuyente(Contribuyente nuevo);
	
	/**
	 * Retorna el veh�cula cuyo dni se pasa 
	 * como par�metro
	 * @param dni
	 * @return El contribuyente
	 * 			null si no se encuentra
	 */
	public Contribuyente eliminaContribuyente(String dni);
	
	/**
	 * Retorna la lista completa de contribuyentes
	 * @return La lista de contribuyentes
	 *         Lista vac�a si no hay ninguno
	 */
	public List<Contribuyente> contribuyentes();
	
}
