package ejercicios;

import java.util.Scanner;

//Escribe un método que devuelva el área de un círculo a partir del radio que recibe.

public class ejercicio04 {
	public static double calcularArea (double n) {
		final double PI = 3.141593;		
	    return (PI * (n * n));
	    }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el radio del círculo por favor. ");
		System.out.println(calcularArea(s.nextDouble()));

	}

}
