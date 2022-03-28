package ejercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ejercicio05 extends JFrame implements ActionListener {

	JFrame frame;
	JTextField tdato1;
	JTextField tdato2;
	JTextField tresultado;
	JButton botonMas, botonMenos, botonPor, botonDiv, salida, usuario;

	public Ejercicio05() {
		super("Calculadora");
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		tdato1 = new JTextField();
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

		botonMas = new JButton("+");
		botonMas.setBounds(278, 113, 89, 23);
		frame.getContentPane().add(botonMas);
		botonMas.addActionListener(this);

		botonMenos = new JButton("-");
		botonMenos.setBounds(278, 147, 89, 23);
		frame.getContentPane().add(botonMenos);
		botonMenos.addActionListener(this);

		botonPor = new JButton("X");
		botonPor.setBounds(278, 181, 89, 23);
		frame.getContentPane().add(botonPor);
		botonPor.addActionListener(this);

		botonDiv = new JButton("/");
		botonDiv.setBounds(278, 215, 89, 23);
		frame.getContentPane().add(botonDiv);
		botonDiv.addActionListener(this);

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

		salida = new JButton("");
		salida.setIcon(new ImageIcon("imagenes/puerta.jpg"));
		salida.setBounds(148, 215, 46, 55);
		frame.getContentPane().add(salida);
		salida.addActionListener(this);

		usuario = new JButton("");
		usuario.setIcon(new ImageIcon("imagenes/hombre.png"));
		usuario.setBounds(146, 281, 46, 55);
		frame.getContentPane().add(usuario);
		usuario.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==botonMas) {
			int num1 = Integer.parseInt(tdato1.getText());
			int num2 = Integer.parseInt(tdato2.getText());
			int suma = num1 + num2;
			tresultado.setText(Integer.toString(suma));
		}
		if(e.getSource()==botonMenos) {
			int num1 = Integer.parseInt(tdato1.getText());
			int num2 = Integer.parseInt(tdato2.getText());
			int resta = num1 - num2;
			tresultado.setText(Integer.toString(resta));
		}
		if(e.getSource()==botonDiv) {
			int num1 = Integer.parseInt(tdato1.getText());
			int num2 = Integer.parseInt(tdato2.getText());
			double division = num1/num2;
			tresultado.setText(Double.toString(division));
		}
		if(e.getSource()==botonPor) {
			int num1 = Integer.parseInt(tdato1.getText());
			int num2 = Integer.parseInt(tdato2.getText());
			int multi = num1*num2;
			tresultado.setText(Integer.toString(multi));
		}
		if(e.getSource()==salida) {
			System.exit(0);
		}
		if(e.getSource()==usuario) {
			JOptionPane.showMessageDialog(null, "Alejandro Piñero Medinilla");
		}
	}

	public static void main(String[] args) {
		Ejercicio05 ventana = new Ejercicio05();
		ventana.frame.setVisible(true);
		ventana.frame.setTitle("Calculadora");

	}

}
