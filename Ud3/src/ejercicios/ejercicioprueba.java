package ejercicios;

import java.util.Scanner;

public class ejercicioprueba {

	public static double conversorCelsius(double gFahrenheit) {
		double resultado = (5.0 / 9) * (gFahrenheit - 32);
		return resultado;
	}// de conversorCelsius

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double gradosFahr, gradosCel;
		System.out.print("Dime la temperatura en Fahrenheit");
		gradosFahr = s.nextDouble();
		gradosCel = conversorCelsius(gradosFahr);
		System.out.println("Equivale a " + gradosCel + " º C");

	}// del metodo principal

}// de class ejercicio01
