package repasobis;

import java.util.ArrayList;

public class Lista {

	ArrayList<B> lista;

	public Lista() {
		lista = new ArrayList<B>();

	}

	public boolean insertar(B list) {
		return lista.add(list);
	}

	public void recorrer() {
		for (B b : lista) {
			System.out.println(b);
		}
	}
	public int cuentaZ() {
		int contador=0;
		for (B tmp: lista) {
			if (tmp instanceof Z) {
				contador++;
			}
		}return contador;
	}
}
