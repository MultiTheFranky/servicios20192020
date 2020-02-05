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
        /**  PUNTO 5
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
        }*/
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            Handler handler = new Handler();
            saxParser.parse("src\\main\\resources\\ImpuestoCirculacion.xml", handler);
            
            Ayuntamiento ayunta = handler.getAyuntamiento();

            for(Contribuyente c: ayunta.getContribuyentes()){
                System.out.println("Nombre: "+c.getNombre() + " Total a pagar: " + ayunta.getPrecioContribuyente(c));
            }
            for(Factura f: ayunta.getFacturas()){
                if(f.getMatricula() == null){
                	DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
                    System.out.println("La factura del impuesto a fecha "+ dateFormat.format(f.getFecha()) +" no es de ninguno de los vehículos del contribuyente");
                }
            }
            
        } catch (Exception e) { 
            e.printStackTrace();
        }
        
    }
}
