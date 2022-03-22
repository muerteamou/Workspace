package EjerciciosCasa;

import java.io.FileReader;
import java.io.IOException;

/*3. Escribe una clase con un método que reciba por parámetro el nombre de un fichero de
texto (que habrás creado con anterioridad) y cuente el número de palabras que contiene.
Incluye también el tratamiento de excepciones.*/

public class Ejercicio03 {

	public static void leerPalabras(String ruta) {
		int caracterleido;
		int contador = 0;
		String [] trozos;
		String cadena = "";
		try {
			FileReader fr = new FileReader(ruta);
			while((caracterleido= fr.read())!= -1) {
				cadena = cadena + ((char)caracterleido);
			}
			fr.close();
			
			trozos = cadena.split("[ , \n]");
			contador = trozos.length;
			
			System.out.println("El archivo se ha leido correctamente.");
			System.out.println("Este es el contenido del archivo");
			System.out.println(cadena);
			System.out.println("El archivo contiene " + contador + " palabras");
			
		} catch (IOException ioe) {
			System.out.println("A ocurrido un error en la lectura del archivo");
		}
	}

	public static void main(String[] args) {
		String ruta = "Ficheros/fichero2.txt";
		leerPalabras(ruta);
	}

}
