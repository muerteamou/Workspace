package repaso;
/*Escribe un programa que lea un número entero N mayor que 0 y calcule la suma
1+2+3+4+5+...+N.*/

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		System.out.println("Introduce un número entero mayor que 0:");

		Scanner s = new Scanner(System.in);
		int x = s.nextInt(), suma = 0;
		 
		
		while(x < 1) {
			System.out.println("Escribe un número mayor que 0!!");
			System.out.println("Vuelve a intentarlo!");
			x = s.nextInt();
		}
			for (int i = 1; i <= x; i++) {
				suma = suma + i;
			}
			System.out.println("La suma de los enteros hasta " + x + " es " + suma);
		s.close();
	}
}
