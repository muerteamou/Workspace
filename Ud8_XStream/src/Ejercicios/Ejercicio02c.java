package Ejercicios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import com.thoughtworks.xstream.XStream;

public class Ejercicio02c {

	public static void main(String[] args) {
		ListaDepartamento lista = new ListaDepartamento();
		rellenarLista(lista);
		crearXML(lista);
	}

	public static void rellenarLista(ListaDepartamento lista) {
		File fichero = new File("Fichero/departamentos.dat");
		if (fichero.exists()) {
			ObjectInputStream entrada = null;
			Departamento dep;
			try {
				entrada = new ObjectInputStream(new FileInputStream(fichero));

				while (true) {
					dep = (Departamento) entrada.readObject();
					lista.add(dep);
				}
			} catch (ClassNotFoundException e) {
				System.out.println("Error, clase no encontrada");
			} catch (FileNotFoundException fnfe) {
				System.out.println("Archivo no encontrado");
			} catch (IOException e) {
				System.out.println("Error en entrada/salida");
			} finally {
				try {
					if (entrada != null) {
						entrada.close();}
				} catch (IOException ieo) {

				}
			}
		}
	}

	public static void crearXML(ListaDepartamento lista) {
		try {
			XStream xstream = new XStream();
			xstream.alias("Departamentos", ListaDepartamento.class);
			xstream.alias("Departamento", Departamento.class);
			xstream.addImplicitCollection(ListaDepartamento.class, "lista");

			xstream.toXML(lista, new FileOutputStream("Fichero/departamentos.xml"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Se ha creado el fichero XML");
	}
}
