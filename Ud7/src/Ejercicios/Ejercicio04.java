package Ejercicios;
import java.io.FileReader;
import java.io.IOException;

/*Escribe una clase con un método que reciba por parámetro el nombre de un 
 * fichero de texto (que habrás creado con anterioridad) y lo muestre por 
 * pantalla sin espacios en blanco. Incluye también el tratamiento de excepciones.*/

public class Ejercicio04 {
	
	private static void leerSinEspacios(String f) {
		int caracterLeido;
		try {
		FileReader fr = new FileReader(f);
		caracterLeido = fr.read();
		while (caracterLeido != -1) {
			if ((char) caracterLeido != ' ') {
				System.out.print((char)caracterLeido);
			}caracterLeido = fr.read();
			
			}fr.close();
			
	}catch (IOException io) {
		System.out.println("Ha ocurrido un error");
	}
		} 
	
	public static void main(String[] args) {
		String fl = "Ficheros/fichero3";
		leerSinEspacios(fl);

	}

}
