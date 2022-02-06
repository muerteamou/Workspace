package ejercicios;

import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int dato1;
		int dato2;

		System.out.print("Introduce dos n�meros entero");
		dato1 = s.nextInt();
		dato2 = s.nextInt();

		System.out.println(dato1 <= dato2);
		s.close();
	}

}
