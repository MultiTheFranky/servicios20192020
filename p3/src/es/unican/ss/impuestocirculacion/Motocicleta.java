
package es.unican.ss.impuestocirculacion;

import java.math.BigInteger;
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
 *     &lt;extension base="{http://www.unican.es/ss/ImpuestoCirculacion}Vehiculo">
 *       &lt;attribute name="cilindrada" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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

    @XmlAttribute(name = "cilindrada", required = true)
    protected BigInteger cilindrada;

    /**
     * Obtiene el valor de la propiedad cilindrada.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCilindrada() {
        return cilindrada;
    }

    /**
     * Define el valor de la propiedad cilindrada.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCilindrada(BigInteger value) {
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
