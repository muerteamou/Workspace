package EjerciciosCasa;

import java.io.FileReader;
import java.io.IOException;

/*2. Escribe una clase con un método que reciba por parámetro el nombre de un fichero de
texto (que habrás creado con anterioridad) y cuente las vocales (tanto mayúsculas como
minúsculas) que en él aparecen. Incluye también el tratamiento de excepciones.*/

public class Ejercicio02 {

	public static void leerVocales(String ruta) {
		int contador = 0;
		try {
			//FileReader se usa para leer caracteres
			FileReader fr = new FileReader(ruta);
			int caracterleido;
			String cadena= "";
			while ((caracterleido = fr.read()) != -1) {
				char c = (char) caracterleido;
				cadena = cadena + c;
				if ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u')) {
					contador++;
				}
			}
			fr.close();
			System.out.println("Se ha leido correctamente el archivo");
			System.out.println("El contenido del archivo es: ");
			System.out.println(cadena);
			System.out.println("Hay " + contador + " vocales en total");
		} catch (IOException ioe) {
			System.out.println("Ha ocurrido un error al leer el archivo");
		}

	}

	public static void main(String[] args) {
		String ruta = "Ficheros/archivo02";
		leerVocales(ruta);
	}

}
