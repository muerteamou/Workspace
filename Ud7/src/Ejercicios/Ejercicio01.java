package Ejercicios;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*Escribe una clase con un método que reciba por parámetro el nombre de un
 *fichero de texto que contiene varias líneas con una cantidad real en cada
 *una de ellas (que habrás creado con anterioridad), y calcule su suma y media.
 *Incluye también el tratamiento de excepciones.*/

public class Ejercicio01 {

	public static void calculos(String fichero) {
		BufferedReader filtro;
		String linea;
		int contador=0;
		double suma =0;
		try {
			filtro=new BufferedReader(
					new FileReader(fichero));
			while ((linea = filtro.readLine()) != null) {
				contador++;
				suma = suma + Double.parseDouble(linea);
				System.out.println(linea);
			}
		    filtro.close();
			System.out.println("La suma vale:  " + suma);
			System.out.println("La media vale:  " + suma/contador);
		} catch (IOException e) {
			System.out.println("No se puede abrir el archivo para lectura");
	}
  
	}
	
	public static void main(String[] args) {
		String nombreArchivo= "Ficheros/fichero5";
		calculos(nombreArchivo);
	}

}
