import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Endpoint;
import javax.xml.ws.Service;

import org.junit.Test;

import es.unican.ss.hello.HelloWorld;
import es.unican.ss.hello.HelloWorldInterface;

public class HelloWorldIT {

	@Test
	public void testGetHello() {
		Endpoint endpoint = Endpoint.publish("http://localhost:8080/hello", new HelloWorld());
			try {
				URL url = new URL("http://localhost:8080/hello?wsdl");
				QName serviceQName = new QName("http://www.unican.es/ss/hello", "HelloWorldService");
				QName portQName = new QName("http://www.unican.es/ss/hello", "HelloWorldPort");
				Service service = Service.create(url, serviceQName);
				HelloWorldInterface sut = service.getPort(portQName, HelloWorldInterface.class);
				assertTrue(sut.getHello("Patri").equals("Hello Patri!"));
			} catch (MalformedURLException e) {e.printStackTrace(); }
		endpoint.stop();
	}
}
