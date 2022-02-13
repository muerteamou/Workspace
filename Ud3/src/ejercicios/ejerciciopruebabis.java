package ejercicios;

import java.util.Scanner;

public class ejerciciopruebabis {

	public static double conversorCelsius(double gFahrenheit){
		return  5.0 / 9 * (gFahrenheit - 32);
	}// de conversorCelsius

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double gradosFahr;
		System.out.print("Dime la temperatura en Fahrenheit");
		gradosFahr = s.nextDouble();
		System.out.println("Equivale a " + conversorCelsius(gradosFahr) + " º C");

	}//del metodo principal

}// de class ejercicio01bis
	
