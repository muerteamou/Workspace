package ejercicios;
/*Escribe un programa que indique si un número introducido por teclado es primo o no
(recuerda que un número primo es aquél que solo es divisible por 1 y si mismo)*/

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		System.out.println("Introduce un numero entero:");
		Scanner s = new Scanner(System.in);
		int x= s.nextInt(), contador=0;
		
		for (int i=1; i<=x; i++) {
			if (x%i==0) {
				contador++;
			}
		}if (contador!=2)
			System.out.println("El número no es primo");
		else {
			System.out.println("El número es primo");
		}
		s.close();
	}

}
