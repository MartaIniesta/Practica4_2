package Ejemplo03;

public class Principal {
	public static void main(String[] args) {

		Persona p1 = new Persona("Marta", "Iniesta");
		
		Persona p2 = new Persona();
		
		System.out.println(p1.nombreCompleto());
		System.out.println(p2.apellidosCompleto());
	}
}