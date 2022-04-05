package pregunta1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pregunta1 extends JFrame {
  Container panel;
  JButton btnComprobar;
  JTextField txtExpresion;
  JLabel lbl1;

  public Pregunta1() {
    
	panel = getContentPane();
    panel.setLayout((null));
	lbl1=new JLabel("Expresi�n");
	
    lbl1.setBounds(50, 20, 60,20);
    panel.add(lbl1);
   
    txtExpresion = new JTextField(5);
    txtExpresion.setBounds(120, 20, 90, 20);
	  panel.add(txtExpresion);
	 
	  btnComprobar = new JButton("Comprobar");
	  btnComprobar.setBounds(110, 60, 110, 20);
	  panel.add(btnComprobar);
	  btnComprobar.addActionListener(new OyenteBoton());
    setSize(320, 150);
    setTitle("Validador Binario");
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String args[]) {
    Pregunta1 ventana = new Pregunta1();
    
  }

  class OyenteBoton implements ActionListener {
    public void actionPerformed(ActionEvent e){
    	String cadena = txtExpresion.getText();
    	if(cadena.matches("[0-1]{8}")) {
			JOptionPane.showMessageDialog(null, cadena + " es un n�mero binario de 8 bits");
		}
		else
			JOptionPane.showMessageDialog(null, cadena + " no es un n�mero binario de 8 bits");
  
    }
  }
}



