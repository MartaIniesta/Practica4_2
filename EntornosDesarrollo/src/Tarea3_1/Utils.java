package Tarea3_1;

import java.util.Scanner;

public class Utils {

    public static String tipoTriangulo (double lado1, double lado2, double lado3){

        if(!esTriangulo(lado1, lado2, lado3)){
            return "ERROR";
        }

        if(lado1 == lado2 && lado1 != lado3 || lado1 == lado3 && lado2 != lado3 || lado2 == lado3 && lado2 != lado1){
            return "Isosceles";
        }else if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
            return "Equilatero";
        }else{
            return "Escaleno";
        }
    } 

    public static boolean esTriangulo (double lado1, double lado2, double lado3){
            if(lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado3 + lado1 > lado2){
                return true;
            }
        return false;
    }
    	
	public static int masFrecuenteInt(int[] numeros){
		int numeroMasFrecuente = numeros[0];
		int frecuenciaMaxima = 1;

		for (int i = 0; i < numeros.length; i++){
			int numeroActual = numeros[i];
			int frecuenciaActual = 1;

			for (int j = i + 1; j < numeros.length; j++){
				if (numeros[j] == numeroActual){
					frecuenciaActual++;
				}
			}
			frecuenciaActual++;
			if (frecuenciaActual > frecuenciaMaxima){
				frecuenciaMaxima = frecuenciaActual;
				numeroMasFrecuente = numeroActual;
			}
		}
		return numeroMasFrecuente;
	}   

	public static int buscarInt(int[] vector, int num){

		for(int i = 0; i < vector.length; i++){
			if(num == vector[i]){
				return i;
			}      
		}
		return -1;
	    
	}
}