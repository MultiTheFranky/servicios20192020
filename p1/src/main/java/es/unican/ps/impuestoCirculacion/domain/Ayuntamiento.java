//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.04 a las 04:18:59 PM CET 
//


package es.unican.ps.impuestoCirculacion.domain;

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
    "vehiculosOrContribuyentesOrFacturas"
})
public class Ayuntamiento {

    @XmlElements({
        @XmlElement(name = "vehiculos", type = Vehiculo.class),
        @XmlElement(name = "contribuyentes", type = Contribuyente.class),
        @XmlElement(name = "facturas", type = Factura.class)
    })
    protected List<Object> vehiculosOrContribuyentesOrFacturas;

    /**
     * Gets the value of the vehiculosOrContribuyentesOrFacturas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehiculosOrContribuyentesOrFacturas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehiculosOrContribuyentesOrFacturas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Vehiculo }
     * {@link Contribuyente }
     * {@link Factura }
     * 
     * 
     */
    public List<Object> getVehiculosOrContribuyentesOrFacturas() {
        if (vehiculosOrContribuyentesOrFacturas == null) {
            vehiculosOrContribuyentesOrFacturas = new ArrayList<Object>();
        }
        return this.vehiculosOrContribuyentesOrFacturas;
    }

}
