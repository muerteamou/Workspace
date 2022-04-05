package Ejercicio03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
	
	
public class ConsultaSocio extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	private static JPanel contentPane;
	private static JTextField textLocalidad;
	private static JTextField textNombre;
	private static JTextField textEstatura;
	private static JTextField textEdad;
	private static JTextField textSocio;
	private static JTextField textBuscar;
	private JButton btnBuscar, btnAnterior, btnSig;
	private static JFrame frame;
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database = "baloncesto";
	private static String hostname = "localhost";
	private static String port = "3308";
	private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database
			+ "?serverTimezone=Europe/Madrid";
	private static String username = "root";
	private static String password = "root";

	public static Connection conecta;
	
	public ConsultaSocio() {
		
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 450, 300);
		frame.setVisible(true);
		frame.setLayout(null);
		
		/*
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setVisible(true);
		add(contentPane);
		*/
		
		JLabel socio = new JLabel("Socio");
		socio.setBounds(20, 30, 46, 14);
		frame.add(socio);

		JLabel nombre = new JLabel("Nombre");
		nombre.setBounds(20, 55, 46, 14);
		frame.add(nombre);

		JLabel estatura = new JLabel("Estatura");
		estatura.setBounds(20, 80, 46, 14);
		frame.add(estatura);

		JLabel edad = new JLabel("Edad");
		edad.setBounds(20, 105, 46, 14);
		frame.add(edad);

		JLabel localidad = new JLabel("Localidad");
		localidad.setBounds(20, 130, 70, 14);
		frame.add(localidad);

		textSocio = new JTextField();
		textSocio.setBounds(90, 27, 46, 20);
		frame.add(textSocio);
		textSocio.setColumns(10);
		textSocio.setEditable(false);
		
		textNombre = new JTextField();
		textNombre.setBounds(90, 52, 167, 20);
		frame.add(textNombre);
		textNombre.setColumns(10);
		textNombre.setEditable(false);
		
		textEstatura = new JTextField();
		textEstatura.setBounds(90, 77, 30, 20);
		frame.add(textEstatura);
		textEstatura.setColumns(10);
		textEstatura.setEditable(false);
		
		textEdad = new JTextField();
		textEdad.setBounds(90, 102, 25, 20);
		frame.add(textEdad);
		textEdad.setColumns(10);
		textEdad.setEditable(false);
		
		textLocalidad = new JTextField();
		textLocalidad.setBounds(90, 130, 66, 20);
		frame.add(textLocalidad);
		textLocalidad.setColumns(10);
		textLocalidad.setEditable(false);

		JLabel cm = new JLabel("cm.");
		cm.setBounds(132, 80, 46, 14);
		frame.add(cm);

		JLabel anyos = new JLabel("años");
		anyos.setBounds(129, 105, 46, 14);
		frame.add(anyos);

		textBuscar = new JTextField();
		textBuscar.setBounds(338, 20, 86, 20);
		frame.add(textBuscar);
		textBuscar.setEnabled(true);
		textBuscar.setColumns(10);

		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(338, 51, 89, 23);
		btnBuscar.setEnabled(true);
		frame.add(btnBuscar);
		btnBuscar.addActionListener(this);
		
		btnAnterior = new JButton("Anterior");
		btnAnterior.setBounds(127, 182, 89, 23);
		frame.add(btnAnterior);
		btnAnterior.setEnabled(false);
		btnAnterior.addActionListener(this);
		
		btnSig = new JButton("Siguiente");
		btnSig.setBounds(249, 182, 89, 23);
		frame.add(btnSig);
		btnSig.setEnabled(false);
		btnSig.addActionListener(this);
	}

	public static void conectar() {
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
	
	public static void consultarPorLocalidad() throws SQLException {
		// Preparamos la consulta
		Statement consulta = conecta.createStatement();
		// Establecemos la consulta base por si no se introduce la localidad
		String cadenaSQL = "SELECT * FROM socio";
		//Establecemos la consulta añadiendo a la anterior la localidad
		if(!textBuscar.getText().isEmpty()) {
			cadenaSQL = cadenaSQL + " WHERE localidad = '" + textBuscar.getText() + "'";
		}
		System.out.println(cadenaSQL);
		ResultSet rs = consulta.executeQuery(cadenaSQL);
		while (rs.next()) {
			rs.first();
			textSocio.setText(Integer.toString(rs.getInt("socioID")));;
			textNombre.setText(rs.getString("nombre"));
			textEstatura.setText(Integer.toString(rs.getInt("estatura")));
			textEdad.setText(Integer.toString(rs.getInt("edad")));
			textLocalidad.setText(rs.getString("localidad"));
		}
		
		consulta.close();
	}
			
	
	public static void main(String[] args) throws SQLException {
		ConsultaSocio ventana = new ConsultaSocio();
		ventana.setVisible(true);
		conectar();
		
		}



	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnBuscar) {
			try {
				consultarPorLocalidad();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}return;
		}
		
	}
	
}
