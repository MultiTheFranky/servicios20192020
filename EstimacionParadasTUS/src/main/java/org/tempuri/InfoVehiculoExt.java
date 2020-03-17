
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para infoVehiculoExt complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="infoVehiculoExt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vehiculoId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cocheId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="servicioId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conductor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conductorId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="estadoServicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sentido" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ultimaParada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proximaSalida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HoraProximaSalida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="desfase" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="estadoLocalizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dutyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HoraProximoRelevo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proximoRelevo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proximoConductor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lineaLbl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "infoVehiculoExt", propOrder = {
    "vehiculoId",
    "cocheId",
    "servicioId",
    "conductor",
    "conductorId",
    "estadoServicio",
    "sentido",
    "ultimaParada",
    "proximaSalida",
    "horaProximaSalida",
    "desfase",
    "estadoLocalizacion",
    "dutyId",
    "horaProximoRelevo",
    "proximoRelevo",
    "proximoConductor",
    "lineaLbl"
})
public class InfoVehiculoExt {

    protected int vehiculoId;
    protected int cocheId;
    protected String servicioId;
    protected String conductor;
    protected int conductorId;
    protected String estadoServicio;
    protected int sentido;
    protected String ultimaParada;
    protected String proximaSalida;
    @XmlElement(name = "HoraProximaSalida")
    protected String horaProximaSalida;
    protected int desfase;
    protected String estadoLocalizacion;
    protected String dutyId;
    @XmlElement(name = "HoraProximoRelevo")
    protected String horaProximoRelevo;
    protected String proximoRelevo;
    protected int proximoConductor;
    protected String lineaLbl;

    /**
     * Obtiene el valor de la propiedad vehiculoId.
     * 
     */
    public int getVehiculoId() {
        return vehiculoId;
    }

    /**
     * Define el valor de la propiedad vehiculoId.
     * 
     */
    public void setVehiculoId(int value) {
        this.vehiculoId = value;
    }

    /**
     * Obtiene el valor de la propiedad cocheId.
     * 
     */
    public int getCocheId() {
        return cocheId;
    }

    /**
     * Define el valor de la propiedad cocheId.
     * 
     */
    public void setCocheId(int value) {
        this.cocheId = value;
    }

    /**
     * Obtiene el valor de la propiedad servicioId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicioId() {
        return servicioId;
    }

    /**
     * Define el valor de la propiedad servicioId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicioId(String value) {
        this.servicioId = value;
    }

    /**
     * Obtiene el valor de la propiedad conductor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConductor() {
        return conductor;
    }

    /**
     * Define el valor de la propiedad conductor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConductor(String value) {
        this.conductor = value;
    }

    /**
     * Obtiene el valor de la propiedad conductorId.
     * 
     */
    public int getConductorId() {
        return conductorId;
    }

    /**
     * Define el valor de la propiedad conductorId.
     * 
     */
    public void setConductorId(int value) {
        this.conductorId = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoServicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoServicio() {
        return estadoServicio;
    }

    /**
     * Define el valor de la propiedad estadoServicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoServicio(String value) {
        this.estadoServicio = value;
    }

    /**
     * Obtiene el valor de la propiedad sentido.
     * 
     */
    public int getSentido() {
        return sentido;
    }

    /**
     * Define el valor de la propiedad sentido.
     * 
     */
    public void setSentido(int value) {
        this.sentido = value;
    }

    /**
     * Obtiene el valor de la propiedad ultimaParada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUltimaParada() {
        return ultimaParada;
    }

    /**
     * Define el valor de la propiedad ultimaParada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUltimaParada(String value) {
        this.ultimaParada = value;
    }

    /**
     * Obtiene el valor de la propiedad proximaSalida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProximaSalida() {
        return proximaSalida;
    }

    /**
     * Define el valor de la propiedad proximaSalida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProximaSalida(String value) {
        this.proximaSalida = value;
    }

    /**
     * Obtiene el valor de la propiedad horaProximaSalida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraProximaSalida() {
        return horaProximaSalida;
    }

    /**
     * Define el valor de la propiedad horaProximaSalida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraProximaSalida(String value) {
        this.horaProximaSalida = value;
    }

    /**
     * Obtiene el valor de la propiedad desfase.
     * 
     */
    public int getDesfase() {
        return desfase;
    }

    /**
     * Define el valor de la propiedad desfase.
     * 
     */
    public void setDesfase(int value) {
        this.desfase = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoLocalizacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoLocalizacion() {
        return estadoLocalizacion;
    }

    /**
     * Define el valor de la propiedad estadoLocalizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoLocalizacion(String value) {
        this.estadoLocalizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad dutyId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDutyId() {
        return dutyId;
    }

    /**
     * Define el valor de la propiedad dutyId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDutyId(String value) {
        this.dutyId = value;
    }

    /**
     * Obtiene el valor de la propiedad horaProximoRelevo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraProximoRelevo() {
        return horaProximoRelevo;
    }

    /**
     * Define el valor de la propiedad horaProximoRelevo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraProximoRelevo(String value) {
        this.horaProximoRelevo = value;
    }

    /**
     * Obtiene el valor de la propiedad proximoRelevo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProximoRelevo() {
        return proximoRelevo;
    }

    /**
     * Define el valor de la propiedad proximoRelevo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProximoRelevo(String value) {
        this.proximoRelevo = value;
    }

    /**
     * Obtiene el valor de la propiedad proximoConductor.
     * 
     */
    public int getProximoConductor() {
        return proximoConductor;
    }

    /**
     * Define el valor de la propiedad proximoConductor.
     * 
     */
    public void setProximoConductor(int value) {
        this.proximoConductor = value;
    }

    /**
     * Obtiene el valor de la propiedad lineaLbl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineaLbl() {
        return lineaLbl;
    }

    /**
     * Define el valor de la propiedad lineaLbl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineaLbl(String value) {
        this.lineaLbl = value;
    }

}
