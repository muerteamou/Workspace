package objetos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class PruebaZona {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Zona principal = new Zona(1000);
		Zona cv = new Zona(200);
		Zona vip = new Zona(25);

		int menu1;
		int menu2;

		do {
			menu1 = Integer.parseInt(JOptionPane.showInputDialog(
					"Expocoches DAM:\nElige una opción:\n 1. Mostrar número de entradas libres.\n2. Vender entradas.\n3. Salir."));

			if (menu1 == 1) {
				JOptionPane.showMessageDialog(null,
						"En la zona principal quedan " + principal.getEntradasPorVender()
								+ "\nEn la zona de compra-venta quedan " + cv.getEntradasPorVender()
								+ "\nEn la zona VIP quedan " + vip.getEntradasPorVender());
			}
			if (menu1 == 2) {
				int cantidadEntradas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas entradas quieres?"));
				menu2 = Integer
						.parseInt(JOptionPane.showInputDialog("Elige una zona: \n1.Principal\n2.Compra-venta\n3.Vip"));
				if (menu2 == 1) {
					principal.vender(cantidadEntradas);
				}
				if (menu2 == 2) {
					cv.vender(cantidadEntradas);
				}
				if (menu2 == 3) {
					vip.vender(cantidadEntradas);
				}

			}

		} while (menu1 != 3);
		JOptionPane.showMessageDialog(null, "Gracias");
		s.close();
	}
}
