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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Motocicleta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Motocicleta">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.example.org/ss/ImpuestoCirculacion}Vehiculo">
 *       &lt;attribute name="cilindrada" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Motocicleta")
public class Motocicleta
    extends Vehiculo
{

    @XmlAttribute(required = true)
    private int cilindrada;

    /**
     * Obtiene el valor de la propiedad cilindrada.
     * 
     */
    public int getCilindrada() {
        return cilindrada;
    }

    /**
     * Define el valor de la propiedad cilindrada.
     * 
     */
    public void setCilindrada(int value) {
        this.cilindrada = value;
    }
    
    /**
     * Calcula el impuesto a pagar
     *  @return precio
     */
    @SuppressWarnings("deprecation")
	@Override
    public double calculaPrecio() {
    	Date d = new Date();
    	double precio;
    	
    	if(d.getYear()-fecha1Matriculacion.getYear() > 25) {
    		precio=0.0;
    	} else {
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
    	}
	    	
    	return precio;
    }

}
