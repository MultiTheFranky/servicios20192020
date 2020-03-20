package es.unican.ss.hello;

import javax.jws.WebService;

@WebService
public interface HelloWorldInterface {
	public String getHello(String name);
}
