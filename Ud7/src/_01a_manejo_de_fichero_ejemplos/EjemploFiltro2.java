package _01a_manejo_de_fichero_ejemplos;

import java.io.*;
public class EjemploFiltro2 {
	public static void main(String[] args) {
		try {
			BufferedWriter fichero = new BufferedWriter 
										(new FileWriter ("d:\\Ejemplo.txt"));
			for (int i=1; i<6; i++){
				fichero.write("Fila n�mero: "+i);
				fichero.newLine();
			}
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

