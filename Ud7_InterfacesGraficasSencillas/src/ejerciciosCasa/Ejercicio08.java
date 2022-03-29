package ejerciciosCasa;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ejercicio08 extends JFrame implements ChangeListener{
	JCheckBox check1, check2, check3;
	JLabel etiqueta1, etiqueta2, etiqueta3, etiqueta4, etiqueta5;

	public Ejercicio08() {
		setTitle("Idiomas");
		setLayout((null));

		etiqueta1 = new JLabel("Inglés");
		etiqueta2 = new JLabel("Francés");
		etiqueta3 = new JLabel("Alemán");
		etiqueta4 = new JLabel("idiomas Seleccionados:");
		etiqueta5 = new JLabel("");
		etiqueta1.setBounds(40, 20, 60, 20);
		add(etiqueta1);
		etiqueta2.setBounds(40, 40, 60, 20);
		add(etiqueta2);
		etiqueta3.setBounds(40, 60, 60, 20);
		add(etiqueta3);
		etiqueta4.setBounds(10, 80, 150, 20);
		add(etiqueta4);
		Font fuente = new Font("Times New Roman", Font.PLAIN, 12);
		etiqueta5.setBounds(160, 80, 200, 25);
		etiqueta5.setFont(fuente);
		etiqueta5.setForeground(Color.blue);
		add(etiqueta5);
		check1 = new JCheckBox();
		check1.setBounds(10, 20, 20, 20);
		add(check1);
		check2 = new JCheckBox();
		check2.setBounds(10, 40, 20, 20);
		add(check2);
		check3 = new JCheckBox();
		check3.setBounds(10, 60, 20, 20);
		add(check3);
		check1.addChangeListener(this);
		check2.addChangeListener(this);
		check3.addChangeListener(this);
		setSize(500, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		Ejercicio08 ventana = new Ejercicio08();

	}

	@Override
	public void stateChanged(ChangeEvent e) {
		String cadena ="";
		if(check1.isSelected()) {
			cadena=cadena + (etiqueta1.getText());
			
		}
		
		if(check2.isSelected()) {
			cadena = cadena + " - " +(etiqueta2.getText());
			
		}
		if(check3.isSelected()) {
			cadena = cadena + " - " + (etiqueta3.getText());
			
		}
		etiqueta5.setText(cadena);
		
	}

}
