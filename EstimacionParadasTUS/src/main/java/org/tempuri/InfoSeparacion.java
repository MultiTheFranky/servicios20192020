
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InfoSeparacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InfoSeparacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tiempo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="espacio" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoSeparacion", propOrder = {
    "tiempo",
    "espacio",
    "estado"
})
public class InfoSeparacion {

    protected short tiempo;
    protected short espacio;
    @XmlSchemaType(name = "unsignedByte")
    protected short estado;

    /**
     * Obtiene el valor de la propiedad tiempo.
     * 
     */
    public short getTiempo() {
        return tiempo;
    }

    /**
     * Define el valor de la propiedad tiempo.
     * 
     */
    public void setTiempo(short value) {
        this.tiempo = value;
    }

    /**
     * Obtiene el valor de la propiedad espacio.
     * 
     */
    public short getEspacio() {
        return espacio;
    }

    /**
     * Define el valor de la propiedad espacio.
     * 
     */
    public void setEspacio(short value) {
        this.espacio = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     */
    public short getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     */
    public void setEstado(short value) {
        this.estado = value;
    }

}
