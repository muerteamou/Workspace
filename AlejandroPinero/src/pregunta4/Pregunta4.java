package pregunta4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import clases.Persona;

public class Pregunta4 {
	static ArrayList<Persona> lista;

	public static void cargarDatos() {

		lista = new ArrayList<Persona>();
		File archivo = new File("Ficheros/Agenda.dat");
		if (archivo.exists()) {
			ObjectInputStream entrada = null;
			try {
				entrada = new ObjectInputStream(new FileInputStream(archivo));
				Persona p;
				while (true) {
					p = (Persona) entrada.readObject();
					lista.add(p);
				}

			} catch (FileNotFoundException e) {
			} catch (IOException e) {
			} catch (ClassNotFoundException e) {
			} finally {
				try {
					entrada.close();
				} catch (IOException e) {
				}
			}
		}
	}

	public static void escribirTxt(ArrayList<Persona> lista) {
		String linea = "";
		FileWriter salida;
		BufferedWriter bw =null;
		try {
			salida = new FileWriter("Ficheros/Agenda.txt");

			bw = new BufferedWriter(salida);
			
			Collections.sort(lista);
			for (int i = 0; i < lista.size(); i++) {
//				while ((linea = lista[i]) != null) {
				bw.write(lista.get(i).toString());
				bw.newLine();
				}
			

		} catch (IOException e) {

			e.printStackTrace();
		}finally {
			try {
				bw.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		cargarDatos();
		escribirTxt(lista);

	}

}
