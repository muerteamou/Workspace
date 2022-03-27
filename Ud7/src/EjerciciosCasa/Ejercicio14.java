package EjerciciosCasa;

import java.io.File;
import java.io.IOException;

/*Escribir un programa que muestre los nombres de los archivos y (sub)directorios que se
encuentren en el directorio que se pase como argumento (args[0]).*/

public class Ejercicio14 {

	public static void main(String[] args) throws IOException {
		String directorio;

		if (args.length > 0)
			directorio = args[0];
		else
			directorio = ".";

		File file = new File(directorio);
		System.out.println("El directorio actual es: " + file.getCanonicalPath());
		;

		File[] actual = file.listFiles();

		for (File tmp : actual) {
			if (tmp.isDirectory()) {
				System.out.println("Carpeta " + tmp.getName());
			}else
				System.out.println("Archivo " + tmp.getName());
		}
	}

}
