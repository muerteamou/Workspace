package ejerciciosCasa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Ejercicio09 extends JFrame implements ActionListener {
	JRadioButton radio1,radio2,radio3;
	ButtonGroup bg;
	
	public Ejercicio09() {
		setTitle("Ejemplo grupos de opción");
		setLayout(null);
		bg=new ButtonGroup();
		radio1=new JRadioButton("Linux");
        radio1.setBounds(10,20,100,30);
        radio1.addActionListener(this);
        add(radio1);
        bg.add(radio1);
        radio2=new JRadioButton("Windows");
        radio2.setBounds(10,70,100,30);
        radio2.addActionListener(this);        
        add(radio2);
        bg.add(radio2);
        radio3=new JRadioButton("Macintosh");
        radio3.setBounds(10,120,100,30);
        radio3.addActionListener(this);        
        add(radio3);
        bg.add(radio3);  
	}
	

	public static void main(String[] args) {
		Ejercicio09 ventana = new Ejercicio09();
		ventana.setBounds(0, 0 , 400, 300);
		ventana.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (radio1.isSelected()) {
			JOptionPane.showMessageDialog(this, "Has elegido Linux", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
		}
		if (radio2.isSelected()) {
			JOptionPane.showMessageDialog(this, "Has elegido Windows", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
		}
		if (radio3.isSelected()) {
			JOptionPane.showMessageDialog(this, "Has elegido Macintosh", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
