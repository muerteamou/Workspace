package ejercicios;

import java.util.Scanner;

public class ejercicio09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double fahr;
		double cel;
		
		System.out.print("Dime la temperatura en Fahrenheit");
		fahr = s.nextDouble();
		
		System.out.println("Equivale a " + ((5.0 / 9) * (fahr - 32)) + " º C" );

	}

}
