package Supuesto1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce una frase: ");
		String frase = teclado.nextLine().trim();
		
		String fraseCambiada = cambiarVerbo(frase);
		System.out.println(fraseCambiada);
		
		boolean resultado = escribirFrase(fraseCambiada);
		if(resultado) {
			System.out.println("Archivo creado");
		}else {
			System.out.println("No se ha podido crear el archivo");
		}
	}

	public static String cambiarVerbo(String frase) {
		String regex = "[a-zA-ZñÑ]*([aAeEiI][rR])\\b";
		frase = frase.replaceAll(regex, "(VERBO)");
		return frase;
	}
	
	public static boolean escribirFrase(String frase) {
		try {
			String fichero = System.currentTimeMillis() + ".txt";
			FileWriter writer = new FileWriter("./frases/" + fichero);
			writer.write(frase);
			writer.close();
					
		}catch (IOException e){
			return false;
	    }
		return true;
	}
}
