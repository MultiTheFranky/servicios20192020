
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetEventsResult" type="{http://tempuri.org/}ArrayOfInfoHeaderEvent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getEventsResult"
})
@XmlRootElement(name = "GetEventsResponse")
public class GetEventsResponse {

    @XmlElement(name = "GetEventsResult")
    protected ArrayOfInfoHeaderEvent getEventsResult;

    /**
     * Obtiene el valor de la propiedad getEventsResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInfoHeaderEvent }
     *     
     */
    public ArrayOfInfoHeaderEvent getGetEventsResult() {
        return getEventsResult;
    }

    /**
     * Define el valor de la propiedad getEventsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInfoHeaderEvent }
     *     
     */
    public void setGetEventsResult(ArrayOfInfoHeaderEvent value) {
        this.getEventsResult = value;
    }

}
