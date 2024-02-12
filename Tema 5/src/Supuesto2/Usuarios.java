package Supuesto2;

public class Usuarios {
	private String numLista;
	private String nombre;
	private String apellidos;
	private String DNI;
	private String email;
	private String direccion;
	private String telefono;
	
	public Usuarios() {
		
	}
	public Usuarios(String numLista, String nombre, String apellidos, String DNI, String email, String direccion, String telefono) {
		this.numLista = numLista;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.DNI = DNI;
		this.email = email;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	//GET
	public String getNumLista() {
		return this.numLista;
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getApellidos() {
		return this.apellidos;
	}
	public String getDNI() {
		return this.DNI;
	}
	public String getEmail() {
		return this.email;
	}
	public String getDireccion() {
		return this.direccion;
	}
	public String getTelefono() {
		return this.telefono;
	}
	
	//SET
	public void setNumLista(String numLista) {
		this.numLista = numLista;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public void setDNI(String DNI) {
		this.DNI = DNI;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}