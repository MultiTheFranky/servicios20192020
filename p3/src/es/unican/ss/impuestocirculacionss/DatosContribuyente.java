
package es.unican.ss.impuestocirculacionss;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para datosContribuyente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="datosContribuyente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="apellido" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vehiculos" type="{http://www.unican.es/ss/ImpuestoCirculacionSS/}listaVehiculos"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosContribuyente", propOrder = {
    "nombreOrApellidoOrVehiculos"
})
public class DatosContribuyente {

    @XmlElementRefs({
        @XmlElementRef(name = "vehiculos", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "apellido", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "nombre", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> nombreOrApellidoOrVehiculos;

    /**
     * Gets the value of the nombreOrApellidoOrVehiculos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nombreOrApellidoOrVehiculos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNombreOrApellidoOrVehiculos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link ListaVehiculos }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getNombreOrApellidoOrVehiculos() {
        if (nombreOrApellidoOrVehiculos == null) {
            nombreOrApellidoOrVehiculos = new ArrayList<JAXBElement<?>>();
        }
        return this.nombreOrApellidoOrVehiculos;
    }

}
