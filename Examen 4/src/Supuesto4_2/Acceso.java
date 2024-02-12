package Supuesto4_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Acceso {
	public static String arch = "./archivos/";
	public static String tex = "textos.txt";
	
	public static void leer() {
		ArrayList<String> lista = new ArrayList<String>();
		try {
	        File filas = new File(arch + tex);
	        Scanner datos = new Scanner(filas);
	        while (datos.hasNextLine()) {
	          String texto = datos.nextLine();
	          lista.add(texto);
	        }
	        
	        datos.close();
	      } catch (FileNotFoundException e) {
	        System.out.println("Error");
	        e.printStackTrace();
	      }
		
		String[] textos = new String[lista.size()];
		for(int i =0; i<lista.size();i++) {
			textos[i]=lista.get(i);
		}
		
		for(int i = 1; i < textos.length; i++) {
			for(int j = 0; j < textos.length - i; j++) {
				if(textos[j].trim().compareToIgnoreCase(textos[j+1]) > 0) {
					String aux = textos[j];
					textos[j] = textos[j+1];
					textos[j+1] = aux;
				}
			}
		}
		
		for(int i = 0; i < textos.length; i++) {
			System.out.println(textos[i]);
		}
	}
	
	public static void insertar() {
		Scanner teclado = new Scanner(System.in);
		
	    try {
	        FileWriter myWriter = new FileWriter(arch + tex, true);
			System.out.println();
			System.out.print("Escribe una frase: ");
			String texto = teclado.nextLine();

				if(texto.length() < 5) {
					System.out.println("-El texto debe tener al menos 5 caracteres.\n-No se ha podido introducir.");
				}else {
			        myWriter.write("\n" + texto);
			        System.out.println("-El texto se ha introducido correctamente.");
				}
	        myWriter.close();
	        
	      } catch (IOException e) {
	          System.out.println("Error.");
	          e.printStackTrace();
	      }
	}
}