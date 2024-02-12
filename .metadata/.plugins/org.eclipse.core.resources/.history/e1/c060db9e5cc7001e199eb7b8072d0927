package Ejercicio12;

import java.time.LocalDateTime;

public class Ejercicio12 {
	public static void main(String[] args) {
		System.out.println("Inicio del programa\n");
		
		cadaSegundo();
		
		System.out.println("\nFin del programa");
	}

	public static void cadaSegundo() {
		while (true) {
			System.out.println(fechaHoraActual());
			try {
				Thread.sleep(1000); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static String fechaHoraActual() {
		LocalDateTime fecha = LocalDateTime.now();
		return  fecha.getDayOfMonth() + "/" + fecha.getMonthValue() + "/" + fecha.getYear() + " " + fecha.getHour() + ":" + fecha.getMinute() + ":" + fecha.getSecond();
	}
}