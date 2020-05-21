package es.unican.ss.estimaciontusbpel;

import javax.xml.ws.Holder;

import es.unican.ss.estimaciontusbpel.EstimacionTUSBPEL;

public class Client {
	
	public static void main (String args[]) {
		EstimacionTUSBPEL service = new EstimacionTUSBPEL();
		
		EstimacionTUSBPELPortType port = service.getEstimacionTUSBPELPort();
		Holder<Integer> estimacion1 = new Holder<Integer>();
		Holder<Integer> estimacion2 = new Holder<Integer>();
		
		port.estimacionPaso("25", "1", estimacion1, estimacion2);
		
		System.out.println("Estimaci�n 1: "+estimacion1.value+" | Estimaci�n 2: "+estimacion2.value);
		
	}
}
