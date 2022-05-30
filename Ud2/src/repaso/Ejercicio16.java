package repaso;

import java.util.Scanner;

/*16. Escribe un programa que lea un número entero positivo del teclado y muestre la suma
de sus dígitos. Por ejemplo, si el entero es 932, mostrará 14 (9 + 3 + 2).*/

public class Ejercicio16 {
	
	public static void main(String[] args) {
		System.out.println("Introduce un numero de varios dígitos: ");
		Scanner s = new Scanner(System.in);
		int cociente=0, suma =0;
		int x = s.nextInt();
		
		
		while (x>10) {
			cociente = (x%10);
			suma = suma + cociente;
			x = x / 10;
		}
		suma = suma + x;
		System.out.println(suma);
	}
}
