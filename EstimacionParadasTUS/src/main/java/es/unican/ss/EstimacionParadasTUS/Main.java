package es.unican.ss.EstimacionParadasTUS;

import es.unican.ss.EstimacionParadasTUS.Estimaciones.DatosNoDisponibles;
import es.unican.ss.EstimacionParadasTUS.Estimaciones.ParadaNoValida;

/**
 *
 */
import javax.jws.WebService;

@WebService(targetNamespace="http://www.unican.es/ss/EstimacionParadasTUS", 
endpointInterface="es.unican.ss.EstimacionParadasTUS.Main")
public class Main implements IMain {

    public Datos getEstimaciones(String nombreParada, String numeroParada) {
    	Estimaciones est = new Estimaciones();
    	try {
			return est.calculaTiempo(nombreParada, numeroParada);
		} catch (ParadaNoValida e) {
			e.printStackTrace();
			return null;
		}
    	catch (DatosNoDisponibles e) {
			e.printStackTrace();
			return null;
		}
	}
}
