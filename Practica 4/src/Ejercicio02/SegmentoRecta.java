package Ejercicio02;

public class SegmentoRecta {
	private double coordenadaInicio;
	private double coordenadaFin;
	private double longitud;
	
	public SegmentoRecta() {
		
	}
	public SegmentoRecta(double coordenadaInicio, double coordenadaFin, double longitud) {
		this.coordenadaInicio = coordenadaInicio;
		this.coordenadaFin = coordenadaFin;
		this.longitud = longitud;
	}
	
	public double getCoordenadaInicio() {
		return coordenadaInicio;
	}
	public void setCoordenadaInicio(double coordenadaInicio) {
		this.coordenadaInicio = coordenadaInicio;
	}
	
	public double getCoordenadaFin() {
		return coordenadaFin;
	}
	public void setCoordenadaFin(double coordenadaFin) {
		this.coordenadaFin = coordenadaFin;
	}
	
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
}