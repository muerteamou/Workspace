package EjerciciosCasa;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*A partir de los datos de temperaturas por cada hora del 10 de Agosto de 2021 en Huesca, escribe una clase con un método que cree un archivo con la siguiente 
 * estructura:El primer registro es la cadena“10 Agosto 2021”, el resto de registros lo componen 24 pares hora (entero comenzando en 0)
- temperatura (double). Las horas se registran en el formato 0-23; las temperaturas puedes simularlas utilizando el método Math.random().
Incluye también el tratamiento de excepciones.*/

public class Ejercicio07 {

	public static void main(String[] args) {
		//es importante montar DataInputStream así 
		DataInputStream dataIS = null;

		try {
			FileOutputStream fileout;
			fileout = new FileOutputStream("Ficheros/archivo07");
			dataIS = new DataInputStream(new FileInputStream("Ficheros/archivo07"));

			DataOutputStream dataOS = new DataOutputStream(fileout);
		
		dataOS.writeUTF("10 Agosto 2021");
		
		for(int i=0; i<= 23; i++) {
			dataOS.writeInt(i);
			dataOS.writeDouble(Math.random()*30);
			
		}
		dataOS.close();
		
		System.out.println(dataIS.readUTF());
		while(true) {
			System.out.println("Hora: " + dataIS.readInt() + " Temperatura: " + dataIS.readDouble());
		}
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado");
		}catch (EOFException e) {
			System.out.println("Final del archivo");
		} catch (IOException e) {
			System.out.println("Error de entrada/salida");
		}
		try {
			dataIS.close();
		} catch (IOException e) {
			
		}
	}

}
