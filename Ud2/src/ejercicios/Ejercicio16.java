package ejercicios;

import java.util.Scanner;

/*Escribe un programa que lea un número entero positivo del teclado y muestre
 * la suma de sus dígitos. Por ejemplo, si el entero es 932, mostrará 14 (9 + 3
 * + 2).
 * 
 * por ejemplo con 927, para descomponerlo, dividimos entre 10
 * 
 * cociente 92 resto 7
 * 
 * cociente 9 resto 2
 * 
 * si cociente es <10 paramos.*/
public class Ejercicio16 {

	public static void main(String[] args) {
		System.out.println("Introduce un número, vamos a calcular la suma de sus dígitos:");
		Scanner s = new Scanner(System.in);
		/*
		 * int x = s.nextInt(), suma = 0, cociente = 0; while (x > 10) { cociente = (x %
		 * 10); suma = suma + cociente; x = x / 10; } suma = suma + x;
		 * System.out.println("La suma de sus digitos es " + suma);
		 */

		int suma = 0;
		Integer x = s.nextInt();
		String cadena = Integer.toString(x);

		for (int i = 0; i < cadena.length(); i++) {
			// suma = suma + Integer.parseInt(cadena.charAt(i));
			// System.out.println(Integer.valueOf(cadena.charAt(i)));
			suma = suma + Character.getNumericValue(cadena.charAt(i));
		}
		System.out.println(suma);
		s.close();
	}

}
