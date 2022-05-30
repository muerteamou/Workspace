package ejercicios;

/*Escribe un programa que imprima los 100 primeros números primos.*/
public class Ejercicio15 {

	public static void main(String[] args) {
		/*
		 * int x = 1, primo, contador=0;
		 * 
		 * for (primo = 1; primo <= 100; primo++) { int sumador=0; for (int i = 1; i <=
		 * x; i++) { if (x % i == 0) { sumador = sumador + 1; } } if (sumador == 2) {
		 * contador++; System.out.println(contador +"º número primo - " +x); x++;
		 * 
		 * } else { x++; primo = primo - 1; } }
		 */
		//Con métodos
		int primos = 0;
		int x = 2;
		while (primos < 100) {
			
			if (esPrimo(x)) {
				primos++;
				System.out.println(primos + "º número primo - " + x);
				x++;
			}else
				x++;
		}
	}

	public static boolean esPrimo(int x) {
		int contador = 0;
		for (int i = 1; i <= x; i++) {
			if (x % i == 0) {
				contador++;
			}
		}
		if (contador == 2) {
			return true;
		} else {
			return false;
		}
	}

}
