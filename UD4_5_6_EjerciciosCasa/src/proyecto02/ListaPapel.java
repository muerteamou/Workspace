package proyecto02;

import java.util.ArrayList;

public class ListaPapel {
	ArrayList<Papel> kiosko;

	public ListaPapel() {
		kiosko = new ArrayList<Papel>();
	}

	public void addPapel(Papel texto) {
		kiosko.add(texto);
	}

	public int cuentaPrestados() {
		int sumador = 0;
		for (Papel tmp : kiosko) {
			if (tmp instanceof Libro) {
				if (((Libro) tmp).esPrestado()) {
					sumador++;
				}
			}
		}
		return sumador;
	}

	@Override
	public String toString() {
		String elementos="";
		for (Papel texto : kiosko) {
			elementos= elementos + texto.toString() + "\n"; 
		}
		return elementos;
	}
	
	public int publicacionesAnterioresA(int anyo) {
		int sumador=0;
		for(Papel txt : kiosko) {
			if (txt.getAnyo()<anyo)
				sumador++;
		}
		return sumador;
		}
	
}
