package Supuesto4_2;

import java.util.Scanner;

public class Supuesto4_2 {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Inicio del programa\n");
		int opcion = 0;
		do {
			System.out.println("\nMENU\n------ ");
			System.out.println("1 - Ver contenido del archivo");
			System.out.println("2 - Insertar frase");
			System.out.println("0 - Salir");

			System.out.print("Selecciona una opcion (Pulse 0 para salir): ");
			opcion = teclado.nextInt();
			
				if(opcion == 1) {
					System.out.println("\nTextos\n-------");
					Acceso.leer();
					
				}else if(opcion == 2) {
					Acceso.insertar();

				}else if(opcion < 0 || opcion > 2){
					System.out.println("\nEsta opcion no esta en el menu.");
				}
			
		}while(opcion != 0);

		
		System.out.println("\nFin del programa");
	}
}