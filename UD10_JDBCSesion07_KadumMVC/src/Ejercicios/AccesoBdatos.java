package Ejercicios;

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

	public ResultSet consultarPorLocalidad(String localidad) throws SQLException {
		// Preparamos la consulta
		Statement consulta = conecta.createStatement();
		// Establecemos la consulta base por si no se introduce la localidad
		String cadenaSQL = "SELECT * FROM socio";
		// Establecemos la consulta añadiendo a la anterior la localidad
		if (!localidad.isEmpty()) {
			cadenaSQL = cadenaSQL + " WHERE localidad = '" + localidad + "'";
		}
		ResultSet rs = consulta.executeQuery(cadenaSQL);
		return rs;
	}

	public void editarSocio(int socio, String nombre, int estatura, int edad, String localidad) throws SQLException {
		// Preparamos la consulta
		Statement consulta = conecta.createStatement();
		// Establecemos la consulta con la clausula where
		String cadenaSQL = "UPDATE socio SET nombre= '" + nombre + "', estatura = " + estatura + ", edad= " + edad
				+ ", localidad = '" + localidad + "' WHERE socioID = " + socio;
		// ejecutamos la consulta
		consulta.executeUpdate(cadenaSQL);

	}
	public void crearSocio(String nombre, int estatura, int edad, String localidad) throws SQLException {
		// Preparamos la consulta
		Statement consulta = conecta.createStatement();
		// Establecemos la consulta
		String cadenaSQL = "INSERT INTO `socio` (`nombre`, `estatura`, `edad`, `localidad`) VALUES ('" + nombre + "', " + estatura + ", " + edad
				+ ", '" + localidad + "')";
		// ejecutamos la consulta
		//System.out.println(cadenaSQL);
		consulta.executeUpdate(cadenaSQL);

	}
	public void borrarSocio (int socioID) throws SQLException {
		// Preparamos la consulta
		Statement consulta = conecta.createStatement();
		// Establecemos la consulta
		String cadenaSQL = "DELETE FROM socio WHERE socioID = " + socioID;
		// Ejecutamos la consulta
		consulta.executeUpdate(cadenaSQL);		
	}

}