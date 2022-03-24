package EjerciciosCasa;

import java.io.FileReader;
import java.io.IOException;

/*Escribe una clase con un método que a partir de dos ficheros que
 reciba como argumento indique si son idénticos.*/
public class Ejercicio09 {
	
	public static void comprobarArchivos(String arch1, String arch2) {
		int caracterLeido1;
		int caracterLeido2;
		String cadena1 = "";
		String cadena2 = "";
		try {
			FileReader fr1 = new FileReader(arch1);
			FileReader fr2 = new FileReader(arch2);
			while ((caracterLeido1 = fr1.read()) != -1) {
				cadena1 = cadena1 + (char) caracterLeido1;
			}
			while ((caracterLeido2 = fr2.read()) != -1) {
				cadena2 = cadena2 + (char) caracterLeido2;
			}
			fr1.close();
			fr2.close();

			if (cadena1.equals(cadena2)) {
				System.out.println("Los archivos son idénticos");
			} else {
				System.out.println("Los archivos no son idénticos");
			}
		} catch (IOException ioe) {
			System.out.println("Error de entrada/salida");
		}
	}

	public static void main(String[] args) {
		String arch1 ="Ficheros/archivo10";
		String arch2 ="Ficheros/copia_de_archivo10";
		System.out.println("Vamos a comprobar los siguientes archivos");
		System.out.println(arch1 + " y " + arch2);
		comprobarArchivos(arch1, arch2);
		

	}

}
