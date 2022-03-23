package Ejercicios;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*Escribe una clase con un método que pida al usuario una cadena de caracteres y
 la guarde al revés en un archivo de texto cuyo nombre se le pasará como segundo
 argumento. Incluye también el tratamiento de excepciones.*/
public class Ejercicio05 {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce una palabra");
		String cadena = s.nextLine();
		String ruta = "Ficheros/ficheroinverso";
		invertir(cadena, ruta);
		s.close();
	}
	
	public static void invertir(String texto, String nfichero) throws IOException {
		
		FileWriter fw = new FileWriter(nfichero);
		/*
		char [] temp = texto.toCharArray();
		
		for (int i=texto.length()-1; i>=0; i--) {
			fw.write(temp[i]);
		}
		*/
		for (int i = texto.length()-1; i>=0; i--) {
			fw.write(texto.charAt(i));
		}
		fw.close();
		
	}

}
