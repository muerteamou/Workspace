package escritura_XML;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*a) Realiza un programa Java que cree un fichero binario para guardar datos (objetos) de departamentos
(departamentos.dat). Los datos para cada departamento son:
- Numdepartamento: entero
- Nombre: String
- Localidad: String

Introduce varios departamentos */

public class Ejercicio02a {

	public static void main(String[] args) {

		Departamento dep1 = new Departamento(1, "Marqueting", "Huesca");
		Departamento dep2 = new Departamento(2, "Ventas", "Teruel");
		Departamento dep3 = new Departamento(3, "Recursos Humanos", "Huesca");
		Departamento dep4 = new Departamento(4, "Compras", "Huesca");
		Departamento dep5 = new Departamento(5, "Sat", "Huesca");
		Departamento dep6 = new Departamento(6, "Ventas", "Zaragoza");

		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("Ficheros/departamentos.dat"));
			oos.writeObject(dep1);
			oos.writeObject(dep2);
			oos.writeObject(dep3);
			oos.writeObject(dep4);
			oos.writeObject(dep5);
			oos.writeObject(dep6);
			// tendremos que controlar los try catch
		} catch (FileNotFoundException fnfe) {
			System.out.println("No se encuentra el fichero");
		} catch (IOException e) {
			System.out.println("Error al escribir o leer");

		}

		// usar el finally (opcional)que sirve para ejecutar esas ordenes pase lo que
		// pase
		finally {
			try {
				if (oos != null) {
					oos.close();
				}
			} catch (IOException e) {
				System.out.println("Error al cerrar el flujo");
			}
		}
	}

}
