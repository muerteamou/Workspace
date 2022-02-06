package ejercicios;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int minutos;

		System.out.print("Introduce la cantidad de segundos");
		int segundos = s.nextInt();

		int horas = segundos / 3600;
		int datoSegundos = segundos % 3600;
		minutos = datoSegundos / 60;
		segundos = datoSegundos % 60;

		System.out.println("En total son " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos");
		s.close();

	}

}
