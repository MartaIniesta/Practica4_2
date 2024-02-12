package Ejemplos;

public class Ejemplo2 {
	public static void main(String[] args) {
		System.out.println("Inicio del programa\n");
		
		char caracteres[] = {'M','u','n','d','o',' ','J','a','v','a'};
		System.out.println("Array de char:");
		for(int i = 0; i < caracteres.length; i++) {
			System.out.print(caracteres[i]);
		}
		
		System.out.println("\n\nCadena de caracteres:");
		String cadena = new String(caracteres, 6, 4); //El 6 es donde empieza a contar y el 4 los caracteres que coge
		for(int i = 0; i < cadena.length(); i++) {
			System.out.print(cadena.charAt(i));
		}
		
		System.out.println("\n\nFin del programa");
	}
}