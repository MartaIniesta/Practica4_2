package Ejercicio07;

public class Punto {
	private double x;
	private double y;
	
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
	
    public void distancia() {
        double distanciaAlOrigen = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println(" Su distancia al origen (0, 0)--> " + distanciaAlOrigen);
    }
}