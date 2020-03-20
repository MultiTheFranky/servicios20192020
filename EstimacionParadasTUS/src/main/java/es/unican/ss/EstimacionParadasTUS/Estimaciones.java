
package es.unican.ss.EstimacionParadasTUS;

import java.io.InputStream;
import java.net.URL;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.ws.Holder;

import org.tempuri.ArrayOfPasoParada;
import org.tempuri.Dinamica;
import org.tempuri.DinamicaSoap;

public class Estimaciones {
    public class ParadaNoValida extends Exception {
        private static final long serialVersionUID = -2813864616238136014L;
    }

    public class DatosNoDisponibles extends Exception {
        private static final long serialVersionUID = 474474148016192737L;
    }

    public static String URL_LINEAS = "http://datos.santander.es/api/rest/datasets/lineas_bus_secuencia.xml";

    public Datos calculaTiempo(String nombreParada, String numeroDeLaLinea) throws ParadaNoValida, DatosNoDisponibles {
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
            System.out.println(handler.parada.getNombreParada()+" "+handler.parada.getNumeroParada());
            Dinamica dinamicaService = new Dinamica();
            DinamicaSoap dinamicaPort = dinamicaService.getDinamicaSoap();
            Holder<ArrayOfPasoParada> pasoParada = new Holder<ArrayOfPasoParada>();
            Holder<Integer> intParada = new Holder<Integer>();
            dinamicaPort.getPasoParada(numeroDeLaLinea,
            		handler.parada.getNombreParada(), intParada, pasoParada);

            Datos resultado = new Datos();
            resultado.setNombreRuta(pasoParada.value.getPasoParada().get(0).getRuta());
            resultado.setEstimacion1(pasoParada.value.getPasoParada().get(0).getE1().getMinutos());
            resultado.setEstimacion2(pasoParada.value.getPasoParada().get(0).getE2().getMinutos());
            return resultado;
        } catch (Exception e) {
        	e.printStackTrace();
            return null;
        }
    }
}