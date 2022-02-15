package Ejercicios;

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
		String carpeta= "Ficheros/";
		int caracterLeido;
		try {
		FileReader fr = new FileReader(carpeta + f);
		String fn = carpeta + "copia_de_" + f;
		FileWriter fw = new FileWriter(fn);
		while ((caracterLeido = fr.read()) != -1) {
			char c = (char) caracterLeido;
			fw.write(c);
		}
		fr.close();
		fw.close();
		System.out.println("El fichero se ha copiado con �xito");
		}catch(IOException io) {
			System.out.println("Ocurri� un error en la copia");
		}		
	}

	public static void main(String[] args) {	
		String fichero= "fichero2.txt";
		copiarFichero(fichero);

	}

}
