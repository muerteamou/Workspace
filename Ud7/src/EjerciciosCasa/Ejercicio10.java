package EjerciciosCasa;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.DuplicateFormatFlagsException;

/*Escribe una clase con un método que reciba como argumento el nombre de un fichero (ya
existente) y cree una copia del mismo en otro fichero. El nombre de este último fichero
tendrá como prefijo “copia_de_xxx” donde xxx es el nombre de fichero a duplicar. Incluye
también el tratamiento de excepciones.*/
public class Ejercicio10 {
	
	public static void duplicarArchivo(String archivo) {
		FileReader fr;
		try {
			fr = new FileReader("Ficheros/"+archivo);
		
		FileWriter fw = new FileWriter("Ficheros/copia_de_"+archivo);
		int caracterLeido=0;
		while((caracterLeido=fr.read())!=-1) {
			fw.write(caracterLeido);
		}
		fr.close();
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
	duplicarArchivo("archivo10");
		

	}

}
