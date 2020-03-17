
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LineStatusInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LineStatusInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="localizados" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="desf" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="desf_abs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="desf_bien" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="desf_regular" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="desf_adel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="desf_retr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="frec" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="frec_desf" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="frec_bien" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="frec_regular" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="frec_adel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="frec_retr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="graves" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="linea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineStatusInfo", propOrder = {
    "activos",
    "localizados",
    "desf",
    "desfAbs",
    "desfBien",
    "desfRegular",
    "desfAdel",
    "desfRetr",
    "frec",
    "frecDesf",
    "frecBien",
    "frecRegular",
    "frecAdel",
    "frecRetr",
    "graves",
    "linea"
})
public class LineStatusInfo {

    protected int activos;
    protected int localizados;
    protected int desf;
    @XmlElement(name = "desf_abs")
    protected int desfAbs;
    @XmlElement(name = "desf_bien")
    protected int desfBien;
    @XmlElement(name = "desf_regular")
    protected int desfRegular;
    @XmlElement(name = "desf_adel")
    protected int desfAdel;
    @XmlElement(name = "desf_retr")
    protected int desfRetr;
    protected int frec;
    @XmlElement(name = "frec_desf")
    protected int frecDesf;
    @XmlElement(name = "frec_bien")
    protected int frecBien;
    @XmlElement(name = "frec_regular")
    protected int frecRegular;
    @XmlElement(name = "frec_adel")
    protected int frecAdel;
    @XmlElement(name = "frec_retr")
    protected int frecRetr;
    protected int graves;
    protected String linea;

    /**
     * Obtiene el valor de la propiedad activos.
     * 
     */
    public int getActivos() {
        return activos;
    }

    /**
     * Define el valor de la propiedad activos.
     * 
     */
    public void setActivos(int value) {
        this.activos = value;
    }

    /**
     * Obtiene el valor de la propiedad localizados.
     * 
     */
    public int getLocalizados() {
        return localizados;
    }

    /**
     * Define el valor de la propiedad localizados.
     * 
     */
    public void setLocalizados(int value) {
        this.localizados = value;
    }

    /**
     * Obtiene el valor de la propiedad desf.
     * 
     */
    public int getDesf() {
        return desf;
    }

    /**
     * Define el valor de la propiedad desf.
     * 
     */
    public void setDesf(int value) {
        this.desf = value;
    }

    /**
     * Obtiene el valor de la propiedad desfAbs.
     * 
     */
    public int getDesfAbs() {
        return desfAbs;
    }

    /**
     * Define el valor de la propiedad desfAbs.
     * 
     */
    public void setDesfAbs(int value) {
        this.desfAbs = value;
    }

    /**
     * Obtiene el valor de la propiedad desfBien.
     * 
     */
    public int getDesfBien() {
        return desfBien;
    }

    /**
     * Define el valor de la propiedad desfBien.
     * 
     */
    public void setDesfBien(int value) {
        this.desfBien = value;
    }

    /**
     * Obtiene el valor de la propiedad desfRegular.
     * 
     */
    public int getDesfRegular() {
        return desfRegular;
    }

    /**
     * Define el valor de la propiedad desfRegular.
     * 
     */
    public void setDesfRegular(int value) {
        this.desfRegular = value;
    }

    /**
     * Obtiene el valor de la propiedad desfAdel.
     * 
     */
    public int getDesfAdel() {
        return desfAdel;
    }

    /**
     * Define el valor de la propiedad desfAdel.
     * 
     */
    public void setDesfAdel(int value) {
        this.desfAdel = value;
    }

    /**
     * Obtiene el valor de la propiedad desfRetr.
     * 
     */
    public int getDesfRetr() {
        return desfRetr;
    }

    /**
     * Define el valor de la propiedad desfRetr.
     * 
     */
    public void setDesfRetr(int value) {
        this.desfRetr = value;
    }

    /**
     * Obtiene el valor de la propiedad frec.
     * 
     */
    public int getFrec() {
        return frec;
    }

    /**
     * Define el valor de la propiedad frec.
     * 
     */
    public void setFrec(int value) {
        this.frec = value;
    }

    /**
     * Obtiene el valor de la propiedad frecDesf.
     * 
     */
    public int getFrecDesf() {
        return frecDesf;
    }

    /**
     * Define el valor de la propiedad frecDesf.
     * 
     */
    public void setFrecDesf(int value) {
        this.frecDesf = value;
    }

    /**
     * Obtiene el valor de la propiedad frecBien.
     * 
     */
    public int getFrecBien() {
        return frecBien;
    }

    /**
     * Define el valor de la propiedad frecBien.
     * 
     */
    public void setFrecBien(int value) {
        this.frecBien = value;
    }

    /**
     * Obtiene el valor de la propiedad frecRegular.
     * 
     */
    public int getFrecRegular() {
        return frecRegular;
    }

    /**
     * Define el valor de la propiedad frecRegular.
     * 
     */
    public void setFrecRegular(int value) {
        this.frecRegular = value;
    }

    /**
     * Obtiene el valor de la propiedad frecAdel.
     * 
     */
    public int getFrecAdel() {
        return frecAdel;
    }

    /**
     * Define el valor de la propiedad frecAdel.
     * 
     */
    public void setFrecAdel(int value) {
        this.frecAdel = value;
    }

    /**
     * Obtiene el valor de la propiedad frecRetr.
     * 
     */
    public int getFrecRetr() {
        return frecRetr;
    }

    /**
     * Define el valor de la propiedad frecRetr.
     * 
     */
    public void setFrecRetr(int value) {
        this.frecRetr = value;
    }

    /**
     * Obtiene el valor de la propiedad graves.
     * 
     */
    public int getGraves() {
        return graves;
    }

    /**
     * Define el valor de la propiedad graves.
     * 
     */
    public void setGraves(int value) {
        this.graves = value;
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

}
