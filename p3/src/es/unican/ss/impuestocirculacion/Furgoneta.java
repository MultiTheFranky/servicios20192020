
package es.unican.ss.impuestocirculacion;

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
 * &lt;complexType name="Furgoneta">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.unican.es/ss/ImpuestoCirculacion}Vehiculo">
 *       &lt;attribute name="potencia" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="comercial" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
