package es.unican.servicios.p1;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import es.unican.ps.impuestoCirculacion.domain.Ayuntamiento;
import es.unican.ps.impuestoCirculacion.domain.Contribuyente;
import es.unican.ps.impuestoCirculacion.domain.Factura;

public class App 
{
    public static void main( String[] args )
    {
    	
        
        // 5ª Parte: Procesamiento de documentos XML con JAXB.
        // Creación del JAXBContext
        JAXBContext jaxbctx;

        try {
            jaxbctx = JAXBContext.newInstance(Ayuntamiento.class);

            // Procesamos el documento (Unmarshall)
            Unmarshaller unmarshaller = jaxbctx.createUnmarshaller();
            Ayuntamiento ayu = (Ayuntamiento) unmarshaller.unmarshal(new File("src\\main\\resources\\ImpuestoCirculacion.xml"));

           
            for (Contribuyente c: ayu.getContribuyentes()){
                Double totalPago = ayu.getPrecioContribuyente(c);
                System.out.println(c.getNombre() + " " + totalPago);
            }

            Contribuyente c = new Contribuyente();
            c.setId("C6");
            c.setDni("11111112M");
            c.setNombre("Manuel");
            c.setApellido1("Gonzalez");
            c.setApellido2("Díaz");
            ayu.getContribuyentes().add(c);
            // Volcamos a un nuevo fichero xml (marshall)
            Marshaller marshaller = jaxbctx.createMarshaller();
            marshaller.marshal(ayu, new File("src\\main\\resources\\ayuntamiento_v2.xml"));



        } catch (JAXBException e) {
        	e.printStackTrace();
        }
        
    	
    	
        try {
        	
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            Handler handler = new Handler();
            saxParser.parse("src\\main\\resources\\ImpuestoCirculacion.xml", handler);
            
        } catch (Exception e) { 
            e.printStackTrace();
        }
        
    }
}
