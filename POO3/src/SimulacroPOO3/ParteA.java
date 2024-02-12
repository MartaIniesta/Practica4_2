package SimulacroPOO3;

import java.io.File;
import java.util.Scanner;

public class ParteA {
	public static void main(String[] args) {
		
		System.out.println("Inicio del programa\n");
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t     Parte A");
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		ParteA();
		
		System.out.print("Fin del programa");
	}
	
	public static void ParteA() {
		try {
			File fiModulos = new File("./ficheros/modulos.txt");
			Scanner fichero = new Scanner(fiModulos);
			while(fichero.hasNextLine()) {
				String linea = fichero.nextLine();
				String[] partes = linea.split("&");
					
				if(partes.length == 5) {
					Modulo modulo = new Modulo(Integer.parseInt(partes[0]), partes[1], Integer.parseInt(partes[2]), Integer.parseInt(partes[3]), partes[4]);
					Alumno[] alumno = modulo.leerModulo(partes[0]);
					modulo.Mostrar();
					System.out.print("\n");
						for(int i = 0; i < alumno.length; i++) {
							alumno[i].Mostrar();
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