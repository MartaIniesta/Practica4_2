package POO1;

public class Alumno {
	private String nombre;
	private String apellidos;
	private String nre;
	private String email;
	private String direccion;
	
	// Constructor vacio
	public Alumno() {
		
	}
	public Alumno(String name, String surname, String numero, String mail,String address) {
		nombre = name;
		apellidos = surname;
		nre = numero;
		email = mail;
		direccion = address;
	}
	
	//Nombre
	public String getNombre() { //leer valor
		return nombre;
	}
	public void setNombre(String name) { //dar valor
		nombre = name;
	}
	
	//Apellido
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String surname) {
		if(surname.trim().length() > 0) {
			apellidos = surname;
		}
	}
	
	//Nre
	public String getNre() {
		return nre;
	}
	public void setNre(String numero) {
		if(numero.trim().length() > 0) {
			nre = numero;
		}
	}
	
	//Email
	public String getEmail() {
		return email;
	}
	public void setEmail(String mail) {
		if(mail.trim().length() > 0) {
			email = mail;
		}
	}
	
	//Direccion
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String address) {
		if(address.trim().length() > 0) {
			direccion = address;
		}
	}
	
	public String info() {
		String informacion = nombre + " " + apellidos + "\n";
			informacion += "-----------\n";
			informacion += "NRE: " + nre + "\n";
			informacion += "Email: " + email + "\n";
			informacion += "Direccion: " + direccion + "\n";

		return informacion;
	}
}