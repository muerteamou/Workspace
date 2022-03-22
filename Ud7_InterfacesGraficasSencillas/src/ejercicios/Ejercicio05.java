package ejercicios;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejercicio05 extends JFrame{
	
	JFrame frame;
	JTextField tdato1 = new JTextField();
	JTextField tdato2;
	JTextField tresultado;
	
	public Ejercicio05() {
		super("Calculadora");
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		tdato1.setBounds(148, 114, 100, 20);
		frame.getContentPane().add(tdato1);
		tdato1.setColumns(10);
		
		tdato2 = new JTextField();
		tdato2.setColumns(10);
		tdato2.setBounds(148, 145, 100, 20);
		frame.getContentPane().add(tdato2);
		
		JLabel foto = new JLabel("");
		foto.setIcon(new ImageIcon("imagenes/calculadora.jpg"));
		foto.setBounds(138, 23, 130, 91);
		frame.getContentPane().add(foto);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.setBounds(278, 113, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.setBounds(278, 147, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("X");
		btnNewButton_2.setBounds(278, 181, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.setBounds(278, 215, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		tresultado = new JTextField();
		tresultado.setBounds(148, 182, 100, 20);
		frame.getContentPane().add(tresultado);
		tresultado.setEnabled(false);
		tresultado.setColumns(10);
		
		JLabel dato1 = new JLabel("Dato 1");
		dato1.setBounds(22, 117, 46, 14);
		frame.getContentPane().add(dato1);
		
		JLabel dato2 = new JLabel("Dato 2");
		dato2.setBounds(22, 151, 46, 14);
		frame.getContentPane().add(dato2);
		
		JLabel resultado = new JLabel("Resultado");
		resultado.setBounds(22, 185, 66, 14);
		frame.getContentPane().add(resultado);
		
		JButton salida = new JButton("");
		salida.setIcon(new ImageIcon("imagenes/puerta.jpg"));
		salida.setBounds(148, 215, 46, 55);
		frame.getContentPane().add(salida);
		
		JButton usuario = new JButton("");
		usuario.setIcon(new ImageIcon("imagenes/hombre.png"));
		usuario.setBounds(146, 281, 46, 55);
		frame.getContentPane().add(usuario);
		
	
	}

	public static void main(String[] args) {
		Ejercicio05 ventana = new Ejercicio05();
		ventana.frame.setVisible(true);
		ventana.frame.setTitle("Calculadora");

	}

}
