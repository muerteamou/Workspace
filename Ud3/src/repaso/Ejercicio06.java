package repaso;

/*6. Escribe un programa que genere 20 números enteros aleatorios entre 0 y 99 y los 
almacene en un array. El programa debe crear un nuevo array con los números primos que 
haya entre esos 20 números. Luego debe mostrar los dos arrays.*/
public class Ejercicio06 {

	public static void main(String[] args) {

		int[] arrayEnteros = new int[20];
		for (int i = 0; i < arrayEnteros.length; i++) {
			arrayEnteros[i] = (int) (Math.random() * 98 + 1);
			System.out.print(arrayEnteros[i] + " , ");
		}
		System.out.println(" ");
		int[] arrayPrimos = new int[contadorPrimos(arrayEnteros)];

		int contador = contadorPrimos(arrayEnteros);
		System.out.println(contadorPrimos(arrayEnteros));
		while (contador > 0) {
			for (int j = 0; j < arrayEnteros.length; j++) {
				if (esPrimo(arrayEnteros[j])) {
					arrayPrimos[contador-1] = arrayEnteros[j];
					contador--;
				}
			}

		}
		System.out.println(contadorPrimos(arrayEnteros));
		/*for (int i = 0; i < arrayPrimos.length; i++) {
			for (int j = 0; j < arrayEnteros.length; j++) {
				if (esPrimo(arrayEnteros[j])) {
					arrayPrimos[i] = arrayEnteros[j];
				}
			}
		}*/
		for (int i = 0; i < arrayPrimos.length; i++) {
			System.out.print(arrayPrimos[i] + " , ");
		}
	}

	public static boolean esPrimo(int x) {
		int contador = 0;
		for (int i = 1; i <= x; i++) {
			if (x % i == 0) {
				contador++;
			}
		}
		if (contador == 2)
			return true;
		else
			return false;

	}

	public static int contadorPrimos(int[] ArrayEn) {
		int contador = 0;
		for (int i = 0; i < ArrayEn.length; i++) {
			if (esPrimo(ArrayEn[i]))
				contador++;
		}
		return contador;
	}
}
