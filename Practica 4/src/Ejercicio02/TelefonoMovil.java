package Ejercicio02;

public class TelefonoMovil {
	private String marca;
	private String modelo;
	private double precio;
	private int tamaño;
	
	public TelefonoMovil() {
		
	}
	public TelefonoMovil(String marca, String modelo, double precio, int tamaño) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.tamaño = tamaño;
	}

	//MARCA
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	//MODELO
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	//PRECIO
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	//TAMAÑO
	public int getTamaño() {
		return tamaño;
	}
	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}
}