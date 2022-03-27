package EjerciciosCasa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*1. Escribe una clase con un método que reciba por parámetro el nombre de un fichero de
texto que contiene varias líneas con una cantidad real en cada una de ellas (que habrás
creado con anterioridad), y calcule su suma y media. Incluye también el tratamiento de
excepciones.*/

public class Ejercicio01 {

	public static void calcularLinea(String fichero) {
		int contador = 0;
		double suma = 0;
		String linea = "";
		BufferedReader bf;
		try {
			bf = new BufferedReader(new FileReader(fichero));
		
		while ((linea = bf.readLine()) != null) {
			contador++;
			suma = suma + Double.parseDouble(linea);
			System.out.println(linea);
		}
		bf.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("La suma de los numeros es: " + suma);
		System.out.println("La media de los numeros es: " + suma/contador);
	}

	public static void main(String[] args) {
		String archivo = "Ficheros/archivo01";
		calcularLinea(archivo);

	}

}
