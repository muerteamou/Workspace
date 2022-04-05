package Ejercicio3Bis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
		
		//Con PreparedStatment establecemos primero la consulta base por si no se introduce la localidad
		String cadenaSQL = "SELECT * FROM socio";
		PreparedStatement consulta;
		// Establecemos la consulta añadiendo a la anterior la localidad
		if (localidad.isEmpty()) {
			consulta = conecta.prepareStatement(cadenaSQL);
			ResultSet rs = consulta.executeQuery();
			return rs;
		}else {
			cadenaSQL = "SELECT * FROM socio WHERE localidad = ?";
			consulta = conecta.prepareStatement(cadenaSQL);
			consulta.setString(1, localidad);
			ResultSet rs = consulta.executeQuery();
			return rs;
		}
		
	}

	public void editarSocio(int socio, String nombre, int estatura, int edad, String localidad) throws SQLException {
		// Establecemos la consulta con la clausula where
		String cadenaSQL = "UPDATE socio SET nombre= ?, estatura = ?, edad= ?, localidad = ? WHERE socioID = ?";
		// Creamos el PreparedStatement
		PreparedStatement consulta;
		// Establecemos la consulta con la clausula where
		consulta = conecta.prepareStatement(cadenaSQL);
		consulta.setString(1, nombre);
		consulta.setInt(2, estatura);
		consulta.setInt(3, edad);
		consulta.setString(4, localidad);
		consulta.setInt(5, socio);
		// ejecutamos la consulta
		consulta.executeUpdate();
		
	}
	public void crearSocio(String nombre, int estatura, int edad, String localidad) throws SQLException {
		// Establecemos la consulta
		String cadenaSQL = "INSERT INTO `socio` (`nombre`, `estatura`, `edad`, `localidad`) VALUES (?, ?, ?, ? )";
		// Preparamos la consulta
		PreparedStatement consulta = conecta.prepareStatement(cadenaSQL);
		consulta.setString(1, nombre);
		consulta.setInt(2, estatura);
		consulta.setInt(3, edad);
		consulta.setString(4, localidad);
		// ejecutamos la consulta		
		consulta.executeUpdate();
	}
	
	public void borrarSocio (int socioID) throws SQLException {
		// Establecemos la consulta
		String cadenaSQL = "DELETE FROM socio WHERE socioID = ?";
		// Preparamos la consulta
		PreparedStatement consulta = conecta.prepareStatement(cadenaSQL);
		consulta.setInt(1, socioID);
		// Ejecutamos la consulta
		consulta.executeUpdate();		
	}

}