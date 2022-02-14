package ejercicios;
/*Escribe un programa que calcule el mínimo, el máximo y la media de una lista de
números enteros introducidos por teclado. La lista finalizará cuando se introduzca un
número negativo.*/

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int min = 0, max = 0, contador = 0;
		float sumador = 0;

		System.out.println("Introduce números enteros:");
		System.out.println("Para terminar introduzca un número negativo.");
		int x = s.nextInt();

		if (x >= 0) {
			min = x;
			max = x;
			while (x >= 0) {
				contador++;
				if (x < min) {
					min = x;
				}
				if (x > max) {
					max = x;
				}
				sumador = sumador + x;
				x = s.nextInt();
			}
			System.out.println("El mínimo introducido es " + min + ", el máximo introducido es " + max
					+ ". La media de todos es " + (sumador / contador));
		} else {
			System.out.println("No has introducido ningún número positivo");
			s.close();
		}
	}
}
