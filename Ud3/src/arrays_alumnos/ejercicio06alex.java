package arrays_alumnos;

import java.util.Scanner;

public class ejercicio06alex {

	// Escribe un programa que pida 10 números por teclado y que luego muestre los
	// números
	// introducidos junto con las palabras "máximo" y "mínimo" al lado del máximo y
	// del mínimo
	// respectivamente. Utiliza métodos en la solución (p.ej. para leer, calcular el
	// máximo,
	// mínimo, visualizar...)
	static int[] x = new int[3];
	static int max, min;

	// metodo solicitar numero
	public static void solicitarNumero() {
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < x.length; i++) {
			System.out.println("Introduce un numero entero: ");
			x[i] = s.nextInt();
		}
	}

	// metodo calcular min/max
	public static void minMax() {
		min = x[0];
		max = x[0];
		for (int i = 0; i < x.length; i++) {
			if (max < x[i]) {
				max = x[i];
			}
			if (min > x[i]) {
				min = x[i];
			}
		}
	}

	// Imprimes
	public static void imprimirNumero() {
		System.out.println("los numeros introducidos son");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]);
			if (x[i] == min)
				System.out.print(" - mínimo");

			if (x[i] == max)
				System.out.println(" - máximo");

			else
				System.out.println("");
		}

	}

	public static void main(String[] args) {

		solicitarNumero();
		minMax();
		imprimirNumero();

	}

}
