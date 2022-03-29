package ejerciciosCasa;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Ejercicio06 extends JFrame implements ActionListener {
	
	Container panel;
	JButton color;
	JComboBox<Integer> rojo, verde, azul;
	JLabel etiqueta1, etiqueta2, etiqueta3 ;
	
	public Ejercicio06() {
		setTitle("Practicando con Combos");
	    panel = getContentPane();
	    panel.setLayout((null));
	    etiqueta1=new JLabel("Rojo:");
		etiqueta2=new JLabel("Verde:");
		etiqueta3=new JLabel("Azul:");
	    etiqueta1.setBounds(10, 20, 60,20);
	    panel.add(etiqueta1);
	    etiqueta2.setBounds(10, 60, 60,20);
	    panel.add (etiqueta2);
	    etiqueta3.setBounds(10, 100, 60,20);
	    panel.add (etiqueta3);
	    rojo = new JComboBox<Integer>();
	    rojo.setBounds(100, 20, 130, 20);
		panel.add(rojo);
		verde = new JComboBox<Integer>();
		verde.setBounds(100, 60, 130, 20);
		panel.add(verde);
		azul = new JComboBox<Integer>();
		azul.setBounds(100, 100, 130, 20);
		panel.add(azul);
		
		for(int i=0;i<=255;i++) {
			rojo.addItem(i);
			verde.addItem(i);
			azul.addItem(i);
		}
		
		color = new JButton("Color de fondo");
		color.setBounds(100, 140, 130, 20);
		panel.add(color);
		color.addActionListener(this);			
	    setSize(400, 250);
	    setVisible(true);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Ejercicio06 ventana = new Ejercicio06();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int red = (int) rojo.getSelectedItem();
		int green = (int) verde.getSelectedItem();
		int blue = (int) azul.getSelectedItem();
		Color col = new Color(red,green,blue);
		panel.setBackground(col);
		
	}

}
