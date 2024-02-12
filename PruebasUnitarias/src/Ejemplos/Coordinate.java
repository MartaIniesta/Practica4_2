package Ejemplos;

public class Coordinate {
	private double x;
	private double y;
	
	public Coordinate(double x, double y) {
		//Llamar a los setters
		this.setX(x);
		this.setY(y);
	}
	
	//GET
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	
	//SET
	public void setX(double x) {
		if(x >= -10 && x <= 10) {
			this.x = x;
		}
	}
	public void setY(double y) {
		if(y >= -10 && y <= 10) {
			this.y = y;
		}
	}
	
	public double distanciaAlcero() {
		return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
	}
	public double distancia(Coordinate b) {
		return Math.sqrt(Math.pow(b.getX() - this.x, 2) + Math.pow(b.getY() - this.y, 2));
	}
}