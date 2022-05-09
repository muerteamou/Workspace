package Ejercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Bd {
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String hostname = "localhost";
	private String port = "3308";
	private String url = "";
	private String username = "root";
	private String password = "root";

	public static Connection conecta = null;

	Bd(String baseDatos) {
		this.url = "jdbc:mysql://" + hostname + ":" + port + "/" + baseDatos + "?serverTimezone=Europe/Madrid";

		try {
			Class.forName(this.driver);
		} catch (ClassNotFoundException cnfe) {
			System.out.println("Clase no encontrada");
		}

		try {
			conecta = DriverManager.getConnection(url, this.username, this.password);
		} catch (SQLException sqle) {
			System.out.println("Error de conexion");
		}

		System.out.println("Conectado con éxito a " + baseDatos);

	}

	// Devuelve el objeto Connection que se usar� en la clase Controller
	public static Connection getConexion() {
		return conecta;
	}
}
