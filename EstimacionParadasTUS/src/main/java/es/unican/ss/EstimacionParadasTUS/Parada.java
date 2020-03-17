package es.unican.ss.EstimacionParadasTUS;

public class Parada{
    /**
     * Atributos
     */
    private String nombreParada;
    private int numeroParada;

    /**
     * Constructor
     */
    public Parada(String nombre, int numeroParada){
        this.nombreParada = nombre;
        this.numeroParada = numeroParada;
    }

	public String getNombreParada() {
		return nombreParada;
	}

	public int getNumeroParada() {
		return numeroParada;
	}
    
    
    
}