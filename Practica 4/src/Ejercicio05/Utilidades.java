package Ejercicio05;

public class Utilidades {
	public static void main(String[] args) {
		System.out.println("Inicio del programa\n");
		
		String texto = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
		String resultado = encripta(texto);
		System.out.println("Texto normal: " + texto);
		System.out.println("Texto encriptado: " + resultado);
		
		System.out.println("\nFin del programa");
	}
	
	public static String encripta(String texto) {
	    String textoEncripta = "";
	    
	    for(int i = 0; i < texto.length(); i++) {
	        char letraTexto = texto.charAt(i);  
	        int num = letraTexto;
	        num += 3; 
	        char letraEncripta = (char) num;

	        if(letraTexto > (122 - 3) && letraTexto <= 122) {
	        	int n = (3 - 122) + letraTexto;
	        	textoEncripta += Character.toString(96 + n);
	        	
	        }else if(letraTexto == 32) {
	    		textoEncripta += " ";
	    		
	    	}else {
		        textoEncripta += letraEncripta; 
	        }
	    }
	    return textoEncripta;
	}
}