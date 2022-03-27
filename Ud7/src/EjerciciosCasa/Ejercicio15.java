package EjerciciosCasa;

/*15. Modifica el ejercicio anterior para que además imprima por consola el número de archivos
y (sub)directorios que se encuentren en el directorio que se pase como argumento
(args[0]).*/

import java.io.File;
import java.io.IOException;

public class Ejercicio15 {

	public static void main(String[] args) {
		String directorio;
		int contadorD = 0;
		int contadorF = 0;

		if (args.length > 0)
			directorio = args[0];
		else
			directorio = ".";

		File file = new File(directorio);
		try {
			System.out.println("El directorio actual es: " + file.getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		;

		File[] actual = file.listFiles();

		for (File tmp : actual) {
			if (tmp.isDirectory()) {
				System.out.println("Carpeta " + tmp.getName());
				contadorD++;
			} else {
				System.out.println("Archivo " + tmp.getName());
				contadorF++;
			}
		}
		System.out.println("Hay en total " + contadorD + " carpetas");
		System.out.println("Hay en total " + contadorF + " archivos");
	}

}
