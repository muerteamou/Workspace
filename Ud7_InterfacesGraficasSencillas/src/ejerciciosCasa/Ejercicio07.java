package ejerciciosCasa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*PISTA PR�CTICA 7
La primera interfaz por el bot�n, la segunda por el checkbox, nos centramos en esta �ltima
public class Practica7 extends JFrame implements ActionListener, ChangeListener{
....
private JCheckBox check1;
....

check1=new JCheckBox("Texto del checkbox");
check1.setBounds(10,50,100,30);
...
registrar el manejador
check1.addChangeListener(this);
...
----------------------------------------------------------------------------------
public void stateChanged(ChangeEvent e) {
       check1.isSelected()==true -->se ha puesto a true
.....
----------------------------------------------------------------------------------*/
public class Ejercicio07 extends JFrame implements ChangeListener {
	
	JButton continuar;
	JCheckBox check1;
	JLabel etiqueta1, etiqueta2;
	
	public Ejercicio07() {
		setTitle("Confirmar");
	    setLayout((null));
	    
	    etiqueta1=new JLabel("He leído el documento y estoy de acuerdo con las condiciones");
		etiqueta2=new JLabel("Acepto");
	    etiqueta1.setBounds(10, 20, 600,20);
	    add(etiqueta1);
	    etiqueta2.setBounds(50, 60, 60,20);
	    add (etiqueta2);
	    check1 = new JCheckBox();
	    check1.setBounds(10, 60, 20, 20);
		add(check1);
		continuar = new JButton("Continuar");
		continuar.setBounds(70, 100, 130, 20);
		add(continuar);
		continuar.setEnabled(false);
		check1.addChangeListener(this);			
	    setSize(500, 200);
	    setVisible(true);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		Ejercicio07 ventana = new Ejercicio07();
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		if(check1.isSelected()) {
			continuar.setEnabled(true);
		}
	}


}
