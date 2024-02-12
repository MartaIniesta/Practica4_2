package Ejercicio07;

public class Ejercicio07 {
	public static void main(String[] args) {
		System.out.println("Inicio del programa\n");
		
		String texto = "Oracle ha anunciado hoy su nueva generación de compilador Java hoy. Utiliza analizador avanzado y optimizador especial para la JVM de Oracle";
		String palabras = "JVM,Java,Oracle";
		System.out.println("Texto original: " + texto + "\nPalabras censuradas: " + palabras + "\n\nTexto censurado: " + reemplazaPalabras(texto, palabras));
				
		System.out.println("\nFin del programa");
	}
	
	public static String reemplazaPalabras(String texto, String palabras) {
		String[] a = palabras.split(",");
		
		for(int i = 0; i < a.length; i++) {
			String repetir = a[i];
			texto = texto.replaceAll(a[i], "*".repeat(repetir.length()));
		}
		return texto;
	}
}