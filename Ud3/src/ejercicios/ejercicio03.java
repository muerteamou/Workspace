package ejercicios;

import java.util.Scanner;

/*Escribe un m�todo que reciba dos argumentos: una cantidad de d�lares y la cotizaci�n 
 * del d�lar con respecto al euro, y devuelva el n�mero de euros equivalente. P.ej. si
 * la cotizaci�n de 1 d�lar estadounidense = 0,895245 euros a fecha de hoy, la llamada
 *  al m�todo ejercicio3 (650.75, 0,895245) devolver� 582.723.*/

public class ejercicio03 {
	public static double conversorDolar(double eu, double dol) {
		return ( eu / dol );
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce la cantidad de d�lares y a cuanto est� el cambio, separado por espacios");
		double dolar = s.nextDouble();
		double cambio = s.nextDouble();
		System.out.println(conversorDolar(dolar, cambio));

	}

}
