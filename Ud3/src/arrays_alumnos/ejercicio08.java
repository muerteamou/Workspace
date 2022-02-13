package arrays_alumnos;

import java.util.Scanner;

public class ejercicio08 {
	/*
	 * Implementa un programa que pida al usuario las calificaciones (double) de los
	 * 10 estudiantes de una clase y los guarde en un array. Despu�s, mostrar� esas
	 * calificaciones (cada una en una l�nea), seguida de la media del curso y del
	 * n�mero de aprobados y suspensos. Se usar� un m�todo para calcular la nota
	 * media y otro para el n�mero de suspensos.
	 */	
	public static int suspensos(double[] x) {
		int sumador = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] < 5) {
				sumador++;
			}
		}
		return sumador;

	}
	public static double calcularMedia(double [] x) {
		double media=0;
		for (int i = 0; i < x.length; i++) {
			media=x[i]+ media;
		}
		return media/x.length;
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int tamanyo = 10;

		double[] x = new double[tamanyo];
		for (int i = 0; i < x.length; i++) {
			System.out.println("Introduce  las calificaciones de cada estudiante: ");
			x[i] = s.nextDouble();
		}
		for (int i = 0; i < x.length; i++) {
			System.out.println("La nota es " + x[i]);
			}
		System.out.println("La nota media del curso es " + calcularMedia(x));
		System.out.println("Han aprobado " + (x.length - suspensos(x)) + " alumnos.");
		System.out.println("Han suspendido " + suspensos(x) + " alumnos.");
	}

}
