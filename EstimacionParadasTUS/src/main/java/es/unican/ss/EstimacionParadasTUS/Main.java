package es.unican.ss.EstimacionParadasTUS;

import java.io.InputStream;
import java.net.URL;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static String URL_LINEAS = "http://datos.santander.es/api/rest/datasets/lineas_bus_secuencia.xml";
    public static void main( String[] args )
    {
        try { 
        	URL url = new URL(URL_LINEAS);
        	InputStream stream = url.openStream();
        	
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            HandlerParadas handler = new HandlerParadas();
            saxParser.parse(stream, handler);
            for (Parada parada : handler.paradas) {
				System.out.println("Nombre: "+parada.getNombreParada()+" Nº: "+parada.getNumeroParada());
			}
        } catch (Exception e) {
            System.err.println("ERROR: "+e.getLocalizedMessage());
        }
    }
}
