import java.util.Scanner;
public class Practica01 {
	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
		
		System.out.print("Escribe un texto: ");
		String texto = teclado.nextLine();
		
		System.out.print("Primer numero: ");
		int num1 = teclado.nextInt();
		
		System.out.print("Segundo numero: ");
		int num2 = teclado.nextInt();
		
		System.out.print("Tercer numero: ");
		int num3 = teclado.nextInt();

		System.out.print("Numero con decimales: ");
		double num4 = teclado.nextDouble();
		
		int num5 = Math.abs(-num1);
		int num6 = Math.abs(-num2);
		int num7 = Math.abs(-num3);
		
		System.out.println("\nEl texto es: " + texto);
		System.out.println("El primer numero es: " + num5 + "\nEl segundo numero es: " + num6 + "\nEl tercer numero es: " + num7);
		System.out.println("El numero con decimales es: " + num4);
		
		int resultado = num6 * num7 + num5;
		System.out.println("El resultado de la operacion es: " + resultado);
		
	    System.out.println("El resultado es " + Math.floor(num4));
		 
	    System.out.println("El resultado es " + Math.ceil(num4));
	    
	    System.out.println(texto + ". El resultado de la operacion de los numeros enteros es: " + resultado + 
	    ". El numero por arriba es: " + Math.floor(num4) + ", y el de abajo es: " + Math.ceil(num4));
				
	}

}
