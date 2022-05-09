package Ejercicios;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Vista extends JFrame {
	/*********************ATRIBUTOS********************/
	//CONTENEDOR PRINCICIPAL
	private JPanel contentPane;
	
	//DEFINICIÓN DE LOS CUADROS DE TEXTO
	public JTextField textLocalidad, textNSocio, textBuscar, textSocio, textEdad, textEstatura, textNombre;
	
	//DEFINICION DE LOS BOTONES
	public JButton btnBuscar, btnAnt, btnSig, btnEdit, btnConfirm, btnCancelar, btnCrear, btnBorrar;
	
	//DEFINICION DE LAS ETIQUETAS	
	private JLabel socio, nombre, estatura, edad, localidad, cm, anyos;
	
	Vista() {
		//MÉTODOS DEL JFRAME
		setBounds(100, 100, 450, 300); //DEFINIR LAS DIMENSIONES DE LA VENTANA
		setTitle("GESTIÓN DE SOCIOS"); //BARRA DE TITULO
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ACCIÓN AL PULSAR SALIR
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		socio = new JLabel("Socio");
		socio.setBounds(20, 30, 46, 14);
		contentPane.add(socio);

		nombre = new JLabel("Nombre");
		nombre.setBounds(20, 55, 46, 14);
		contentPane.add(nombre);

		estatura = new JLabel("Estatura");
		estatura.setBounds(20, 80, 46, 14);
		contentPane.add(estatura);

		edad = new JLabel("Edad");
		edad.setBounds(20, 105, 46, 14);
		contentPane.add(edad);

		localidad = new JLabel("Localidad");
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

		cm = new JLabel("cm.");
		cm.setBounds(132, 80, 46, 14);
		contentPane.add(cm);

		anyos = new JLabel("años");
		anyos.setBounds(129, 105, 46, 14);
		contentPane.add(anyos);

		textBuscar = new JTextField();
		textBuscar.setBounds(330, 20, 86, 20);
		contentPane.add(textBuscar);
		textBuscar.setColumns(10);

		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(330, 51, 89, 23);
		contentPane.add(btnBuscar);

		btnAnt = new JButton("Anterior");
		btnAnt.setBounds(127, 220, 89, 23);
		contentPane.add(btnAnt);
		btnAnt.setEnabled(false);

		btnSig = new JButton("Siguiente");
		btnSig.setBounds(220, 220, 89, 23);
		contentPane.add(btnSig);
		btnSig.setEnabled(false);

		btnEdit = new JButton("Editar");
		btnEdit.setBounds(330, 160, 89, 23);
		contentPane.add(btnEdit);
		btnEdit.setEnabled(false);

		btnConfirm = new JButton("Confirmar");
		btnConfirm.setBounds(330, 220, 89, 23);
		contentPane.add(btnConfirm);
		btnConfirm.setEnabled(false);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(330, 190, 89, 23);
		contentPane.add(btnCancelar);
		btnCancelar.setEnabled(false);

		btnCrear = new JButton("Crear");
		btnCrear.setBounds(330, 130, 89, 23);
		contentPane.add(btnCrear);

		btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(330, 100, 89, 23);
		contentPane.add(btnBorrar);
		btnBorrar.setEnabled(false);
	
		// SE HACE VISIBLE LA VENTANA
		setVisible(true);
		
	}
		public void conectaControlador (Controller c) {
			btnBuscar.addActionListener(c);
			btnBuscar.setActionCommand("BUSCAR");
			
			btnAnt.addActionListener(c);
			btnAnt.setActionCommand("ANTERIOR");

			btnSig.addActionListener(c);
			btnSig.setActionCommand("SIGUIENTE");

			btnEdit.addActionListener(c);
			btnEdit.setActionCommand("EDITAR");
			
			btnConfirm.addActionListener(c);
			btnConfirm.setActionCommand("CONFIRMAR");
			
			btnCancelar.addActionListener(c);
			btnCancelar.setActionCommand("CANCELAR");
			
			btnCrear.addActionListener(c);
			btnCrear.setActionCommand("CREAR");

			btnBorrar.addActionListener(c);
			btnBorrar.setActionCommand("BORRAR");

	}
}
