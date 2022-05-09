package Ejercicios;

import java.sql.SQLException;

/*j. Método public int borrarEmpleado (int numero) que reciba un empleado y lo dé de baja. */
public class MainJ {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AccesoBdatos abd = new AccesoBdatos();
		abd.conectar();
		
		System.out.println(abd.borrarEmpleado(1));
		//1 - Se ha borrado el empleado de código 1 de la tabla
		System.out.println(abd.borrarEmpleado(99));
		//0 – No se ha borrado ninguno pues no existe el empleado 99
		System.out.println(abd.borrarEmpleado(7839));
		//1 – Se ha borrado el empleado 7839.
	}

}
