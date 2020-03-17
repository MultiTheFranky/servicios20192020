
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
 *         &lt;element name="XGetVehiculosResult" type="{http://tempuri.org/}ArrayOfInfoVehiculo" minOccurs="0"/>
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
    "xGetVehiculosResult"
})
@XmlRootElement(name = "XGetVehiculosResponse")
public class XGetVehiculosResponse {

    @XmlElement(name = "XGetVehiculosResult")
    protected ArrayOfInfoVehiculo xGetVehiculosResult;

    /**
     * Obtiene el valor de la propiedad xGetVehiculosResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInfoVehiculo }
     *     
     */
    public ArrayOfInfoVehiculo getXGetVehiculosResult() {
        return xGetVehiculosResult;
    }

    /**
     * Define el valor de la propiedad xGetVehiculosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInfoVehiculo }
     *     
     */
    public void setXGetVehiculosResult(ArrayOfInfoVehiculo value) {
        this.xGetVehiculosResult = value;
    }

}
