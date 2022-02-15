package Ejemplos_clase;
import java.io.FileWriter;
import java.io.IOException;

public class Escritorv2 {

	private static void escribe(String f) {
		try {
			FileWriter fw = new FileWriter(f);
			fw.write('1');
			fw.write('\n');
			fw.write(65);
			fw.write('\n');
			fw.write("Esto es una cadena que va en la tercera linea");
			fw.write('\n');
			fw.write("Esto es un array de caracteres".toCharArray());

			fw.close();
			
			System.out.println("Los datos se han guardado correctamente");
		} catch (IOException io) {
			System.out.println("Ocurrió un error en la entrada de datos");
		}
	}
	

	public static void main(String[] args) {
		String f = "Ficheros/fichero2.txt";
		escribe(f);
	}
	

}
