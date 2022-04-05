package Ejercicio03;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class GestorSocios extends JFrame implements ActionListener {

	private JPanel contentPane;
	private static JTextField textLocalidad, textNSocio, textBuscar, textSocio, textEdad, textEstatura, textNombre;
	private static JButton btnBuscar, btnAnt, btnSig, btnEdit, btnConfirm, btnCancelar, btnCrear, btnBorrar;
	private static ResultSet rs;
	private static int contador;

	public GestorSocios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel socio = new JLabel("Socio");
		socio.setBounds(20, 30, 46, 14);
		contentPane.add(socio);

		JLabel nombre = new JLabel("Nombre");
		nombre.setBounds(20, 55, 46, 14);
		contentPane.add(nombre);

		JLabel estatura = new JLabel("Estatura");
		estatura.setBounds(20, 80, 46, 14);
		contentPane.add(estatura);

		JLabel edad = new JLabel("Edad");
		edad.setBounds(20, 105, 46, 14);
		contentPane.add(edad);

		JLabel localidad = new JLabel("Localidad");
		localidad.setBounds(20, 130, 70, 14);
		contentPane.add(localidad);

		textSocio = new JTextField();
		textSocio.setBounds(90, 27, 46, 20);
		contentPane.add(textSocio);
		textSocio.setColumns(10);
		textSocio.setEditable(false);

		textNombre = new JTextField();
		textNombre.setBounds(90, 52, 167, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		textNombre.setEditable(false);

		textEstatura = new JTextField();
		textEstatura.setBounds(90, 77, 30, 20);
		contentPane.add(textEstatura);
		textEstatura.setColumns(10);
		textEstatura.setEditable(false);

		textEdad = new JTextField();
		textEdad.setBounds(90, 102, 25, 20);
		contentPane.add(textEdad);
		textEdad.setColumns(10);
		textEdad.setEditable(false);

		textNSocio = new JTextField();
		textNSocio.setBounds(180, 190, 66, 20);
		contentPane.add(textNSocio);
		textNSocio.setBorder(null);
		textNSocio.setColumns(50);
		textNSocio.setSize(100, 20);
		textNSocio.setEditable(false);

		textLocalidad = new JTextField();
		textLocalidad.setBounds(90, 130, 66, 20);
		contentPane.add(textLocalidad);
		textLocalidad.setSize(75, 20);
		textLocalidad.setColumns(10);
		textLocalidad.setEditable(false);

		JLabel cm = new JLabel("cm.");
		cm.setBounds(132, 80, 46, 14);
		contentPane.add(cm);

		JLabel anyos = new JLabel("años");
		anyos.setBounds(129, 105, 46, 14);
		contentPane.add(anyos);

		textBuscar = new JTextField();
		textBuscar.setBounds(330, 20, 86, 20);
		contentPane.add(textBuscar);
		textBuscar.setColumns(10);

		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(330, 51, 89, 23);
		btnBuscar.addActionListener(this);
		contentPane.add(btnBuscar);

		btnAnt = new JButton("Anterior");
		btnAnt.setBounds(127, 220, 89, 23);
		btnAnt.addActionListener(this);
		contentPane.add(btnAnt);
		btnAnt.setEnabled(false);

		btnSig = new JButton("Siguiente");
		btnSig.setBounds(220, 220, 89, 23);
		contentPane.add(btnSig);
		btnSig.addActionListener(this);
		btnSig.setEnabled(false);

		btnEdit = new JButton("Editar");
		btnEdit.setBounds(330, 160, 89, 23);
		btnEdit.addActionListener(this);
		contentPane.add(btnEdit);
		btnEdit.setEnabled(false);

		btnConfirm = new JButton("Confirmar");
		btnConfirm.setBounds(330, 220, 89, 23);
		contentPane.add(btnConfirm);
		btnConfirm.addActionListener(this);
		btnConfirm.setEnabled(false);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(330, 190, 89, 23);
		contentPane.add(btnCancelar);
		btnCancelar.addActionListener(this);
		btnCancelar.setEnabled(false);

		btnCrear = new JButton("Crear");
		btnCrear.setBounds(330, 130, 89, 23);
		contentPane.add(btnCrear);
		btnCrear.addActionListener(this);

		btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(330, 100, 89, 23);
		contentPane.add(btnBorrar);
		btnBorrar.addActionListener(this);
		btnBorrar.setEnabled(false);

	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestorSocios frame = new GestorSocios();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnBuscar) {
			contador = 0;
			AccesoBdatos abd = new AccesoBdatos();
			abd.conectar();
			String busqueda = textBuscar.getText();
			try {
				rs = abd.consultarPorLocalidad(busqueda);
				while (rs.next()) {
					contador++;
				}
				rs.first();
				textSocio.setText(Integer.toString(rs.getInt(1)));
				textNombre.setText(rs.getString(2));
				textEstatura.setText(Integer.toString(rs.getInt(3)));
				textEdad.setText(Integer.toString(rs.getInt(4)));
				textLocalidad.setText(rs.getString(5));
				textNSocio.setText("Socio " + rs.getRow() + " de " + contador);
				//faltaría desactivar los botones ant y sig si sólo hay 1 resultado
				btnAnt.setEnabled(true);
				btnSig.setEnabled(true);	
				
				btnCrear.setEnabled(false);
				btnBorrar.setEnabled(true);
				btnCancelar.setEnabled(true);
			} catch (SQLException e1) {
				JOptionPane.showMessageDialog(null, "No se encontraron socios de " + busqueda, "Mensaje",
						JOptionPane.INFORMATION_MESSAGE);
			}
			btnEdit.setEnabled(true);

		}
		if (e.getSource() == btnSig) {
			try {
				rs.next();
				textSocio.setText(Integer.toString(rs.getInt(1)));
				textNombre.setText(rs.getString(2));
				textEstatura.setText(Integer.toString(rs.getInt(3)));
				textEdad.setText(Integer.toString(rs.getInt(4)));
				textLocalidad.setText(rs.getString(5));
				textNSocio.setText("Socio " + rs.getRow() + " de " + contador);
			} catch (SQLException e1) {
				JOptionPane.showMessageDialog(null, "No existen registros posteriores", "Ultimo socio",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}
		if (e.getSource() == btnAnt) {
			try {
				rs.previous();
				textSocio.setText(Integer.toString(rs.getInt(1)));
				textNombre.setText(rs.getString(2));
				textEstatura.setText(Integer.toString(rs.getInt(3)));
				textEdad.setText(Integer.toString(rs.getInt(4)));
				textLocalidad.setText(rs.getString(5));
				textNSocio.setText("Socio " + rs.getRow() + " de " + contador);
			} catch (SQLException e1) {
				JOptionPane.showMessageDialog(null, "No existen registros anteriores", "Primer socio",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}
		if (e.getSource() == btnEdit) {
			textNombre.setEditable(true);
			textEstatura.setEditable(true);
			textEdad.setEditable(true);
			textLocalidad.setEditable(true);
			btnSig.setEnabled(false);
			btnAnt.setEnabled(false);
			btnBuscar.setEnabled(false);
			btnConfirm.setEnabled(true);
			btnCancelar.setEnabled(true);
		}
		if (e.getSource() == btnConfirm) {
			AccesoBdatos abd = new AccesoBdatos();

			if (textNombre.getText().isEmpty() || textEstatura.getText().isEmpty() || textEdad.getText().isEmpty()
					|| textLocalidad.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "No puede haber un campo vacío", "Advertencia",
						JOptionPane.WARNING_MESSAGE);
			} else if (btnCrear.isEnabled() && !btnEdit.isEnabled()) {
				String nombre = textNombre.getText();
				int estatura = Integer.valueOf(textEstatura.getText());
				int edad = Integer.valueOf(textEdad.getText());
				String localidad = textLocalidad.getText();
				abd.conectar();
				try {
					abd.crearSocio(nombre, estatura, edad, localidad);
					JOptionPane.showMessageDialog(null, "Socio creado con éxito", "Mensaje",
							JOptionPane.INFORMATION_MESSAGE);

					rs = abd.consultarPorLocalidad("");
					rs.last();
					textSocio.setText(Integer.toString(rs.getInt(1)));
					textNombre.setEditable(false);
					textEstatura.setEditable(false);
					textEdad.setEditable(false);
					textLocalidad.setEditable(false);
					btnSig.setEnabled(false);
					btnAnt.setEnabled(false);
					btnBuscar.setEnabled(true);
					btnConfirm.setEnabled(false);
					btnCancelar.setEnabled(false);
				} catch (SQLException e1) {
					System.out.println("Ha entrado en crear");
					e1.printStackTrace();
				}

			} else {
				String nombre = textNombre.getText();
				int estatura = Integer.valueOf(textEstatura.getText());
				int edad = Integer.valueOf(textEdad.getText());
				String localidad = textLocalidad.getText();
				int idSocio = Integer.valueOf(textSocio.getText());

				abd.conectar();
				try {
					abd.editarSocio(idSocio, nombre, estatura, edad, localidad);
					JOptionPane.showMessageDialog(null, "Cambios realizados con éxito", "Mensaje",
							JOptionPane.INFORMATION_MESSAGE);
					textNombre.setEditable(false);
					textEstatura.setEditable(false);
					textEdad.setEditable(false);
					textLocalidad.setEditable(false);

					btnSig.setEnabled(true);
					btnAnt.setEnabled(true);
					btnBuscar.setEnabled(true);
					btnConfirm.setEnabled(false);
					btnCancelar.setEnabled(false);
				} catch (SQLException e1) {
					System.out.println("ha entrado en editar");
					e1.printStackTrace();
				}
			}
		}
		if (e.getSource() == btnCancelar) {
			textNombre.setText(null);
			textNombre.setEditable(false);
			textEstatura.setEditable(false);
			textEstatura.setText(null);
			textEdad.setEditable(false);
			textEdad.setText(null);
			textLocalidad.setEditable(false);
			textLocalidad.setText(null);
			textSocio.setText(null);
			textNSocio.setText(null);
			btnSig.setEnabled(false);
			btnAnt.setEnabled(false);
			btnBuscar.setEnabled(true);
			btnConfirm.setEnabled(false);
			btnCancelar.setEnabled(false);
			btnBorrar.setEnabled(false);
			btnEdit.setEnabled(false);
			btnCrear.setEnabled(true);
		}
		if (e.getSource() == btnCrear) {
			textNombre.setEditable(true);
			textEstatura.setEditable(true);
			textEdad.setEditable(true);
			textLocalidad.setEditable(true);
			btnCancelar.setEnabled(true);
			btnConfirm.setEnabled(true);

		}
		if(e.getSource() == btnBorrar) {
			AccesoBdatos abd = new AccesoBdatos();
			abd.conectar();
			
			try {
				JOptionPane.showConfirmDialog(null, "¿Estás seguro de borrar al socio?", "Confirmar", JOptionPane.INFORMATION_MESSAGE);
				
				abd.borrarSocio(Integer.valueOf(textSocio.getText()));
				
				textNombre.setText(null);
				textNombre.setEditable(false);
				textEstatura.setEditable(false);
				textEstatura.setText(null);
				textEdad.setEditable(false);
				textEdad.setText(null);
				textLocalidad.setEditable(false);
				textLocalidad.setText(null);
				textSocio.setText(null);
				textNSocio.setText(null);
				btnSig.setEnabled(false);
				btnAnt.setEnabled(false);
				btnBuscar.setEnabled(true);
				btnConfirm.setEnabled(false);
				btnCancelar.setEnabled(false);
				btnBorrar.setEnabled(false);
				btnEdit.setEnabled(false);
				btnCrear.setEnabled(true);
				
				
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
