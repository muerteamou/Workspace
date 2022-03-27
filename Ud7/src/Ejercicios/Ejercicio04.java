package Ejercicios;
import java.io.FileReader;
import java.io.IOException;

/*Escribe una clase con un m�todo que reciba por par�metro el nombre de un 
 * fichero de texto (que habr�s creado con anterioridad) y lo muestre por 
 * pantalla sin espacios en blanco. Incluye tambi�n el tratamiento de excepciones.*/

public class Ejercicio04 {
	
	private static void leerSinEspacios(String f) {
		int caracterleido;
		String cadena="";
		FileReader fr;
		try {
			fr = new FileReader(f);
		
		
		while((caracterleido= fr.read())!=-1) {
			if(caracterleido!=' ') {
				cadena = cadena +(char) caracterleido;
			}
			
		}fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(cadena);
		} 
	
	public static void main(String[] args) {
		String fl = "Ficheros/archivo04";
		leerSinEspacios(fl);

	}

}
