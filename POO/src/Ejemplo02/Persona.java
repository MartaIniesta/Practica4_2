package Ejemplo02;

public class Persona {
	public String nombre;
	public String apellidos;
	
	public String nombreCompleto(){
		return nombre + " " + apellidos;
	}
	
	public String apellidosCompleto(){
		return apellidos + ", " + nombre;
	}
}