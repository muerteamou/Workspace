package ejercicios;

import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Introduce el ancho en cm");
		double ancho = s.nextDouble();
		System.out.print("Introduce el alto en cm");
		double alto = s.nextDouble();

		System.out.print("El área es " + alto * ancho + " cm cuadrados");
		s.close();
	}

}
