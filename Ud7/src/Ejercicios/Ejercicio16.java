package Ejercicios;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int opcion =0;
		while (opcion!=6 ) {//true
			do {
				System.out.println("1. Cargar Clientes");
				System.out.println("2. Consultar Clientes");
				System.out.println("3. Consultar Cliente");
				System.out.println("4. Modificar Clientes");
				System.out.println("5. Borrar Clientes");
				System.out.println("6. Guardar Clientes");
				System.out.println("\n\n\t\t Introduzca la opción");
				opcion = s.nextInt();
			}while (opcion <1 || opcion >6);
			
			switch (opcion) {
			case 1: //metodo cargar y break
			case 2:	//metodo consultar y break
			case 3: 
			case 4:
			case 5:
			default: // guardar

			}
		}
		
s.close();
	}

}
