package ejercicios;

import java.util.Scanner;

public class ejercicio13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int dato1;
		int dato2;
		int dato3;
		
		System.out.print("Introduce tres números entero");
		dato1 = s.nextInt();
		dato2 = s.nextInt();
		dato3 = s.nextInt();	
		System.out.println((dato1 <= dato2) && ( dato2 <= dato3));	
		
	}

}
