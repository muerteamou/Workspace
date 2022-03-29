package expresiones_regulares;

/*1. Utilizando expresiones regulares, realiza los siguientes métodos para validar strings que se leerán por teclado:
a) Validar un número de teléfono nacional sin espacios (9 cifras numéricas); ej--> 974243447
b) Validar un número de teléfono internacional (Comienza por paréntesis, le sigue el carácter +, después 2 ó
3 cifras numéricas, paréntesis de cierre y 9 cifras numéricas); ej--> (+34)974243447
c) Validar un código postal (5 cifras numéricas); ej--> 28080
d) Validar una fecha en formato dd/mm/aaaa*/

public class Ejercicio01 {

	public static void main(String[] args) {

		String cadena = "974238570";

		// A)
		if (cadena.matches("\\d{9}")) // ("[0-9]{9}")
			System.out.println("La cadena es válida");
		else
			System.out.println("la cadena es inválida");

		// B)
		cadena = "(+34)974238570";
		if (cadena.matches("\\(\\+[0-9]{2,3}\\)[0-9]{9}"))
			System.out.println("La cadena es válida");
		else
			System.out.println("la cadena es inválida");

		// C)
		cadena = "28080";
		if (cadena.matches("\\d{5}"))
			System.out.println("La cadena es válida");
		else
			System.out.println("la cadena es inválida");
		// D)
		cadena = "15/09/1983";
		if (cadena.matches("(([0-2][0-9])|(3[0-1]))/((0[0-9])|(1[0-2]))/[0-2][0-9]{3}"))
			System.out.println("La cadena es válida");
		else
			System.out.println("la cadena es inválida");
		// D+

		cadena = "31/09/1983";
		String trozos[] = cadena.split("/");
		System.out.println(trozos[1]);
		if (trozos[1].equals("01") || trozos[1].equals("03") || trozos[1].equals("05") || trozos[1].equals("07")
				|| trozos[1].equals("08") || trozos[1].equals("10") || trozos[1].equals("12")) {
			if (cadena.matches("(([0-2][0-9])|(3[0,1]))/((0[0-9])|(1[0-2]))/[0-2][0-9]{3}")) {
				System.out.println("La cadena es válida");
			} else
				System.out.println("la cadena es inválida");
		}
		if (trozos[1].equals("04") || trozos[1].equals("06") || trozos[1].equals("09") || trozos[1].equals("11")) {
			if (cadena.matches("(([0-2][0-9])|(30))/((0[0-9])|(1[0-2]))/[0-2][0-9]{3}")) {
				System.out.println("La cadena es válida");
			} else
				System.out.println("la cadena es inválida");
		}

	}

}
