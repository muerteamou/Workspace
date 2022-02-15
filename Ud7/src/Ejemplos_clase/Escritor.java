package Ejemplos_clase;
import java.io.FileWriter;
import java.io.IOException;

public class Escritor {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("Ficheros/fichero2.txt");
		fw.write('1');
		fw.write('\n');
		fw.write(65);
		fw.write('\n');
		fw.write("Esto es una cadena que va en la tercera linea");
		fw.write('\n');
		fw.write("Esto es un array de caracteres".toCharArray());
		
		
		fw.close();
	}

}
