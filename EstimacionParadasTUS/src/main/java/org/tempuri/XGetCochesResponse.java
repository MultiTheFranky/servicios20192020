
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
 *         &lt;element name="XGetCochesResult" type="{http://tempuri.org/}ArrayOfInfoCoche" minOccurs="0"/>
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
    "xGetCochesResult"
})
@XmlRootElement(name = "XGetCochesResponse")
public class XGetCochesResponse {

    @XmlElement(name = "XGetCochesResult")
    protected ArrayOfInfoCoche xGetCochesResult;

    /**
     * Obtiene el valor de la propiedad xGetCochesResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInfoCoche }
     *     
     */
    public ArrayOfInfoCoche getXGetCochesResult() {
        return xGetCochesResult;
    }

    /**
     * Define el valor de la propiedad xGetCochesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInfoCoche }
     *     
     */
    public void setXGetCochesResult(ArrayOfInfoCoche value) {
        this.xGetCochesResult = value;
    }

}
