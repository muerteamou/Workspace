package ejercicios;

import java.util.Scanner;

public class ejercicio14 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int entero;

		System.out.printf("Introduce un entero: ");
		entero = s.nextInt();
		System.out.println(entero % 2 == 0);
		s.close();
	}

}
