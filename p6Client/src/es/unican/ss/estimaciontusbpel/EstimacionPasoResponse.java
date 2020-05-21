
package es.unican.ss.estimaciontusbpel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="estimacion1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="estimacion2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "estimacion1",
    "estimacion2"
})
@XmlRootElement(name = "estimacionPasoResponse")
public class EstimacionPasoResponse {

    protected int estimacion1;
    protected int estimacion2;

    /**
     * Obtiene el valor de la propiedad estimacion1.
     * 
     */
    public int getEstimacion1() {
        return estimacion1;
    }

    /**
     * Define el valor de la propiedad estimacion1.
     * 
     */
    public void setEstimacion1(int value) {
        this.estimacion1 = value;
    }

    /**
     * Obtiene el valor de la propiedad estimacion2.
     * 
     */
    public int getEstimacion2() {
        return estimacion2;
    }

    /**
     * Define el valor de la propiedad estimacion2.
     * 
     */
    public void setEstimacion2(int value) {
        this.estimacion2 = value;
    }

}
