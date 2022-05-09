package Ejercicios;

import java.sql.SQLException;

/*Método public int actualizarSalario(int departamento, double porcentaje) que reciba un
número de departamento y un porcentaje, y suba el salario a todos los empleados de ese departamento
en ese porcentaje. El método devolverá también el número de filas modificadas.*/

public class MainI {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		AccesoBdatos abd = new AccesoBdatos();
		abd.conectar();
		
		System.out.println("Subir un 20% el salario de los empleados del Departamento 30");
		System.out.println(abd.actualizarSalarioconTransacciones(30, 0.2)); //→6
		//
		System.out.println("Subir un 15% el salario de los empleados del Departamento 44");
		System.out.println(abd.actualizarSalario(44, 0.15));//→0
		// No existe el departamento 44
	}
}
