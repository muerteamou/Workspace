package proyecto01;

import java.util.ArrayList;

public class ListaMultimedia {
	private ArrayList<Multimedia> listaMultimedia;

	public ListaMultimedia() {
		listaMultimedia = new ArrayList<Multimedia>();
	}

	public void addMultimedia(Multimedia multimedia) {
		listaMultimedia.add(multimedia);
	}

	public void impLista() {
		System.out.println("Vamos a mostrar toda la lista de objetos multimedia\n");
		for (Multimedia mm : listaMultimedia)
			System.out.println(mm.toString());
	}

	public void duracionTotal() {
		double sumador = 0;
		for (Multimedia mm : listaMultimedia)
			sumador = sumador + mm.getDuracion();
		System.out.println("La duración total de contenido es de " + sumador + " minutos.");
	}

	public int cuantosRock() {
		int sumador = 0;

		for (Multimedia mm : listaMultimedia) {
			if (mm instanceof Disco) {
				if (((Disco) mm).getGenero().toLowerCase().contains("rock"))
					sumador++;
			}
		}
		return sumador;
	}

	public int cuantaSinActriz() {
		int sumador=0;
		for (Multimedia mm : listaMultimedia) {
			if (mm instanceof Pelicula) {
				if (((Pelicula) mm).getActrizP() == null)
					sumador++;
			}

		}
		return sumador;
	}
}
