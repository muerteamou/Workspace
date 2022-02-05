package ejercicios;

import java.util.Scanner;

/*Escribe un programa que lea un número entero N mayor que 0 y calcule la suma
1+2+3+4+5+...+N.*/

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un número entero mayor que 0");
		int x =s.nextInt(), suma=0;
		if (x>0) {
		for(int i=1; i<=x; i++) {
			suma = suma + i;
			
		}System.out.println("La suma de todos los números hasta " + x + " es " + suma);
		}else
			System.out.println("El número introducido no es válido.");
		s.close();
	}

}
