package EjerciciosCasa;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*12. Un encriptador es una aplicación que transforma un texto haciéndolo ilegible para
aquellos que desconocen el código. Crea una clase que lea un fichero de texto y lo
codifique para crear uno nuevo con el mensaje cifrado. Sólo se cifrarán (codificarán) letras
(minúsculas/mayúsculas), sin acentuar y tampoco se codificarán las “ñ”(“Ñ”). El alfabeto
de codificación será el siguiente:
- La letra “a” se cifrará como “b”, la letra “b” como “c”... la letra “z” como “a”
- La letra “A” se cifrará como “B”, la letra “B” como “C”... la letra “Z” como “A”.*/

public class Ejercicio12 {

	public static void encriptarArchivo() {
		FileReader fr;
		try {
			fr = new FileReader("Ficheros/archivo12");

			FileWriter fw;

			fw = new FileWriter("Ficheros/archivo12cod");

			int caracterleido;
			while ((caracterleido = fr.read()) != -1) {
				if ((caracterleido > 64 && caracterleido < 90) || (caracterleido > 96 && caracterleido < 122)) {
					fw.write(caracterleido + 1);
				} else if ((caracterleido == 90 || caracterleido == 122)) {
					fw.write(caracterleido - 25);
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
		encriptarArchivo();
	}

}
