package Ejercicio04;

import Ejercicio03.Punto;

public class Principal {
	public static void main(String[] args) {
		System.out.println("Inicio del programa\n");
		
		Punto Punto1 = new Punto(1, 5);
		System.out.println("1º Coordenada: (" + Punto1.getX() + ", " + Punto1.getY() + ")--> " + cuadrante(Punto1));
		
		Punto1.setX(-5);
		Punto1.setY(7);
		System.out.println("2º Coordenada: (" + Punto1.getX() + ", " + Punto1.getY() + ")--> " + cuadrante(Punto1));
		
		Punto1.setX(-6);
		Punto1.setY(0-2);
		System.out.println("3º Coordenada: (" + Punto1.getX() + ", " + Punto1.getY() + ")--> " + cuadrante(Punto1));
		
		Punto Punto2 = new Punto(3, -4);
		System.out.println("4º Coordenada: (" + Punto2.getX() + ", " + Punto2.getY() + ")--> " + cuadrante(Punto2));
		
		Punto Punto3 = new Punto(0, 0);
		System.out.println("5º Coordenada: (" + Punto3.getX() + ", " + Punto3.getY() + ")--> " + cuadrante(Punto3));
		
		Punto3.setX(9);
		Punto3.setY(0);
		System.out.println("6º Coordenada: (" + Punto3.getX() + ", " + Punto3.getY() + ")--> " + cuadrante(Punto3));
		
		System.out.println("\nFin del programa\n");
	}
	
	public static String cuadrante(Punto puntos) {
		if(puntos.getX() > 0 && puntos.getY() > 0) {
			return "Primer cuadrante";
		}else if(puntos.getX() < 0 && puntos.getY() > 0) {
			return "Segundo cuadrante";
		}else if(puntos.getX() < 0 && puntos.getY() < 0) {
			return "Tercer cuadrante";
		}else if(puntos.getX() > 0 && puntos.getY() < 0) {
			return "Cuarto cuadrante";
		}else if(puntos.getX() == 0 && puntos.getY() == 0) {
			return "Se encuentra sobre el centro del eje";
		}else{
			return "Se encuentra entre dos cuadrantes";
		}
	}
}