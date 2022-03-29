package ejercicios;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ejercicio_02a {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		ObjectOutputStream salida = null;
		Departamento d;
		try {
			fos = new FileOutputStream("documentos/departamentos.dat");
			salida = new ObjectOutputStream(fos);

			d = new Departamento(1, "Informática", "Estadilla");
			salida.writeObject(d);
			d = new Departamento(2, "Economía", "Huesca");
			salida.writeObject(d);
			d = new Departamento(3, "Comercio", "Zaragoza");
			salida.writeObject(d);
			d = new Departamento(4, "Matemáticas", "Barbastro");
			salida.writeObject(d);

		} catch (FileNotFoundException e) {
			System.out.println("1" + e.getMessage());
		} catch (IOException e) {
			System.out.println("2" + e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				if (fos != null)
					fos.close();
				if (salida != null)
					salida.close();
			} catch (IOException e) {
				System.out.println("3" + e.getMessage());
			}
		}

	}

}
