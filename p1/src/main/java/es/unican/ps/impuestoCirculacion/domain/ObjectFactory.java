//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.04 a las 04:01:02 PM CET 
//


package es.unican.ps.impuestoCirculacion.domain;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Prueba package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Ayuntamiento_QNAME = new QName("http://www.unican.es/ss/ImpuestoCirculacion", "ayuntamiento");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Prueba
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Ayuntamiento }
     * 
     */
    public Ayuntamiento createAyuntamiento() {
        return new Ayuntamiento();
    }

    /**
     * Create an instance of {@link Turismo }
     * 
     */
    public Turismo createTurismo() {
        return new Turismo();
    }

    /**
     * Create an instance of {@link Motocicleta }
     * 
     */
    public Motocicleta createMotocicleta() {
        return new Motocicleta();
    }

    /**
     * Create an instance of {@link Furgoneta }
     * 
     */
    public Furgoneta createFurgoneta() {
        return new Furgoneta();
    }

    /**
     * Create an instance of {@link Contribuyente }
     * 
     */
    public Contribuyente createContribuyente() {
        return new Contribuyente();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ayuntamiento }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Ayuntamiento }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.unican.es/ss/ImpuestoCirculacion", name = "ayuntamiento")
    public JAXBElement<Ayuntamiento> createAyuntamiento(Ayuntamiento value) {
        return new JAXBElement<Ayuntamiento>(_Ayuntamiento_QNAME, Ayuntamiento.class, null, value);
    }

}
