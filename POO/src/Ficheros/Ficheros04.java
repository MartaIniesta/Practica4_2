package Ficheros;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ficheros04 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Inicio del programa\n");
		
		System.out.print("Titulo: ");
		String titulo = teclado.nextLine().trim();
		
		System.out.print("Duracion: ");
		int duracion = Integer.parseInt(teclado.nextLine().trim());
		
		System.out.print("Sinopsis: ");
		String sinopsis = teclado.nextLine().trim();
		
		System.out.print("Genero: ");
		String genero = teclado.nextLine().trim();
		
		Pelicula peli = new Pelicula(titulo, duracion, sinopsis, genero);
		
		boolean resultado = insertar(peli);
		
		if(resultado) {
			System.out.println("Insertado correctamente");
		}else {
			System.out.println("Ha ocurrido un error...");
		}
		
		System.out.println("\nFin del programa");
	}
	
	public static boolean insertar(Pelicula peli) {
		String nuevaLinea = peli.getTitulo() + "=" + peli.getDuracion() + "=" + peli.getSinopsis() + "=" + peli.getGenero();
		
	    try {
	        FileWriter myWriter = new FileWriter("./Archivos/peliculas.txt", true); // el ,true es para que no me borre lo que tenia escrito antes
	        myWriter.write("\n" + nuevaLinea);
	        myWriter.close();
	        
	    }catch (IOException e) {
	        return false;
	    }
	    
		return true;
	}
}