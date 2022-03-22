package EjerciciosCasa;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*5. Escribe una clase con un método que pida al usuario una cadena de caracteres y la guarde
al revés en un archivo de texto cuyo nombre se le pasará como segundo argumento.
Incluye también el tratamiento de excepciones.*/

public class Ejercicio05 {

	public static void invertirTexto(String ruta, String texto) {

		try {
			FileWriter fw = new FileWriter(ruta);

			for (int i = texto.length() - 1; i >= 0; i--) {
				fw.write(texto.charAt(i));
			}
			fw.close();
		} catch (IOException e) {
			System.out.println("Error al escribir el archivo");
		}
	}

	public static void main(String[] args) {
		System.out.println("Introduce una frase");
		Scanner s = new Scanner(System.in);
		String texto = s.nextLine();
		String ruta = "Ficheros/archivo05";
		invertirTexto(ruta, texto);
		s.close();
	}

}
