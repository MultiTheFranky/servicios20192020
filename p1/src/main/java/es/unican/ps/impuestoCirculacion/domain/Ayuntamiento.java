//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.04 a las 04:18:59 PM CET 
//


package es.unican.ps.impuestoCirculacion.domain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Ayuntamiento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Ayuntamiento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element name="vehiculos" type="{http://www.unican.es/ss/ImpuestoCirculacion}Vehiculo"/&gt;
 *         &lt;element name="contribuyentes" type="{http://www.unican.es/ss/ImpuestoCirculacion}Contribuyente"/&gt;
 *         &lt;element name="facturas" type="{http://www.unican.es/ss/ImpuestoCirculacion}Factura"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ayuntamiento", propOrder = {
    "vehiculos","contribuyentes","facturas"
})
@XmlRootElement
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

    public double getPrecioContribuyente(Contribuyente c){
        double total = 0.0;
        for (Vehiculo v : vehiculos) {
            if(((Contribuyente)v.getContribuyente()).getId().equals(c.getId())){
                total+=v.calculaPrecio();
            }
        }
        return total;
	}
	
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
