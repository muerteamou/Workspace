package Ejercicios;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*8. Utiliza el fichero del ejercicio anterior para crear una clase con un método que permita
visualizar los datos de manera clara por pantalla así como la media de temperaturas, la
máxima y la mínima. Incluye también el tratamiento de excepciones.*/

public class Ejercicio08 {

	public static void leerYAnalizar(String arch) {

		int contador = 0, hora;

		double min = 5000, max = 0, temp, suma = 0;
		DataInputStream dataIS = null;
		try {
			dataIS = new DataInputStream(new FileInputStream(arch));

			System.out.println(dataIS.readUTF());

			while (true) {
				contador++;
				hora = dataIS.readInt();
				temp = dataIS.readDouble();
				suma = suma + temp;
				if (temp > max)
					max = temp;
				if (temp < min)
					min = temp;
				System.out.println("Hora " + hora + "- Temperatura: " + temp);

			}
		} catch (EOFException eof) {
			System.out.println("Final de lectura");
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
		try {
			dataIS.close();
		} catch (IOException e) {
		}
		System.out.println("La temperatura máxima es: " + max);
		System.out.println("La temperatura mínima es: " + min);
		System.out.println("La temperatura media es: " + suma / contador);

	}

	public static void main(String[] args) {
		leerYAnalizar("Ficheros/temperaturas");
	}

}
