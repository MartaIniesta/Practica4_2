
public class Ejemplo2 {
	public static void main(String[] args) {
		System.out.print("Inicio del programa");
		int[] numeros = {6,5,4,7,8,7,1,2,3,4};
		
		listarNumeros(numeros);
		
		numeros = ordenar(numeros, true);
		listarNumeros(numeros);
		
		numeros = ordenar(numeros, false);
		listarNumeros(numeros);
		
		System.out.println("\n\nFin del programa");
	}
	
	public static void listarNumeros(int[] numeros) {
		System.out.println("\n\nNúmeros\n-----------");
		for(int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]);
		}
	}
	
	public static int[] ordenar(int[] numeros, boolean ascendente) {
		for(int i = 0; i < numeros.length; i++) {
			for(int j = i+1; j < numeros.length; j++) {
				if((ascendente && numeros[i] > numeros[j]) || (!ascendente && numeros[i] < numeros[j])) {
					int aux = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = aux;
				}
			}
		}
		return numeros;
	}
}
