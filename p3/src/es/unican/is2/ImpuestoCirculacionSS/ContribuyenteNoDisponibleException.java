/**
 * ContribuyenteNoDisponibleException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package es.unican.is2.ImpuestoCirculacionSS;

public class ContribuyenteNoDisponibleException extends java.lang.Exception {
    private static final long serialVersionUID = 1582729589950L;
    private java.lang.String faultMessage;

    public ContribuyenteNoDisponibleException() {
        super("ContribuyenteNoDisponibleException");
    }

    public ContribuyenteNoDisponibleException(java.lang.String s) {
        super(s);
    }

    public ContribuyenteNoDisponibleException(java.lang.String s,
        java.lang.Throwable ex) {
        super(s, ex);
    }

    public ContribuyenteNoDisponibleException(java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(java.lang.String msg) {
        faultMessage = msg;
    }

    public java.lang.String getFaultMessage() {
        return faultMessage;
    }
}
