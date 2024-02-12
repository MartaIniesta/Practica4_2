package Ejercicio01;

public class Principal {
	public static void main(String[] args) {
		System.out.println("Inicio del programa\n");
		
		Punto Punto1 = new Punto();
		Punto1.x = 9.5;
		Punto1.y = 5.09;
		
		Punto Punto2 = new Punto();
		Punto2.x = 6.2;
		Punto2.y = 2.6;
		
		System.out.println("Punto 1: " + "(" + Punto1.x + ", " + Punto1.y + ")");
		System.out.println("Punto 2: " + "(" + Punto2.x + ", " + Punto2.y + ")");
		
		Punto1.x = 5.1;
		Punto1.y = 2.8;
		System.out.println("\nPunto 1 cambiado: " + "(" + Punto1.x + ", " + Punto1.y + ")");
		
		Punto2.x = -1.01;
		Punto2.y = 0;
		System.out.println("Punto 2 cambiado: " + "(" + Punto2.x + ", " + Punto2.y + ")");
		
		System.out.println("\nFin del programa");
	}
}