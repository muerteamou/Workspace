package Ejercicios;
/*Escribe una clase con un método que reciba por parámetro el nombre de un fichero de
texto (que habrás creado con anterioridad) y cuente el número de palabras que contiene.
Incluye también el tratamiento de excepciones.
*/
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio03 {

	public static void main(String[] args) {
		int caracterLeido;
		int numeroTrozosReales=0;
		String [] trozos;
		String cadena = "";
		
		try {
		FileReader fr = new FileReader("Ficheros/fichero2.txt");
		
		while ((caracterLeido = fr.read()) != -1) {
			cadena = cadena + ((char) caracterLeido);
		}
		fr.close();
		
		trozos=cadena.split(" ");
		System.out.println(trozos.length);
		for (String trozo: trozos) {
			System.out.println(trozo);
			if (!trozo.isEmpty())
				numeroTrozosReales++;
		}
		System.out.println(numeroTrozosReales);
		
		System.out.println("El fichero se ha leido con éxito");
	}catch (IOException io) {
		System.out.println("Ha ocurrido un error");
	}
		}

}
