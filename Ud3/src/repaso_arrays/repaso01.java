package repaso_arrays;

import java.util.Scanner;

public class repaso01 {
	/*
	 * Escribe un programa que pida 10 n�meros por teclado, los almacene en un array
	 * y luego muestre el m�ximo valor, el m�nimo y las posiciones que ocupan en el
	 * array (ten en cuenta que el m�ximo y el m�nimo pueden aparecer varias veces).
	 */
	static int max, min;
	
	public static void calcularValores(int[] x) {
		max = x[0];
		min = x[0];
		for (int i = 0; i < x.length; i++) {
			if (x[i] < min)
				min = x[i];
			if (x[i] > max)
				max = x[i];
		}
	}
	
	public static void mostrarValores(int [] x) {
		
		for (int i = 0; i < x.length; i++) {
			if (x[i]== min)
				System.out.println("El n�mero "+ min + " es el m�nimo y est� en la posicion " + i);
			if (x[i] == max)
				System.out.println("El n�mero " + max + " es el m�ximo y est� en la posicion " + i);
		}
		}
		
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int tamanyo = 10;
		int[] x = new int[tamanyo];

		for (int i = 0; i < tamanyo; i++) {
			System.out.println("Introduce un numero: ");
			x[i] = s.nextInt();
		}
		calcularValores(x);
		mostrarValores(x);
	}
}
