package EjerciciosPracticas;

import java.time.LocalDateTime;

/*Realiza un programa que descomponga la fecha actual en 6 variables enteras correspondientes al año, mes, día,
hora, minutos y segundos. Intenta resolverlo de 3 formas distintas, utilizando:
a. La clase java.util.Date
b. La clase java.util.GregorianCalendar
c. El paquete java.time*/
public class Ejercicio02C {
	public static void main(String[] args) {
		LocalDateTime fechaHoy = LocalDateTime.now();
		int anyo = fechaHoy.getYear();
		int mes = fechaHoy.getMonthValue();
		int dia = fechaHoy.getDayOfMonth();
		int hora = fechaHoy.getHour();
		int minutos = fechaHoy.getMinute();
		int segundos = fechaHoy.getMinute();

		System.out.println("Esta es la fecha con el método por defecto toString de Date:");
		System.out.println(fechaHoy.toString() + "\n");

		System.out.println("Esta es la fecha imprimida por mi:");

		System.out.println(
				"Son las " + hora + ":" + minutos + ":" + segundos + " del día " + dia + " de " + mes + " del " + anyo);

	}
}
