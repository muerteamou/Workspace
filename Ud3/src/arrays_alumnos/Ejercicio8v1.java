package arrays_alumnos;

import java.util.Scanner;

public class Ejercicio8v1 {

	public static void rellenar(int[] v) {
		Scanner s = new Scanner(System.in);
		System.out.println("Rellenamos la tabla");
		for (int i = 0; i < v.length; i++) {
			System.out.println("Introduce casilla " + i);
			v[i] = s.nextInt();
		}
	}// de rellenar

	public static int suspensos(int[] v) {
		int contador = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i] < 5)
				contador++;
		}
		return contador;

	} // de suspensos

	public static double media(int[] v) {
		int suma = 0;
		for (int i = 0; i < v.length; i++) {
			suma = suma + v[i];
		}
		return suma / v.length;
	} // de media

	public static void main(String[] args) {
		int  nSuspensos,tamanyo = 4;
		double notaMedia;
		int[] n = new int[tamanyo];
		rellenar(n);
		notaMedia= media(n);
		nSuspensos= suspensos(n);
		System.out.println("Nota + Media + Aprobados + Suspensos");
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i] + "\t" + notaMedia + "\t" 
					+ (n.length-nSuspensos) + "\t\t" + nSuspensos);
		}

		System.out.println("FIN");

	}// del main

}
