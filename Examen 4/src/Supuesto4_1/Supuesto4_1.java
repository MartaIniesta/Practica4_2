package Supuesto4_1;

import java.util.Scanner;

public class Supuesto4_1 {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Inicio del programa\n");		
		
		mostrarUsuario(pedirUsuarios());

		System.out.println("\nFin del programa");
	}
	
	public static Usuario[] pedirUsuarios() {
		Usuario user = new Usuario();
		Usuario[] usuarios;
		do {
			System.out.print("Introduce una cantidad de usuarios: ");
			int cantidad = teclado.nextInt();
			usuarios = new Usuario[cantidad];
			teclado.nextLine();
			
			for(int i = 0; i < usuarios.length; i++) {
				System.out.println((i+1)+ "º Usuario\n----------");
				
				System.out.print("Introduce el nombre: ");
				String nombre = teclado.nextLine();
				user.setNombre(nombre);
				if(user.getNombre() == null) {
					System.out.println("-Debe tener al menos 4 caracteres\n");
					break;
				}
	
				System.out.print("Introduce los apellidos: ");
				String apellidos = teclado.nextLine();
				user.setApellidos(apellidos);
				if(user.getApellidos() == null) {
					System.out.println("-Debe tener al menos 4 caracteres\n");
					break;
				}
	
				System.out.print("Introduce el email: ");
				String email = teclado.nextLine();
				user.setEmail(email);
				if(user.getEmail() == null) {
					System.out.println("-Debe tener al menos 6 caracteres\n");
					break;
				}
				Usuario user2 = new Usuario(nombre, apellidos, email);
				usuarios[i] = user2;
			}
		}while(user.getNombre() == null || user.getApellidos() == null || user.getEmail() == null);

		return usuarios;
	}
	
	public static void mostrarUsuario(Usuario[] usuarios) {
		System.out.println();
		System.out.print("Introduce el numero de usuario que quieres mostrar: ");
		int numUs = teclado.nextInt(); 
		System.out.println("\nNombre: " + usuarios[numUs-1].getNombre() + "\nApellidos: " + usuarios[numUs-1].getApellidos() + "\nEmail: " + usuarios[numUs-1].getEmail());
	}
}