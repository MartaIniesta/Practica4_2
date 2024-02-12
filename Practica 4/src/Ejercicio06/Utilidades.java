package Ejercicio06;

public class Utilidades {
	public static void main(String[] args) {
		System.out.println("Inicio del programa\n");
		
		String texto = "d e f g h i j k l m n o p q r s t u v w x y z a b c";
		String resultado = desencripta(texto);
		System.out.println("Texto encriptado: " + texto);
		System.out.println("Texto desencriptado: " + resultado);
		
		System.out.println("\nFin del programa");
	}
	
	public static String desencripta(String texto) {
	    String textoEncripta = "";
	    for(int i = 0; i < texto.length(); i++) {
	        char letraTexto = texto.charAt(i);  
	        int num = letraTexto;
	        num -= 3; 
	        char letraEncripta = (char) num;

	        if(letraTexto < (97 + 3) && letraTexto >= 97) {
	        	int n = (97 + 3) - letraTexto;
	        	textoEncripta += Character.toString(123 - n);
	        	
	        }else if(letraTexto == 32) {
	    		textoEncripta += " ";
	    		
	    	}else {
		        textoEncripta += letraEncripta; 
	        }
	    }
	    return textoEncripta;
	}
}