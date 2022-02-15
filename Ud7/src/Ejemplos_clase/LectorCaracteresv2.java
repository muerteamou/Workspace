package Ejemplos_clase;
import java.io.FileReader;
import java.io.IOException;

public class LectorCaracteresv2 {

	private static void lee(String f) {
		int caracterLeido;
		try {
			FileReader fr = new FileReader(f);
			while ((caracterLeido = fr.read()) != -1) {
				System.out.print((char) caracterLeido);
			}

			fr.close();
		} catch (IOException io) {
			System.out.println("Ocurrió un error al leer el fichero" + f);
		}
	}

	public static void main(String[] args) throws IOException {
		String f = "Ficheros/fichero2.txt";
		lee(f);
	}

}
