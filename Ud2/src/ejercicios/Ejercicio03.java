package ejercicios;

import java.util.Scanner;

//Escribe un programa que lea dos números e indique si uno de ellos es múltiplo de otro.
public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Introduce dos números");
		int a = s.nextInt();
		int b = s.nextInt();
		
		if (a%b==0)
			System.out.println(a + " es múltiplo de " + b);
		else if (b%a==0)
			System.out.println(b + " es múltiplo de " + a);
		else
			System.out.println(a + " y " + b + " no son múltiplos");
		s.close();
	}

}
