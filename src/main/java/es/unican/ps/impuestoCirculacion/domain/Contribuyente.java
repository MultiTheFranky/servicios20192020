//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2014.10.08 a las 09:44:31 AM CEST 
//


package es.unican.ps.impuestoCirculacion.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Contribuyente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Contribuyente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="turismo" type="{http://www.example.org/ss/ImpuestoCirculacion}Turismo"/>
 *         &lt;element name="furgoneta" type="{http://www.example.org/ss/ImpuestoCirculacion}Furgoneta"/>
 *         &lt;element name="motocicleta" type="{http://www.example.org/ss/ImpuestoCirculacion}Motocicleta"/>
 *       &lt;/choice>
 *       &lt;attribute name="Nombre" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Apellido1" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Apellido2" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dni" use="required" type="{http://www.example.org/ss/ImpuestoCirculacion}DNI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Contribuyente {

    @XmlElements({
        @XmlElement(name = "turismo", type = Turismo.class),
        @XmlElement(name = "furgoneta", type = Furgoneta.class),
        @XmlElement(name = "motocicleta", type = Motocicleta.class)
    })
    private List<Vehiculo> vehiculos;
    @XmlAttribute(required = true)
    private String nombre;
    @XmlAttribute(required = true)
    private String apellido1;
    @XmlAttribute(required = true)
    private String apellido2;
    @XmlAttribute(required = true)
    private String dni;
    
    
    public Contribuyente(){}
    

    public Contribuyente(String nombre, String apellido1, String apellido2, String dni) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
	}


	/**
     * Gets the value of the turismoOrFurgonetaOrMotocicleta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the turismoOrFurgonetaOrMotocicleta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTurismoOrFurgonetaOrMotocicleta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Turismo }
     * {@link Furgoneta }
     * {@link Motocicleta }
     * 
     * 
     */
    public List<Vehiculo> getVehiculos() {
        if (vehiculos == null) {
        	vehiculos = new ArrayList<Vehiculo>();
        }
        return this.vehiculos;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad apellido1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellido1() {
        return apellido1;
    }

    /**
     * Define el valor de la propiedad apellido1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellido1(String value) {
        this.apellido1 = value;
    }

    /**
     * Obtiene el valor de la propiedad apellido2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellido2() {
        return apellido2;
    }

    /**
     * Define el valor de la propiedad apellido2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellido2(String value) {
        this.apellido2 = value;
    }

    /**
     * Obtiene el valor de la propiedad dni.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDni() {
        return dni;
    }

    /**
     * Define el valor de la propiedad dni.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDni(String value) {
        this.dni = value;
    }
    
    
    /**
     * Calcula el precio total a pagar por todos los vehiculos del contribuyente
     * @return precio total
     */
    public double totalAPagar() {
    	double total=0.0;
    	for (Vehiculo v: vehiculos) {
    		total+=v.calculaPrecio();
    	}
    	
    	return total;
    }

	public void setVehiculos(List<Vehiculo> lista) {
		this.vehiculos = lista;
		
	}

}
