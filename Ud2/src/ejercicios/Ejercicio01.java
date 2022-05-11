package ejercicios;

import java.util.Scanner;

/*Escribe un programa que lea un número entero por teclado e indique si es par o impar.*/

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Introduce un número: ");
		int n = s.nextInt();
		if (n % 2 != 0)
			System.out.println("El número " + n + " es impar");
		else
			System.out.println("El número " + n + " es par");
		s.close();
	}

}
