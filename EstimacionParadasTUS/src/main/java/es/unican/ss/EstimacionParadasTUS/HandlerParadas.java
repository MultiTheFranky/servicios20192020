package es.unican.ss.EstimacionParadasTUS;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class HandlerParadas extends DefaultHandler {

    public Parada parada;
    private String texto = null;
    private String nombreParada;
    private boolean insertarParada = false;
    private boolean getNumeroParada = false;
    private int numeroParada = 0;

    public HandlerParadas(String nombreParada) {
        this.nombreParada = nombreParada;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        if (qName.equals("str") && attributes.getValue("name").equals("ayto:NParada")) {
            getNumeroParada = true;
        }
        if (qName.equals("str") && attributes.getValue("name").equals("ayto:NombreParada")) {
            insertarParada = true;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        texto = new String(ch, start, length).trim();
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (getNumeroParada) {
            numeroParada = Integer.parseInt(texto);
            getNumeroParada = false;
        }
        if (insertarParada && texto.equals(nombreParada)) {
            parada = new Parada(texto, numeroParada);
            insertarParada = false;
        }
    }
}