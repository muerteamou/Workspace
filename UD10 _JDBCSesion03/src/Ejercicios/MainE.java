package Ejercicios;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MainE {

	public static void main(String[] args) {
		System.out.println("Empleados contratados antes del 22 de febrero de 1981");
		System.out.println("=====================================================");
		java.util.Date fecha = null;
		java.sql.Date sqlfecha = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		try {
			fecha = sdf.parse("1981/02/22");
			sqlfecha = new java.sql.Date(fecha.getTime());
			
		}catch(ParseException e) {
			System.out.println("Error al convertir la fecha");
		}
		AccesoBdatos abd = new AccesoBdatos();
		try {
			abd.conectar();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(abd.busquedaPorAntiguedad(sqlfecha));
	}

}
