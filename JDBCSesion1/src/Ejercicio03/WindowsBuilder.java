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
public class WindowsBuilder extends JFrame implements ActionListener {

	private JPanel contentPane;
	private static JTextField textLocalidad;
	private static JTextField textNombre;
	private static JTextField textEstatura;
	private static JTextField textEdad;
	private static JTextField textSocio;
	private static JTextField textBuscar;
	private static JTextField textNSocio;
	private static JButton btnBuscar, btnAnt, btnSig;
	private static ResultSet rs;
	private static int contador;

	public WindowsBuilder() {
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
		textNSocio.setBounds(190, 150, 66, 20);
		contentPane.add(textNSocio);
		textNSocio.setBorder(null);
		textNSocio.setColumns(50);
		textNSocio.setSize(100, 20);
		textNSocio.setEditable(false);

		textLocalidad = new JTextField();
		textLocalidad.setBounds(90, 130, 66, 20);
		contentPane.add(textLocalidad);
		textLocalidad.setColumns(10);
		textLocalidad.setEditable(false);

		JLabel cm = new JLabel("cm.");
		cm.setBounds(132, 80, 46, 14);
		contentPane.add(cm);

		JLabel anyos = new JLabel("años");
		anyos.setBounds(129, 105, 46, 14);
		contentPane.add(anyos);

		textBuscar = new JTextField();
		textBuscar.setBounds(338, 20, 86, 20);
		contentPane.add(textBuscar);
		textBuscar.setColumns(10);

		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(338, 51, 89, 23);
		btnBuscar.addActionListener(this);
		contentPane.add(btnBuscar);

		btnAnt = new JButton("Anterior");
		btnAnt.setBounds(127, 200, 89, 23);
		btnAnt.addActionListener(this);
		contentPane.add(btnAnt);
		btnAnt.setEnabled(false);

		btnSig = new JButton("Siguiente");
		btnSig.setBounds(249, 200, 89, 23);
		contentPane.add(btnSig);
		btnSig.addActionListener(this);
		btnSig.setEnabled(false);

	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowsBuilder frame = new WindowsBuilder();
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
				textSocio.setText(Integer.toString(rs.getInt("socioID")));
				textNombre.setText(rs.getString("nombre"));
				textEstatura.setText(Integer.toString(rs.getInt("estatura")));
				textEdad.setText(Integer.toString(rs.getInt("edad")));
				textLocalidad.setText(rs.getString("localidad"));
				textNSocio.setText("Socio " + rs.getRow() + " de " + contador);
				btnAnt.setEnabled(true);
				btnSig.setEnabled(true);
			} catch (SQLException e1) {
				JOptionPane.showMessageDialog(null, "No se encontraron socios de " + busqueda, "Mensaje",
						JOptionPane.INFORMATION_MESSAGE);
			}

		}
		if (e.getSource() == btnSig) {
			try {
				rs.next();
				textSocio.setText(Integer.toString(rs.getInt("socioID")));
				textNombre.setText(rs.getString("nombre"));
				textEstatura.setText(Integer.toString(rs.getInt("estatura")));
				textEdad.setText(Integer.toString(rs.getInt("edad")));
				textLocalidad.setText(rs.getString("localidad"));
				textNSocio.setText("Socio " + rs.getRow() + " de " + contador);
			} catch (SQLException e1) {
				JOptionPane.showMessageDialog(null, "No existen registros posteriores", "Ultimo socio",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}
		if (e.getSource() == btnAnt) {
			try {
				rs.previous();
				textSocio.setText(Integer.toString(rs.getInt("socioID")));
				textNombre.setText(rs.getString("nombre"));
				textEstatura.setText(Integer.toString(rs.getInt("estatura")));
				textEdad.setText(Integer.toString(rs.getInt("edad")));
				textLocalidad.setText(rs.getString("localidad"));
				textNSocio.setText("Socio " + rs.getRow() + " de " + contador);
			} catch (SQLException e1) {
				JOptionPane.showMessageDialog(null, "No existen registros anteriores", "Primer socio",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}

}
