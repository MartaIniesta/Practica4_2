package replace;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejemplo4 {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Inicio del programa\n");
		//Llamar a un metodo que habra el fichero y devuelva todo su contenido y lo recogemos en un String
		//Pedimos en bucle al usuario que indique que palabras queremos "censurar" hasta que escribamos "terminar"
		//Despues mandamos el texto a un metodo que lo inserte en un fichero que se genere con un nombre compuesto por la fecha y hora actual o los milisegundos de la fecha
	
		String texto = leerFichero();
		System.out.print(texto);

		String palabras = pedirPalabras(texto);
		
		reemplazarTexto(palabras);
						
		System.out.println("\nFin del programa");
	}
	
	public static String leerFichero() {
		ArrayList<String> lista = new ArrayList<String>();
		
		try {
			File filas = new File("./input/texto.txt");
	        Scanner leer = new Scanner(filas);
		        while (leer.hasNextLine()) {
		        	String linea = leer.nextLine();
		        	lista.add(linea);
		        }
		        leer.close();
	      } catch (FileNotFoundException e) {
	        System.out.println("Error");
	        e.printStackTrace();
	      }
		
		String texto = "";
		for(int i = 0; i < lista.size(); i++) {
			texto += lista.get(i) + "\n";
		}
		
		return texto;
	}
	
	public static void reemplazarTexto(String texto) {
		LocalDateTime hoy = LocalDateTime.now();
		String ruta = "./output/" + hoy.getHour() + ":" + hoy.getMinute() + ":" + hoy.getSecond() + " " + hoy.getDayOfMonth() + "-" + hoy.getMonth() + "-" + hoy.getYear() + ".txt";
		
		try {
			FileWriter writer = new FileWriter(ruta);
			writer.write(texto);
			writer.close();
			
			System.out.println("Se ha creado el archivo \"" + ruta + "\" con exito.");
		
	      } catch (IOException e) {
	        System.out.println("Error.");
	      }
	}
	
	public static String pedirPalabras(String texto) {
		String palabra = null;
		
		do {
			System.out.print("Indica las palabras que quieres censurar: ");
			palabra = teclado.nextLine().trim();
			texto = texto.replaceAll(palabra, "***");
			
		}while(!palabra.equalsIgnoreCase("terminar"));
		
		return texto;
	}
}
