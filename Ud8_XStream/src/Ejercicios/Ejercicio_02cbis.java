package Ejercicios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.thoughtworks.xstream.XStream;

public class Ejercicio_02cbis {

	public static void main(String[] args) {

		ListaDepartamento lista = new ListaDepartamento();
		llenarLista(lista);
		crearXML(lista);
		leerXML();
	}

	public static void llenarLista(ListaDepartamento lista) {
		File fichero = new File("Fichero/departamentos.dat");

		if (fichero.exists()) {
			ObjectInputStream entrada = null;
			Departamento d;
			try {
				entrada = new ObjectInputStream(new FileInputStream(fichero));
				while (true) {
					d = (Departamento) entrada.readObject();
					lista.add(d);
				}
			} catch (ClassNotFoundException e) {
			} catch (FileNotFoundException e) {
			} catch (IOException e) {
			} finally {
				try {
					if (entrada != null) {
						entrada.close();
					}
				} catch (IOException e) {
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
			e.printStackTrace();
		}
		System.out.println("Creado fichero XML...");
	}

	public static void leerXML() {
		try {
			XStream xstream = new XStream();
			xstream.alias("Departamentos", ListaDepartamento.class);
			xstream.alias("Departamento", Departamento.class);
			xstream.addImplicitCollection(ListaDepartamento.class, "lista");

			ListaDepartamento listadoTodos;

			listadoTodos = (ListaDepartamento) xstream.fromXML(new FileReader("Fichero/departamentos.xml"));

			System.out.println("Número de Departamentos: " + listadoTodos.getLista().size());

			for (Departamento d : listadoTodos.getLista()) {
				System.out.println("numDepartamento: " + d.getNumdepartamento() + ", nombre: " + d.getNombre()
						+ ", localidad: " + d.getLocalidad());
			}

			System.out.println("Fin del listado....");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
