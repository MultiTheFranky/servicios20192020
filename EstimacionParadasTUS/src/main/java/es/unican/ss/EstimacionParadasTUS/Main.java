package es.unican.ss.EstimacionParadasTUS;

import es.unican.ss.EstimacionParadasTUS.Estimaciones.DatosNoDisponibles;
import es.unican.ss.EstimacionParadasTUS.Estimaciones.ParadaNoValida;

/**
 *
 */
public class Main {

    public static void main(String[] args) {
    	Estimaciones est = new Estimaciones();
    	try {
			System.out.println(est.calculaTiempo("PADRE MENNI", 62));
		} catch (ParadaNoValida e) {
			e.printStackTrace();
		}
    	catch (DatosNoDisponibles e) {
			e.printStackTrace();
		}
    }
}
