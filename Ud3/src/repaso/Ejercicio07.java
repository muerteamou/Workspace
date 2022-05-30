package repaso;

import java.util.Iterator;
import java.util.Scanner;

/*7. Determinar si una palabra introducida por teclado es capicúa. Una palabra capicúa quiere 
decir que se lee igual de izquierda a derecha que de derecha a izquierda; por ejemplo ojo, 
oro, radar, somos, reconocer, anilina…*/

public class Ejercicio07 {

	public static void main(String[] args) {
		
		System.out.println("Introduce una palabra: ");
		Scanner s = new Scanner(System.in);
		String palabra = s.nextLine();
		s.close();
		if (esCapi(cadenaToCharArray(palabra))) 
			System.out.println("Es capicua!");
		else
			System.out.println("No es capicua!");
		

	}

	public static char[] cadenaToCharArray(String palabra) {
		char[] cadena = new char[palabra.length()];
		for (int i = 0; i < palabra.length(); i++) {
			cadena[i] = palabra.charAt(i);
		}
		return cadena;
	}

	public static boolean esCapi(char[] cadena) {
		int contador = 0;
		char[] cadenaInv = new char[cadena.length];
		for (int i = 0; i < cadena.length; i++) {
			cadenaInv[i] = cadena[cadena.length - i - 1];
			if (cadenaInv[i] != cadena[i]) {
				contador++;
			}
		}if(contador==0)
				return true;
			else
				return false;
				
		
	}
}
