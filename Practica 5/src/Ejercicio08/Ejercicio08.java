package Ejercicio08;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio08 {
	public static void main(String[] args) {
		System.out.println("Inicio del programa\n");
		
        String URL = "http://www.devbg.org/forum/index.php";
        String[] resultado = separarURL(URL);
        
        System.out.println("Protocolo: " + resultado[0]);
        System.out.println("Servidor: " + resultado[1]);
        System.out.println("Recurso: " + resultado[2]);
		
		System.out.println("\nFin del programa");
	}
	
	public static String[] separarURL(String URL) {
        /*String protocolo = "";
        String servidor = "";
        String recurso = "";

        Pattern patron = Pattern.compile("(http)://(.*?)(/.*)");
        Matcher matcher = patron.matcher(URL);

        if (matcher.matches()) {
            protocolo = matcher.group(1);
            servidor = matcher.group(2);
            recurso = matcher.group(3);
        }

        return new String[]{protocolo, servidor, recurso};*/
        
        String regex = "://|/";
        String[] trozos = URL.split(regex, 3);
        
        if(trozos.length == 3) {
        	trozos[2] = "/" + trozos[2];
        }
        return trozos;
	}
}