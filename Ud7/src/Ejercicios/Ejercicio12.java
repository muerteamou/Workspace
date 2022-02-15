package Ejercicios;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*Un encriptador es una aplicación que transforma un texto haciéndolo
 *  ilegible para aquellos que desconocen el código. Crea una clase 
 *  que lea un fichero de texto y lo codifique para crear uno nuevo 
 *  con el mensaje cifrado. Sólo se cifrarán (codificarán) letras 
 *  (minúsculas/mayúsculas), sin acentuar y tampoco se codificarán 
 *  las “ñ”(“Ñ”). El alfabeto de codificación será el siguiente:
- La letra “a” se cifrará como “b”, la letra “b” como “c”… la letra 
“z” como “a”
- La letra “A” se cifrará como “B”, la letra “B” como “C”… la letra 
“Z” como “A”.
*/
public class Ejercicio12 {
	private static void encriptadorTexto(String f) {
		try {
			FileReader fr = new FileReader(f);
			FileWriter fw = new FileWriter("Ficheros/ficheroencriptado");
			int caracterLeido;
			while ((caracterLeido = fr.read())!= -1) {
				if ((caracterLeido > 64 && caracterLeido < 90)|| (caracterLeido > 96  && caracterLeido< 122)) {
					fw.write(caracterLeido+1);
				}else if ((caracterLeido == 90 || caracterLeido == 122)) {
					fw.write(caracterLeido-25);
				}else
					fw.write(caracterLeido);
			}
			fr.close();
			fw.close();
			
		}catch(IOException io){
			System.out.println("Ha ocurrido un error");
		}
	}	
	

	public static void main(String[] args) {
		String f = "Ficheros/fichero4.txt";
		encriptadorTexto(f);
	}

}
