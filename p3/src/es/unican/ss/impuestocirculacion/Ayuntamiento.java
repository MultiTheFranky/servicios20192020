
package es.unican.ss.impuestocirculacion;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Ayuntamiento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Ayuntamiento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="vehiculos" type="{http://www.unican.es/ss/ImpuestoCirculacion}Vehiculo"/>
 *         &lt;element name="contribuyentes" type="{http://www.unican.es/ss/ImpuestoCirculacion}Contribuyente"/>
 *         &lt;element name="facturas" type="{http://www.unican.es/ss/ImpuestoCirculacion}Factura"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ayuntamiento", propOrder = {
    "vehiculosOrContribuyentesOrFacturas"
})
public class Ayuntamiento {

    @XmlElements({@XmlElement(name = "vehiculos", type = Vehiculo.class)})
    protected List<Vehiculo> vehiculos;
	@XmlElements({@XmlElement(name = "contribuyentes", type = Contribuyente.class)})
    protected List<Contribuyente> contribuyentes;
    @XmlElements({@XmlElement(name = "facturas", type = Factura.class)})
    protected List<Factura> facturas;
    
    public Ayuntamiento(){
		vehiculos = new ArrayList<Vehiculo>();
		contribuyentes = new ArrayList<Contribuyente>();
		facturas = new ArrayList<Factura>();
	}
    
    public List<Vehiculo> getVehiculos() {
		return vehiculos;
	}
	public void setVehiculos(List<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}
	public List<Contribuyente> getContribuyentes() {
		return contribuyentes;
	}
	public void setContribuyentes(List<Contribuyente> contribuyentes) {
		this.contribuyentes = contribuyentes;
	}
	public List<Factura> getFacturas() {
		return facturas;
	}
	public void setFacturas(List<Factura> facturas) {
		this.facturas = facturas;
	}

	/**
	 * Metodo que retorna el precio total de todos los vehiculos de
	 * un contribuyente
	 * @param contribuyente que calcular el precio de todos sus vehiculos
	 * @return valor total de los precios de todos los vehiculos
	 */
    public double getPrecioContribuyente(Contribuyente c){
        double total = 0.0;
        for (Vehiculo v : vehiculos) {
            if(((Contribuyente)v.getContribuyente()).getId().equals(c.getId())){
                total+=v.calculaPrecio();
            }
        }
        return total;
	}
	
    /**
     * Hemos anadido un id a los contribuyentes, dado que no podemos utilizar
     * el dni porque tiene un formato especifico
     * @param id de cada contribuyente
     * @return contribuyente con el id indicado
     */
	public Contribuyente gContribuyente(String id){
		Contribuyente c = null;
		for (Contribuyente contribuyente : contribuyentes) {
			if (contribuyente.getId().equals(id)) {
				c = contribuyente;
			}
		}
		return c;
	}

}
