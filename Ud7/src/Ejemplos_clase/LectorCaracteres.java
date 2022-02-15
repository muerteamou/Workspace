package Ejemplos_clase;
import java.io.FileReader;
import java.io.IOException;

public class LectorCaracteres {

	public static void main(String[] args) throws IOException {
		int caracterLeido;
		FileReader fr = new FileReader("Ficheros/fichero1");
		/*caracterLeido = fr.read();
		while (caracterLeido != -1) {
			System.out.print((char)caracterLeido);
			caracterLeido = fr.read();
		}
		*///version larga
		
		//version corta
		while ((caracterLeido=fr.read())!= -1) {
			System.out.print((char)caracterLeido);
		}
		
		fr.close();
	}

}
