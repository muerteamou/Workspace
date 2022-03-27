package Ejercicios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*A partir de los datos de temperaturas por cada hora del 10 de Agosto de 2021 
 en Huesca, escribe una clase con un método que cree un archivo con la 
 siguiente estructura:El primer registro es la cadena“10 Agosto 2021”, 
 el resto de registros lo componen 24 pares hora (entero comenzando en 0)
 - temperatura (double). Las horas se registran en el formato 0-23;
 las temperaturas puedes simularlas utilizando el método Math.random().
 Incluye también el tratamiento de excepciones.*/

public class Ejercicio07 {

	public static void registrarTemp() {
		DataOutputStream dataOS = null;
		try {
			FileOutputStream fileout;
			fileout = new FileOutputStream("Ficheros/temperaturas");

			dataOS = new DataOutputStream(fileout);
			dataOS.writeUTF("10 Agosto 2021");

			for (int i = 0; i <= 23; i++) {

				dataOS.writeInt(i);
				dataOS.writeDouble(Math.random() * 30);
			}
			dataOS.close();

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error de entrada");
		}
	}

	public static void leerTemp() {
		DataInputStream dataIS = null;
		try {
			FileInputStream filein;
			filein = new FileInputStream("Ficheros/temperaturas");
			dataIS = new DataInputStream(filein);

			System.out.println(dataIS.readUTF());
			while (true) {
				System.out.println("Hora - " + dataIS.readInt() + " - Temperatura: " + dataIS.readDouble());
			}
		} catch (EOFException e) {
			System.out.println("Final del archivo");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			dataIS.close();
		} catch (Exception e) {
			System.out.println("Final del archivo");
		}

	}

	public static void main(String[] args) {
		registrarTemp();
		leerTemp();
	}
}
