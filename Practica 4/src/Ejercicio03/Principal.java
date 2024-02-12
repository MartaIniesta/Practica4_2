package Ejercicio03;

public class Principal {
	public static void main(String[] args) {
		System.out.println("Inicio del programa\n");
		
		Punto Punto1 = new Punto(3.3, 4.4);
		Punto Punto2 = new Punto(7.2, 2.7);

		System.out.println("1º Coordenada: (" + Punto1.getX() + ", " + Punto1.getY() + ")");
		System.out.println("2º Coordenada: (" + Punto2.getX() + ", " + Punto2.getY() + ")");
		
		Punto1.setX(1.1);
		Punto1.setY(0);
		System.out.println("\n1º Coordenada cambiada: (" + Punto1.getX() + ", " + Punto1.getY() + ")");
		
		Punto2.setX(0);
		Punto2.setY(-9.1);
		System.out.println("2º Coordenada cambiada: (" + Punto2.getX() + ", " + Punto2.getY() + ")");

		System.out.println("\nFin del programa");
	}
}