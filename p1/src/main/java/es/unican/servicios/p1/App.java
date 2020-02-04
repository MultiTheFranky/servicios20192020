package es.unican.servicios.p1;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import es.unican.ps.impuestoCirculacion.domain.Ayuntamiento;
import es.unican.ps.impuestoCirculacion.domain.Contribuyente;

public class App 
{
    public static void main( String[] args )
    {
         // Creación del JAXBContext
        JAXBContext jaxbctx;

        try {
            jaxbctx = JAXBContext.newInstance(Ayuntamiento.class);

            // Procesamos el documento (Unmarshall)
            Unmarshaller unmarshaller = jaxbctx.createUnmarshaller();
            Ayuntamiento ayu = (Ayuntamiento) unmarshaller.unmarshal(new File("src\\main\\resources\\ImpuestoCirculacion.xml"));

            for (Object o:ayu.getVehiculosOrContribuyentesOrFacturas()) {
                if (o instanceof Contribuyente) {
                    Contribuyente c = (Contribuyente)o;
                    Double totalPago = ayu.totalAPagarContribuyente(c);
                    System.out.println(c.getNombre() + totalPago);
                }
            }  

            Contribuyente c = new Contribuyente();
            c.setId("C6");
            c.setDni("11111112M");
            c.setNombre("Manuel");
            c.setApellido1("Gonzalez");
            c.setApellido2("Díaz");
            ayu.getVehiculosOrContribuyentesOrFacturas().add(c);
            // Volcamos a un nuevo fichero xml (marshall)
            Marshaller marshaller = jaxbctx.createMarshaller();
            marshaller.marshal(ayu, new File("src\\main\\resources\\ayuntamiento_v2.xml"));



        } catch (JAXBException e) {
        	e.printStackTrace();
        }
    }
}
