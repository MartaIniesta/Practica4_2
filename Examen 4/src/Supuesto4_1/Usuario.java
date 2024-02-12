package Supuesto4_1;

public class Usuario {
	private String nombre;
	private String apellidos;
	private String email;

	public Usuario() {
		
	}
	public Usuario(String nombre, String apellidos, String email) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
	}
	
	//GET
	public String getNombre() {
		return this.nombre;
	}
	public String getApellidos() {
		return this.apellidos;
	}
	public String getEmail() {
		return this.email;
	}
	
	//SET
	public void setNombre(String nombre) {
		if(nombre.length() >= 4) {
			this.nombre = nombre;
		}
	}
	public void setApellidos(String apellidos) {
		if(apellidos.length() >= 4) {
			this.apellidos = apellidos;
		}		
	}
	public void setEmail(String email) {
		if(email.length() >= 6) {
			this.email = email;
		}
	}
}
