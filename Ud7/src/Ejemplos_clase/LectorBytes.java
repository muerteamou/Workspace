package Ejemplos_clase;
import java.io.FileInputStream;
import java.io.IOException;

public class LectorBytes {

	private static void lee(String f) {
		int caracterLeido;
		try {
			FileInputStream fr = new FileInputStream(f);
			while ((caracterLeido = fr.read()) != -1) {
				System.out.print((char) caracterLeido);
			}

			fr.close();
		} catch (IOException io) {
			System.out.println("Ocurrió un error al leer el fichero" + f);
		}
	}

	public static void main(String[] args) throws IOException {
		String f = "Ficheros/fichero3.dat";
		lee(f);
	}

}
