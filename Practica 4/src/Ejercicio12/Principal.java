package Ejercicio12;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Inicio del programa\n");
		
		System.out.print("Marca: ");
		String marca = teclado.nextLine().trim();
		
		System.out.print("Modelo: ");
		String modelo = teclado.nextLine().trim();
		
		System.out.print("Color: ");
		String color = teclado.nextLine().trim();
		
		System.out.print("Combustible: ");
		String combustible = teclado.nextLine().trim();
		
		System.out.print("Kilometraje: ");
		double kilometraje = teclado.nextDouble();
		
		Coche coches = new Coche(marca, modelo, color, combustible, kilometraje);
		
		boolean resultado = Archivo.nuevaLinea(coches);
		
		if(resultado) {
			System.out.println("\nInsertado correctamente");
		}else {
			System.out.println("\nHa ocurrido un error...");
		}

		System.out.println("\nFin del programa");
	}
}