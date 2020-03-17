
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfPasoParada complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPasoParada">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PasoParada" type="{http://tempuri.org/}PasoParada" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPasoParada", propOrder = {
    "pasoParada"
})
public class ArrayOfPasoParada {

    @XmlElement(name = "PasoParada", nillable = true)
    protected List<PasoParada> pasoParada;

    /**
     * Gets the value of the pasoParada property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pasoParada property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPasoParada().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PasoParada }
     * 
     * 
     */
    public List<PasoParada> getPasoParada() {
        if (pasoParada == null) {
            pasoParada = new ArrayList<PasoParada>();
        }
        return this.pasoParada;
    }

}
