import static org.junit.Assert.*;

import org.junit.Test;

import es.unican.ss.hello.HelloWorld;

public class HelloWorldTest {

	@Test
	public void testGetHello() {
		HelloWorld sut = new HelloWorld();
		assertTrue(sut.getHello("Patri").equals("Hello Patri!"));
	} 

}
