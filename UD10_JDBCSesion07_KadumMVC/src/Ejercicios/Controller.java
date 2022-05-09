package Ejercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Controller implements ActionListener {
	private Vista vista;
	protected static int contador = 0;
	protected static ResultSet rs;

	// CONSTRUCTOR
	Controller(Vista vista) {
		this.vista = vista;

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// OBJETO PARA EJECUTAR LAS SENTENCIAS PREPARADAS
		PreparedStatement ps;
		// COMANDO EJECUTADO
		String comando = arg0.getActionCommand();
		String busqueda = this.vista.textBuscar.getText();
		// DEBE COINCIDIR CON LOS PARÁMETROS INDICADOS EN
		// setActionCommand EN LA CLASE VISTA
		switch (comando) {
		case "BUSCAR":
			try {

				// Establecemos la consulta base por si no se introduce la localidad
				String cadenaSQL = "SELECT * FROM socio";
				// Establecemos la consulta añadiendo a la anterior la localidad
				if (!busqueda.isEmpty()) {
					cadenaSQL = cadenaSQL + " WHERE localidad = ?";
					ps = Bd.getConexion().prepareStatement(cadenaSQL);
					ps.setString(1, busqueda);
					rs = ps.executeQuery();
					cargarDatos(rs);
				}
				ps = Bd.getConexion().prepareStatement(cadenaSQL);
				rs = ps.executeQuery();
				cargarDatos(rs);

			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "No se encontraron socios de " + busqueda, "Mensaje",
						JOptionPane.INFORMATION_MESSAGE);
			}
			break;
		case "ANTERIOR":
			cargarAnt(rs);
			break;

		case "SIGUIENTE":
			cargarSig(rs);
			break;

		case "EDITAR":
			vista.textNombre.setEditable(true);
			vista.textEstatura.setEditable(true);
			vista.textEdad.setEditable(true);
			vista.textLocalidad.setEditable(true);
			vista.btnSig.setEnabled(false);
			vista.btnAnt.setEnabled(false);
			vista.btnBuscar.setEnabled(false);
			vista.btnConfirm.setEnabled(true);
			vista.btnCancelar.setEnabled(true);
			break;

		case "CONFIRMAR":
			if (vista.textNombre.getText().isEmpty() || vista.textEstatura.getText().isEmpty()
					|| vista.textEdad.getText().isEmpty() || vista.textLocalidad.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "No puede haber un campo vacío", "Advertencia",
						JOptionPane.WARNING_MESSAGE);
			} else if (vista.btnCrear.isEnabled() && !vista.btnEdit.isEnabled()) {

				// Establecemos la consulta
				String cadenaSQL = "INSERT INTO `socio` (`nombre`, `estatura`, `edad`, `localidad`) VALUES ('?', '?', '?', '?')";
				// Preparamos la consulta
				try {
					ps = Bd.getConexion().prepareStatement(cadenaSQL);

					ps.setString(1, vista.textNombre.getText());
					ps.setInt(2, Integer.valueOf(vista.textEstatura.getText()));
					ps.setInt(3, Integer.valueOf(vista.textEdad.getText()));
					ps.setString(4, vista.textLocalidad.getText());
					// ejecutamos la consulta
					ps.executeUpdate(cadenaSQL);

					JOptionPane.showMessageDialog(null, "Socio creado con éxito", "Mensaje",
							JOptionPane.INFORMATION_MESSAGE);
					cadenaSQL = "SELECT * FROM socio";
					rs = ps.executeQuery();
					cargarDatos(rs);
					rs.last();

					vista.textSocio.setText(Integer.toString(rs.getInt("socioID")));
					vista.textNombre.setEditable(false);
					vista.textEstatura.setEditable(false);
					vista.textEdad.setEditable(false);
					vista.textLocalidad.setEditable(false);
					vista.btnSig.setEnabled(false);
					vista.btnAnt.setEnabled(false);
					vista.btnBuscar.setEnabled(true);
					vista.btnConfirm.setEnabled(false);
					vista.btnCancelar.setEnabled(false);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				/*
				 * String nombre = textNombre.getText(); int estatura =
				 * Integer.valueOf(textEstatura.getText()); int edad =
				 * Integer.valueOf(textEdad.getText()); String localidad =
				 * textLocalidad.getText(); int idSocio = Integer.valueOf(textSocio.getText());
				 * 
				 * abd.conectar(); try { abd.editarSocio(idSocio, nombre, estatura, edad,
				 * localidad); rs = abd.consultarPorLocalidad("");
				 * JOptionPane.showMessageDialog(null, "Cambios realizados con éxito",
				 * "Mensaje", JOptionPane.INFORMATION_MESSAGE); textNombre.setEditable(false);
				 * textEstatura.setEditable(false); textEdad.setEditable(false);
				 * textLocalidad.setEditable(false); btnSig.setEnabled(true);
				 * btnAnt.setEnabled(true); btnBuscar.setEnabled(true);
				 * btnConfirm.setEnabled(false); btnCancelar.setEnabled(false); } catch
				 * (SQLException e1) { e1.printStackTrace(); }
				 */}

		}
	}

	protected void cargarDatos(ResultSet rs) {
		contador = 0;
		try {
			while (rs.next()) {
				contador++;
			}
			rs.first();
			vista.textSocio.setText(Integer.toString(rs.getInt("socioID")));
			vista.textNombre.setText(rs.getString("nombre"));
			vista.textEstatura.setText(Integer.toString(rs.getInt("estatura")));
			vista.textEdad.setText(Integer.toString(rs.getInt("edad")));
			vista.textLocalidad.setText(rs.getString("localidad"));
			vista.textNSocio.setText("Socio " + rs.getRow() + " de " + contador);
			vista.btnAnt.setEnabled(true);
			vista.btnSig.setEnabled(true);
			vista.btnCrear.setEnabled(false);
			vista.btnBorrar.setEnabled(true);
			vista.btnCancelar.setEnabled(true);
		} catch (SQLException e) {

		}
		vista.btnEdit.setEnabled(true);
	}

	protected void cargarAnt(ResultSet rs) {

		try {
			rs.previous();
			vista.textSocio.setText(Integer.toString(rs.getInt("socioID")));
			vista.textNombre.setText(rs.getString("nombre"));
			vista.textEstatura.setText(Integer.toString(rs.getInt("estatura")));
			vista.textEdad.setText(Integer.toString(rs.getInt("edad")));
			vista.textLocalidad.setText(rs.getString("localidad"));
			vista.textNSocio.setText("Socio " + rs.getRow() + " de " + contador);
		} catch (SQLException e1) {
			JOptionPane.showMessageDialog(null, "No existen registros anteriores", "Primer socio",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}

	protected void cargarSig(ResultSet rs) {
		try {
			rs.next();
			vista.textSocio.setText(Integer.toString(rs.getInt("socioID")));
			vista.textNombre.setText(rs.getString("nombre"));
			vista.textEstatura.setText(Integer.toString(rs.getInt("estatura")));
			vista.textEdad.setText(Integer.toString(rs.getInt("edad")));
			vista.textLocalidad.setText(rs.getString("localidad"));
			vista.textNSocio.setText("Socio " + rs.getRow() + " de " + contador);
		} catch (SQLException e1) {
			JOptionPane.showMessageDialog(null, "No existen registros posteriores", "Ultimo socio",
					JOptionPane.INFORMATION_MESSAGE);
		}

	}

}
