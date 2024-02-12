package Ejemplo03;

public class Persona {
	public String nombre;
	public String apellidos;
	
	public Persona() {
		System.out.println("Persona creada!");
		nombre = "Sin nombre";
		apellidos = "Sin apellidos";
	}
	
	public Persona(String name, String surname) {
		nombre = name;
		apellidos = surname;
	}
	
	public String nombreCompleto(){
		return nombre + " " + apellidos;
	}
	
	public String apellidosCompleto(){
		return apellidos + ", " + nombre;
	}
}