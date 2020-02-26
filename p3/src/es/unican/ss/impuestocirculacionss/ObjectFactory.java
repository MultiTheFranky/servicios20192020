
package es.unican.ss.impuestocirculacionss;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.unican.ss.impuestocirculacionss package. 
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

    private final static QName _ContribuyenteNoDisponible_QNAME = new QName("http://www.unican.es/ss/ImpuestoCirculacionSS/", "contribuyenteNoDisponible");
    private final static QName _ValorImpuestoContribuyente_QNAME = new QName("http://www.unican.es/ss/ImpuestoCirculacionSS/", "valorImpuestoContribuyente");
    private final static QName _DatosContribuyenteApellido_QNAME = new QName("", "apellido");
    private final static QName _DatosContribuyenteNombre_QNAME = new QName("", "nombre");
    private final static QName _DatosContribuyenteVehiculos_QNAME = new QName("", "vehiculos");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.unican.ss.impuestocirculacionss
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DatosContribuyente }
     * 
     */
    public DatosContribuyente createDatosContribuyente() {
        return new DatosContribuyente();
    }

    /**
     * Create an instance of {@link ListaVehiculos }
     * 
     */
    public ListaVehiculos createListaVehiculos() {
        return new ListaVehiculos();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.unican.es/ss/ImpuestoCirculacionSS/", name = "contribuyenteNoDisponible")
    public JAXBElement<String> createContribuyenteNoDisponible(String value) {
        return new JAXBElement<String>(_ContribuyenteNoDisponible_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.unican.es/ss/ImpuestoCirculacionSS/", name = "valorImpuestoContribuyente")
    public JAXBElement<Double> createValorImpuestoContribuyente(Double value) {
        return new JAXBElement<Double>(_ValorImpuestoContribuyente_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "apellido", scope = DatosContribuyente.class)
    public JAXBElement<String> createDatosContribuyenteApellido(String value) {
        return new JAXBElement<String>(_DatosContribuyenteApellido_QNAME, String.class, DatosContribuyente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "nombre", scope = DatosContribuyente.class)
    public JAXBElement<String> createDatosContribuyenteNombre(String value) {
        return new JAXBElement<String>(_DatosContribuyenteNombre_QNAME, String.class, DatosContribuyente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaVehiculos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "vehiculos", scope = DatosContribuyente.class)
    public JAXBElement<ListaVehiculos> createDatosContribuyenteVehiculos(ListaVehiculos value) {
        return new JAXBElement<ListaVehiculos>(_DatosContribuyenteVehiculos_QNAME, ListaVehiculos.class, DatosContribuyente.class, value);
    }

}
