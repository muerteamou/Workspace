package ejercicios;

import java.util.Scanner;

public class ejercicio16 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int dinero;
		
		System.out.println("Introduce la cantidad: ");
		dinero = s.nextInt();
		
		/*int b500 = dinero / 500;
		int b200 = (dinero % 500) / 200;
		int b100 = ((dinero % 500) % 200) / 100;
		int b50 = (((dinero % 500) % 200) % 100) / 50;
		int b20 = ((((dinero % 500) % 200) % 100) % 50) / 20;
		int b10 = (((((dinero % 500) % 200) % 100) % 50) % 20) / 10;
		int b5 = ((((((dinero % 500) % 200) % 100) % 50) % 20) % 10 ) / 5;
		int mon = (((((((dinero % 500) % 200) % 100) % 50) % 20) % 10 ) % 5) / 1;
		
		System.out.println("Billetes de 500 euros: " + b500);
		System.out.println("Billetes de 200 euros: " + b200);
		System.out.println("Billetes de 100 euros: " + b100);
		System.out.println("Billetes de 50 euros: " + b50);
		System.out.println("Billetes de 20 euros: " + b20);
		System.out.println("Billetes de 10 euros: " + b10);
		System.out.println("Billetes de 5 euros: " + b5);
		System.out.println("Euros en monedas: " + mon);
		*/
		
		int b500 = dinero / 500;
		dinero = dinero % 500;
		int b200 = dinero / 200;
		dinero = dinero % 200;
		int b100 = dinero / 100;
		dinero = dinero % 100;
		int b50 = dinero / 50;
		dinero = dinero % 50;
		int b20 = dinero / 20;
		dinero = dinero % 20;
		int b10 = dinero / 10;
		dinero = dinero % 10;
		int b5 = dinero / 5;
		dinero = dinero % 5;
		int mon = dinero / 1;
		
		System.out.println("Billetes de 500 euros: " + b500);
		System.out.println("Billetes de 200 euros: " + b200);
		System.out.println("Billetes de 100 euros: " + b100);
		System.out.println("Billetes de 50 euros: " + b50);
		System.out.println("Billetes de 20 euros: " + b20);
		System.out.println("Billetes de 10 euros: " + b10);
		System.out.println("Billetes de 5 euros: " + b5);
		System.out.println("Euros en monedas: " + mon);
		s.close();
	}

}
