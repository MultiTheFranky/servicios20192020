/**
 * ImpuestoCirculacionSSSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package es.unican.is2.ImpuestoCirculacionSS;

import es.unican.ss.impuestocirculacion.Ayuntamiento;
import es.unican.ss.impuestocirculacion.Contribuyente;

/**
 *  ImpuestoCirculacionSSSkeleton java skeleton for the axisService
 */
public class ImpuestoCirculacionSSSkeleton {
    /**
     * Auto generated method signature
     *
     * @param string
     * @return valorImpuestoContribuyente
     * @throws ContribuyenteNoDisponibleException
     */
    public double valorImpuestoContribuyente(java.lang.String string)
        throws ContribuyenteNoDisponibleException {
        //TODO : fill this with the necessary business logic
        
        throw new java.lang.UnsupportedOperationException("Please implement " +
            this.getClass().getName() + "#valorImpuestoContribuyente");
    }

    /**
     * Auto generated method signature
     *
     * @param string0
     * @return contribuyenteNoDisponible
     * @throws ContribuyenteNoDisponibleException
     */
    public java.lang.String datosContribuyente(java.lang.String string0)
        throws ContribuyenteNoDisponibleException {
        String textToReturn = "";
        ContribuyenteDao
        Contribuyente contribuyente = a.gContribuyente(string0);
        if(contribuyente == null){
            throw new ContribuyenteNoDisponibleException();
        }
        textToReturn += contribuyente.getNombre();
        textToReturn += " "+contribuyente.getApellido1();
        return textToReturn;
        throw new java.lang.UnsupportedOperationException("Please implement " +
            this.getClass().getName() + "#datosContribuyente");
    }
}
