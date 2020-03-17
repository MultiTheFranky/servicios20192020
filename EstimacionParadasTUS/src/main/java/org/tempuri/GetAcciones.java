
package org.tempuri;

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
 *         &lt;element name="macro" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="linea" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="coche" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="vehiculo" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "macro",
    "linea",
    "coche",
    "vehiculo"
})
@XmlRootElement(name = "GetAcciones")
public class GetAcciones {

    protected int macro;
    protected int linea;
    protected int coche;
    protected int vehiculo;

    /**
     * Obtiene el valor de la propiedad macro.
     * 
     */
    public int getMacro() {
        return macro;
    }

    /**
     * Define el valor de la propiedad macro.
     * 
     */
    public void setMacro(int value) {
        this.macro = value;
    }

    /**
     * Obtiene el valor de la propiedad linea.
     * 
     */
    public int getLinea() {
        return linea;
    }

    /**
     * Define el valor de la propiedad linea.
     * 
     */
    public void setLinea(int value) {
        this.linea = value;
    }

    /**
     * Obtiene el valor de la propiedad coche.
     * 
     */
    public int getCoche() {
        return coche;
    }

    /**
     * Define el valor de la propiedad coche.
     * 
     */
    public void setCoche(int value) {
        this.coche = value;
    }

    /**
     * Obtiene el valor de la propiedad vehiculo.
     * 
     */
    public int getVehiculo() {
        return vehiculo;
    }

    /**
     * Define el valor de la propiedad vehiculo.
     * 
     */
    public void setVehiculo(int value) {
        this.vehiculo = value;
    }

}
