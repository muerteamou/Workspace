package ejercicios;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char x;
		System.out.println("Introduce un caracter: ");
		x = s.nextLine().charAt(0); // recojo sólo el primer caracter por si introducen mas.
		//System.out.println(x);
		if ((x >= 48 && x <= 57 ) || (x >=65 && x<=90)||(x>=97 && x<=122)){
			System.out.println(x + " es un caracter alfanumérico");
			if (x >= 48 && x <= 57 ){
				System.out.println( x + " es un número.");
			}
			if (x >=65 && x<=90) {
				System.out.println( x + " es un letra mayúscula.");
			}
			if (x>=97 && x<=122) {
				System.out.println( x + " es un letra mayúscula.");
			}
		}
		else {
			System.out.println(x + " No es un caracter alfanumérico");
		}
		s.close();
			
		//(int) x = x;
		
		
		

	}

}
