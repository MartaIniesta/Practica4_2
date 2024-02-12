package Ejemplo01;

public class Principal {
	public static void main(String[] args) {
		//String texto = new String();
		Persona p1 = new Persona();
		p1.nombre = "David";
		p1.apellidos = "Munuera";
		
		Persona p2 = new Persona();
		p2.nombre = "Jesus";
		p2.apellidos = "Martinez";
		
		System.out.println(p1.nombre + " " + p1.apellidos);
		System.out.println(p2.nombre + " " + p2.apellidos);

	}
}