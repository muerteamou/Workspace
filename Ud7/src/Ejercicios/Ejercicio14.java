package Ejercicios;

import java.io.File;
import java.io.IOException;

/*Escribir un programa que muestre los nombres de los archivos y (sub)directorios que se
encuentren en el directorio que se pase como argumento (args[0]).*/

public class Ejercicio14 {

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
		
		File [] contenido = actual.listFiles();
		
		for (File file : contenido) {
			if(file.isDirectory())
			System.out.println("El nombre del directorio es: " + file.getName());
			if(file.isFile())
				System.out.println("El nombre del archivo es: " + file.getName());
		}

	}

}
