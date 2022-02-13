package ejercicios;

import java.util.Scanner;

/*Escribe un método que reciba dos argumentos: una cantidad de dólares y la cotización 
 * del dólar con respecto al euro, y devuelva el número de euros equivalente. P.ej. si
 * la cotización de 1 dólar estadounidense = 0,895245 euros a fecha de hoy, la llamada
 *  al método ejercicio3 (650.75, 0,895245) devolverá 582.723.*/

public class ejercicio03 {
	public static double conversorDolar(double eu, double dol) {
		return ( eu / dol );
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce la cantidad de dólares y a cuanto está el cambio, separado por espacios");
		double dolar = s.nextDouble();
		double cambio = s.nextDouble();
		System.out.println(conversorDolar(dolar, cambio));

	}

}
