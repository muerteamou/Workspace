package ejercicios;

import java.util.Scanner;

public class ejercicio02 {
	// Escribe un m�todo que reciba dos enteros y devuelva cierto si el primero
	// de ellos es m�ltiplo del otro, o falso en caso contrario.

	public static boolean esMultiplo(int n, int m) {
		return (n % m == 0);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce dos n�meros aleatorios");
		int x = s.nextInt();
		int y = s.nextInt();
		System.out.println(esMultiplo (x,y));

	}

}
