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

public class Ejercicio16bis {
	static ArrayList<Cliente> lista = new ArrayList<Cliente>();
	static Scanner s = new Scanner(System.in);

	public static void cargarClientes() {
		File archivo = new File("Ficheros/ventas.dat");
		if (archivo.exists()) {
			ObjectInputStream entrada = null;
			Cliente cnt;
			try {
				entrada = new ObjectInputStream(new FileInputStream(archivo));

				while (true) {
					cnt = (Cliente) entrada.readObject();
					lista.add(cnt);
				}
			} catch (ClassNotFoundException e) {
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

	public static void anyadirCliente() {
		Cliente c = new Cliente();
		System.out.println("Introduce el nombre y apellidos del cliente:");
		c.setNombre(s.nextLine());
		System.out.println("Introduce el teléfono: ");
		c.setTelefono(s.nextLine());
		System.out.println("Introduce la dirección: ");
		c.setDireccion(s.nextLine());
		System.out.println("Introduce el NIF: ");
		c.setDireccion(s.nextLine());
		System.out.println("Indica si es moroso con true o false");
		c.setMoroso(Boolean.parseBoolean(s.nextLine()));
		lista.add(c);
	}
	
	public static void consultarClientes() {
		for (Cliente c : lista) {
			System.out.println(c);
		}
	}
	public static void clienteMoroso() {
		for(Cliente c : lista) {
			if(c.getMoroso()) {
				System.out.println(c);
			}
		}
	}
	public static void guardarSalir() {
		ObjectOutputStream salida;
		try {
			salida = new ObjectOutputStream(new FileOutputStream("Ficheros/ventas.dat"));
		
		for (Cliente cliente : lista) {
			salida.writeObject(cliente);
		}} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Fin de la aplicacion");
		
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
				opcion = Integer.parseInt(s.nextLine()); // Tengo que usar las clases envoltorio porque da problemas con
															// el buffer. Lo mejor leer la linea entera y deja el bufer
															// vac�o.
			} while (opcion < 1 || opcion > 6);

			switch (opcion) {
			case 1:
				anyadirCliente();
				break; // m�todo a�adir y break
			case 2:
				 consultarClientes();
				break; // m�todo consultar y break
			case 3:
				clienteMoroso();
				break;// ... y break
			case 4:
				// modificarCliente();
				break;// ... y break
			case 5:
				// borrarCliente();
				break;// ... y break
			default:
				guardarSalir();
				break;// ...Guardar
			}
		}
	}

}
