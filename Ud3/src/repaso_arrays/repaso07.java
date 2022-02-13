package repaso_arrays;

import java.util.Scanner;

public class repaso07 {
	
	/*
	 * Determinar si una palabra introducida por teclado es capicúa. Una palabra
	 * capicúa quiere decir que se lee igual de izquierda a derecha que de derecha a
	 * izquierda; por ejemplo ojo, oro, radar, somos, reconocer, anilina…
	 */
	
	public static boolean esCapi(char [] cadena) {
		char [] invertido = new char [cadena.length];
		int contador=0;
		for (int i=0; i<cadena.length; i++) {
				invertido[i]=cadena[cadena.length - 1 - i];
				
			if (invertido[i]!=cadena[i])
				contador++;
			}
			if (contador==0)
				return true;
			else
				return false;		
	}
	
	public static char[] cadenaArray(String cadena) {
		char [] palabra= new char[cadena.length()];
		for (int i=0; i<cadena.length(); i++) {
			palabra[i]=cadena.charAt(i);
		}
		return palabra;
	}

	public static void main(String[] args) {

	System.out.println("Introduce una palabra: ");
	
	Scanner s= new Scanner(System.in);
	String cadena = s.nextLine();
	
	if (esCapi(cadenaArray(cadena)))
		System.out.println("La palabra introducida es capicúa");
	else
		System.out.println("La palabra introducida no es capicúa");		
	}

}
