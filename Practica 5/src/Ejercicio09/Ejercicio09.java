package Ejercicio09;

public class Ejercicio09 {
	public static void main(String[] args) {
		System.out.println("Inicio del programa\n");
		
        String texto = "Hola me llamo marta";
        String clave = "clave";
        String resultado = encriptar(texto, clave);
        
        System.out.println("Texto encriptado: " + resultado);
		
		System.out.println("\nFin del programa");
	}
	
	public static String encriptar(String texto, String clave) {
		String encriptado = "";
		int longitud = clave.length();
		int j = 0;
		for(int i = 0; i < texto.length(); i++) {
			encriptado += texto.charAt(i) ^ clave.charAt(j);
			j++;
			if(j >= longitud) {
				j = 0;
			}
		}
		return encriptado;
	}
}