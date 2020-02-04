//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.04 a las 04:01:02 PM CET 
//


package Prueba;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Furgoneta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Furgoneta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.unican.es/ss/ImpuestoCirculacion}Vehiculo"&gt;
 *       &lt;attribute name="potencia" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="comercial" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Furgoneta")
public class Furgoneta
    extends Vehiculo
{

    @XmlAttribute(name = "potencia", required = true)
    protected double potencia;
    @XmlAttribute(name = "comercial", required = true)
    protected boolean comercial;

    /**
     * Obtiene el valor de la propiedad potencia.
     * 
     */
    public double getPotencia() {
        return potencia;
    }

    /**
     * Define el valor de la propiedad potencia.
     * 
     */
    public void setPotencia(double value) {
        this.potencia = value;
    }

    /**
     * Obtiene el valor de la propiedad comercial.
     * 
     */
    public boolean isComercial() {
        return comercial;
    }

    /**
     * Define el valor de la propiedad comercial.
     * 
     */
    public void setComercial(boolean value) {
        this.comercial = value;
    }

}
