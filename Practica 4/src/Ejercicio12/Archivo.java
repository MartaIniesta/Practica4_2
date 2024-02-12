package Ejercicio12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Archivo {
	public static Coche[] obtenerCoches() {
		ArrayList<Coche> lista = new ArrayList<Coche>();
		try {
			File myObj = new File("./Archivos/coches.txt");
	        Scanner datos = new Scanner(myObj);
	        while (datos.hasNextLine()) {
		          String linea = datos.nextLine();
		          String[] campos = linea.split(",,");
		          double kilometraje = Double.parseDouble(campos[4]);
		          Coche actual = new Coche(campos[0], campos[1], campos[2], campos[3], kilometraje);
		          lista.add(actual);  
	        }
	        datos.close();
	    }catch (FileNotFoundException e) {
	        System.out.println("Error");
	        e.printStackTrace();
	    }
		Coche[] array = new Coche[lista.size()];
		for(int i = 0; i < lista.size(); i++) {
			array[i] = lista.get(i); 
		}
		return array;
	}
	
	public static boolean nuevaLinea(Coche coches) {
		String nuevaLinea = coches.getMarca() + ",," + coches.getModelo() + ",," + coches.getColor() + ",," + coches.getCombustible() + ",," + coches.getKilometraje();

	    try {
	        FileWriter myWriter = new FileWriter("./Archivos/coches.txt", true);
	        myWriter.write("\n" + nuevaLinea);
	        myWriter.close();
	        
	    }catch (IOException e) {
	        return false;
	    }
	    
		return true;
	}
}

class Coche{
	private String marca;
	private String modelo;
	private String color;
	private String combustible;
	private double kilometraje;
	
	public Coche() {
		
	}
	public Coche(String marca, String modelo, String color, String combustible, double kilometraje) {
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setColor(color);
		this.setCombustible(combustible);
		this.setKilometraje(kilometraje);
	}
	
	//GET
	public String getMarca() {
		return this.marca;
	}
	public String getModelo() {
		return this.modelo;
	}
	public String getColor() {
		return this.color;
	}
	public String getCombustible() {
		return this.combustible;
	}
	public double getKilometraje() {
		return this.kilometraje;
	}
	
	//SET
	public void setMarca(String marca) {
			this.marca = marca;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
	public void setKilometraje(double kilometraje) {
		this.kilometraje = kilometraje;
	}
}