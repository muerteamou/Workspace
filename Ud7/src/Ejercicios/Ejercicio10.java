package Ejercicios;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*Escribe una clase con un m�todo que reciba como argumento el nombre
 * de un fichero (ya existente) y cree una copia del mismo en otro 
 * fichero. El nombre de este �ltimo fichero tendr� como prefijo
 * �copia_de_xxx� donde xxx es el nombre de fichero a duplicar.
 * Incluye tambi�n el tratamiento de excepciones.
 */

public class Ejercicio10 {
	
	//lo hago con filereader
	
	
	
	//probar a hacerlo con file estream
	private static void copiarFichero(String f) {
		int crt =0;
		FileReader fr;
		try {
			fr = new FileReader("Ficheros/" + f);
		
		FileWriter fw = new FileWriter ("Ficheros/copia_de_" + f);
		while((crt=fr.read())!=-1) {
			fw.write(crt);
		}fr.close();
		fw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {	
		String fichero= "fichero2.txt";
		copiarFichero(fichero);

	}

}
