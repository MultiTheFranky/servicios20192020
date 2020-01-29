//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2014.10.08 a las 09:44:31 AM CEST 
//


package es.unican.ps.impuestoCirculacion.domain;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * &lt;complexType name="Vehiculo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="matricula" use="required" type="{http://www.example.org/ss/ImpuestoCirculacion}Matricula" />
 *       &lt;attribute name="Fecha1Matriculacion" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vehiculo")
@XmlSeeAlso({
    Motocicleta.class,
    Furgoneta.class,
    Turismo.class
})
public abstract class Vehiculo {

    @XmlAttribute(required = true)
    private String matricula;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "date")
    protected Date fecha1Matriculacion;

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
    public Date getFecha1Matriculacion() {
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
    public void setFecha1Matriculacion(Date value) {
        this.fecha1Matriculacion = value;
    }
    
    public double getPotencia(){
    	return 0.0;
    }
    
    public int getCilindrada(){
    	return 0;
    }
    
    /**
     * Calcula el impuesto a pagar. Sera sobreescrito por cada clase hija
     *  @return precio
     */
	public double calculaPrecio () {
		
    	return 0.0;
    }
    
    
    
    
   

}
