package ejercicios;

import java.util.Scanner;

/*1. Escribe un programa que lea dos n�meros enteros y aplique sobre ellos todos los operadores aritm�ticos
(suma, resta, producto, divisi�n, m�dulo, postincremento y preincremento del primero de ellos,
postdecremento y predecremento del segundo), visualizando todas las operaciones con sus resultados.*/

public class Ejercicio01 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int x;
		int y;

		System.out.print("Introduce un número: ");
		x = s.nextInt();
		System.out.print("Introduce otro número: ");
		y = s.nextInt();
		System.out.println("SUMA = " + (x + y));
		System.out.println("RESTA = " + (x - y));
		System.out.println("MULTIPLICACIÓN = " + (x * y));
		System.out.println("DIVISION = " + (x / y));
		System.out.println("RESTO = " + (x % y));
		System.out.println("PREINCREMENTO(1) = " + ++x);
		System.out.println("POSTINCREMENTO(1) = " + x++);
		System.out.println("PREINCREMENTO(2) = " + ++y);
		System.out.println("POSTINCREMENTO(2) = " + y++);
		s.close();
	}

}
