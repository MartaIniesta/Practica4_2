package Ejemplo02;

public class Principal {
	public static void main(String[] args) {

		Persona p1 = new Persona();
		p1.nombre = "David";
		p1.apellidos = "Munuera";
		
		Persona p2 = new Persona();
		p2.nombre = "Marta";
		p2.apellidos = "Iniesta";
		
		System.out.println(p1.nombreCompleto());
		System.out.println(p2.apellidosCompleto());

	}
}
