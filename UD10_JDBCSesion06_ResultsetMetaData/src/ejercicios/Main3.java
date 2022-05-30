package ejercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Main3 {
	
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database = "empleados";
	private static String hostname = "localhost";
	private static String port = "3308";
	private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database
			+ "?serverTimezone=Europe/Madrid";
	private static String username = "root";
	private static String password = "root";
	private static Connection conecta;

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Class.forName(driver);
		conecta = DriverManager.getConnection(url, username, password);
		
		PreparedStatement ps = conecta.prepareStatement("SELECT * FROM empleados WHERE dpto = ?");
		ps.setInt(1, 10);
		ResultSet rs = ps.executeQuery();
		
		int filas;
		
		filas = rs.getMetaData().getColumnCount();
		
		for(int i=1; i<= filas; i++) {
			System.out.print(rs.getMetaData().getColumnName(i) + " - " + rs.getMetaData().getColumnTypeName(i) + " _ " + rs.getMetaData().getColumnDisplaySize(i));
			System.out.println("");
		}
		
		for(int i=1; i<= filas; i++) {
			System.out.print(rs.getMetaData().getColumnName(i) + "\t\t");
			
		}
		System.out.println("");
		System.out.println("================================================================================================");
		while(rs.next()) {
			for(int i=1; i<= filas; i++) {
				
				System.out.print(rs.getString(i) + "\t");
				
			}
			System.out.println("");
		}
		
		ps.close(); 
		conecta.close();
		
	} 
}