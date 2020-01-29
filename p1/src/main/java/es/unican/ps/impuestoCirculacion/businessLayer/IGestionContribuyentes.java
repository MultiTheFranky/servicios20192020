package es.unican.ps.impuestoCirculacion.businessLayer;


import es.unican.ps.impuestoCirculacion.domain.Contribuyente;

/**
 * Interfaz de negocio para gestionar contribuyentes
 */
public interface IGestionContribuyentes {
	
	/**
	 * Añade un nuevo contribuyente al sistema.
	 * @param c Contribuyente que desea añadir
	 * @return El contribuyente añadido
	 * 		   null si no se añade porque ya existe
	 */
	public Contribuyente altaContribuyente(Contribuyente c);
	
	/**
	 * Elimina el contribuyente cuyo dni se pasa como parámetro
	 * del sistema.
	 * @param dni DNI del cliente que se quiere eliminar
	 * @return El contribuyente eliminado
	 * 		   null si no se elimina porque no se encuentra 
	 * @throws OperacionNoValida si el contribuyente existe pero tiene vehículos
	 * 			a su nombre
	 */
	public Contribuyente bajaContribuyente(String dni) throws OperacionNoValida;
	
	/**
	 * Retorna el contribuyente cuyo dni se pasa como parámetro
	 * @param dni DNI del contribuyente buscado
	 * @return El contribuyente cuyo dni coincide con el parámetro
	 * 			null en caso de que no se encuentre
	 */
	public Contribuyente contribuyente(String dni); 
	
	/**
	 * Retorna el total de impuesto a pagar por un contribuyente
	 * debido a los vehículos que tiene a su nombre
	 * @param dni DNI del contribuyente buscado
	 * @return El valor a pagar en euros
	 * 			Un valor negativo si el contribuyente no existe
	 */
	public double totalContribuyente(String dni);

}
