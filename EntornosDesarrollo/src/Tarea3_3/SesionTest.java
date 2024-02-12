package Tarea3_3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SesionTest {
	
	Sesion Persona1 = new Sesion();
	Sesion Persona2 = new Sesion();
	Sesion Persona3 = new Sesion();
	Sesion Persona4 = new Sesion();

	@Test
	public void testSesion() {
		//Comprueba si en mi fichero se encuentra el nombre y la contraseña devolviendome un true
		boolean resultado1 = Persona1.login("dmunuera", "123456");
		assertEquals(true, resultado1);
		
		boolean resultado2 = Persona2.login("pepe", "654321");
		assertEquals(true, resultado2);
		
		//Comprueba que el nombre y la contraseña no se encuentran en el fichero devolviendome un false
		boolean resultado3 = Persona3.login("maria del carmen", "1234");
		assertEquals(false, resultado3);
		
		boolean resultado4 = Persona4.login("alfonso", "4321");
		assertEquals(false, resultado4);
	}
}