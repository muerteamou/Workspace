package arrays_alumnos;

import java.util.Scanner;

public class ejercicio01 {
	// Escribe un programa que lea 10 números por teclado y luego los muestre en
	// orden
	// inverso, es decir, el primero que se introduce es el último en mostrarse y
	// viceversa.

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] x = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Introduce un numero entero: ");
			x[i]= s.nextInt();
		}
		for (int i=9; i>=0; i--) {
			System.out.println(x[i]);
			
		}
	}

}
