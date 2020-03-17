
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InfoHeaderEvent complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InfoHeaderEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hora_llegada" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hora_salida" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hora_referencia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hora_teorica" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="espera" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="coche" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="viaje" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="llegada_ejecutada" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="salida_ejecutada" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="servicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoHeaderEvent", propOrder = {
    "horaLlegada",
    "horaSalida",
    "horaReferencia",
    "horaTeorica",
    "espera",
    "coche",
    "viaje",
    "llegadaEjecutada",
    "salidaEjecutada",
    "servicio"
})
public class InfoHeaderEvent {

    @XmlElement(name = "hora_llegada")
    protected int horaLlegada;
    @XmlElement(name = "hora_salida")
    protected int horaSalida;
    @XmlElement(name = "hora_referencia")
    protected int horaReferencia;
    @XmlElement(name = "hora_teorica")
    protected int horaTeorica;
    protected int espera;
    @XmlSchemaType(name = "unsignedByte")
    protected short coche;
    @XmlSchemaType(name = "unsignedByte")
    protected short viaje;
    @XmlElement(name = "llegada_ejecutada")
    @XmlSchemaType(name = "unsignedByte")
    protected short llegadaEjecutada;
    @XmlElement(name = "salida_ejecutada")
    @XmlSchemaType(name = "unsignedByte")
    protected short salidaEjecutada;
    protected String servicio;

    /**
     * Obtiene el valor de la propiedad horaLlegada.
     * 
     */
    public int getHoraLlegada() {
        return horaLlegada;
    }

    /**
     * Define el valor de la propiedad horaLlegada.
     * 
     */
    public void setHoraLlegada(int value) {
        this.horaLlegada = value;
    }

    /**
     * Obtiene el valor de la propiedad horaSalida.
     * 
     */
    public int getHoraSalida() {
        return horaSalida;
    }

    /**
     * Define el valor de la propiedad horaSalida.
     * 
     */
    public void setHoraSalida(int value) {
        this.horaSalida = value;
    }

    /**
     * Obtiene el valor de la propiedad horaReferencia.
     * 
     */
    public int getHoraReferencia() {
        return horaReferencia;
    }

    /**
     * Define el valor de la propiedad horaReferencia.
     * 
     */
    public void setHoraReferencia(int value) {
        this.horaReferencia = value;
    }

    /**
     * Obtiene el valor de la propiedad horaTeorica.
     * 
     */
    public int getHoraTeorica() {
        return horaTeorica;
    }

    /**
     * Define el valor de la propiedad horaTeorica.
     * 
     */
    public void setHoraTeorica(int value) {
        this.horaTeorica = value;
    }

    /**
     * Obtiene el valor de la propiedad espera.
     * 
     */
    public int getEspera() {
        return espera;
    }

    /**
     * Define el valor de la propiedad espera.
     * 
     */
    public void setEspera(int value) {
        this.espera = value;
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
     * Obtiene el valor de la propiedad viaje.
     * 
     */
    public short getViaje() {
        return viaje;
    }

    /**
     * Define el valor de la propiedad viaje.
     * 
     */
    public void setViaje(short value) {
        this.viaje = value;
    }

    /**
     * Obtiene el valor de la propiedad llegadaEjecutada.
     * 
     */
    public short getLlegadaEjecutada() {
        return llegadaEjecutada;
    }

    /**
     * Define el valor de la propiedad llegadaEjecutada.
     * 
     */
    public void setLlegadaEjecutada(short value) {
        this.llegadaEjecutada = value;
    }

    /**
     * Obtiene el valor de la propiedad salidaEjecutada.
     * 
     */
    public short getSalidaEjecutada() {
        return salidaEjecutada;
    }

    /**
     * Define el valor de la propiedad salidaEjecutada.
     * 
     */
    public void setSalidaEjecutada(short value) {
        this.salidaEjecutada = value;
    }

    /**
     * Obtiene el valor de la propiedad servicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicio() {
        return servicio;
    }

    /**
     * Define el valor de la propiedad servicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicio(String value) {
        this.servicio = value;
    }

}
