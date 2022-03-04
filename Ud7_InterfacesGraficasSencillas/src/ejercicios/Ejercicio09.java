package ejercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class Ejercicio09 extends JFrame implements ActionListener{
	
	private JRadioButton linux, mac, win;
	private ButtonGroup bg;
	
	public Ejercicio09() {
		setTitle("Ejemplo grupos de opción");
		setLayout(null);
		bg = new ButtonGroup();
		linux = new JRadioButton("Linux");
		linux.setBounds(10, 10, 100, 30);
		linux.addActionListener(this);
		add(linux);
		bg.add(linux);
		win = new JRadioButton("Windows");
		win.setBounds(110, 10, 100, 30);
		win.addActionListener(this);
		add(win);
		bg.add(win);
		mac = new JRadioButton("Macintosh");
		mac.setBounds(210, 10, 100, 30);
		mac.addActionListener(this);
		add(mac);
		bg.add(mac);
		
	}
	

	public static void main(String[] args) {
		Ejercicio09 formulario = new Ejercicio09();
		formulario.setBounds(0,0,400,150);
		formulario.setVisible(true);

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (linux.isSelected()) {
            JOptionPane.showMessageDialog(this, "Elegiste Linux");
        }
        if (win.isSelected()) {
        	JOptionPane.showMessageDialog(this, "Elegiste Windows");
        }
        if (mac.isSelected()) {
        	JOptionPane.showMessageDialog(this, "Elegiste Macintosh");
        }
		
	}

}
