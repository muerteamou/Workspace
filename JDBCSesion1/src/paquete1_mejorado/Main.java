package paquete1_mejorado;
/*
 * Alberto Carrera Mart�n 
 * 29 de febrero de 2020
 */
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		AccesoBdatos abd=new AccesoBdatos();
		//
		try {
			abd.conectar();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("NO SE PUDO ESTABLECER CONEXI�N");
			System.exit(-1);
		}
		
		ArrayList <Libro> todosLibros = abd.consultarTodos();
		if (todosLibros.size()!=0) {
			System.out.println("Listado de todos los libros");
			for (Libro l : todosLibros)
				 System.out.println(l);
		}
		else
			System.out.println("Lista de todos los libros vac�a");
		//
		//
		System.out.println("\n");
		//
		Libro l = abd.consultarId(2);
		if (l!=null) {
			System.out.println("Datos del libro " + l.getIdLibro());
			System.out.println(l);
		}
		else
			System.out.println("No se ha encontrado el libro 2");
		//
		//
		System.out.println("\n");
		//
		ArrayList <Libro> librosPorTitulo = abd.consultarPorTitulo("man");
		if (librosPorTitulo.size()!=0) {
			System.out.println("Listado de libros que contienen man en el t�tulo 'man'");
			for (Libro l2 : librosPorTitulo)
				 System.out.println(l2);
		}
		else
			System.out.println("Lista de Libros vac�a");
		
		
		try {
			abd.desconectar();
		} catch (SQLException e) {
			System.out.println("NO SE PUDO DESCONECTAR - NO SE LLEG� A ESTABLECER CONEXI�N");
			System.exit(-1);
		}
	}

}
