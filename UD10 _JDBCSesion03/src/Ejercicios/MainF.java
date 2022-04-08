package Ejercicios;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MainF {

	public static void main(String[] args) {
		java.util.Date fecha = null;
		java.sql.Date sqlfecha = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		try {
			fecha = sdf.parse("2020/03/18");
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

		Empleado e1 = new Empleado(1, "CARRERA", "PROFESOR", 7788, sqlfecha, 700, 0, 20);
		System.out.println(abd.insertarConBean(e1));
		System.out.println(abd.insertarConBean(e1));
	}

}
