package ejercicios;

import java.util.Scanner;

public class ejercicio05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		final double PI = 3.141593;
		double radio;

		System.out.print("Introduce el valor del radio ");
		radio = s.nextDouble();
		double area = (PI * (radio * radio));
		System.out.println("El area del círculo es  " + area);
		s.close();
	}

}
