package escritura_XML;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/*b) A partir del fichero departamentos.dat anterior, implementa una clase que cree un fichero XML
departamentos.xml usando la librería DOM. Utiliza dicha librería también para codificar otra clase que permita leer
el fichero XML.*/

public class Ejercicio02b {
	
	public static ArrayList<Departamento> leerFichero() {
		ObjectInputStream entrada = null;
		ArrayList<Departamento> adep = new ArrayList<Departamento>();
		Departamento dep;
		try {
			entrada = new ObjectInputStream(new FileInputStream("Ficheros/departamentos.dat"));
			while (true) {
				
					dep = (Departamento) entrada.readObject();
				
				adep.add(dep);
			}	
		}catch(FileNotFoundException fnf){
			System.out.println("Fichero no encontrado");
		}catch(EOFException eof) {
			System.out.println("Fin de fichero");
		}catch(IOException ioe) {
			System.out.println("Error de lectura");
		}catch(ClassNotFoundException e) {
			System.out.println("Clase no encontrada");
		}
		finally {
				try {
					if(entrada != null) {
					entrada.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		}
		return adep;
	}

	public static void main(String[] args) {
		
		
	}
	}


