package Tarea3_1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UtilsTest {
	
	@Test
	public void testTipoTriangulo() {
		String resultado = Utils.tipoTriangulo(4,5,6);
		assertEquals("Escaleno", resultado);
		
		String resultado2 = Utils.tipoTriangulo(4,4,4);
		assertEquals("Equilatero", resultado2);
		
		String resultado3 = Utils.tipoTriangulo(4,5,4);
		assertEquals("Isosceles", resultado3);
		
		String resultado4 = Utils.tipoTriangulo(4,50,4);
		assertEquals("ERROR", resultado4);
	}
	
	@Test
	public void testMasFrecuenteInt() {
		int[] numeros = {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3};
		int resultado = Utils.masFrecuenteInt(numeros);
		assertEquals(4, resultado);
		
		int[] numeros2 = {2, 2, 4, 5, 6, 2, 1};
		int resultado2 = Utils.masFrecuenteInt(numeros2);
		assertEquals(2, resultado2);
	}
	
	@Test
	public void testBuscarInt() {
		int[] numeros = {1, 2, 3, 4, 5};
		int resultado = Utils.buscarInt(numeros, 3);
		assertEquals(2, resultado);
		
		int[] numeros2 = {2, 2, 4, 5, 6, 2, 1};
		int resultado2 = Utils.buscarInt(numeros2, 9);
		assertEquals(-1, resultado2);
	}
}