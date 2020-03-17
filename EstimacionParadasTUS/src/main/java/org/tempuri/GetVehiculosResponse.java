
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
 *         &lt;element name="GetVehiculosResult" type="{http://tempuri.org/}ArrayOfInfoVehiculo" minOccurs="0"/>
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
    "getVehiculosResult"
})
@XmlRootElement(name = "GetVehiculosResponse")
public class GetVehiculosResponse {

    @XmlElement(name = "GetVehiculosResult")
    protected ArrayOfInfoVehiculo getVehiculosResult;

    /**
     * Obtiene el valor de la propiedad getVehiculosResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInfoVehiculo }
     *     
     */
    public ArrayOfInfoVehiculo getGetVehiculosResult() {
        return getVehiculosResult;
    }

    /**
     * Define el valor de la propiedad getVehiculosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInfoVehiculo }
     *     
     */
    public void setGetVehiculosResult(ArrayOfInfoVehiculo value) {
        this.getVehiculosResult = value;
    }

}
