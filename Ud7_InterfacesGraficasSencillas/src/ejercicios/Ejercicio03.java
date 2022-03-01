package ejercicios;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ejercicio03 extends JFrame{
	Container panel;
	JButton sumar, restar;
	JTextField num1, num2, resultado;
	JLabel etiqueta1, etiqueta2;
	
	public Ejercicio03() {
		super("Sumar y restar reales");
		panel = getContentPane();
		panel.setLayout(null);
		etiqueta1 = new JLabel("Número 1");
		etiqueta1.setBounds(10, 20, 60, 20);
		panel.add(etiqueta1);
		etiqueta2 = new JLabel("Número 2");
		etiqueta2.setBounds(10, 50, 60, 20);
		panel.add(etiqueta2);
		num1 = new JTextField(5);
		num1.setBounds(70, 20, 45, 20);
		panel.add(num1);
		num2 = new JTextField(5);
		num2.setBounds(70, 50, 45, 20);
		panel.add(num2);
		sumar = new JButton("+");
		sumar.setBounds(40, 90, 45, 20);
		panel.add(sumar);
		restar = new JButton("-");
		restar.setBounds(90, 90, 45,20);
		panel.add(restar);
		resultado = new JTextField(5);
		resultado.setBounds(150, 90, 45, 20);
		panel.add(resultado);
		resultado.setEditable(false);
		resultado.setForeground(Color.red);
		sumar.addActionListener(new OyenteBoton());
		restar.addActionListener(new OyenteBoton());
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		Ejercicio03 ventana = new Ejercicio03();

	}
	
	class OyenteBoton implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource()== sumar) {
				Double calculo = Double.parseDouble(num1.getText()) + Double.parseDouble(num2.getText());
				resultado.setText(calculo.toString());
			}else {
				Double calculo = Double.parseDouble(num1.getText()) - Double.parseDouble(num2.getText());
				resultado.setText(calculo.toString());
			}
				
			
		}
	}
	
	
	
}
