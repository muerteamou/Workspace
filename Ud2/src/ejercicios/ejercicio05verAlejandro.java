package ejercicios;

import java.util.Scanner;

public class ejercicio05verAlejandro {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char x;
		System.out.println("Introduce un caracter: ");
		x = s.nextLine().charAt(0); // recojo s�lo el primer caracter por si introducen mas.
		//System.out.println(x);
		
			if (x >= 48 && x <= 57 ){
				System.out.println( x + " es un n�mero.");
				System.exit(0);
			}
			if (x >=65 && x<=90) {
				System.out.println( x + " es un letra may�scula.");
				System.exit(0);
			}
			if (x>=97 && x<=122) {
				System.out.println( x + " es un letra min�scula.");
				System.exit(0);
			}
		
			System.out.println(x + " No es un caracter alfanum�rico");

			s.close();
		//(int) x = x;
		
		
		

	}

}
