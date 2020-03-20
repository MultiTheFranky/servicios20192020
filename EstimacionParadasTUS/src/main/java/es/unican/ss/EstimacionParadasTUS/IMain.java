package es.unican.ss.EstimacionParadasTUS;


import javax.jws.WebService;

@WebService
public interface IMain {
	public Datos getEstimaciones(String nombreParada, String numeroParada);
}