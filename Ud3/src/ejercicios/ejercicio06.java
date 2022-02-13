/*Escribe un m�todo que indique si un n�mero que recibe como argumento se puede expresar como el cuadrado de un n�mero
 *entero. P.ej el n�mero 9 se puede expresar como el cuadrado de 3, mientras que el 8 no. Si se puede expresar,
 *la funci�n devolver� el entero (en el caso del 9 del ejemplo anterior, devolver�a el 3), de lo contrario devolver�
 *0 (en el caso del 8 del ejemplo anterior).*/


package ejercicios;

import java.util.Scanner;
public class ejercicio06{

public static int calcularBase (int x){
	int y = (int)Math.sqrt(x);

	if ( y *  y == x)
		return y;
	else
		return 0;
	
}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un numero entero: ");
		int numero = (s.nextInt());
		System.out.println(calcularBase(numero)+ " es la raiz cuadrada de "+(numero));
	}

}
