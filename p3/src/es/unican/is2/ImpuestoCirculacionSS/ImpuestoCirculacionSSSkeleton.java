/**
 * ImpuestoCirculacionSSSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package es.unican.is2.ImpuestoCirculacionSS;

import es.unican.ss.impuestocirculacion.Ayuntamiento;
import es.unican.ss.impuestocirculacion.Contribuyente;

import es.unican.is2.ContribuyentesDAO;

/**
 * ImpuestoCirculacionSSSkeleton java skeleton for the axisService
 * ***tener en cuenta que el contribuyente no tiene una lista de 
 *    vehiculos, sino que cada vehiculo esta asociado a un contribuyente
 */
public class ImpuestoCirculacionSSSkeleton {
    /**
     * Auto generated method signature
     * Retornamos el valor del impuesto total de todos los contribuyentes
     *
     * @param string
     * @return valorImpuestoContribuyente
     * @throws ContribuyenteNoDisponibleException
     */
    public double valorImpuestoContribuyente(java.lang.String string)
        throws ContribuyenteNoDisponibleException {
        //TODO : fill this with the necessary business logic
        double result = 0.0;
        ContribuyentesDAO cdao = new ContribuyentesDAO();
        // cogemos los vehiculos del contribuyente deseado
        ArrayList<Vehiculo> lista = cdao.listaVehiculosContribuyente(string);
        // calculamos el total
        for(Vehiculo v: lista){
            result += v.calculaPrecio();
        }
        return result;
        throw new java.lang.UnsupportedOperationException("Please implement " +
            this.getClass().getName() + "#valorImpuestoContribuyente");
    }


    /**
     * Auto generated method signature
     * Retornamos los datos (en formato de texto) de un contribuyente
     *  - nombre
     *  - primer apellido
     *  - lista de vehiculos (mostrando las matriculas)
     *
     * @param dniContribuyente
     * @return contribuyenteNoDisponible
     * @throws ContribuyenteNoDisponibleException
     */
    public java.lang.String datosContribuyente(java.lang.String dniContribuyente)
        throws ContribuyenteNoDisponibleException {
        String textToReturn = ""; // valor a retornrar
        // cogemos datos del contribuyente
        ContribuyentesDAO cdao = new ContribuyentesDAO();
        Contribuyente contribuyente = cdao.contribuyente(dniContribuyente);
        if(contribuyente == null){
            throw new ContribuyenteNoDisponibleException();
        }
        // escribimos nombre y apellido de contribuyente
        textToReturn += contribuyente.getNombre();
        textToReturn += " "+contribuyente.getApellido1();
        // cogemos los vehiculos del contribuyente y los metemos en el string de retorno
        ArrayList<Vehiculo> listaVehiculos = cdao.listaVehiculosContribuyente(dniContribuyente);
        for(Vehiculo v: listaVehiculos){
            textToReturn += " "+v.getMatricula();
        }
        return textToReturn;
        throw new java.lang.UnsupportedOperationException("Please implement " +
            this.getClass().getName() + "#datosContribuyente");
    }
}
