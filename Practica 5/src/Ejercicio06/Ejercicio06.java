package Ejercicio06;

public class Ejercicio06 {
	public static void main(String[] args) {
		System.out.println("Inicio del programa\n");
		
		System.out.println(padRight("Introducción", '*', 20));
		
		System.out.println("\nFin del programa");
	}
	
	public static String padRight(String texto, char caracter, int num) {
		StringBuilder definitivo = new StringBuilder(texto); 

		for(int i = 0; i < num - texto.length(); i++) {
			//if(texto.length() < (i+1)) {
				definitivo.append(caracter);
			//}
		}
		return definitivo.toString();
	}
}