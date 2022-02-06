package ejercicios;

import java.util.Scanner;

public class ejercicio15 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Introduce un carácter: ");

		char x = (char) s.nextLine().charAt(0);
		System.out.println("El código ASCII de " + x + " es " + (int) (x));
		s.close();
	}

}
