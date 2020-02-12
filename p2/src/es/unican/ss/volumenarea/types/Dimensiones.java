
package es.unican.ss.volumenarea.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Dimensiones complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Dimensiones">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alto" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ancho" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="largo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dimensiones", propOrder = {
    "alto",
    "ancho",
    "largo"
})
public class Dimensiones {

    protected double alto;
    protected double ancho;
    protected double largo;

    /**
     * Obtiene el valor de la propiedad alto.
     * 
     */
    public double getAlto() {
        return alto;
    }

    /**
     * Define el valor de la propiedad alto.
     * 
     */
    public void setAlto(double value) {
        this.alto = value;
    }

    /**
     * Obtiene el valor de la propiedad ancho.
     * 
     */
    public double getAncho() {
        return ancho;
    }

    /**
     * Define el valor de la propiedad ancho.
     * 
     */
    public void setAncho(double value) {
        this.ancho = value;
    }

    /**
     * Obtiene el valor de la propiedad largo.
     * 
     */
    public double getLargo() {
        return largo;
    }

    /**
     * Define el valor de la propiedad largo.
     * 
     */
    public void setLargo(double value) {
        this.largo = value;
    }

}
