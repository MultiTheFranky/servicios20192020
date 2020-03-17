
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
 *         &lt;element name="GetStatusLineasResult" type="{http://tempuri.org/}ArrayOfLineStatusInfo" minOccurs="0"/>
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
    "getStatusLineasResult"
})
@XmlRootElement(name = "GetStatusLineasResponse")
public class GetStatusLineasResponse {

    @XmlElement(name = "GetStatusLineasResult")
    protected ArrayOfLineStatusInfo getStatusLineasResult;

    /**
     * Obtiene el valor de la propiedad getStatusLineasResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLineStatusInfo }
     *     
     */
    public ArrayOfLineStatusInfo getGetStatusLineasResult() {
        return getStatusLineasResult;
    }

    /**
     * Define el valor de la propiedad getStatusLineasResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLineStatusInfo }
     *     
     */
    public void setGetStatusLineasResult(ArrayOfLineStatusInfo value) {
        this.getStatusLineasResult = value;
    }

}
