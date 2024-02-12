package Ejercicio10;

public class Principal {
	public static void main(String[] args) {
		System.out.println("Inicio del programa\n");
		
		boolean resultado = Fichero.nuevaLinea("Nueva linea");
		
		if(resultado) {
			System.out.println("Nueva linea insertada correctamente");
		}else {
			System.out.println("Ha ocurrido un error...");
		}
		
		System.out.println("\nFin del programa");
	}
}