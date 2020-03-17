
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InfoCoche complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InfoCoche">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="coche" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="vehiculo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="serv_bus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conductor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="serv_cond" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="estadoLocReal" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="pos_real" type="{http://tempuri.org/}InfoPosicion"/>
 *         &lt;element name="pos_teor" type="{http://tempuri.org/}InfoPosicion"/>
 *         &lt;element name="desfase" type="{http://tempuri.org/}InfoSeparacion"/>
 *         &lt;element name="frec_real" type="{http://tempuri.org/}InfoSeparacion"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoCoche", propOrder = {
    "coche",
    "vehiculo",
    "servBus",
    "conductor",
    "servCond",
    "estado",
    "estadoLocReal",
    "posReal",
    "posTeor",
    "desfase",
    "frecReal"
})
public class InfoCoche {

    @XmlSchemaType(name = "unsignedByte")
    protected short coche;
    protected short vehiculo;
    @XmlElement(name = "serv_bus")
    protected String servBus;
    protected int conductor;
    @XmlElement(name = "serv_cond")
    protected String servCond;
    protected int estado;
    @XmlSchemaType(name = "unsignedByte")
    protected short estadoLocReal;
    @XmlElement(name = "pos_real", required = true)
    protected InfoPosicion posReal;
    @XmlElement(name = "pos_teor", required = true)
    protected InfoPosicion posTeor;
    @XmlElement(required = true)
    protected InfoSeparacion desfase;
    @XmlElement(name = "frec_real", required = true)
    protected InfoSeparacion frecReal;

    /**
     * Obtiene el valor de la propiedad coche.
     * 
     */
    public short getCoche() {
        return coche;
    }

    /**
     * Define el valor de la propiedad coche.
     * 
     */
    public void setCoche(short value) {
        this.coche = value;
    }

    /**
     * Obtiene el valor de la propiedad vehiculo.
     * 
     */
    public short getVehiculo() {
        return vehiculo;
    }

    /**
     * Define el valor de la propiedad vehiculo.
     * 
     */
    public void setVehiculo(short value) {
        this.vehiculo = value;
    }

    /**
     * Obtiene el valor de la propiedad servBus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServBus() {
        return servBus;
    }

    /**
     * Define el valor de la propiedad servBus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServBus(String value) {
        this.servBus = value;
    }

    /**
     * Obtiene el valor de la propiedad conductor.
     * 
     */
    public int getConductor() {
        return conductor;
    }

    /**
     * Define el valor de la propiedad conductor.
     * 
     */
    public void setConductor(int value) {
        this.conductor = value;
    }

    /**
     * Obtiene el valor de la propiedad servCond.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServCond() {
        return servCond;
    }

    /**
     * Define el valor de la propiedad servCond.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServCond(String value) {
        this.servCond = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     */
    public int getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     */
    public void setEstado(int value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoLocReal.
     * 
     */
    public short getEstadoLocReal() {
        return estadoLocReal;
    }

    /**
     * Define el valor de la propiedad estadoLocReal.
     * 
     */
    public void setEstadoLocReal(short value) {
        this.estadoLocReal = value;
    }

    /**
     * Obtiene el valor de la propiedad posReal.
     * 
     * @return
     *     possible object is
     *     {@link InfoPosicion }
     *     
     */
    public InfoPosicion getPosReal() {
        return posReal;
    }

    /**
     * Define el valor de la propiedad posReal.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoPosicion }
     *     
     */
    public void setPosReal(InfoPosicion value) {
        this.posReal = value;
    }

    /**
     * Obtiene el valor de la propiedad posTeor.
     * 
     * @return
     *     possible object is
     *     {@link InfoPosicion }
     *     
     */
    public InfoPosicion getPosTeor() {
        return posTeor;
    }

    /**
     * Define el valor de la propiedad posTeor.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoPosicion }
     *     
     */
    public void setPosTeor(InfoPosicion value) {
        this.posTeor = value;
    }

    /**
     * Obtiene el valor de la propiedad desfase.
     * 
     * @return
     *     possible object is
     *     {@link InfoSeparacion }
     *     
     */
    public InfoSeparacion getDesfase() {
        return desfase;
    }

    /**
     * Define el valor de la propiedad desfase.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoSeparacion }
     *     
     */
    public void setDesfase(InfoSeparacion value) {
        this.desfase = value;
    }

    /**
     * Obtiene el valor de la propiedad frecReal.
     * 
     * @return
     *     possible object is
     *     {@link InfoSeparacion }
     *     
     */
    public InfoSeparacion getFrecReal() {
        return frecReal;
    }

    /**
     * Define el valor de la propiedad frecReal.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoSeparacion }
     *     
     */
    public void setFrecReal(InfoSeparacion value) {
        this.frecReal = value;
    }

}
