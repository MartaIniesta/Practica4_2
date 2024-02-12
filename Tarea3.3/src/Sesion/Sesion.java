package Sesion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sesion {
	
	public boolean login(String nomUsuario, String contraseña) {	
		try {
			File myObj = new File("./assets/usuarios.txt");
	        Scanner datos = new Scanner(myObj);
	        
	        while (datos.hasNextLine()) {
	          String linea = datos.nextLine();
	          String[] campos = linea.split("#");
		          if(campos[0].equalsIgnoreCase(nomUsuario) && campos[1].equalsIgnoreCase(contraseña)) {
		        	  return true;
		          }
	        }
	        datos.close();
	    }catch (FileNotFoundException e) {
	        System.out.println("Error");
	        e.printStackTrace();
	    }
		return false;
	}
}