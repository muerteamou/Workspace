package EjerciciosPracticas;

import java.util.Scanner;

/*Realiza un programa que a partir de un día, mes y año que se leerán por teclado, visualice el día de la semana
(1,2...7) que le corresponde. Intenta resolverlo de 4 formas distintas, utilizando:
a. La clase Fecha que aparece en el proyecto de ejemplo.
*/

public class Ejercicio1A {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		/*
		System.out.println("Introduce el día:");	
		int dia= s.nextInt();
		System.out.println("Introduce el mes:");
		int mes = s.nextInt();
		System.out.println("Introduce el año:");
		int anyo= s.nextInt();
		Fecha fechahoy = new Fecha(dia,mes,anyo);
		*/
		// Otra opción es con el constructor de la clase Fecha
		 
		Fecha fechahoy = new Fecha();
		fechahoy.leer();
		System.out.println("Calculando el dia de la semana con la clase Fecha.");
		System.out.println("Es el dia " + fechahoy.diaSemana() + " de la semana.");
		s.close();
		
	}

}
