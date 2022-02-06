package EjerciciosPracticas;

import java.util.Date;

/*Realiza un programa que descomponga la fecha actual en 6 variables enteras correspondientes al año, mes, día,
hora, minutos y segundos. Intenta resolverlo de 3 formas distintas, utilizando:
a. La clase java.util.Date
b. La clase java.util.GregorianCalendar
c. El paquete java.time*/

public class Ejercicio02A {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date fechaHoy = new Date();
		fechaHoy.toInstant();
		System.out.println("Esta es la fecha con el método por defecto toString de Date:");
		System.out.println(fechaHoy.toString());
		int anyo = fechaHoy.getYear() + 1900;
		int mes = fechaHoy.getMonth() + 1;
		int dia = fechaHoy.getDate();
		int hora = fechaHoy.getHours();
		int minutos = fechaHoy.getMinutes();
		int segundos = fechaHoy.getSeconds();

		System.out.println("Esta es la fecha imprimida por mi:");

		System.out.println(
				"Son las " + hora + ":" + minutos + ":" + segundos + " del día " + dia + " de " + mes + " del " + anyo);
	}

}
