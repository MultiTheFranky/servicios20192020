
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
 *         &lt;element name="GetPasoParadaResult" type="{http://tempuri.org/}ArrayOfPasoParada" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "getPasoParadaResult",
    "status"
})
@XmlRootElement(name = "GetPasoParadaResponse")
public class GetPasoParadaResponse {

    @XmlElement(name = "GetPasoParadaResult")
    protected ArrayOfPasoParada getPasoParadaResult;
    protected int status;

    /**
     * Obtiene el valor de la propiedad getPasoParadaResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPasoParada }
     *     
     */
    public ArrayOfPasoParada getGetPasoParadaResult() {
        return getPasoParadaResult;
    }

    /**
     * Define el valor de la propiedad getPasoParadaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPasoParada }
     *     
     */
    public void setGetPasoParadaResult(ArrayOfPasoParada value) {
        this.getPasoParadaResult = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

}
