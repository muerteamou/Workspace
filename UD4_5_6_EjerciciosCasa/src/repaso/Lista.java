package repaso;

import java.util.ArrayList;

public class Lista {
	ArrayList<B> lista;

	public Lista() {
		lista = new ArrayList<B>();
	}

	public boolean insertar(B obj) {
		return lista.add(obj);
	}

	public void recorrer() {
		for (B tmp : lista)
			System.out.println(tmp);
	}

	public int cuentaZ() {
		int contador = 0;
		for (B tmp : lista)
			if (tmp instanceof Z)
				contador++;
		return contador;
	}
}
