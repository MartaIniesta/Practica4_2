package Ejercicio14;

public class Ejercicio14 {
	public static void main(String[] args) {
		System.out.println("Inicio del programa\n");
		
		System.out.println("29/02/2024 -> " + fechaValida("29/02/2024"));
		
		System.out.println("\nFin del programa");	
	}
	
	public static boolean fechaValida(String fecha) {

		String patron = "([0-9]{2}(/|-|.)[0-9]{2}(/|-|.)[0-9]{4})|([0-9]{4}(/|-|.)[0-9]{2}(/|-|.)[0-9]{2})";
		boolean coincidencias = fecha.matches(patron);
		
		if(!coincidencias) {
			return false;
		}
		
		String[] separar = fecha.split("/");
		int dia = Integer.parseInt(separar[0]);
		int mes = Integer.parseInt(separar[1]);
		int año = Integer.parseInt(separar[2]);
		
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