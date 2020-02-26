
package es.unican.ss.impuestocirculacionss;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import es.unican.ss.impuestocirculacion.Vehiculo;


/**
 * <p>Clase Java para listaVehiculos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="listaVehiculos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="vehiculos" type="{http://www.unican.es/ss/ImpuestoCirculacion}Vehiculo"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaVehiculos", propOrder = {
    "vehiculos"
})
public class ListaVehiculos {

    protected List<Vehiculo> vehiculos;

    /**
     * Gets the value of the vehiculos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehiculos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehiculos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Vehiculo }
     * 
     * 
     */
    public List<Vehiculo> getVehiculos() {
        if (vehiculos == null) {
            vehiculos = new ArrayList<Vehiculo>();
        }
        return this.vehiculos;
    }

}
