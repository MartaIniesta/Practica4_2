package Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ficheros01 {
	public static void main(String[] args) {
		System.out.println("Inicio del programa\n");
		
		leerFichero();
		
		System.out.println("\nFin del programa");
	}
	
	public static void leerFichero() {
		try {
			File myObj = new File("./Archivos/alumnos.txt");
	        Scanner myReader = new Scanner(myObj);
	        while (myReader.hasNextLine()) {
	          String data = myReader.nextLine();
	          System.out.println(data);
	        }
	        myReader.close();
	      } catch (FileNotFoundException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
	}
}