package POO2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		System.out.println("Inicio del programa\n");
		
		Coordenada[] lista = obtenerCoordenadas();
		
		calcularDistancias(lista);
		
		System.out.println("\nFin del programa");
	}
	
	public static Coordenada[] obtenerCoordenadas() {
		ArrayList<Coordenada> lista = new ArrayList<Coordenada>();
		try {
			File myObj = new File("./files/coordenadas.txt");
	        Scanner datos = new Scanner(myObj);
	        while (datos.hasNextLine()) {
	          String linea = datos.nextLine();
	          String[] campos = linea.split(",");
	          double x = Double.parseDouble(campos[0]);
	          double y = Double.parseDouble(campos[1]);
	          Coordenada actual = new Coordenada(x, y);
	          lista.add(actual); 
	        }
	        datos.close();
	    }catch (FileNotFoundException e) {
	        System.out.println("Error");
	        e.printStackTrace();
	    }
		Coordenada[] array = new Coordenada[lista.size()]; //size es como el length pero del Array
		for(int i = 0; i < lista.size(); i++) {
			array[i] = lista.get(i); 
		}
		return array;
	}
	
	public static void calcularDistancias(Coordenada[] lista) {
		double distanciaTotal = 0;
		System.out.println("\nDistancia entre puntos\n");
		for(int i = 0; i < lista.length - 1; i++) {
			double distancia = lista[i].distancia(lista[i+1]);
			distanciaTotal += distancia;
			System.out.println((i+1) + "º: " + lista[i] + " --> " + lista[i+1] + " Distancia: " + distancia);
		}
		
		System.out.println("\nDistancia total: " + distanciaTotal);
	}
}