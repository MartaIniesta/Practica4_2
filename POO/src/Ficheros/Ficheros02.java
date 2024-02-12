package Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ficheros02 {
	public static void main(String[] args) {
		System.out.println("Inicio del programa\n");
		
		String[] lista = obtenerAlumnos();
		
		System.out.println("Lista de alumnos\n-------------------");
		for(int i = 0; i < lista.length; i++) {
			System.out.println((i+1) + "º: " + lista[i]);
		}
		
		System.out.println("\nFin del programa");
	}
	
	public static String[] obtenerAlumnos() {
		ArrayList<String> lista = new ArrayList<String>();
		try {
			File myObj = new File("./Archivos/alumnos.txt");
	        Scanner datos = new Scanner(myObj);
	        while (datos.hasNextLine()) {
	          String linea = datos.nextLine();
	          lista.add(linea); //va añadiendo
	        }
	        datos.close();
	    }catch (FileNotFoundException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	    }
		String[] array = new String[lista.size()];
		for(int i = 0; i < lista.size(); i++) {
			array[i] = lista.get(i); 
		}
		return array;
	}
}