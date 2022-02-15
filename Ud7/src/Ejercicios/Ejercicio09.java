package Ejercicios;
import java.io.FileReader;
import java.io.IOException;

/*Escribe una clase con un método que a partir de dos ficheros que
 *  reciba como argumento indique si son idénticos.
 */
public class Ejercicio09 {

	private static void comprobarArchivos(String archivo1, String archivo2) {

		int caracterLeido1;
		int caracterLeido2;
		String cadena1 = "";
		String cadena2 = "";
		try {
			FileReader fr1 = new FileReader(archivo1);
			FileReader fr2 = new FileReader(archivo2);

			while ((caracterLeido1 = fr1.read()) != -1) {
				cadena1 = cadena1 + (char)caracterLeido1;
			}
			while ((caracterLeido2 = fr2.read())!= -1) {
				cadena2 = cadena2 + (char)caracterLeido2;
			}
			if (cadena1.equals(cadena2)) {
				System.out.println("Los archivos son iguales");
			}else {
				System.out.println("Los archivos son distintos");
			}
			fr1.close();
			fr2.close();
		} catch (IOException io) {
			System.out.println("Ha ocurrido un error");
		}
	}

	public static void main(String[] args) {
		String archivo1 ="Ficheros/fichero4.txt";
		String archivo2 = "Ficheros/fichero4copia.txt";
		
		comprobarArchivos(archivo1, archivo2);
	}

}
