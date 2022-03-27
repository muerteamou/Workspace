package EjerciciosCasa;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*Diseñar un decodificador (clase) que a partir de un fichero que contenga un 
 * texto cifrado visualice por consola el texto descifrado.*/

public class Ejercicio13 {
	
	public static void desEncriptarArchivo() {
		FileReader fr;
		try {
			fr = new FileReader("Ficheros/archivo12cod");

			FileWriter fw;

			fw = new FileWriter("Ficheros/archivo13");

			int caracterleido;
			while ((caracterleido = fr.read()) != -1) {
				if ((caracterleido > 64 && caracterleido < 90) || (caracterleido > 96 && caracterleido < 122)) {
					fw.write(caracterleido - 1);
				} else if ((caracterleido == 90 || caracterleido == 122)) {
					fw.write(caracterleido + 25);
				} else {
					fw.write(caracterleido);
				}
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
		desEncriptarArchivo();

	}

}
