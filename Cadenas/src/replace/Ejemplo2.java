package replace;

import java.util.Scanner;

public class Ejemplo2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Inicio del programa\n");
		
		System.out.print("Introduce un texto: ");
		String texto = teclado.nextLine().trim();
		System.out.println();
		
		System.out.print("Texto a buscar: ");
		String buscar = teclado.nextLine().trim();
		
		System.out.print("Texto a reemplazar: ");
		String reemplazar = teclado.nextLine().trim();
		
		String resultado = reemplazarTexto(texto, buscar, reemplazar);
		System.out.println();
		System.out.print("El texto procesado es: " + resultado);

		
		System.out.println("\nFin del programa");
	}
	
	public static String reemplazarTexto(String texto, String buscar, String reemplazar) {
		texto = texto.replaceAll(buscar, reemplazar);
		return texto;
	}
}
