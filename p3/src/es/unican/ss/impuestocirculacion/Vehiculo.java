
package es.unican.ss.impuestocirculacion;

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
 * &lt;complexType name="Vehiculo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="contribuyente" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="matricula" use="required" type="{http://www.unican.es/ss/ImpuestoCirculacion}MatriculaType" />
 *       &lt;attribute name="fecha1Matriculacion" type="{http://www.w3.org/2001/XMLSchema}date" />
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

    @XmlAttribute(name = "contribuyente")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object contribuyente;
    @XmlAttribute(name = "matricula", required = true)
    protected String matricula;
    @XmlAttribute(name = "fecha1Matriculacion")
    @XmlSchemaType(name = "date")
    protected Date fecha1Matriculacion;

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
     *     {@link Date }
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
     *     {@link Date }
     *     
     */
    public void setFecha1Matriculacion(Date value) {
        this.fecha1Matriculacion = value;
    }

    /**
     * Calcula el impuesto a pagar. Sera sobreescrito por cada clase hija
     *  @return precio
     */
	public double calculaPrecio () {
		
    	return 0.0;
    }
    
}
