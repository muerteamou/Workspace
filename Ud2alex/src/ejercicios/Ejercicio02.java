package ejercicios;
/*Escribe un programa que lea tres números e indique el mayor de ellos.*/

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Vamos a introducir tres números e indicar cual es el mayor de ellos.");
		System.out.println("Número 1: ");
		int a = s.nextInt();
		System.out.println("Número 2: ");
		int b= s.nextInt();
		System.out.println("Número 3: ");
		int c = s.nextInt();
		
		if (a>=b && a>=c) {
			System.out.println(a + " es el mayor");
		}else if (b>= a && b>=c) {
			System.out.println(b + " es el mayor");
		}else
			System.out.println(c + " es el mayor");
		
		s.close();
	}

}
