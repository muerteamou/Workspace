package ejercicios;

import java.util.Scanner;

public class ejercicio17 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int cantidadPrestada;
		int interesAnual;
		int interesMensual;
		double pagoMensual;
		int anyos;
		int numeroPagos;
		
		System.out.print("Introduce la cantidad prestada: ");
		cantidadPrestada = s.nextInt();
		System.out.print("Introduzca el interés anual en %");
		
		
		System.out.println("===========================================================");
		System.out.print("Resultado de la operación");
		System.out.print("Cantidad prestada: " + cantidadPrestada + " euros");
		System.out.print(" euros");
		System.out.print("Interés anual");		
		System.out.print("Duración en años del prestamo");
		s.close();		

	}

}
