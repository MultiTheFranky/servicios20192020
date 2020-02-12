/**
 * VolumenAreaSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package es.unican.is2.volumenArea;

import es.unican.ss.volumenarea.types.DatosNoValidos;

/**
 * VolumenAreaSkeleton java skeleton for the axisService
 */
public class VolumenAreaSkeleton {
    /**
     * Auto generated method signature
     * Retorna el area del objeto dado
     * @param area
     * @return areaResponse
     * @throws DatosNoValidosException
     */
    public double area(es.unican.ss.volumenarea.types.Dimensiones area)
        throws DatosNoValidosException {
            if (area.getAncho() <0|| area.getLargo()<0) {
                DatosNoValidosException e = new DatosNoValidosException();
                DatosNoValidos d = new DatosNoValidos();
                d.setError("El ancho o el largo no pueden ser negativos");
                e.setFaultMessage(d);
                throw e;
            }
        return VolumenArea.area(area.getAlto(), area.getAlto(), area.getLargo());
    }

    /**
     * Auto generated method signature
     * Retorna el volumen del objeto dado
     * @param volumen
     * @return volumenResponse
     * @throws DatosNoValidosException
     */
    public double volumen(es.unican.ss.volumenarea.types.Dimensiones volumen)
        throws DatosNoValidosException {
            if(volumen.getAncho()<0||volumen.getLargo()<0){
                DatosNoValidosException e = new DatosNoValidosException();
                DatosNoValidos d = new DatosNoValidos();
                d.setError("El ancho o el largo no pueden ser negativos");
                e.setFaultMessage(d);
                throw e;
            }
            return VolumenArea.volumen(volumen.getAlto(),volumen.getAncho(),volumen.getLargo());
    }
}
