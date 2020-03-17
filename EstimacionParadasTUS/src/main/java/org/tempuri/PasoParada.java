
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PasoParada complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PasoParada">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabecera" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="e1" type="{http://tempuri.org/}Estimacion" minOccurs="0"/>
 *         &lt;element name="e2" type="{http://tempuri.org/}Estimacion" minOccurs="0"/>
 *         &lt;element name="linea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ruta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sublinea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PasoParada", propOrder = {
    "cabecera",
    "e1",
    "e2",
    "linea",
    "parada",
    "ruta",
    "sublinea"
})
public class PasoParada {

    protected boolean cabecera;
    protected Estimacion e1;
    protected Estimacion e2;
    protected String linea;
    protected String parada;
    protected String ruta;
    protected String sublinea;

    /**
     * Obtiene el valor de la propiedad cabecera.
     * 
     */
    public boolean isCabecera() {
        return cabecera;
    }

    /**
     * Define el valor de la propiedad cabecera.
     * 
     */
    public void setCabecera(boolean value) {
        this.cabecera = value;
    }

    /**
     * Obtiene el valor de la propiedad e1.
     * 
     * @return
     *     possible object is
     *     {@link Estimacion }
     *     
     */
    public Estimacion getE1() {
        return e1;
    }

    /**
     * Define el valor de la propiedad e1.
     * 
     * @param value
     *     allowed object is
     *     {@link Estimacion }
     *     
     */
    public void setE1(Estimacion value) {
        this.e1 = value;
    }

    /**
     * Obtiene el valor de la propiedad e2.
     * 
     * @return
     *     possible object is
     *     {@link Estimacion }
     *     
     */
    public Estimacion getE2() {
        return e2;
    }

    /**
     * Define el valor de la propiedad e2.
     * 
     * @param value
     *     allowed object is
     *     {@link Estimacion }
     *     
     */
    public void setE2(Estimacion value) {
        this.e2 = value;
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
     * Obtiene el valor de la propiedad parada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParada() {
        return parada;
    }

    /**
     * Define el valor de la propiedad parada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParada(String value) {
        this.parada = value;
    }

    /**
     * Obtiene el valor de la propiedad ruta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuta() {
        return ruta;
    }

    /**
     * Define el valor de la propiedad ruta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuta(String value) {
        this.ruta = value;
    }

    /**
     * Obtiene el valor de la propiedad sublinea.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSublinea() {
        return sublinea;
    }

    /**
     * Define el valor de la propiedad sublinea.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSublinea(String value) {
        this.sublinea = value;
    }

}
