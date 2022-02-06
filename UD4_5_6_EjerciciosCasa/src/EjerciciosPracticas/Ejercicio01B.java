package EjerciciosPracticas;

import java.util.Date;
import java.util.Scanner;

/*Realiza un programa que a partir de un día, mes y año que se leerán por teclado, visualice el día de la semana
(1,2...7) que le corresponde. Intenta resolverlo de 4 formas distintas, utilizando:
a. La clase Fecha que aparece en el proyecto de ejemplo.
b. La clase java.util.Date
c. La clase java.util.GregorianCalendar
d. El paquete java.time
*/

public class Ejercicio01B {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el día:");
		
		int dia= s.nextInt();
		System.out.println("Introduce el mes:");
		int mes = s.nextInt();
		System.out.println("Introduce el año:");
		int anyo= s.nextInt();
		Date fechahoy = new Date(anyo,mes,dia);
		System.out.println("Calculando el día de la semana usando la clase Date");
		System.out.println("Es el dia " + fechahoy.getDay() + " de la semana.");
		s.close();
		
	}

}
