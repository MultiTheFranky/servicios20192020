
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
 *         &lt;element name="XGetPasoParadaREGResult" type="{http://tempuri.org/}ArrayOfPasoParada" minOccurs="0"/>
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
    "xGetPasoParadaREGResult",
    "status"
})
@XmlRootElement(name = "XGetPasoParadaREGResponse")
public class XGetPasoParadaREGResponse {

    @XmlElement(name = "XGetPasoParadaREGResult")
    protected ArrayOfPasoParada xGetPasoParadaREGResult;
    protected int status;

    /**
     * Obtiene el valor de la propiedad xGetPasoParadaREGResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPasoParada }
     *     
     */
    public ArrayOfPasoParada getXGetPasoParadaREGResult() {
        return xGetPasoParadaREGResult;
    }

    /**
     * Define el valor de la propiedad xGetPasoParadaREGResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPasoParada }
     *     
     */
    public void setXGetPasoParadaREGResult(ArrayOfPasoParada value) {
        this.xGetPasoParadaREGResult = value;
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
