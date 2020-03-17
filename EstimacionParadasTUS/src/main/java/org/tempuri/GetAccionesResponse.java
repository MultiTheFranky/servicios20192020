
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
 *         &lt;element name="GetAccionesResult" type="{http://tempuri.org/}ArrayOfInfoAccion" minOccurs="0"/>
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
    "getAccionesResult"
})
@XmlRootElement(name = "GetAccionesResponse")
public class GetAccionesResponse {

    @XmlElement(name = "GetAccionesResult")
    protected ArrayOfInfoAccion getAccionesResult;

    /**
     * Obtiene el valor de la propiedad getAccionesResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInfoAccion }
     *     
     */
    public ArrayOfInfoAccion getGetAccionesResult() {
        return getAccionesResult;
    }

    /**
     * Define el valor de la propiedad getAccionesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInfoAccion }
     *     
     */
    public void setGetAccionesResult(ArrayOfInfoAccion value) {
        this.getAccionesResult = value;
    }

}
