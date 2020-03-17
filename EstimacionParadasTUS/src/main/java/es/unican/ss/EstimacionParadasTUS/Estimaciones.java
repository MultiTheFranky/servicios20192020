package es.unican.ss.EstimacionParadasTUS;

import java.io.InputStream;
import java.net.URL;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class Estimaciones {
    public class ParadaNoValida extends Exception {
        private static final long serialVersionUID = -2813864616238136014L;
    }

    public class DatosNoDisponibles extends Exception {
        private static final long serialVersionUID = 474474148016192737L;
    }

    public static String URL_LINEAS = "http://datos.santander.es/api/rest/datasets/lineas_bus_secuencia.xml";

    public int calculaTiempo(String nombreParada, int numeroDeLaLinea) throws ParadaNoValida, DatosNoDisponibles {
        try {
            URL url = new URL(URL_LINEAS);
            InputStream stream = url.openStream();

            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            HandlerParadas handler = new HandlerParadas(nombreParada);
            saxParser.parse(stream, handler);
            if (handler.parada == null) {
                throw new ParadaNoValida();
            }
            return handler.parada.getNumeroParada();
        } catch (Exception e) {
            System.err.println("ERROR: " + e.getLocalizedMessage());
            return -1;
        }
    }
}