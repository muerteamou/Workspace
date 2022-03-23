package EjerciciosCasa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*6. Escribe una clase con un método que reciba como argumento el nombre de un fichero de
texto (que habrás creado con anterioridad) y convierta a mayúsculas sus caracteres sobre
otro fichero cuyo nombre se le pasará como segundo argumento. Utiliza buffering. Incluye
también el tratamiento de excepciones.*/

public class Ejercicio06 {

	public static void todoMay(String arch1, String arch2) {
		String linea;
		try {
			BufferedReader br = new BufferedReader(new FileReader(arch1));
			BufferedWriter bw = new BufferedWriter(new FileWriter(arch2));

			while ((linea = br.readLine()) != null) {
				bw.write(linea.toUpperCase());
				bw.newLine();
			}
			System.out.println("La conversión se ha realizado con éxito.");
			bw.close();
			System.out.println("El archivo se ha guardado con éxito");
			br.close();

		} catch (IOException ioe) {
			System.out.println("Ha habido un error de entrada/salida");
		}
	}

	public static void main(String[] args) {
		String arch1 = "Ficheros/archivo06a";
		String arch2 = "Ficheros/archivo06b";
		todoMay(arch1, arch2);
	}

}
