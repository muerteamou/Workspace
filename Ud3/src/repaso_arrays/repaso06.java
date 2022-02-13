package repaso_arrays;

public class repaso06 {

	/*
	 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 99 y
	 * los almacene en un array. El programa debe crear un nuevo array con los
	 * números primos que haya entre esos 20 números. Luego debe mostrar los dos
	 * arrays.
	 */
	public static boolean esPrimo(int numero) {
		for (int i = 2; i <= numero / 2; i++) {
			if (numero % 2 == 0) {
				return false;
			}
		}
		return true;
	}// de primo

	public static void main(String[] args) {
		int tamanyo = 20;
		int[] numeros = new int[tamanyo];
		int[] primos = new int[tamanyo];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * 100);

		}

	}

}
