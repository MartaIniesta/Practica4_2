package Ejercicio09;

public class Principal {
	public static void main(String[] args) {
		System.out.println("Inicio del programa\n");
		
		String[] lista = Fichero.listaLineas();
		
		System.out.println("Lista de textos\n----------------");
		for(int i = 0; i < lista.length; i++) {
			System.out.println((i+1) + "º linea: " + lista[i]);
		}
		
		System.out.println("\nFin del programa");
	}
}