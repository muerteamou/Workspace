package _01a_manejo_de_fichero_ejemplos;

import java.io.*;
// La clase PrintWriter, que deriva de Write, posee los m�todos
// print(String) y println(String), id�nticos a los de System.Out
// ambos reciben un string y lo imprimen
// La clase PrintStream -- �dem pero para bytes
public class EjemploFiltro4 {
	
	public static void main(String[] args) {
		try {
			PrintWriter fichero = new PrintWriter 
										(new FileWriter ("d:\\Ejemplo.txt"));
			for (int i=1; i<6; i++)
				fichero.println("Fila n�mero: "+i);
			fichero.close();
		}
		catch (FileNotFoundException fn) {
			System.out.println("No se encuentra el fichero");
	}
		catch (IOException e) {
			System.out.println("Error de E/S");
	}
  }
}

