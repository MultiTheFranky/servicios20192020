
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InfoPosicion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InfoPosicion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="seccion" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="offset" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoPosicion", propOrder = {
    "seccion",
    "offset"
})
public class InfoPosicion {

    @XmlSchemaType(name = "unsignedByte")
    protected short seccion;
    protected short offset;

    /**
     * Obtiene el valor de la propiedad seccion.
     * 
     */
    public short getSeccion() {
        return seccion;
    }

    /**
     * Define el valor de la propiedad seccion.
     * 
     */
    public void setSeccion(short value) {
        this.seccion = value;
    }

    /**
     * Obtiene el valor de la propiedad offset.
     * 
     */
    public short getOffset() {
        return offset;
    }

    /**
     * Define el valor de la propiedad offset.
     * 
     */
    public void setOffset(short value) {
        this.offset = value;
    }

}
