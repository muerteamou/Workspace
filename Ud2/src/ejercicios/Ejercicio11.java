package ejercicios;

import java.util.Scanner;

/*Escribe un programa que lea caracteres del teclado hasta que el usuario
introduzca un *. Los caracteres se solicitan e introducen uno a uno, cada uno en una
línea (seguidos de Intro). El programa debe contar el número de dígitos, letras
mayúsculas y letras minúsculas introducidas y, cuando haya finalizado la introducción
de datos, mostrar cuántos caracteres de cada tipo había.*/

public class Ejercicio11 {

	public static void main(String[] args) {
		System.out.println("Introduce cualquier caracter o dígito, seguido de intro\nPara terminar introduce *.");
		Scanner s = new Scanner(System.in);
		int x = s.nextLine().charAt(0), may = 0, min = 0, n = 0;
		while (x != 42) {
			if (x >= 65 && x <= 90) {
				may++;
			}
			if (x >= 97 && x <= 122) {
				min++;
			}
			if (x >= 48 && x <= 57) {
				n++;
			}
			x = s.nextLine().charAt(0);

		}
		if (x == 42) {
			System.out.println("Has introducido " + n + " digitos, " + min + " minusculas, " + may + " mayusculas.");
		}

		s.close();
	}

}
