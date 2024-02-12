package Supuesto2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Inicio del programa\n");
		
		System.out.print("Introduce un dominio de direccion de correo: ");
		String dominio = teclado.nextLine().trim();
	
		if(dominio.length() > 0) {
			Usuarios[] user = obtenerUsuariosDominio(dominio);
			String plantilla = obtenerPlantilla();
			for(int i = 0; i < user.length; i++) {
				enviarEmail(user[i], plantilla);
			}
			System.out.println("Archivo creado correctamente");

		}

		System.out.println("\nFin del programa");		
	}
	public static Usuarios[] obtenerUsuariosDominio(String dominio) {
		ArrayList<Usuarios> lista = new ArrayList<Usuarios>();
		String regex = ".*@" + dominio + ".*";

		try {
			File myObj = new File("./usuarios/usuarios.txt");
	        Scanner datos = new Scanner(myObj);
	        
	        while (datos.hasNextLine()) {
	            String linea = datos.nextLine();
			    String[] partes = linea.split("&");
			    
			    if(partes[4].matches(regex)) {
			    	Usuarios actual = new Usuarios(partes[0], partes[1], partes[2], partes[3], partes[4], partes[5], partes[6]);
			    	lista.add(actual);
			    }	  
	        }
	        datos.close();
	    }catch (FileNotFoundException e) {
	        System.out.println("No se ha podido abrir el fichero");
	    }
		
		Usuarios[] usuarios = new Usuarios[lista.size()];
		for(int i = 0; i < usuarios.length; i++) {
			usuarios[i] = lista.get(i); 
		}
	
		return usuarios;
	}
	
	public static String obtenerPlantilla() {
		String plantilla = "";
		try {
			File myObj = new File("./usuarios/plantilla.html");
	        Scanner datos = new Scanner(myObj);
	        while (datos.hasNextLine()) {
	        	String linea = datos.nextLine();
			    plantilla += linea;
	        }
	        
	        datos.close();
	    }catch (FileNotFoundException e) {
	        System.out.println("Error");
	        e.printStackTrace();
	    }
		return plantilla;
	}
	
	public static void enviarEmail(Usuarios user, String plantilla) {
		//Rellenar email
		String email = plantilla;
		email = email.replaceAll("=nombre=", user.getNombre());
		email = email.replaceAll("=apellidos=", user.getApellidos());
		email = email.replaceAll("=dni=", user.getDNI());
		email = email.replaceAll("=direccion=", user.getDireccion());
		email = email.replaceAll("=telefono=", user.getTelefono());
		email = email.replaceAll("=email=", user.getEmail());

		//Generar nombre archivo html
		String[] partes = user.getEmail().split("@");
		String fichero = partes[0] + "_" + System.currentTimeMillis() + ".html";
		
		//Enviar el email
		try {
			FileWriter writer = new FileWriter("./output/" + fichero);
			writer.write(email);
			writer.close();
					
		}catch (IOException e){
			System.out.println("No se ha podido crear el archivo");
	    }
	}
}