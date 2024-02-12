package Ejercicio03;

public class Punto {
	public double x;
	public double y;
	
	public Punto() {
		
	}
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	//GET
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	
	//SET
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
}