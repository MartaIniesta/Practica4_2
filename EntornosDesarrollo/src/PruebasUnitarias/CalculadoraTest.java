package PruebasUnitarias;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	Calculadora calculadora;
	
	@Before
	public void preparacion() {
		System.out.println("Preparacion");
		this.calculadora = new Calculadora();
	}
	
    @Test
    public void testSumar() {
		System.out.println("Test sumar");
        int resultado = calculadora.sumar(2, 3);
        assertEquals(5, resultado);
    }

    @Test
    public void testRestar() {
		System.out.println("Test restar");
        int resultado = calculadora.restar(5, 3);
        assertEquals(2, resultado);
    }
    
    @Test
    public void testPar() {
		System.out.println("Test es Par");
        boolean resultado = calculadora.esPar(4);
        assertTrue(resultado);
    }
    
    @Test
    public void testImpar() {
		System.out.println("Test es Impar");
        boolean resultado = calculadora.esImpar(5);
        assertTrue(resultado);
    }
}