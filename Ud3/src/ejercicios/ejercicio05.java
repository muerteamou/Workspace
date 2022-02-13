package ejercicios;

import java.util.Scanner;

//Escribe un método que reciba dos argumentos enteros (a y b) devuelva la potencia ab de 
//manera repetitiva, sin usar la función matemática pow(). 
public class ejercicio05 {

	public static double calcularPotencia(int m, int n) {
		double resultado = 1;
		for (int i = 1; i <= n; i++) {
			resultado = resultado * m;
		}
		return resultado;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Escribe dos números enteros. ");
		int n1=s.nextInt();
		int n2=s.nextInt();
		System.out.println(calcularPotencia(n1,n2));

	}

}
