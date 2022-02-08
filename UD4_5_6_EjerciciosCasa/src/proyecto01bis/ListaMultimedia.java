package proyecto01bis;

import java.util.ArrayList;

public class ListaMultimedia {

	private ArrayList<Multimedia> lista;

	public ListaMultimedia() {
		lista = new ArrayList<Multimedia>();
	}

	public void addMM(Multimedia mm) {
		lista.add(mm);
	}

	public void impLista() {
		for (Multimedia tmp : lista) {
			System.out.println(tmp.toString());
		}
	}

	public double duracionTotal() {
		double sumador = 0;
		for (Multimedia tmp : lista) {
			sumador = sumador + tmp.getDuracion();
		}
		return sumador;
	}

	public int cuantosRock() {
		int sumador = 0;
		for (Multimedia tmp : lista) {
			if (tmp instanceof Disco) {
				if (((Disco) tmp).getGenero().toLowerCase().contains("rock"))
					sumador++;
			}
		}
		return sumador;
	}

	public int cuantasSinActriz() {
		int sumador = 0;
		for (Multimedia mm : lista) {
			if (mm instanceof Pelicula) {
				if (((Pelicula) mm).getActrizP() == null)
				sumador++;
			}
		}
		return sumador;
	}

	public int cuantaSinActriz() {
		int sumador = 0;
		for (Multimedia mm : lista) {
			if (mm instanceof Pelicula) {
				if (((Pelicula) mm).getActrizP() == null)
					sumador++;
			}
		}
		return sumador;
	}

}
