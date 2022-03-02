package ejercicios;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Ejercicio04 extends JFrame {
	
	Container panel;
	JButton validar;
	JTextField user, pass;
	JLabel etiqueta1, etiqueta2;

	public Ejercicio04() {
		super("Iniciar sesion");
		panel = getContentPane();
		panel.setLayout(null);
		etiqueta1 = new JLabel("Usuario: ");
		etiqueta1.setBounds(10, 20, 60, 40);
		panel.add(etiqueta1);
		etiqueta2 = new JLabel("Contraseña: ");
		etiqueta2.setBounds(10, 50, 80, 40);
		panel.add(etiqueta2);
		user = new JTextField(5);
		user.setBounds(90, 20, 100, 20);
		panel.add(user);
		pass = new JPasswordField(5);
		pass.setBounds(90, 50, 100, 20);
		panel.add(pass);
		validar = new JButton("Validar");
		validar.setBounds(90, 90, 100, 20);
		panel.add(validar);
		//validar.addActionListener(new OyenteBoton());
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
}
		public static void main(String[] args) {
			Ejercicio04 ventana = new Ejercicio04();
	}

}
