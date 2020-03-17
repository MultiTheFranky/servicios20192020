
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="svcbus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="svccond" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cond" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "svcbus",
    "svccond",
    "cond"
})
@XmlRootElement(name = "GetInfoActividades")
public class GetInfoActividades {

    protected String svcbus;
    protected String svccond;
    protected int cond;

    /**
     * Obtiene el valor de la propiedad svcbus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcbus() {
        return svcbus;
    }

    /**
     * Define el valor de la propiedad svcbus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcbus(String value) {
        this.svcbus = value;
    }

    /**
     * Obtiene el valor de la propiedad svccond.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvccond() {
        return svccond;
    }

    /**
     * Define el valor de la propiedad svccond.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvccond(String value) {
        this.svccond = value;
    }

    /**
     * Obtiene el valor de la propiedad cond.
     * 
     */
    public int getCond() {
        return cond;
    }

    /**
     * Define el valor de la propiedad cond.
     * 
     */
    public void setCond(int value) {
        this.cond = value;
    }

}
