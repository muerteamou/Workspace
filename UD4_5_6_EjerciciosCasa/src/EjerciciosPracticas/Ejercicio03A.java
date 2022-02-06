package EjerciciosPracticas;

import java.util.Scanner;
import java.util.StringTokenizer;

/*Escribe un programa que a partir de una cadena formada por tu nombre completo, lo desglose y visualice
separadamente por nombre, apellido 1o y apellido 2o de dos formas:
a) Utilizando la clase StringTokenizer (averigua antes su funcionamiento).
b) el método split de la clase String visto en clase*/
public class Ejercicio03A {

	public static void main(String[] args) {
		System.out.println("Introduce tu nombre y apellidos:");
		Scanner s = new Scanner(System.in);
		String nCompleto = s.nextLine();

		StringTokenizer st = new StringTokenizer(nCompleto);

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());

		}
		s.close();
	}

}
