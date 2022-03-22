package Ejercicio01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


/*1. (script baloncesto.sql). Realiza las siguientes clases:
a. Clase ListaSociosBaloncesto.java, con un método main, que visualice los datos de todos los socios. Incluir
también el número de socios. Ejemplo de ejecución:*/

public class ListaSociosBaloncesto {

	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database = "baloncesto";
	private static String hostname = "localhost";
	private static String port = "3308";
	private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?serverTimezone=Europe/Madrid";
	private static String username = "root";
	private static String password = "root";

	public class Socio{
		private int SocioID;
		private String nombre;
		private int estatura;
		private String localidad;
		private int edad;

		public Socio(int SocioID, String nombre, int estatura, int edad, String localidad) {
			this.SocioID = SocioID;
			this.nombre = nombre;
			this.estatura = estatura;
			this.edad = edad;
			this.localidad = localidad;
		}
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, username, password);
		Statement consulta = conn.createStatement();
		ResultSet rs = consulta.executeQuery ("SELECT * FROM socio");

		System.out.println("Lista de socios\n------------------------");
		while(rs.next()) {
			int id = rs.getInt("socioID");
			String nombre =rs.getString("nombre");
			int estatura = rs.getInt("estatura");
			int edad = rs.getInt("edad");
			String localidad = rs.getString("localidad");
			
			System.out.println("Socio nº " + id + ". Nombre: " + nombre + " edad: " + edad + " estatura: " +estatura + " localidad: " + localidad);
		}
		conn.close();
		consulta.close();
		rs.close();
		
	}

}
