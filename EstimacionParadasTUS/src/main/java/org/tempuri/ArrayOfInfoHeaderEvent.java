
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfInfoHeaderEvent complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInfoHeaderEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InfoHeaderEvent" type="{http://tempuri.org/}InfoHeaderEvent" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInfoHeaderEvent", propOrder = {
    "infoHeaderEvent"
})
public class ArrayOfInfoHeaderEvent {

    @XmlElement(name = "InfoHeaderEvent")
    protected List<InfoHeaderEvent> infoHeaderEvent;

    /**
     * Gets the value of the infoHeaderEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infoHeaderEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfoHeaderEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InfoHeaderEvent }
     * 
     * 
     */
    public List<InfoHeaderEvent> getInfoHeaderEvent() {
        if (infoHeaderEvent == null) {
            infoHeaderEvent = new ArrayList<InfoHeaderEvent>();
        }
        return this.infoHeaderEvent;
    }

}
