package Ejemplos;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CoordinateTest {
	Coordinate c1;
	Coordinate c2;
	Coordinate c3;
	
	@Before
	public void inicializar() {
		this.c1 = new Coordinate(2, 5);
		this.c2 = new Coordinate(-5.6, 1.8);
		this.c3 = new Coordinate(9.3, -5.1);
	}
	
	@Test
	public void testGetX() {
		double resultado1 = c1.getX();
		assertEquals(2, resultado1, 0.001);
		double resultado2 = c2.getX();
		assertEquals(-5.6, resultado2, 0.001);
		double resultado3 = c3.getX();
		assertEquals(9.3, resultado3, 0.001);
	}
	
	@Test
	public void testGetY() {
		double resultado1 = c1.getY();
		assertEquals(5, resultado1, 0.001);
		double resultado2 = c2.getY();
		assertEquals(1.8, resultado2, 0.001);
		double resultado3 = c3.getY();
		assertEquals(-5.1, resultado3, 0.001);
	}
	
	@Test
	public void testSetX() {
		c1.setX(1);
		double resultado1 = c1.getX();
		assertEquals(1, resultado1, 0.001);
		c2.setX(7.5);
		double resultado2 = c2.getX();
		assertEquals(7.5, resultado2, 0.001);
		c3.setX(-3.6);
		double resultado3 = c3.getX();
		assertEquals(-3.6, resultado3, 0.001);
	}
	
	@Test
	public void testSetY() {
		c1.setY(9);
		double resultado1 = c1.getY();
		assertEquals(9, resultado1, 0.001);
		c2.setY(-3.12);
		double resultado2 = c2.getY();
		assertEquals(-3.12, resultado2, 0.001);
		c3.setY(15);
		double resultado3 = c3.getY();
		assertEquals(-5.1, resultado3, 0.001);
	}
	
	@Test
	public void testDistaciaAlCero() {
		double d1 = c1.distanciaAlcero();
		assertEquals(5.3851, d1, 0.0001);
		double d2 = c2.distanciaAlcero();
		assertEquals(5.8821, d2, 0.0001);
		double d3 = c3.distanciaAlcero();
		assertEquals(10.6066, d3, 0.0001);
	}
	
	@Test
	public void testDistacia() {
		double d1 = c1.distancia(c2);
		assertEquals(8.2462, d1, 0.0001);
		double d2 = c2.distancia(c3);
		assertEquals(16.4201, d2, 0.0001);
		double d3 = c3.distancia(c1);
		assertEquals(12.4619, d3, 0.0001);
	}
}