
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
 *         &lt;element name="GetPasoParadaREGResult" type="{http://tempuri.org/}ArrayOfPasoParada" minOccurs="0"/>
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
    "getPasoParadaREGResult",
    "status"
})
@XmlRootElement(name = "GetPasoParadaREGResponse")
public class GetPasoParadaREGResponse {

    @XmlElement(name = "GetPasoParadaREGResult")
    protected ArrayOfPasoParada getPasoParadaREGResult;
    protected int status;

    /**
     * Obtiene el valor de la propiedad getPasoParadaREGResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPasoParada }
     *     
     */
    public ArrayOfPasoParada getGetPasoParadaREGResult() {
        return getPasoParadaREGResult;
    }

    /**
     * Define el valor de la propiedad getPasoParadaREGResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPasoParada }
     *     
     */
    public void setGetPasoParadaREGResult(ArrayOfPasoParada value) {
        this.getPasoParadaREGResult = value;
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
