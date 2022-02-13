package repaso_arrays;

import java.util.Scanner;

public class repaso01 {
	/*
	 * Escribe un programa que pida 10 números por teclado, los almacene en un array
	 * y luego muestre el máximo valor, el mínimo y las posiciones que ocupan en el
	 * array (ten en cuenta que el máximo y el mínimo pueden aparecer varias veces).
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
				System.out.println("El número "+ min + " es el mínimo y está en la posicion " + i);
			if (x[i] == max)
				System.out.println("El número " + max + " es el máximo y está en la posicion " + i);
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
