package ejercicios;

import java.util.Scanner;

/*Escribe un programa que lea un número entero y calcule su factorial.*/
public class Ejercicio13 {

	public static void main(String[] args) {
		System.out.println("Introduce un número entero para calcular su factorial:");
		Scanner s = new Scanner(System.in);
		int x = s.nextInt(), factorial=1;
		
		for (int i=1; i<=x; i++) {
			factorial = factorial * i;
		}
		System.out.println(factorial);
		s.close();
	}

}
