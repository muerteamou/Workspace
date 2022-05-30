package ejercicios;

import java.util.Scanner;

/*Debido a una pertinaz sequía se decidió poner en práctica un sistema de cobro de agua
que penalice el consumo excesivo tal como indica la tabla siguiente:
Consumo (m3) €/ m3
Primeros 100 0,15
De 100 a 500 0,20
De 500 a 1000 0,35
Más de 1000 0,80
Escribe un programa que lea del teclado los metros cúbicos consumidos y muestre en
la pantalla el coste de agua total. Ten en cuenta que en la tabla se indica lo que hay
que cobrar por los m3 que se encuentran en el intervalo. Así, si hemos consumido 750
m3 deberíamos pagar: 100 * 0,15 + 400 * 0,20 + 250 * 0,35 = 182,50 €. Usa
constantes.*/

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Introduce los metros cúbicos consumidos");
		double x = s.nextDouble();
		final double tramo1 = 0.15, tramo2 = 0.20, tramo3 = 0.35, tramo4 = 0.80;

		if (x > 100) {
			x = x - 100;
			if (x > 400) {
				x = x - 400;
				if (x > 500) {
					x = x - 500;
					System.out.println(
							"El total a pagar es: " + (x * tramo4 + 500 * tramo3 + 400 * tramo2 + 100 * tramo1) + " €");
				} else {
					System.out.println("El total a pagar es: " + (x * tramo3 + 400 * tramo2 + 100 * tramo1) + " €");
				}
			} else {
				System.out.println("El total a pagar es: " + (x * tramo2 + 100 * tramo1) + " €");
			}
		} else
			System.out.println("El total a pagar es: " + (x * tramo1) + " €");
		s.close();
	}

}
