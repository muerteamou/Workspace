package EjerciciosPracticas;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*Realiza un programa que a partir de un día, mes y año que se leerán por teclado, visualice el día de la semana
(1,2...7) que le corresponde. Intenta resolverlo de 4 formas distintas, utilizando:
a. La clase Fecha que aparece en el proyecto de ejemplo.
b. La clase java.util.Date
c. La clase java.util.GregorianCalendar
d. El paquete java.time
*/
public class Ejercicio01C {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		GregorianCalendar fechahoy = new GregorianCalendar();
		System.out.println("Introduce el día:");	
		int dia= s.nextInt();
		System.out.println("Introduce el mes:");
		int mes = s.nextInt();
		System.out.println("Introduce el año:");
		int anyo= s.nextInt();
		fechahoy.set(Calendar.DAY_OF_MONTH, dia);
		fechahoy.set(Calendar.MONTH, mes);
		fechahoy.set(Calendar.YEAR, anyo);
		System.out.println("Calculando el dia de la semana con GregorianCalendar.");
		System.out.println("Es el dia " + fechahoy.get(Calendar.DAY_OF_WEEK ));
		s.close();

	}

}
