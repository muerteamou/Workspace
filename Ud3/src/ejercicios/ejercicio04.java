package ejercicios;

import java.util.Scanner;

//Escribe un m�todo que devuelva el �rea de un c�rculo a partir del radio que recibe.

public class ejercicio04 {
	public static double calcularArea (double n) {
		final double PI = 3.141593;		
	    return (PI * (n * n));
	    }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el radio del c�rculo por favor. ");
		System.out.println(calcularArea(s.nextDouble()));

	}

}
