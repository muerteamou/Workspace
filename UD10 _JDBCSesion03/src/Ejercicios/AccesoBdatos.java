package Ejercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AccesoBdatos {
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database = "demodb";
	private static String hostname = "localhost";
	private static String port = "3308";
	private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database
			+ "?serverTimezone=Europe/Madrid";
	private static String username = "root";
	private static String password = "root";
	private Connection conecta;

	public void conectar() throws SQLException, ClassNotFoundException {
		Class.forName(driver);
		conecta = DriverManager.getConnection(url, username, password);
	}

	public void desconectar() throws SQLException, ClassNotFoundException {

		conecta = null; // = conecta.close();
	}

	public Empleado buscarPorCodigo(int numero) throws ClassNotFoundException {

		Empleado emp = new Empleado();
		String sql = "SELECT * FROM emp WHERE EMPNO =?";
		try {
			PreparedStatement consulta = conecta.prepareStatement(sql);
			consulta.setInt(1, numero);
			ResultSet rs = consulta.executeQuery();
			if (rs.next()) {
				emp.setEmpno(rs.getInt(1));
				emp.setEname(rs.getString(2));
				emp.setJob(rs.getString(3));
				emp.setMgr(rs.getInt(4));
				emp.setHiredate(rs.getDate(5));
				emp.setSal(rs.getDouble(6));
				emp.setComm(rs.getDouble(7));
				emp.setDeptno(rs.getInt(8));
			} else {
				emp = null;
			}
			consulta.close();
			return emp;
		} catch (SQLException e) {
			// System.out.println("error en la consulta - "+e.getMessage());
			return null;
		}
	}

	public ArrayList<Empleado> busquedaPorOficio(String oficio) {
		ArrayList<Empleado> listemp = new ArrayList<Empleado>();
		String sql = "SELECT * FROM emp WHERE JOB=?";
		try {
			PreparedStatement consulta = conecta.prepareStatement(sql);
			consulta.setString(1, oficio);
			ResultSet rs = consulta.executeQuery();
			while (rs.next()) {
				Empleado emp = new Empleado(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDate(5),
						rs.getDouble(6), rs.getDouble(7), rs.getInt(8));
				listemp.add(emp);
			}
			consulta.close();
		} catch (SQLException e) {
			return null;
		}
		return listemp;

	}

	public ArrayList<Empleado> busquedaPorAntiguedad(java.sql.Date fecha) {
		ArrayList<Empleado> listemp = new ArrayList<Empleado>();
		String sql = "SELECT * FROM emp WHERE HIREDATE <= ?";
		try {
			PreparedStatement consulta = conecta.prepareStatement(sql);
			consulta.setDate(1, fecha);
			ResultSet rs = consulta.executeQuery();
			while (rs.next()) {
				Empleado emp = new Empleado(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDate(5),
						rs.getDouble(6), rs.getDouble(7), rs.getInt(8));
				listemp.add(emp);
			}
			consulta.close();
		} catch (SQLException e) {
			return null;
		}
		return listemp;
	}
	public int insertarConBean(Empleado emp) {
		String sql = "INSERT INTO emp VALUES (?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement consulta = conecta.prepareStatement(sql);
			consulta.setInt(1, emp.getEmpno());
			consulta.setString(2, emp.getEname());
			consulta.setString(3, emp.getJob());
			consulta.setInt(4,emp.getMgr());
			consulta.setDate(5, emp.getHiredate());
			consulta.setDouble(6, emp.getSal());
			consulta.setDouble(7, emp.getComm());
			consulta.setInt(8,emp.getDeptno());
			consulta.executeUpdate();
			return 1;	
		} catch (SQLException e) {
			return e.getErrorCode();
		}				
	}
	public int actualizarSalario (int salario, double porcentaje) {
		String sql = "";
		
	}
}
