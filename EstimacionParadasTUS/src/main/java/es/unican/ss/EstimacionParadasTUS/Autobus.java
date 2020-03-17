package es.unican.ss.EstimacionParadasTUS;

import java.util.ArrayList;

public class Autobus{
    /**
     * Atributos
     */
    private String num_linea;
    private ArrayList<Parada> paradas;

    /**
     * Constructor
    */
    public Autobus(String linea){
        this.num_linea = linea;
        paradas = new ArrayList<Parada>();
    }

    public ArrayList<Parada> getParadas(){
        return paradas;
    }

    public String getLinea(){
        return num_linea;
    }
}