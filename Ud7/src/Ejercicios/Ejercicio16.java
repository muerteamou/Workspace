package Ejercicios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*Crea una aplicación que almacene como objetos en un fichero ventas.dat los datos básicos
de los clientes como son el nombre completo (String), teléfono (String), dirección, (String),
nif (String) y moroso (boolean) . La aplicación (menú) debe tener en cuenta los métodos:
a. Introducir en el fichero anterior los datos de los clientes que se pedirán por
teclado y se irán añadiendo al fichero .
b. Visualizar los datos del fichero.
c. Visualizar los datos de los clientes morosos.
d. Modificar los datos de un cliente sustituyéndolos por los del objeto que se
pase como argumento del método.
e. Dar de baja clientes a partir del nif.*/

import java.util.Scanner;

public class Ejercicio16 {
	static ArrayList<Cliente> clnt = new ArrayList<Cliente>();
	static Scanner s = new Scanner(System.in);
	static File fichero = new File("Ficheros/ventas.dat");
	private static ObjectOutputStream salida;

	public static void cargarClientes() {

		if (fichero.exists()) {
			ObjectInputStream entrada = null;
			try {
				entrada = new ObjectInputStream(new FileInputStream(fichero));

				while (true) {
					Cliente c = (Cliente) entrada.readObject();
					clnt.add(c);
				}

			} catch (ClassNotFoundException e) {
			} catch (FileNotFoundException e) {
				System.out.println("El fichero no existe");
			} catch (IOException e) {
			} finally {

				try {
					entrada.close();
				} catch (IOException e) {
				}
			}
		}
	}

	public static void insertarClientes() {
		System.out.println("Introduce el nombre completo del cliente: ");
		String nombre = s.nextLine();
		System.out.println("Introduce el teléfono: ");
		String tlfn = s.nextLine();
		System.out.println("Introduce la dirección: ");
		String direccion = s.nextLine();
		System.out.println("Introduce el nif: ");
		String nif = s.nextLine();
		System.out.println("Indica con true o false si es moroso: ");
		String moroso = s.nextLine();
		Boolean morosob = Boolean.parseBoolean(moroso);
		clnt.add(new Cliente(nombre, tlfn, direccion, nif, morosob));
	}


	public static void guardarSalir() {
		try {
			salida = new ObjectOutputStream(new FileOutputStream(fichero));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (Cliente tmp : clnt) {
			try {
				salida.writeObject(tmp);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void consultarCliente() {
		for (Cliente tmp : clnt) {
			System.out.println(tmp);
		}
	}
	public static void consultarClienteMoroso(){}
	
	public static void consultarMorosos() {
		for (Cliente tmp : clnt) {
			if (tmp.isMoroso()) {
				System.out.println(tmp);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		cargarClientes();

		Cliente antonio = new Cliente();
		Cliente alex = new Cliente("Alejandro", "666666666", "Calle baja", "12345678", false);
		clnt.add(alex);
		clnt.add(antonio);

		ObjectInputStream entrada = null;

		// fis = new FileInputStream("Ficheros/ventas.dat");
		// entrada = new ObjectInputStream(fis);
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("Ficheros/ventas.dat");
			ObjectOutputStream sos = new ObjectOutputStream(fos);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		// nada mas empezar cargar los clientes del archivo si este existe
		// File ventas = new File("Ficheros/ventas.dat");

		int opcion = 0;
		while (opcion != 6) {// true
			do {
				System.out.println("1. Insertar Clientes (en el arraylist)");
				System.out.println("2. Consultar Clientes Morosos");
				System.out.println("3. Consultar Cliente");
				System.out.println("4. Modificar Clientes");
				System.out.println("5. Borrar Clientes");
				System.out.println("6. Guardar Clientes y salir");
				System.out.println("\n\n\t\t Introduzca la opción");
				String ent = s.nextLine();
				opcion = Integer.parseInt(ent);

				String opcionS = s.nextLine();
				opcion = Integer.parseInt(opcionS);
				
			} while (opcion < 1 || opcion > 6);

			switch (opcion) {
			case 1:
				insertarClientes();// metodo cargar y break
				break; 
			case 2:
				consultarMorosos();
				break;// metodo consultar y break
			case 3:
				consultarCliente();
				break;
			case 4:
			case 5:
			case 6:
				guardarSalir();
				break;
			default: // guardar
			}
		}
		s.close();
	}

}
