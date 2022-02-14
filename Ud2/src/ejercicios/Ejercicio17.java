package ejercicios;

import java.util.Scanner;

/*Desarrolla un programa que determine si una secuencia de enteros introducidos por el
teclado y terminada en 0 es creciente o no (cada elemento es mayor o igual que el
anterior).*/
public class Ejercicio17 {

	public static void main(String[] args) {
		System.out.println("Introduce un número entero seguido de intro, para parar introduce 0.");
		Scanner s = new Scanner(System.in);
		int x = s.nextInt(), y=0;
		boolean escreciente= true;
		while (x!=0) {
			if(x>y) {
				y=x;
				x=s.nextInt();
			}else {
				escreciente=false;
				y=x;
				x=s.nextInt();
			}
		}
		if(escreciente)
			System.out.println("La secuencia es creciente");
		else
			System.out.println("La secuencia  no es creciente");
		s.close();
	}

}
