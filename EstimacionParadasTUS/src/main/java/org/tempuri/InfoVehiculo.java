
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InfoVehiculo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InfoVehiculo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vehiculo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="linea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sublinea" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="coche" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="serv_bus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conductor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="serv_cond" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="estadoLocReal" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="xcoord" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ycoord" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoVehiculo", propOrder = {
    "vehiculo",
    "linea",
    "sublinea",
    "coche",
    "servBus",
    "conductor",
    "servCond",
    "estado",
    "estadoLocReal",
    "xcoord",
    "ycoord"
})
public class InfoVehiculo {

    protected short vehiculo;
    protected String linea;
    protected short sublinea;
    @XmlSchemaType(name = "unsignedByte")
    protected short coche;
    @XmlElement(name = "serv_bus")
    protected String servBus;
    protected int conductor;
    @XmlElement(name = "serv_cond")
    protected String servCond;
    protected int estado;
    @XmlSchemaType(name = "unsignedByte")
    protected short estadoLocReal;
    protected int xcoord;
    protected int ycoord;

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
     * Obtiene el valor de la propiedad linea.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinea() {
        return linea;
    }

    /**
     * Define el valor de la propiedad linea.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinea(String value) {
        this.linea = value;
    }

    /**
     * Obtiene el valor de la propiedad sublinea.
     * 
     */
    public short getSublinea() {
        return sublinea;
    }

    /**
     * Define el valor de la propiedad sublinea.
     * 
     */
    public void setSublinea(short value) {
        this.sublinea = value;
    }

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
     * Obtiene el valor de la propiedad xcoord.
     * 
     */
    public int getXcoord() {
        return xcoord;
    }

    /**
     * Define el valor de la propiedad xcoord.
     * 
     */
    public void setXcoord(int value) {
        this.xcoord = value;
    }

    /**
     * Obtiene el valor de la propiedad ycoord.
     * 
     */
    public int getYcoord() {
        return ycoord;
    }

    /**
     * Define el valor de la propiedad ycoord.
     * 
     */
    public void setYcoord(int value) {
        this.ycoord = value;
    }

}
