package Ejercicios;

import java.sql.SQLException;

/*Método public Empleado busquedaPorCodigo (int numero) que a partir de un número de
empleado que reciba como argumento imprima sus datos.*/
public class MainC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AccesoBdatos abd = new AccesoBdatos();
		abd.conectar();
		
		System.out.println(abd.buscarPorCodigo(100));
		
		System.out.println(abd.buscarPorCodigo(7788));

	}

}
