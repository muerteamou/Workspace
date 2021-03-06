package Ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*Escribe una clase con un método que reciba como argumento el nombre de un 
 * fichero de texto (que habrás creado con anterioridad) y convierta a 
 * mayúsculas sus caracteres sobre otro fichero cuyo nombre se le pasará como 
 * segundo argumento. Utiliza buffering. Incluye también el tratamiento de 
 * excepciones.*/

public class Ejercicio06 {

	public static void main(String[] args) {

		ponerMay("Ficheros/fichero06", "Ficheros/fichero06tmp");

	}

	public static void ponerMay(String fichero1, String fichero2) {
		String linea;

		BufferedReader bf;
		try {
			bf = new BufferedReader(new FileReader(fichero1));
		
		BufferedWriter bw;
		
			bw = new BufferedWriter(new FileWriter(fichero2));
		

		while ((linea = bf.readLine()) != null) {
			linea = linea.toUpperCase();
			bw.write(linea);
			bw.newLine();
		}
		bf.close();
		bw.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
	}

}
