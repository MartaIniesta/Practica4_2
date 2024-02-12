package Ejemplos;

public class Estatica {

	public static int factorial(int num) {
		if(num < 0) {
			return -1;
		}
		
		int valor = 1;
		for(int i = 1; i <= num; i++) {
			valor = valor * i;
		}
		
		return valor;
	}
}