package Ejercicio11;

public class Principal {
	public static void main(String[] args) {
		System.out.println("Inicio del programa\n");
		
		Coche[] lista = Archivo.obtenerCoches();
		
		System.out.println("Lista de coches\n-------------------");
		for(int i = 0; i < lista.length; i++) {
			System.out.println((i+1) + "º coche");
			System.out.println("Marca: " + lista[i].getMarca());
			System.out.println("Modelo: " + lista[i].getModelo());
			System.out.println("Color: " + lista[i].getColor());
			System.out.println("Combustible: " + lista[i].getCombustible());
			System.out.println("Kilometraje: " + lista[i].getKilometraje() + "km\n");
		}
	
		System.out.println("Fin del programa");
	}
}