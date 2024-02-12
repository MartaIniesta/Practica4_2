package Ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Inicio del programa\n");
		
		String expresion1 = "((a + b) / 5-d)";
		String expresion2 = ")(a + b))";
		
		System.out.println(expresion1 + " -> " + parentesisCorrectos(expresion1));
		System.out.println(expresion2 + " -> " + parentesisCorrectos(expresion2));
		
		System.out.println("\nFin del programa");
	}
	
	public static boolean parentesisCorrectos(String expresion) {
		int contador = 0;
		for(int i = 0; i < expresion.length(); i++) {
			char parentesis = expresion.charAt(i);
			
			if(parentesis == '(') {
				contador++;
			}else if(parentesis == ')') {
				contador--;
			}
			
			if(contador < 0 && contador > 0) {
				return false;
			}
		}
		return contador == 0;
	}
}