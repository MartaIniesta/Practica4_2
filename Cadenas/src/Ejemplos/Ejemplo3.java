package Ejemplos;

public class Ejemplo3 {
	public static void main(String[] args) {
		System.out.println("Inicio del programa\n");
		
		char caracteres[] = {'M', 'u', 'n', 'd', 'o', ' ', 'J', 'a', 'v', 'a', ' ', 'h', 'o', 'l', 'a'};
		System.out.println("Array de char:");
		for(int i = 0; i < caracteres.length; i++) {
			System.out.print(caracteres[i]);
		}
		
		int inicio = 6;
		int cantidad = caracteres.length - inicio;
		System.out.println("\n\nCadena de caracteres:");
		
		String cadena = new String(caracteres, inicio, cantidad); 
		for(int i = 0; i < cadena.length(); i++) {
			System.out.print(cadena.charAt(i));
		}
		
		System.out.println("\n\nFin del programa");
	}
}