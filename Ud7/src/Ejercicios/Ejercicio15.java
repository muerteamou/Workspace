package Ejercicios;

import java.io.File;
import java.io.IOException;

/*Modifica el ejercicio anterior para que además imprima por consola el número de archivos
y (sub)directorios que se encuentren en el directorio que se pase como argumento
(args[0]).*/

public class Ejercicio15 {

	public static void main(String arg[]) {

		String directorio;
		if (arg.length > 0)
			directorio = arg[0];
		else
			directorio = ".";

		File actual = new File(directorio);
		System.out.println("El directorio actual es: ");
		try {
			System.out.println(actual.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}

		File[] contenido = actual.listFiles();
		int contd = 0, contf = 0;
		for (File file : contenido) {
			if (file.isDirectory()) {
				System.out.println("El nombre del directorio es: " + file.getName());
				contd++;
			}

			if (file.isFile()) {
				System.out.println("El nombre del archivo es: " + file.getName());
				contf++;
			}
		}
		System.out.println("El número de directorios es " + contd);
		System.out.println("El número de archivos es " + contf);

	}

}
