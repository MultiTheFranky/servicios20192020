package es.unican.ps.impuestoCirculacion.daoLayer;

import java.util.List;

import es.unican.ps.impuestoCirculacion.domain.Contribuyente;

/**
 * Interfaz DAO para los vehículos
 */
public interface IContribuyentesDAO  {
	
	/** 
	 * Persite un nuevo contribuyente
	 * @param c contribuyente a añadir
	 * @return El contribuyente una vez añadido
	 */
	public Contribuyente creaContribuyente(Contribuyente c);
	
	/**
	 * Elimina el vehículo cuyo dni se pasa
	 * como parámetro
	 * @param dni
	 * @return El vehículo eliminado
	 */
	public Contribuyente contribuyente(String dni);
	
	/**
	 * Actualiza el estado del contribuyente que se pasa
	 * como parámetro
	 * @param nuevo Nuevo estado del contribuyente
	 * @return El contribuyente actualizado
	 */
	public Contribuyente actualizaContribuyente(Contribuyente nuevo);
	
	/**
	 * Retorna el vehícula cuyo dni se pasa 
	 * como parámetro
	 * @param dni
	 * @return El contribuyente
	 * 			null si no se encuentra
	 */
	public Contribuyente eliminaContribuyente(String dni);
	
	/**
	 * Retorna la lista completa de contribuyentes
	 * @return La lista de contribuyentes
	 *         Lista vacía si no hay ninguno
	 */
	public List<Contribuyente> contribuyentes();
	
}
