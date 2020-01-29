package es.unican.ps.impuestoCirculacion.daoLayer;

import java.util.List;

import es.unican.ps.impuestoCirculacion.domain.Vehiculo;

/**
 * Interfaz DAO para los vehículos
 */
public interface IVehiculosDAO  {
	/** 
	 * Persite un nuevo vehiculo
	 * @param v Vehiculo a añadir
	 * @return El vehiculo una vez añadido
	 */
	public Vehiculo creaVehiculo(Vehiculo v);
	
	/**
	 * Elimina el vehículo cuya matrícula se pasa
	 * como parámetro
	 * @param matricula
	 * @return El vehículo eliminado
	 */
	public Vehiculo eliminaVehiculo(String matricula);
	
	/**
	 * Actualiza el estado del vehículo que se pasa
	 * como parámetro
	 * @param nuevo Nuevo estado del vehiculo
	 * @return El vehiculo actualizado
	 */
	public Vehiculo actualizaVehiculo(Vehiculo nuevo);
	
	/**
	 * Retorna el vehícula cuya matrícula se pasa 
	 * como parámetro
	 * @param matricula
	 * @return El vehiculo
	 * 			null si no se encuentra
	 */
	public Vehiculo vehiculo(String matricula);
	
	/**
	 * Retorna la lista completa de vehículos
	 * @return La lista de vehículos
	 *         Lista vacía si no hay ninguno
	 */
	public List<Vehiculo> vehiculos();
}
