
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
 *         &lt;element name="GetStatusLineaResult" type="{http://tempuri.org/}LineStatusInfo"/>
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
    "getStatusLineaResult"
})
@XmlRootElement(name = "GetStatusLineaResponse")
public class GetStatusLineaResponse {

    @XmlElement(name = "GetStatusLineaResult", required = true)
    protected LineStatusInfo getStatusLineaResult;

    /**
     * Obtiene el valor de la propiedad getStatusLineaResult.
     * 
     * @return
     *     possible object is
     *     {@link LineStatusInfo }
     *     
     */
    public LineStatusInfo getGetStatusLineaResult() {
        return getStatusLineaResult;
    }

    /**
     * Define el valor de la propiedad getStatusLineaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link LineStatusInfo }
     *     
     */
    public void setGetStatusLineaResult(LineStatusInfo value) {
        this.getStatusLineaResult = value;
    }

}
