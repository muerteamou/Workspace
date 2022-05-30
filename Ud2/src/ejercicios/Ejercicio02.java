package ejercicios;
/*Escribe un programa que lea tres números e indique el mayor de ellos.*/

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		System.out.println("Introduce un numero:");
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		System.out.println("Introduce un numero:");
		int a = s.nextInt();
		System.out.println("Introduce un numero:");
		int b = s.nextInt();

		if (x > a && x > b)
			System.out.println(x + " es el mayor de ellos.");
		else if(a>b && a>x)
			System.out.println(a + " es el mayor de ellos.");
		else
			System.out.println(b + " es el mayor de ellos.");
		s.close();
	}

}
