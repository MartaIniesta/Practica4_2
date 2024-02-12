package Ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Inicio del programa\n");
		
		System.out.print("Introduce un texto: ");
		String texto = teclado.nextLine().trim();
		String textoIn = invertirTexto(texto);
		System.out.println(texto + " -> " + textoIn);
		
		System.out.println("\nFin del programa");
	}
	
	public static String invertirTexto(String texto) {
		StringBuilder textoIn = new StringBuilder(texto);
        int longitud = textoIn.length();
        int inicio = 0;
        int fin = longitud - 1;

        do {
            char caracter = textoIn.charAt(inicio);
            textoIn.setCharAt(inicio, textoIn.charAt(fin));
            textoIn.setCharAt(fin, caracter);
            inicio++;
            fin--;
        } while(inicio < fin);

        return textoIn.toString();
	}
}