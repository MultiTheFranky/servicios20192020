package es.unican.ps.impuestoCirculacion.businessLayer;



import es.unican.ps.impuestoCirculacion.domain.Vehiculo;
import es.unican.ps.impuestoCirculacion.domain.Contribuyente;

/**
 * Interfaz de negocio para gestionar vehiculos
 */
public interface IGestionVehiculos {
	
	/**
	 * Añade un nuevo vehiculo al contribuyente cuyo dni se pasa
	 * como parámetro.
	 * @param a Vehiculo que desea añadir
	 * @param dni DNI del contribuyente al que se le quiere añadir
	 * @return El vehículo añadido
	 * 		   null si no se añade porque no se encuentra el contribuyente
	 * @throws OperacionNoValida si el contribuyente ya tiene ese coche
	 */
	public Vehiculo altaVehiculo(Vehiculo v, String dni) throws OperacionNoValida;
	
	/**
	 * Elimina el vehículo cuya matrícula se pasa como parámetro y 
	 * que pertenece al contribuyente cuyo dni se pasa como parámetro
	 * @param matricula Matricula del coche a eliminar
	 * @param dni DNI del propietario del vehículo
 	 * @return El vehículo eliminado
 	 *         null si el vehículo o el propietario no existen
 	 * @throws OperacionNoValida si el vehículo no pertenece al dni indicado
	 */
	public Vehiculo bajaVehiculo(String matricula, String dni) throws OperacionNoValida;
	
	/**
	 * Retorna el vehículo cuya matrícula se pasa como parámetro
	 * @param matricula 
	 * @return El vehículo
	 * 	       null si no existe
	 */
	public Vehiculo vehiculo(String matricula); 	

}
