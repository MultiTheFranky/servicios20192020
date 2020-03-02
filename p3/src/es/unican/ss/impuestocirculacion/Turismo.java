
package es.unican.ss.impuestocirculacion;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Turismo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Turismo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.unican.es/ss/ImpuestoCirculacion}Vehiculo">
 *       &lt;attribute name="potencia" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Turismo")
public class Turismo
    extends Vehiculo
{

    @XmlAttribute(name = "potencia", required = true)
    protected BigDecimal potencia;

    /**
     * Obtiene el valor de la propiedad potencia.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPotencia() {
        return potencia;
    }

    /**
     * Define el valor de la propiedad potencia.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPotencia(BigDecimal value) {
        this.potencia = value;
    }

    /**
     * Calcula el impuesto a pagar
     *  @return precio
     */
    @SuppressWarnings("deprecation")
	@Override
    public double calculaPrecio() {
    	double precio;
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
    	
    	return precio;
    }

}
