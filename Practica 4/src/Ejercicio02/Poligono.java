package Ejercicio02;

public class Poligono {
	private double longitudLados;
	private int angulos;
	private double area;
	private String tipo;
	private int numeroLados;
	
	public Poligono(){
		
	}
	public Poligono(double longitudLados, int angulos, double area, String tipo, int numeroLados){
		this.longitudLados = longitudLados;
		this.angulos = angulos;
		this.area = area;
		this.tipo = tipo;
		this.numeroLados = numeroLados;
	}
	
	public double getLongitudLados() {
		return longitudLados;
	}
	public void setLongitudLados(double longitudLados) {
		this.longitudLados = longitudLados;
	}
	
	public int getAngulos() {
		return angulos;
	}
	public void setAngulos(int angulos) {
		this.angulos = angulos;
	}
	
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getNumeroLados() {
		return numeroLados;
	}
	public void setNumeroLados(int numeroLados) {
		this.numeroLados = numeroLados;
	}
}