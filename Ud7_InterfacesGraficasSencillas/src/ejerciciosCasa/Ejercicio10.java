package ejerciciosCasa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class Ejercicio10 extends JFrame implements ActionListener {
	JMenuBar mb;
	JMenu menu1,menu2;
	JMenuItem mi1,mi2,mi3,mi4,mi5,mi6;
	JLabel teclado, etiqueta1, etiqueta2, etiqueta3;
	JTextField dato1, dato2, resultado;
   
	public Ejercicio10() {
		setTitle("Calculadora");
		setBounds(100, 100, 415, 307);
		setLayout(null);
		
		teclado = new JLabel("");
		teclado.setBounds(102, 2, 260, 60);
		ImageIcon iconoCalculadora =new ImageIcon("imagenes/calculadora.jpg");
		teclado.setIcon(iconoCalculadora);
		add(teclado);
		
		etiqueta1 = new JLabel("Dato 1:");
		etiqueta1.setBounds(10, 68, 69, 14);
		add(etiqueta1);
		
		etiqueta2 = new JLabel("Dato 2:");
		etiqueta2.setBounds(10, 93, 69, 14);
		add(etiqueta2);
		
		etiqueta3 = new JLabel("Resultado:");
		etiqueta3.setBounds(10, 118, 69, 14);
		add(etiqueta3);
		
		dato1 = new JTextField();
		dato1.setBounds(107, 65, 86, 20);
		add(dato1);
		
		dato2 = new JTextField();
		dato2.setBounds(107, 90, 86, 20);
		add(dato2);
		
		resultado = new JTextField();
		resultado.setEditable(false);
		resultado.setBounds(107, 115, 86, 20);
		add(resultado);
		
		mb=new JMenuBar();
	    setJMenuBar(mb);
	    menu1=new JMenu("Operaciones");
	    mb.add(menu1);
	    menu2=new JMenu("Aplicación");
	    mb.add(menu2);
	    mi1=new JMenuItem("Sumar");
	    menu1.add(mi1);
	    mi1.addActionListener(this);
	    mi2=new JMenuItem("Restar");
	    menu1.add(mi2);
	    mi2.addActionListener(this);
	    mi3=new JMenuItem("Multiplicar");
	    menu1.add(mi3);
	    mi3.addActionListener(this);
	    mi4=new JMenuItem("Dividir");
	    menu1.add(mi4);
	    mi4.addActionListener(this);
	    mi5=new JMenuItem("Salir");
	    menu2.add(mi5);
	    mi5.addActionListener(this);
	    mi6=new JMenuItem("About");
	    menu2.add(mi6);
	    mi6.addActionListener(this);
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		Ejercicio10 ventana = new Ejercicio10();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==mi1) {
			int n1 = Integer.parseInt(dato1.getText());
			int n2 = Integer.parseInt(dato2.getText());
			resultado.setText(Integer.toString(n1+n2));
		}
		if(e.getSource()==mi2) {
			int n1 = Integer.parseInt(dato1.getText());
			int n2 = Integer.parseInt(dato2.getText());
			resultado.setText(Integer.toString(n1-n2));
		}
		if(e.getSource()==mi3) {
			int n1 = Integer.parseInt(dato1.getText());
			int n2 = Integer.parseInt(dato2.getText());
			resultado.setText(Integer.toString(n1*n2));
		}
		if(e.getSource()==mi4) {
			int n1 = Integer.parseInt(dato1.getText());
			int n2 = Integer.parseInt(dato2.getText());
			resultado.setText(Integer.toString(n1/n2));
		}
	}

}
