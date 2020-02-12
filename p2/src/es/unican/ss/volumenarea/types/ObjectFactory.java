
package es.unican.ss.volumenarea.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.unican.ss.volumenarea.types package. 
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

    private final static QName _Volumen_QNAME = new QName("http://www.unican.es/ss/VolumenArea/types/", "volumen");
    private final static QName _VolumenResponse_QNAME = new QName("http://www.unican.es/ss/VolumenArea/types/", "volumenResponse");
    private final static QName _Area_QNAME = new QName("http://www.unican.es/ss/VolumenArea/types/", "area");
    private final static QName _DatosNoValidos_QNAME = new QName("http://www.unican.es/ss/VolumenArea/types/", "datosNoValidos");
    private final static QName _AreaResponse_QNAME = new QName("http://www.unican.es/ss/VolumenArea/types/", "areaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.unican.ss.volumenarea.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Dimensiones }
     * 
     */
    public Dimensiones createDimensiones() {
        return new Dimensiones();
    }

    /**
     * Create an instance of {@link DatosNoValidos }
     * 
     */
    public DatosNoValidos createDatosNoValidos() {
        return new DatosNoValidos();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Dimensiones }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.unican.es/ss/VolumenArea/types/", name = "volumen")
    public JAXBElement<Dimensiones> createVolumen(Dimensiones value) {
        return new JAXBElement<Dimensiones>(_Volumen_QNAME, Dimensiones.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.unican.es/ss/VolumenArea/types/", name = "volumenResponse")
    public JAXBElement<Double> createVolumenResponse(Double value) {
        return new JAXBElement<Double>(_VolumenResponse_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Dimensiones }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.unican.es/ss/VolumenArea/types/", name = "area")
    public JAXBElement<Dimensiones> createArea(Dimensiones value) {
        return new JAXBElement<Dimensiones>(_Area_QNAME, Dimensiones.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosNoValidos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.unican.es/ss/VolumenArea/types/", name = "datosNoValidos")
    public JAXBElement<DatosNoValidos> createDatosNoValidos(DatosNoValidos value) {
        return new JAXBElement<DatosNoValidos>(_DatosNoValidos_QNAME, DatosNoValidos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.unican.es/ss/VolumenArea/types/", name = "areaResponse")
    public JAXBElement<Double> createAreaResponse(Double value) {
        return new JAXBElement<Double>(_AreaResponse_QNAME, Double.class, null, value);
    }

}
