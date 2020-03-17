
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ActividadesInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ActividadesInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="linea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="macro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coche" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="viaje" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="servBus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servCond" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conductor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="actividad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hTeor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hRef" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hReal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActividadesInfo", propOrder = {
    "linea",
    "macro",
    "coche",
    "viaje",
    "servBus",
    "servCond",
    "label",
    "conductor",
    "actividad",
    "hTeor",
    "hRef",
    "hReal"
})
public class ActividadesInfo {

    protected String linea;
    protected String macro;
    protected int coche;
    protected int viaje;
    protected String servBus;
    protected String servCond;
    protected String label;
    protected int conductor;
    protected String actividad;
    protected int hTeor;
    protected int hRef;
    protected int hReal;

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
     * Obtiene el valor de la propiedad macro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMacro() {
        return macro;
    }

    /**
     * Define el valor de la propiedad macro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMacro(String value) {
        this.macro = value;
    }

    /**
     * Obtiene el valor de la propiedad coche.
     * 
     */
    public int getCoche() {
        return coche;
    }

    /**
     * Define el valor de la propiedad coche.
     * 
     */
    public void setCoche(int value) {
        this.coche = value;
    }

    /**
     * Obtiene el valor de la propiedad viaje.
     * 
     */
    public int getViaje() {
        return viaje;
    }

    /**
     * Define el valor de la propiedad viaje.
     * 
     */
    public void setViaje(int value) {
        this.viaje = value;
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
     * Obtiene el valor de la propiedad label.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Define el valor de la propiedad label.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
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
     * Obtiene el valor de la propiedad actividad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActividad() {
        return actividad;
    }

    /**
     * Define el valor de la propiedad actividad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActividad(String value) {
        this.actividad = value;
    }

    /**
     * Obtiene el valor de la propiedad hTeor.
     * 
     */
    public int getHTeor() {
        return hTeor;
    }

    /**
     * Define el valor de la propiedad hTeor.
     * 
     */
    public void setHTeor(int value) {
        this.hTeor = value;
    }

    /**
     * Obtiene el valor de la propiedad hRef.
     * 
     */
    public int getHRef() {
        return hRef;
    }

    /**
     * Define el valor de la propiedad hRef.
     * 
     */
    public void setHRef(int value) {
        this.hRef = value;
    }

    /**
     * Obtiene el valor de la propiedad hReal.
     * 
     */
    public int getHReal() {
        return hReal;
    }

    /**
     * Define el valor de la propiedad hReal.
     * 
     */
    public void setHReal(int value) {
        this.hReal = value;
    }

}
