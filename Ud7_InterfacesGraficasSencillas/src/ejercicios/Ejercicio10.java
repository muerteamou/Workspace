package ejercicios;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejercicio10 extends JFrame{
	
	JFrame frame;
	JTextField tdato1 = new JTextField();
	JTextField tdato2;
	JTextField tresultado;
	
	public Ejercicio10() {
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
		setSize(400,400);
		
		
	}
	public static void main(String[] args) {
		Ejercicio10 calculadora = new Ejercicio10();
		calculadora.frame.setVisible(true);
		calculadora.frame.setTitle("Calculadora");

	}

}
