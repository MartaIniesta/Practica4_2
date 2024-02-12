package Ejercicio02;

public class Manzana {
	private double peso;
	private double precio;
	private String tipo;
	
	public Manzana() {
		
	}
	public Manzana(double peso, double precio, String tipo) {
		this.peso = peso;
		this.precio = precio;
		this.tipo = tipo;
	}

	//PESO
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	//PRECIO
	public double getPrecio() {
		return peso;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	//TIPO
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}