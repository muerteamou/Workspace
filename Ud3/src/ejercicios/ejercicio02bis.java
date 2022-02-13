package ejercicios;

import java.util.Scanner;

//Escribe un método que reciba dos enteros y devuelva cierto si el primero
// de ellos es múltiplo del otro, o falso en caso contrario.
public class ejercicio02bis {
	public static boolean esMultiplo(int n, int m) {
		return (n % m == 0);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce dos números aleatorios separados por espacio");
		System.out.println(esMultiplo(s.nextInt(), s.nextInt()));

	}

}// del main