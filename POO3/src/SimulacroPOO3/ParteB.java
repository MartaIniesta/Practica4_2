package SimulacroPOO3;

import java.io.File;
import java.util.Scanner;

public class ParteB {
	public static String Modulos = "./ficheros/modulos.txt";
	public static String Alumnos = "./ficheros/alumnos.txt";
	public static String Modulo_Alumno = "./ficheros/modulo_alumno.txt";
	
	public static void main(String[] args) {
		System.out.println("Inicio del programa\n");
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t     Parte B");
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		ParteB();
		
		System.out.print("Fin del programa");
	}
	
	public static void ParteB() {
		try {
			File fiAlumnos = new File(Alumnos);
			Scanner fichero = new Scanner(fiAlumnos);
			while(fichero.hasNextLine()) {
				String linea = fichero.nextLine().toLowerCase().trim();
				String[] partes = linea.split("&");
				
				if(partes.length == 7) {
					Alumno alumno = new Alumno(Integer.parseInt(partes[0]), partes[1], partes[2], partes[3], partes[4], partes[5], Integer.parseInt(partes[6]));
					Modulo[] modulo = alumno.OpenAlumno(partes[0]);
					alumno.Mostrar();
					System.out.print("\n");
						for(int i = 0; i < modulo.length; i++) {
							modulo[i].Mostrar();
						}
					System.out.println("\n");
				}
			}
			fichero.close();
		}catch(Exception e) {
			System.out.println("El fichero no existe");
		}
	}
}
