package EjerciciosCasa;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio16 {

	static ArrayList<Cliente> lista = new ArrayList<Cliente>();
	
	static Scanner s = new Scanner(System.in);

	public static void cargarClientes() {
		// CARGAR LOS CLIENTES DEL ARCHIVO AL ARRAYLIST, SI ESTE EXISTE:
		File fichero = new File("Ficheros/ventas.dat");

		if (fichero.exists()) { 
			ObjectInputStream entrada = null;
			Cliente c;
			try {
				entrada = new ObjectInputStream(new FileInputStream(fichero));
				while (true) {
					c = (Cliente) entrada.readObject();
					lista.add(c);
				}
			} catch (ClassNotFoundException e) {
			} catch (FileNotFoundException e) {
			} catch (IOException e) {}
			finally {
				try {
					if(entrada != null) {
						entrada.close();
					}
				} catch (IOException e) {}
			}
		}
	}

	public static void anyadirCliente() {
		Cliente x= new Cliente();
		System.out.println("Introduce el nombre del Cliente: ");
		x.setNombre(s.nextLine());
		System.out.println("Introduce el teléfono del Cliente: ");
		x.setTelefono(s.nextLine());
		System.out.println("Introduce la dirección del Cliente: ");
		x.setDireccion(s.nextLine());
		System.out.println("Introduce el nif del Cliente: ");
		x.setNif(s.nextLine());
		System.out.println("Indica si es moroso (true o false)");
		x.setMoroso(Boolean.parseBoolean(s.nextLine()));
		lista.add(x);
	}
	
	public static void consultarClientes() {
		for (Cliente cliente : lista) {
			System.out.println(cliente);
		}
	}
	
	public static void clienteMoroso() {
		for (Cliente cliente : lista) {
			if(cliente.getMoroso())
				System.out.println(cliente);
		}
	}
	
	public static void modificarCliente() {
		Cliente x= new Cliente();
		System.out.println("Introduce el nombre del Cliente: ");
		x.setNombre(s.nextLine());
		System.out.println("Introduce el teléfono del cliente: ");
		x.setTelefono(s.nextLine());
		System.out.println("Introduce la dirección del cliente: ");
		x.setDireccion(s.nextLine());
		System.out.println("Introduce el nif del cliente: ");
		x.setNif(s.nextLine());
		System.out.println("Indica si es moroso (true o false)");
		x.setMoroso(Boolean.parseBoolean(s.nextLine()));
		for (Cliente cliente : lista) {
			if (cliente.getNif().equalsIgnoreCase(x.getNif())) {
				lista.remove(cliente);
				lista.add(x);
				return;
			}
		}
		System.out.println("No hay ning�n cliente con ese nif.");
	}
	
	public static void borrarCliente() {
		System.out.println("Introduce el nif del Cliente: ");
		String nif= s.nextLine();
		for (Cliente cliente : lista) {
			if (cliente.getNif().equalsIgnoreCase(nif)) {
				lista.remove(cliente);
				return;
			}
		}
		System.out.println("No hay ningún cliente con ese NIF.");
	}
	
	public static void guardarYSalir() {
		ObjectOutputStream salida;
		try {
			salida = new ObjectOutputStream(new FileOutputStream("Ficheros/ventas.dat"));
			for (Cliente cliente : lista) {
				salida.writeObject(cliente);
			}
			salida.close();
		} catch (FileNotFoundException e) {}
		catch (IOException e) {}
		System.out.println("FIN DEL PROGRAMA");
	}
	
	public static void main(String[] args) {

		cargarClientes();
		
		int opcion = 0;
		while (opcion != 6) /* (true) */ {
			do {
				System.out.println("1. Añadir Clientes");
				System.out.println("2. Consultar Clientes");
				System.out.println("3. Consultar Clientes Morosos");
				System.out.println("4. Modificar Clientes");
				System.out.println("5. Borrar Clientes por NIF");
				System.out.println("6. Guardar Clientes y Salir del programa");
				System.out.println("\n\n\t\t Introduzca la opción");
				opcion = Integer.parseInt(s.nextLine()); //Tengo que usar las clases envoltorio porque da problemas con el buffer. Lo mejor leer la linea entera y deja el bufer vac�o.
			} while (opcion < 1 || opcion > 6);

			switch (opcion) {
			case 1: anyadirCliente(); break; // m�todo a�adir y break
			case 2: consultarClientes();break; // m�todo consultar y break
			case 3: clienteMoroso();break;// ... y break
			case 4: modificarCliente();break;// ... y break
			case 5: borrarCliente();break;// ... y break
			default: guardarYSalir();break;// ...Guardar
			}
		}

	}

}
