package Ejercicio01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccesoBdatos {
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database = "baloncesto";
	private static String hostname = "localhost";
	private static String port = "3308";
	private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database
			+ "?serverTimezone=Europe/Madrid";
	private static String username = "root";
	private static String password = "root";

	public Connection conecta;

	public void conectar() {
		try {
			Class.forName(driver);
			conecta = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException cnfe) {
			System.out.println("Clase no encontrada");
		} catch (SQLException sqle) {
			System.out.println("Error de conexion");
		}
	}

	public void desconectar() throws SQLException {
		if (conecta != null) {
			conecta.close();
		}
	}

	public void consultarPorLocalidad(String localidad) throws SQLException {
		// Preparamos la consulta
		Statement consulta = conecta.createStatement();
		// Establecemos la consulta, la ejecutamos y guardamos en un ResulSet
		ResultSet rs = consulta.executeQuery("SELECT * FROM socio WHERE localidad LIKE " + "'%" + localidad + "%'");
		// Usamos un if porque dará un resultado o ninguno
		System.out.println("Lista de socios\n----------------------------------------------------------");
		int contador = 0;
		while (rs.next()) {
			contador++;
			int id = rs.getInt("socioID");
			String nombre = rs.getString("nombre");
			int estatura = rs.getInt("estatura");
			int edad = rs.getInt("edad");
			String localidad1 = rs.getString("localidad");
			System.out.println("Socio nº " + id + ". Nombre: " + nombre + " edad: " + edad + " estatura: " + estatura
					+ " localidad: " + localidad1);
		}
		rs.close();
		consulta.close();
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Nº total de socios: " + contador);
	}
	public ResultSet consultaTodos() throws SQLException {
		Statement consulta = conecta.createStatement();
		// Establecemos la consulta, la ejecutamos y guardamos en un ResulSet
		return consulta.executeQuery("SELECT * FROM socio");
	}
	
	//imprimirDatos(consulta.executeQuery("SELECT * FROM socio"));
	//Probar a meter en consulta todos, a imprimir
	
	public void imprimirDatos(ResultSet rs) throws SQLException {
		System.out.println("Lista de socios\n----------------------------------------------------------");
		int contador = 0;
		while (rs.next()) {
			contador++;
			int id = rs.getInt("socioID");
			String nombre = rs.getString("nombre");
			int estatura = rs.getInt("estatura");
			int edad = rs.getInt("edad");
			String localidad1 = rs.getString("localidad");
			System.out.println("Socio nº " + id + ". Nombre: " + nombre + " edad: " + edad + " estatura: " + estatura
					+ " localidad: " + localidad1);
		}
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Nº total de socios: " + contador);
	}
}
