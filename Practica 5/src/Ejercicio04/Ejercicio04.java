package Ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Inicio del programa\n");
		
		String texto = "\"Estamos viviendo en un submarino amarillo. No tenemos nada que hacer. En el interior del submarino se está muy apretado. Así que estamos leyendo todo el día. Vamos a salir en 5 días\"";
		String palabra = "en";
		System.out.println(texto + "\n\nLa palabra \"en\" coincide -> " + obtenerNumeroVecesSubCadena2(texto, palabra) + " veces");
		
		System.out.println("\nFin del programa");	
	}
	
	public static int obtenerNumeroVecesSubCadena2(String texto, String palabra) {
		return texto.toLowerCase().split(palabra).length-1;

		/*int contador = 0;
		for(int i = 0; i < texto.length(); i++) {
			if(texto.toLowerCase().indexOf(palabra, i) == i) {
				contador++;
			}
		}
		return contador;*/
	}
}