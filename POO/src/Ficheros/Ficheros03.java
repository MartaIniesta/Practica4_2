package Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ficheros03 {
	public static void main(String[] args) {
		System.out.println("Inicio del programa\n");
		
		Articulo[] lista = obtenerArticulos();
		
		System.out.println("Lista de articulos\n-------------------");
		for(int i = 0; i < lista.length; i++) {
			System.out.println("Nombre: " + lista[i].getNombre());
			System.out.println("Precio: " + lista[i].getPrecio() + "€");
			System.out.println("Descripcion: " + lista[i].getDescripcion() + "\n");
		}
		
		System.out.println("Fin del programa");
	}
	
	public static Articulo[] obtenerArticulos() {
		ArrayList<Articulo> lista = new ArrayList<Articulo>();
		try {
			File myObj = new File("./Archivos/articulos.txt");
	        Scanner datos = new Scanner(myObj);
	        while (datos.hasNextLine()) {
	          String linea = datos.nextLine();
	          String[] campos = linea.split("@");
	          double precio = Double.parseDouble(campos[1]);
	          Articulo actual = new Articulo(campos[0], precio, campos[2]);
	          lista.add(actual); 
	        }
	        datos.close();
	    }catch (FileNotFoundException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	    }
		Articulo[] array = new Articulo[lista.size()];
		for(int i = 0; i < lista.size(); i++) {
			array[i] = lista.get(i); 
		}
		return array;
	}
}

class Articulo{
	private String nombre;
	private double precio;
	private String descripcion;
	
	public Articulo() {
		
	}
	public Articulo(String nombre, double precio, String descripcion) {
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setDescripcion(descripcion);
	}
	
	//GET
	public String getNombre() {
		return this.nombre;
	}
	public double getPrecio() {
		return this.precio;
	}
	public String getDescripcion() {
		return this.descripcion;
	}
	
	//SET
	public void setNombre(String nombre) {
		if(nombre.trim().length() > 3) {
			this.nombre = nombre;
		}
	}
	public void setPrecio(double precio) {
		if(precio > 0) {
			this.precio = precio;
		}
	}
	public void setDescripcion(String descripcion) {
		if(descripcion.trim().length() > 3) {
			this.descripcion = descripcion;
		}
	}
}