package Ejercicio01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database = "baloncesto";
	private static String hostname = "localhost";
	private static String port = "3308";
	private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?serverTimezone=Europe/Madrid";
	private static String username = "root";
	private static String password = "root";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, username, password);
		Statement consulta = conn.createStatement();
		ResultSet rs = consulta.executeQuery ("SELECT * FROM socio");
		
		System.out.println("Lista de socios\n----------------------------------------------------------");
		int contador =0;
		Socio socio = new Socio();
		while(rs.next()) {
			contador++;
			
			socio.setSocioID(rs.getInt("socioID"));
			socio.setNombre(rs.getString("nombre"));
			socio.setEstatura(rs.getInt("estatura"));
			socio.setEdad(rs.getInt("edad"));
			socio.setLocalidad(rs.getString("localidad"));
			
			System.out.println("Socio nº " + socio.getSocioID() + ". Nombre: " + socio.getNombre() + " edad: " + socio.getEdad() + " estatura: " + 
			socio.getEstatura() + " localidad: " + socio.getLocalidad());
		}
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Nº total de socios: " + contador);
		conn.close();
		consulta.close();
		rs.close();		
	}
	

}
