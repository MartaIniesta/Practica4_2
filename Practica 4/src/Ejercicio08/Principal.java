package Ejercicio08;

public class Principal {
	public static void main(String[] args) {
		System.out.println("Inicio del programa\n");
		
		Punto Punto1 = new Punto(1, 5);
		System.out.println("1º Coordenada: (" + Punto1.getX() + ", " + Punto1.getY() + "), " + cuadrante(Punto1));
		Punto1.distancia();
		Punto1.moverA1();
		System.out.println("1º Coordenada cambiada: (" + Punto1.getX() + ", " + Punto1.getY() + "), " + cuadrante(Punto1));
		Punto1.distancia();
		
		Punto1.setX(0);
		Punto1.setY(0);
		System.out.println("\n2º Coordenada: (" + Punto1.getX() + ", " + Punto1.getY() + "), " + cuadrante(Punto1));
		Punto1.distancia();
		Punto1.moverA1();
		System.out.println("2º Coordenada cambiada: (" + Punto1.getX() + ", " + Punto1.getY() + "), " + cuadrante(Punto1));
		Punto1.distancia();
		System.out.println();
		
		Punto Punto2 = new Punto(-2,1);
		System.out.println("3º Coordenada: (" + Punto2.getX() + ", " + Punto2.getY() + "), " + cuadrante(Punto2));
		Punto2.distancia();
		Punto2.moverA1();
		System.out.println("3º Coordenada cambiada: (" + Punto2.getX() + ", " + Punto2.getY() + "), " + cuadrante(Punto2));
		Punto2.distancia();
		
		Punto2.setX(-10);
		Punto2.setY(-2.5);
		System.out.println("\n4º Coordenada: (" + Punto2.getX() + ", " + Punto2.getY() + "), " + cuadrante(Punto2));
		Punto2.distancia();
		Punto2.moverA1();
		System.out.println("4º Coordenada cambiada: (" + Punto2.getX() + ", " + Punto2.getY() + "), " + cuadrante(Punto2));
		Punto2.distancia();

		Punto2.setX(5.2);
		Punto2.setY(-1);
		System.out.println("\n5º Coordenada: (" + Punto2.getX() + ", " + Punto2.getY() + "), " + cuadrante(Punto2));
		Punto2.distancia();
		Punto2.moverA1();
		System.out.println("5º Coordenada cambiada: (" + Punto2.getX() + ", " + Punto2.getY() + "), " + cuadrante(Punto2));
		Punto2.distancia();
		
		Punto2.setX(-1550.025);
		Punto2.setY(-4E-2);
		System.out.println("\n6º Coordenada: (" + Punto2.getX() + ", " + Punto2.getY() + "), " + cuadrante(Punto2));
		Punto2.distancia();
		Punto2.moverA1();
		System.out.println("6º Coordenada cambiada: (" + Punto2.getX() + ", " + Punto2.getY() + "), " + cuadrante(Punto2));
		Punto2.distancia();
		
		System.out.println("\nFin del programa");
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
			return "Se encuentra en el centro del eje";
		}else{
			return "Se encuentra entre dos cuadrantes";
		}
	}
}