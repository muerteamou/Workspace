package EjerciciosCasa;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
/*8. Utiliza el fichero del ejercicio anterior para crear una clase con un método que permita
visualizar los datos de manera clara por pantalla así como la media de temperaturas, la
máxima y la mínima. Incluye también el tratamiento de excepciones.*/
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ejercicio08 {

	public static void main(String[] args) {
		double suma = 0;
		int contador = 0;
		double temp = 0, max = 0, min = 100;
		int basura;
		DataInputStream dataIS = null;
		
		try {
			dataIS = new DataInputStream(new FileInputStream("Ficheros/archivo07"));
			System.out.println(dataIS.readUTF());
			while (true) {
				contador++;
				basura = dataIS.readInt();
				temp = dataIS.readDouble();
				suma = suma + temp;

				System.out.println("Hora: " + basura + " Temperatura: " + temp);
				if (temp > max) {
					max = temp;
				}
				if (temp < min) {
					min = temp;
				}
			}

		}

		catch (EOFException e) {
			System.out.println("Final del archivo");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("La media de temperaturas es: " + suma / contador);
		System.out.println("La temperatura máxima ha sido: " + max);
		System.out.println("La temperatura mínima ha sido: " + min);
		try {
			dataIS.close();
		} catch (IOException e) {
			System.out.println("Fallo al cerrar la lectura");
			e.printStackTrace();
		}

	}

}
