package ejercicios;

import java.util.Scanner;

public class ejercicio17 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int cantidadPrestada;
		double interesAnual;
		
		double pagoMensual;
		int anyos;
		int numeroPagos;
		
		System.out.println("Introduce la cantidad prestada: ");
		cantidadPrestada = s.nextInt();
		System.out.println("Introduzca el interés anual en %");
		interesAnual = s.nextDouble();
		System.out.println("Introduzca la duración en años");
		anyos = s.nextInt();
		
		System.out.println("===========================================================");
		
		System.out.print("Resultado de la operación");
		double interesMensual= ((interesAnual/100)/12);
		numeroPagos = anyos*12;
		pagoMensual = ((cantidadPrestada*interesMensual)/ (1-(1/Math.pow((1+interesMensual), numeroPagos))));
		System.out.println("Cantidad prestada: " + cantidadPrestada + " euros");
		System.out.println("Interés anual " + interesAnual + "%");		
		System.out.println("Duración en años del prestamo: " + anyos);
		System.out.println("Número de pagos: " + numeroPagos);
		System.out.println("Pago Mensual :" + pagoMensual + " euros");
		System.out.println("Cantidad total a pagar : " + (numeroPagos*pagoMensual) + " euros");
		s.close();		

	}

}
