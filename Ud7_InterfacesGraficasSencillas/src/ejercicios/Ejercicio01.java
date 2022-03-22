package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {
		
	
		String baseString= JOptionPane.showInputDialog("Introduzca la base");
		while (!isDouble(baseString)) {
			baseString = JOptionPane.showInputDialog(null,"Número no válido. Inténtelo otra vez");
		}
		Double base = Double.parseDouble(baseString);
		
		String alturaString = JOptionPane.showInputDialog("Introduce la altura");
		while (!isDouble(alturaString)) {
			alturaString = JOptionPane.showInputDialog(null, "Número no válido. Inténtelo otra vez");
		}
		Double altura = Double.parseDouble(alturaString);
		
		// faltaría controlar cuando pulsamos cancelar, que no tire error
		
		JOptionPane.showMessageDialog(null,"El área de la base " + base + " por la altura " + altura + " es " + base*altura);
	}
	
	private static boolean isDouble(String n) {
		try {
			Double.parseDouble(n);
			return true;
		}catch(NumberFormatException nfe) {
			return false;
		}
	}

}
