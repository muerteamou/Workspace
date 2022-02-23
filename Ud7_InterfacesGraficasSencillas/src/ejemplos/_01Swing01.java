package ejemplos;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class _01Swing01 extends JFrame {
  Container panel;
  JButton miboton;

  public _01Swing01() {
    super("Ejemplo 01 con botón");
    // Configurar componentes ;
    miboton = new JButton("Aceptar");
    panel = this.getContentPane();
    panel.add(miboton);
    setSize(200,100);
    setVisible(true);
  //  setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  @SuppressWarnings("unused")
public static void main(String args[]) {
    _01Swing01 ventana = new _01Swing01();
  }
}

