package Ejercicios;

import java.io.FileReader;
import java.io.IOException;

/*Escribe una clase con un m�todo que reciba por par�metro el nombre de un 
 * fichero de texto (que habr�s creado con anterioridad) y cuente las vocales 
 * (tanto may�sculas como min�sculas) que en �l aparecen. Incluye tambi�n el 
 * tratamiento de excepciones.
*/
public class Ejercicio02 {

	private static void leer(String f) {
		int caracterleido, contador = 0;
		String texto="";
		FileReader fr;
		try {
			fr = new FileReader(f);

			while ((caracterleido = fr.read()) != -1) {
				char c = (char) caracterleido;
				texto = texto + c;
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					contador++;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(texto);
		System.out.println("En total hay " + contador + " vocales");
	}

	public static void main(String[] args) {
		String f = "Ficheros/archivo02";
		leer(f);

	}

}
