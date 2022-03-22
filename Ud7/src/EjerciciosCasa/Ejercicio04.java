package EjerciciosCasa;

import java.io.FileReader;
import java.io.IOException;

/*4. Escribe una clase con un método que reciba por parámetro el nombre de un fichero de
texto (que habrás creado con anterioridad) y lo muestre por pantalla sin espacios en
blanco. Incluye también el tratamiento de excepciones.*/

public class Ejercicio04 {

	public static void sinEspacios(String ruta) {

		int caracterLeido;
		FileReader fr;
		try {
			fr = new FileReader(ruta);

			while ((caracterLeido = fr.read()) != -1) {
				if ((char) caracterLeido != ' ') {
					System.out.print((char) caracterLeido);
				}
			}
			fr.close();
		} catch (IOException ioe) {
			System.out.println("Ha ocurrido un error con el archivo");
		}
	}

	public static void main(String[] args) {
		String archivo = "Ficheros/archivo03";
		sinEspacios(archivo);

	}

}
