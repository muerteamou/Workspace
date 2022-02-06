package EjerciciosPracticas;

import java.util.Calendar;
import java.util.GregorianCalendar;

/*Realiza un programa que descomponga la fecha actual en 6 variables enteras correspondientes al año, mes, día,
hora, minutos y segundos. Intenta resolverlo de 3 formas distintas, utilizando:
a. La clase java.util.Date
b. La clase java.util.GregorianCalendar
c. El paquete java.time*/
public class Ejercicio02B {

	public static void main(String[] args) {
		GregorianCalendar fechaHoy = new GregorianCalendar();
		fechaHoy.getTime();
		System.out.println(fechaHoy.toString());
		
		int anyo = fechaHoy.get(Calendar.YEAR);
		int mes = fechaHoy.get(Calendar.MONTH)+1;
		int dia = fechaHoy.get(Calendar.DAY_OF_MONTH);
		int hora = fechaHoy.get(Calendar.HOUR_OF_DAY);
		int minutos = fechaHoy.get(Calendar.MINUTE);
		int segundos = fechaHoy.get(Calendar.SECOND);
		
		System.out.println("Esta es la fecha imprimida por mi:");

		System.out.println(
				"Son las " + hora + ":" + minutos + ":" + segundos + " del día " + dia + " de " + mes + " del " + anyo);

	}

}
