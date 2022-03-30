package Ejercicio03;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class WindowsBuilder extends JFrame {

	private JPanel contentPane;
	private JTextField textLocalidad;
	private JTextField textNombre;
	private JTextField textEstatura;
	private JTextField textEdad;
	private JTextField textSocio;
	private JTextField textBuscar;

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

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(338, 51, 89, 23);
		contentPane.add(btnBuscar);
		
		JButton btnAnterior = new JButton("Anterior");
		btnAnterior.setBounds(127, 182, 89, 23);
		contentPane.add(btnAnterior);
		btnAnterior.setEnabled(false);
		

		JButton btnSig = new JButton("Siguiente");
		btnSig.setBounds(249, 182, 89, 23);
		contentPane.add(btnSig);
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

}
