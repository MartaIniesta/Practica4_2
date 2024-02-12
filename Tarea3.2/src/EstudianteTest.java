import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class EstudianteTest {
	
	Estudiante Persona1;
	Estudiante Persona2;
	Estudiante Persona3;
	
	@Before
	public void crearEstudiantes() {
		Persona1 = new Estudiante("Alfonso", 18, 5);
		Persona2 = new Estudiante("Paco", 20, 7);
		Persona3 = new Estudiante("Paqui", 22, 9);
	}
	
	@Test
	public void testNombre() {
		String resultado = Persona1.getNombre();
		assertEquals("Alfonso", resultado);
		
		String resultado2 = Persona2.getNombre();
		assertEquals("Paco", resultado2);
		
		String resultado3 = Persona3.getNombre();
		assertEquals("Paqui", resultado3);
	}
	
	@Test
	public void testEdad() {
		int resultado = Persona1.getEdad();
		assertEquals(18, resultado);
		
		int resultado2 = Persona2.getEdad();
		assertEquals(20, resultado2);
		
		int resultado3 = Persona3.getEdad();
		assertEquals(22, resultado3);
	}
	
	@Test
	public void testNota() {
		double resultado = Persona1.getNota();
		assertEquals(5, resultado, 0.001);
		
		double resultado2 = Persona2.getNota();
		assertEquals(7, resultado2, 0.001);
		
		double resultado3 = Persona3.getNota();
		assertEquals(9, resultado3, 0.001);
	}
	
	@Test
	public void testObtenerEstadoAcademico() {
		String resultado = Persona1.obtenerEstadoAcademico();
		assertEquals("Aprobado", resultado);
		
		String resultado2 = Persona2.obtenerEstadoAcademico();
		assertEquals("Notable", resultado2);
		
		String resultado3 = Persona3.obtenerEstadoAcademico();
		assertEquals("Sobresaliente", resultado3);
	}
}