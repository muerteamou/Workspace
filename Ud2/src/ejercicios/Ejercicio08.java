package ejercicios;

import java.util.Scanner;

/*Escribe un programa que solicite al usuario un número N y luego muestre por pantalla
la siguiente ejecución:
1
1 2
1 2 3
1 2 3 4
........
1 2 3 4 ...N*/
public class Ejercicio08 {

	public static void main(String[] args) {
		 System.out.println("Introduce un número entero mayor que 0");
		 Scanner s = new Scanner(System.in);
		 int x =s.nextInt();
		 
		 for(int i=1; i<=x; i++) {
			 System.out.println();
			 for (int j=1; j<=i;j++) {
				 System.out.print(j);
			 }
			 
		 }
		 s.close();
	}

}
