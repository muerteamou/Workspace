package Ejercicios;

import java.sql.SQLException;

public class MainC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AccesoBdatos abd = new AccesoBdatos();
		abd.conectar();
		
		System.out.println(abd.buscarPorCodigo(100));
		
		System.out.println(abd.buscarPorCodigo(7788));

	}

}
