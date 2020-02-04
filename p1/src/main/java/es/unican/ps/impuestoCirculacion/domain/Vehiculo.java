//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.04 a las 04:01:02 PM CET 
//


package es.unican.ps.impuestoCirculacion.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para Vehiculo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Vehiculo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="contribuyente" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
 *       &lt;attribute name="matricula" use="required" type="{http://www.unican.es/ss/ImpuestoCirculacion}MatriculaType" /&gt;
 *       &lt;attribute name="fecha1Matriculacion" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vehiculo")
@XmlSeeAlso({
    Turismo.class,
    Motocicleta.class,
    Furgoneta.class
})
public abstract class Vehiculo {

    @XmlAttribute(name = "contribuyente")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object contribuyente;
    @XmlAttribute(name = "matricula", required = true)
    protected String matricula;
    @XmlAttribute(name = "fecha1Matriculacion")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fecha1Matriculacion;

    /**
     * Obtiene el valor de la propiedad contribuyente.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getContribuyente() {
        return contribuyente;
    }

    /**
     * Define el valor de la propiedad contribuyente.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setContribuyente(Object value) {
        this.contribuyente = value;
    }

    /**
     * Obtiene el valor de la propiedad matricula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Define el valor de la propiedad matricula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatricula(String value) {
        this.matricula = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha1Matriculacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha1Matriculacion() {
        return fecha1Matriculacion;
    }

    /**
     * Define el valor de la propiedad fecha1Matriculacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha1Matriculacion(XMLGregorianCalendar value) {
        this.fecha1Matriculacion = value;
    }

}
