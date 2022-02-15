package Ejercicios;
import java.io.FileReader;
import java.io.IOException;

/*Escribe una clase con un m�todo que reciba por par�metro el nombre de un 
 * fichero de texto (que habr�s creado con anterioridad) y cuente las vocales 
 * (tanto may�sculas como min�sculas) que en �l aparecen. Incluye tambi�n el 
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
			System.out.println("Ocurri� un error en la entrada de datos");
		}
	}

	public static void main(String[] args) {
		String f = "Ficheros/fichero3";
		leer(f);

	}

}
