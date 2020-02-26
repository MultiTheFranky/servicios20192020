
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
