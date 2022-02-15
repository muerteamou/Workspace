package Ejemplos_clase;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscritorBytes {

	private static void escribe(String f) {
		try {
			FileOutputStream fw = new FileOutputStream(f);
			fw.write('1');
			fw.write('\n');
			fw.write(65);
			fw.write('\n');
			fw.close();
			System.out.println("Los datos se han guardado correctamente");
		} catch (IOException io) {
			System.out.println("Ocurrió un error en la entrada de datos");
		}
	}
	
	public static void main(String[] args) {
		String f = "Ficheros/fichero3.dat";
		escribe(f);
	}
	

}
