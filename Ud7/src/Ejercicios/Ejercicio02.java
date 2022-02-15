package Ejercicios;
import java.io.FileReader;
import java.io.IOException;

/*Escribe una clase con un método que reciba por parámetro el nombre de un 
 * fichero de texto (que habrás creado con anterioridad) y cuente las vocales 
 * (tanto mayúsculas como minúsculas) que en él aparecen. Incluye también el 
 * tratamiento de excepciones.
*/
public class Ejercicio02 {

	private static void leer(String f) {
		int contador = 0;
		try {
			FileReader fr = new FileReader(f);
			int caracterLeido;

			while ((caracterLeido = fr.read()) != -1) {
				char c = (char) caracterLeido;
				if ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u')) {
					contador++;
				}
			}
			fr.close();
			System.out.println("El fichero se ha leido correctamente.");
			System.out.println("Hay " + contador + " vocales");

		} catch (IOException io) {
			System.out.println("Ocurrió un error en la entrada de datos");
		}
	}

	public static void main(String[] args) {
		String f = "Ficheros/fichero3";
		leer(f);

	}

}
