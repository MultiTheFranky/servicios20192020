
package es.unican.ss.estimaciontusbpel;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EstimacionTUSBPELPortType", targetNamespace = "http://www.unican.es/ss/EstimacionTUSBPEL")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EstimacionTUSBPELPortType {


    /**
     * 
     * @param estimacion2
     * @param estimacion1
     * @param parada
     * @param linea
     */
    @WebMethod(action = "http://www.unican.es/ss/EstimacionTUSBPEL/estimacionPaso")
    @RequestWrapper(localName = "estimacionPaso", targetNamespace = "http://www.unican.es/ss/EstimacionTUSBPEL", className = "es.unican.ss.estimaciontusbpel.EstimacionPaso")
    @ResponseWrapper(localName = "estimacionPasoResponse", targetNamespace = "http://www.unican.es/ss/EstimacionTUSBPEL", className = "es.unican.ss.estimaciontusbpel.EstimacionPasoResponse")
    public void estimacionPaso(
        @WebParam(name = "parada", targetNamespace = "http://www.unican.es/ss/EstimacionTUSBPEL")
        String parada,
        @WebParam(name = "linea", targetNamespace = "http://www.unican.es/ss/EstimacionTUSBPEL")
        String linea,
        @WebParam(name = "estimacion1", targetNamespace = "http://www.unican.es/ss/EstimacionTUSBPEL", mode = WebParam.Mode.OUT)
        Holder<Integer> estimacion1,
        @WebParam(name = "estimacion2", targetNamespace = "http://www.unican.es/ss/EstimacionTUSBPEL", mode = WebParam.Mode.OUT)
        Holder<Integer> estimacion2);

}
