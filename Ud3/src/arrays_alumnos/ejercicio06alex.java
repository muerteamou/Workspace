package arrays_alumnos;

import java.util.Scanner;

public class ejercicio06alex {

	// Escribe un programa que pida 10 n�meros por teclado y que luego muestre los
	// n�meros
	// introducidos junto con las palabras "m�ximo" y "m�nimo" al lado del m�ximo y
	// del m�nimo
	// respectivamente. Utiliza m�todos en la soluci�n (p.ej. para leer, calcular el
	// m�ximo,
	// m�nimo, visualizar...)
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
				System.out.print(" - m�nimo");

			if (x[i] == max)
				System.out.println(" - m�ximo");

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
