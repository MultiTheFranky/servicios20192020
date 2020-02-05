package es.unican.servicios.p1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import es.unican.ps.impuestoCirculacion.domain.Ayuntamiento;
import es.unican.ps.impuestoCirculacion.domain.Contribuyente;
import es.unican.ps.impuestoCirculacion.domain.Factura;
import es.unican.ps.impuestoCirculacion.domain.Furgoneta;
import es.unican.ps.impuestoCirculacion.domain.Motocicleta;
import es.unican.ps.impuestoCirculacion.domain.Turismo;

public class Handler extends DefaultHandler {
    
    protected Ayuntamiento ayuntamiento;
    
    @Override
    public void startDocument() {
        System.out.println("Se comienza a procesar el documento");
        ayuntamiento = new Ayuntamiento();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        if (qName.equals("tns:contribuyentes")) {
            Contribuyente c = new Contribuyente();
            c.setId(attributes.getValue("id"));
            c.setNombre(attributes.getValue("nombre"));
            c.setDni(attributes.getValue("dni"));
            c.setApellido1(attributes.getValue("apellido1"));
            c.setApellido2(attributes.getValue("apellido2"));
            ayuntamiento.getContribuyentes().add(c);
        }
        if (qName.equals("tns:vehiculos")) {
            if(attributes.getValue("xsi:type").equals("tns:Motocicleta")){
                Motocicleta m = new Motocicleta();
                m.setCilindrada(Integer.parseInt(attributes.getValue("cilindrada")));
                m.setContribuyente(ayuntamiento.gContribuyente(attributes.getValue("contribuyente")));
                m.setMatricula(attributes.getValue("matricula"));
                ayuntamiento.getVehiculos().add(m);
            }

            if(attributes.getValue("xsi:type").equals("tns:Furgoneta")){
                Furgoneta f = new Furgoneta();
                f.setComercial(Boolean.parseBoolean(attributes.getValue("comercial")));
                f.setContribuyente(ayuntamiento.gContribuyente(attributes.getValue("contribuyente")));
                f.setMatricula(attributes.getValue("matricula"));
                f.setPotencia(Double.parseDouble(attributes.getValue("potencia")));
                ayuntamiento.getVehiculos().add(f);
            }

            if(attributes.getValue("xsi:type").equals("tns:Turismo")){
                Turismo t = new Turismo();
                t.setContribuyente(ayuntamiento.gContribuyente(attributes.getValue("contribuyente")));
                t.setMatricula(attributes.getValue("matricula"));
                t.setPotencia(Double.parseDouble(attributes.getValue("potencia")));
                ayuntamiento.getVehiculos().add(t);
            }
        }
        if (qName.equals("tns:facturas")) {
            Factura f = new Factura();
            try {
                f.setFecha(new SimpleDateFormat("yyyy-mm-dd").parse(attributes.getValue("fecha")));
            } catch (Exception e) {
            }
            f.setImporte(Double.valueOf(attributes.getValue("importe")));
            f.setMatricula(attributes.getValue("matricula"));
            ayuntamiento.getFacturas().add(f);
        }
    }
    
    /**
     * Antes de acabar de leer el documento mostramos todos los datos
     * solicitados en el enunciado
     */
    @Override
    public void endDocument() {
    	for(Contribuyente c: ayuntamiento.getContribuyentes()){
            System.out.println("Nombre: "+c.getNombre() + " Total a pagar: " + ayuntamiento.getPrecioContribuyente(c));
        }
        for(Factura f: ayuntamiento.getFacturas()){
            if(f.getMatricula() == null){
            	DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
                System.out.println("La factura del impuesto a fecha "+ dateFormat.format(f.getFecha()) +" no es de ninguno de los vehículos del contribuyente");
            }
        }
    }
 }