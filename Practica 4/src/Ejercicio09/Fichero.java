package Ejercicio09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Fichero {
	public static String[] listaLineas() {
		ArrayList<String> lista = new ArrayList<String>();
		try {
			File myObj = new File("./Archivos/lista.txt");
	        Scanner datos = new Scanner(myObj);
	        while (datos.hasNextLine()) {
	          String linea = datos.nextLine();
	          lista.add(linea);
	        }
	        datos.close();
	    }catch (FileNotFoundException e) {
	        System.out.println("Error");
	        e.printStackTrace();
	    }
		String[] array = new String[lista.size()];
		for(int i = 0; i < lista.size(); i++) {
			array[i] = lista.get(i); 
		}
		return array;
	}
}