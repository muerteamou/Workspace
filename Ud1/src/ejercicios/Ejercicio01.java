package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int x;
		int y;

		System.out.print("Introduce un número: ");
		x = s.nextInt();
		System.out.print("Introduce otro número: ");
		y = s.nextInt();
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);
		System.out.println(++x);
		System.out.println(x++);
		System.out.println(++y);
		System.out.println(y++);
		s.close();
	}

}
