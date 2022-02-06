package ejercicios;

import java.util.Scanner;

public class ejercicio07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double dollar = 1.1774;
		double euro;

		System.out.print("¿Cuantos Dólares quieres cambiar? ");
		euro = s.nextDouble();
		System.out.println("Al cambio  te llevas " + (euro / dollar) + " €");
		s.close();
	}

}
