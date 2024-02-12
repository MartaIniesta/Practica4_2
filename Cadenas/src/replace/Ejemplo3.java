package replace;

import java.util.Scanner;

public class Ejemplo3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Inicio del programa\n");
		
		System.out.print("Introduce un texto: ");
		String texto = teclado.nextLine().trim();
		
		String resultado = reemplazarTexto(texto);
		System.out.println();
		System.out.print("El texto procesado es: " + resultado);

		
		System.out.println("\nFin del programa");
	}
	
	public static String reemplazarTexto(String texto) {
		String terminos = "pirata@marketing@amnistia";
		//Reemplazar cada uno de los terminos dentro de texto por tres asteriscos
		
		String[] palabras = terminos.split("@");
		for(int i = 0; i < palabras.length; i++) {
			texto = texto.replaceAll(palabras[i], "***");
		}
		
		return texto;
	}
}
