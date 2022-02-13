package ejercicios;

import java.util.Scanner;

public class ejercicio01bis {

	public static boolean verificadorPar(int n) {
		/*boolean resultado;
		if (n % 2 == 0)
			resultado = true;

		else
			resultado = false;

		return resultado;*/
		return (n % 2 == 0);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Introduce un número entero: ");
		int entero = s.nextInt();
		System.out.println(verificadorPar(entero));
		}
	}
