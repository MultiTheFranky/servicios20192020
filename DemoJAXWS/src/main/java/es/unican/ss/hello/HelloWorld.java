package es.unican.ss.hello;

import javax.jws.WebService;

@WebService(targetNamespace="http://www.unican.es/ss/hello", 
endpointInterface="es.unican.ss.hello.HelloWorldInterface")
public class HelloWorld implements HelloWorldInterface {
    
	@Override
	public String getHello(String name) {
        return "Hello "+name+"!";
    }

	
	public String anotherMethod() {
        return "Hola";
    }


	
	
}