package Ejercicios;

/*3. Escribe una clase con un método que reciba por parámetro el nombre de un fichero de
texto (que habrás creado con anterioridad) y cuente el número de palabras que contiene.
Incluye también el tratamiento de excepciones.*/

import java.io.FileReader;
import java.io.IOException;

public class Ejercicio03 {
	public static void contarPalabras(String f) {
		int caracterleido = 0, contador =0;
		String cadena= "";
		String [] trozos;
		
		FileReader fr;
		try {
			fr = new FileReader(f);
		
		
		while((caracterleido= fr.read())!=-1) {
			cadena = cadena + (char) caracterleido;
		}fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		trozos = cadena.split("[ , \n]");
		contador = trozos.length;
		System.out.println("Hay " + contador + " palabras");
		System.out.println(cadena);
		
	}
	
	/*public static void contarPalabrasB(String f) {
		int contador= 0;
		String cadena="";
		String []trozos;
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(f));
		
		
		while((cadena= br.readLine()) != null) {
			cadena = cadena + br.read();
			
		}br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		trozos = cadena.split("[ , \n]");
		contador = trozos.length;
		
		System.out.println("Hay " + contador + " palabras");
		System.out.println(cadena);
		
	}*/
	
	public static void main(String[] args) {
		contarPalabras("Ficheros/archivo03");
		//contarPalabrasB("Ficheros/archivo03");
	}
}