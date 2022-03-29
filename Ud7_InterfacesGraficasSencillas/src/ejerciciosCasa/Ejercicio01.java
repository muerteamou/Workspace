package ejerciciosCasa;

import javax.swing.JOptionPane;

public class Ejercicio01 {
	
	public static boolean isDouble(String s) {
		try {
		Double.parseDouble(s);
		return true;
		}catch (NumberFormatException e) {
			return false;
		}
	}

	public static void main(String[] args) {
		String baseString = JOptionPane.showInputDialog("Introduzca la base");
		while(!isDouble(baseString)) {
			baseString = JOptionPane.showInputDialog(null,"Número inválido para la base. Inténtelo otra vez.");
		}
		Double base = Double.parseDouble(baseString);
		String alturaString = JOptionPane.showInputDialog("Introduce la altura");
		while(!isDouble(alturaString)) {
			alturaString = JOptionPane.showInputDialog(null,"Número inválido para la altura. Inténtelo otra vez.");
		}
		Double altura = Double.parseDouble(alturaString);
		
		JOptionPane.showMessageDialog(null, "El área de la base " + base + " por la altura " + altura+ " es " + base*altura, "Resultado", JOptionPane.INFORMATION_MESSAGE);
	}

}
