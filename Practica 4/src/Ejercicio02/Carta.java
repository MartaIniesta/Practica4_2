package Ejercicio02;

public class Carta {
	private String destinatario;
	private String remitente;
	private String direccion;
	private String tipo;
	
	public Carta(){
		
	}
	public Carta(String destinatario, String remitente, String direccion, String tipo){
		this.destinatario = destinatario;
		this.remitente = remitente;
		this.direccion = direccion;
		this.tipo = tipo;
	}
	
	//DESTINATARIO
	public String getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	
	//REMITENTE
	public String getRemitente() {
		return remitente;
	}
	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}
	
	//DIRECCION
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	//TIPO
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}