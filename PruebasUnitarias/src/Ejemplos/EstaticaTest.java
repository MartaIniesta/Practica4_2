package Ejemplos;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EstaticaTest {

	@Test
	public void testFactorial() {
		int resultado = Estatica.factorial(4);
		assertEquals(24, resultado);
		int resultado2 = Estatica.factorial(5);
		assertEquals(120, resultado2);
		int resultado3 = Estatica.factorial(0);
		assertEquals(1, resultado3);
	}
}