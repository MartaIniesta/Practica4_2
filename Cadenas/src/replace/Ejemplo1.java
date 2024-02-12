package replace;

import java.util.Scanner;

public class Ejemplo1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Inicio del programa\n");
		
		System.out.print("Introduce un texto: ");
		String texto = teclado.nextLine().trim();
		
		String resultado = reemplazarTexto(texto);
		System.out.print("El texto procesado es: " + resultado);

		
		System.out.println("\nFin del programa");
	}
	
	public static String reemplazarTexto(String texto) {
		String buscar = "David";
		String reemplazar = "Daniel";
		texto = texto.replaceAll(buscar, reemplazar);
		return texto;
	}
}
