package EjerciciosCasa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*11. Crea (p.ej. con el bloc de notas) dos ficheros de personas persona1.txt y persona2.txt; en
cada línea de ellos se guardarán los apellidos y nombre de cada persona. A partir de esos
dos ficheros codifica una clase que cree otro fichero persona3.txt que contenga todas las
personas de los ficheros anteriores ordenadas alfabéticamente. Incluye también el
tratamiento de excepciones.*/
public class Ejercicio11 {

	public static void main(String[] args) {
		BufferedReader br1 = null;
		try {
			br1= new BufferedReader(new FileReader("Ficheros/persona1"));
			BufferedReader br2 = new BufferedReader(new FileReader("Ficheros/persona2"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("Ficheros/persona3"));
			String linea = "";

			while ((linea = br1.readLine()) != null) {
				bw.write(linea);
				bw.newLine();
			}
			while ((linea = br2.readLine()) != null) {
				bw.write(linea);
				bw.newLine();
			}
			br1.close();
			br2.close();
			bw.close();
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado");
		}catch (IOException ioe) {
			System.out.println("Error de entrada/salida");
		}
	}

}
