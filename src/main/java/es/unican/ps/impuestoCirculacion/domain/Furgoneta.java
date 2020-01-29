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
 * <p>Clase Java para Furgoneta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Furgoneta">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.example.org/ss/ImpuestoCirculacion}Vehiculo">
 *       &lt;attribute name="potencia" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
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

    @XmlAttribute(required = true)
    private double potencia;
    
    @XmlAttribute(required = true)
    private boolean comercial;

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
     * Define el valor de la propiedad comercial.
     * 
     */
    public void setComercial(boolean value) {
    	this.comercial=value;
    }
    
    /**
     * Calcula el impuesto a pagar
     *  @return precio
     */
    @SuppressWarnings("deprecation")
	@Override
    public double calculaPrecio() {
    	Date d = new Date();
    	double precio=0.0;
    		
    	if(d.getYear()-fecha1Matriculacion.getYear() > 25) {
    		precio=0.0;
    	} else {
    		
    		if (potencia < 8) {
    			precio = 25.24;
	    	} else if (potencia < 11.99) {
	    		precio = 68.16;
	    	} else if (potencia < 15.99) {
	    		precio = 143.88;
	    	} else if(potencia <19.99) {
	    		precio = 179.22;
	    	} else {
	    		precio = 224.0;
	    	}
	    	
	    	if (comercial) {
	    		precio=precio*0.8;
	    	}
    	}
	    	
    	return precio;
    	
    }

}
