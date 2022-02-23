package ejemplos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class _05Swing05 extends JFrame implements ActionListener {
  JButton boton;
  Container panel;

  public _05Swing05() {
    super("Ejemplo de eventos");
    panel = this.getContentPane();
    boton = new JButton("Pulsa!");
    panel.add(boton);
    boton.addActionListener(this); //añado el boton a la lista de eventos a comprobar y el this significa que se controla dentro de la propia clase
    setSize(400, 200);
    setVisible(true);
    
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public void actionPerformed(ActionEvent e) {  //ActionEvent espera la pulsación de botón
  //  Toolkit.getDefaultToolkit().beep();
	  JOptionPane.showMessageDialog(panel,
		      "Has pulsado el botón",
		      "Lo hiciste! ",
		       JOptionPane.INFORMATION_MESSAGE);
	  
  }

  @SuppressWarnings("unused")
public static void main(String args[]) {
    _05Swing05 ventana = new _05Swing05();
  }
}



