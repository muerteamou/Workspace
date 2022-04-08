package Ejercicios;

import java.sql.SQLException;

/*Método public ArrayList<Empleado> busquedaPorOficio (String oficio) que reciba un oficio
como argumento e imprima los empleados que desempeñan dicho trabajo.*/

public class MainD {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AccesoBdatos abd = new AccesoBdatos();
		abd.conectar();
		System.out.println(abd.busquedaPorOficio("Profesor"));
		
		System.out.println(abd.busquedaPorOficio("CLERK"));

	}

}
