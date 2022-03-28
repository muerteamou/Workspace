package Ejercicios;
import java.io.FileReader;
import java.io.IOException;

/*Escribe una clase con un método que a partir de dos ficheros que
 *  reciba como argumento indique si son idénticos.
 */
public class Ejercicio09 {

	private static void comprobarArchivos(String archivo1, String archivo2) {
			String cadena1="", cadena2="";
			
			int crt1=0, crt2=0;
		
			FileReader fr1;
			try {
				fr1 = new FileReader(archivo1);
			
			FileReader fr2 = new FileReader(archivo2);
			
			while((crt1=fr1.read())!=-1) {
				cadena1=cadena1 + (char)crt1;
			}
			while((crt2=fr2.read())!=-1) {
				cadena2=cadena2 + (char)crt2;
			}fr1.close();
			fr2.close();
			if (cadena1.equals(cadena2)) {
				System.out.println("Los archivos son identicos.");
			}else {
				System.out.println("Los archivos son diferentes");
			}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			
	}

	public static void main(String[] args) {
		String archivo1 ="Ficheros/fichero4.txt";
		String archivo2 = "Ficheros/fichero4copia.txt";
		
		comprobarArchivos(archivo1, archivo2);
	}

}
