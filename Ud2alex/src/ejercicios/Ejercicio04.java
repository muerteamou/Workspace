package ejercicios;

import java.util.Scanner;

/*Escribe un programa que indique si un número entero leído por teclado se puede
expresar como el cuadrado de un número entero. P.ej el número 9 se puede expresar
como el cuadrado de 3, mientras que el 8 no. (Pista, no hace falta utilizar repetición,
utiliza librería matemática...)*/


public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un número:");
		int x = s.nextInt();
				
		double y = Math.sqrt(x);
		
		if ((int) y * (int)y ==x)
			System.out.println(x + " es el cuadrado de " + (int)y);
		else
			System.out.println(x + " no es el cuadrado de ningún entero");
		
		s.close();
	}

}
