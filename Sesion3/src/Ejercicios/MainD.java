package Ejercicios;

import java.sql.SQLException;

public class MainD {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AccesoBdatos abd = new AccesoBdatos();
		abd.conectar();
		System.out.println(abd.busquedaPorOficio("Profesor"));
		
		System.out.println(abd.busquedaPorOficio("CLERK"));

	}

}
