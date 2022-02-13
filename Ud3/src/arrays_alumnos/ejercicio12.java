package arrays_alumnos;

import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {
		/*
		 * Implementa un programa que determine la frecuencia de aparición de cada vocal
		 * en una cadena de caracteres introducida por teclado. Comenzará solicitando la
		 * cadena y, posteriormente, construirá un array con las frecuencias de cada
		 * vocal. Finalmente, imprimirá el array de frecuencias por pantalla. NOTA: No
		 * debe ser sensible a mayúsculas/minúsculas.
		 */
		System.out.println("Introduce una cadena de caracteres: ");
		Scanner s = new Scanner(System.in);
		String cadena = s.nextLine();
		int tamanyo = cadena.length();
		char[] x = new char[tamanyo];
		int [] frecuencia= new int [5];
		for (int i = 0; i < cadena.length(); i++) {
			x[i] = cadena.charAt(i);
			//System.out.println(x[i]);
			if (x[i]== 'a' || x[i] == 'A') 
				frecuencia[0]++;
			if (x[i]== 'e' || x[i] == 'E') 
				frecuencia[1]++;
			if (x[i]== 'i' || x[i] == 'I') 
				frecuencia[2]++;
			if (x[i]== 'o' || x[i] == 'O') 
				frecuencia[3]++;
			if (x[i]== 'u' || x[i] == 'U') 
				frecuencia[4]++;
			
		}
		System.out.println("La vocal a se repite " + frecuencia[0] + " veces.");
		System.out.println("La vocal e se repite " + frecuencia[1] + " veces.");
		System.out.println("La vocal i se repite " + frecuencia[2] + " veces.");
		System.out.println("La vocal o se repite " + frecuencia[3] + " veces.");
		System.out.println("La vocal u se repite " + frecuencia[4] + " veces.");
	}

}
