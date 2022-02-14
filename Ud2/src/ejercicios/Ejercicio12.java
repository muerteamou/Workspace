package ejercicios;

import java.util.Scanner;

/*Escribe un programa que lea dos números a de tipo real y b de tipo entero y calcule ab.
Para resolverlo no utilices ningún operador o función matemática existente (usa la
repetición.*/
public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un numero real");
		double x = s.nextDouble();
		System.out.println("Introduce un número entero");
		int y = s.nextInt();
		double z = x;
		for (int i = 1; i < y; i++) {
			z = z * x;
		}
		System.out.println(x + " elevado a " + y + " da " + z);
		s.close();
	}

}
