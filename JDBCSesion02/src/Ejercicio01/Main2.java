package Ejercicio01;

import java.sql.SQLException;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) throws SQLException {
		AccesoBdatos abd = new AccesoBdatos();
		abd.conectar();
		System.out.println("Introduce una localidad");
		Scanner s = new Scanner(System.in);
		String consulta = s.nextLine();
		s.close();
		abd.consultarPorLocalidad(consulta);
		
		
		//abd.imprimirDatos(abd.consultaTodos());
		abd.desconectar();

	}

}
