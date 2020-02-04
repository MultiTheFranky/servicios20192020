//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.04 a las 04:18:59 PM CET 
//


package es.unican.ps.impuestoCirculacion.domain;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Motocicleta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Motocicleta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.unican.es/ss/ImpuestoCirculacion}Vehiculo"&gt;
 *       &lt;attribute name="cilindrada" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Motocicleta")
public class Motocicleta
    extends Vehiculo
{

    @XmlAttribute(name = "cilindrada", required = true)
    protected int cilindrada;

    /**
     * Obtiene el valor de la propiedad cilindrada.
     * 
     * @return
     *     possible object is
     *     {@link int }
     *     
     */
    public int getCilindrada() {
        return cilindrada;
    }

    /**
     * Define el valor de la propiedad cilindrada.
     * 
     * @param value
     *     allowed object is
     *     {@link int }
     *     
     */
    public void setCilindrada(int value) {
        this.cilindrada = value;
    }

    /**
     * Calcula el impuesto a pagar
     *  @return precio
     */
	@Override
    public double calculaPrecio() {
    	double precio;
    	if (cilindrada < 125) {
    		precio = 8.84;
    	} else if (cilindrada < 250) {
    		precio = 15.14;
    	} else if (cilindrada < 500) {
    		precio = 30.30;
    	} else if(cilindrada <1000) {
    		precio = 60.58;
    	} else {
    		precio = 121.16;
    	}
    	return precio;
    }

}
