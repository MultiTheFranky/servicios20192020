
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfInfoCoche complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInfoCoche">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InfoCoche" type="{http://tempuri.org/}InfoCoche" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInfoCoche", propOrder = {
    "infoCoche"
})
public class ArrayOfInfoCoche {

    @XmlElement(name = "InfoCoche")
    protected List<InfoCoche> infoCoche;

    /**
     * Gets the value of the infoCoche property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infoCoche property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfoCoche().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InfoCoche }
     * 
     * 
     */
    public List<InfoCoche> getInfoCoche() {
        if (infoCoche == null) {
            infoCoche = new ArrayList<InfoCoche>();
        }
        return this.infoCoche;
    }

}
