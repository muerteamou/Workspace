package ejercicios;

import java.util.Scanner;

public class ejercicio15 {



	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduce un car�cter: ");
		
		char x = (char) s.nextLine().charAt(0);
		System.out.println("El c�digo ASCII de " + x + " es " + (int) (x) );

	}

}
