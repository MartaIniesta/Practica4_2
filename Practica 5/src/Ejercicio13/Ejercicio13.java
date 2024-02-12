package Ejercicio13;

public class Ejercicio13 {
	public static void main(String[] args) {
		System.out.println("Inicio del programa\n");
		
		System.out.println("29/02/2023 -> " + fechaValida(29,02,2023));
		System.out.println("29/02/2024 -> " + fechaValida(29,02,2024));
		System.out.println("04/13/2002 -> " + fechaValida(04,13,2002));
		System.out.println("31/06/1997 -> " + fechaValida(31,06,1997));
		
		System.out.println("\nFin del programa");	
	}
	
	public static boolean fechaValida(int dia, int mes, int año) {
		
		if(mes == 2) {
			if(((año%4) == 0 && (año%100) != 0 || (año%400) == 0) && dia == 29) {
				return true;
			}else if(dia <= 28) {
				return true;
			}else {
				return false;
			}
		}
		
		if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			if(dia > 31 || dia < 0) {
				return false;
			}
			
		}else {
			if(dia > 30 || dia < 0 || mes > 12 || mes < 0) {
				return false;
			}
		}
		
		if(año > 2024 || año < 0) {
			return false;
		}
		return true;
	}
}