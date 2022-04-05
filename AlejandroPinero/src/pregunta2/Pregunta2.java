package pregunta2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.InitializationException;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import clases.Persona;

public class Pregunta2 {

	static ArrayList<Persona> lista;

	public static void leerXML(ArrayList<Persona> lista) {
		FileOutputStream salida =null;
		try {
			salida = new FileOutputStream("Ficheros/Agenda.xml");
		
		XStream stream = new XStream(new DomDriver("UTF-8"));
		stream.alias("Datos__Contacto", Persona.class);
		stream.toXML(lista, salida);
		} catch (FileNotFoundException e) {
		}catch (InitializationException e) {
			
		}
	}

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
	
	public static void leerLista(ArrayList<Persona> lista) {
		for (Persona per : lista) {
			System.out.println(per);
		}
	}

	public static void main(String[] args) {
		cargarDatos();
		leerLista(lista);
		leerXML(lista);
	}

}
