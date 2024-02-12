package POO1;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Inicio del programa\n");
		
		System.out.print("Introduce una cantidad de alumnos: ");
		int cantidad = Integer.parseInt(teclado.nextLine());
		
		Alumno[] alumno = pedirAlumnos(cantidad);
		
		for(int i = 0; i < alumno.length; i++) {
			System.out.println("\n" + (i+1) + "º alumno");
			System.out.println("-------------");
			System.out.println("Nombre: " + alumno[i].getNombre());
			System.out.println("Apellidos: " + alumno[i].getApellidos());
			System.out.println("NRE: " + alumno[i].getNre());
			System.out.println("Email: " + alumno[i].getEmail());
			System.out.println("Direccion: " + alumno[i].getDireccion());			
		}
		
		System.out.println("\nFin del programa");
	}
	
	public static Alumno[] pedirAlumnos(int cantidad) {
		Scanner teclado = new Scanner(System.in);
		Alumno[] alumnos = new Alumno[cantidad];
		
		for(int i = 0; i < cantidad; i++) {
			Alumno actual = new Alumno();
			System.out.println((i+1) + "º alumno");

			System.out.print("Nombre: ");
			actual.setNombre(teclado.nextLine());
			
			System.out.print("Apellidos: ");
			actual.setApellidos(teclado.nextLine());
			
			System.out.print("Nre: ");
			actual.setNre(teclado.nextLine());
			
			System.out.print("Email: ");
			actual.setEmail(teclado.nextLine());
			
			System.out.print("Direccion: ");
			actual.setDireccion(teclado.nextLine());
			
			alumnos[i] = actual;
		}
		return alumnos;
	}
}
