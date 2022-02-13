package arrays_alumnos;

import java.util.Scanner;

public class ejercicio07 {

	/*
	 * Escribe un programa que lea 15 números por teclado y los almacene en un
	 * array. Rota los elementos de ese array, es decir, el elemento de la posición
	 * 0 debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se
	 * encuentra en la última posición debe pasar a la posición 0. Finalmente,
	 * muestra el contenido del array. Utiliza métodos.
	 */
	static Scanner s = new Scanner(System.in);

	public static void rellenar(int[] v) {
		System.out.println("Rellenamos la tabla:");
		for (int i = 0; i < v.length; i++) {
			System.out.println("Introduce casilla " + i);
			v[i] = s.nextInt();
		}
	}

	public static void desplazar(int [] v) {
		int almacen = v[v.length - 1];
		for (int i = v.length - 1; i > 0; i--) {
			v[i] = v[i - 1];
		}
		v[0] = almacen;

	}
	public static void imprimir(int [] v) {
		for (int i = 0; i < v.length; i++)
			System.out.print(v[i] + " - ");
			System.out.println("");
	
	}

	public static void main(String[] args) {

		int tamanyo = 3;
		int[] v = new int[tamanyo];
		rellenar(v);
		imprimir(v);
		desplazar(v);
		System.out.println("Ahora vamos a desplazar los valores del array.");
		imprimir(v);

		
	}
	

}
