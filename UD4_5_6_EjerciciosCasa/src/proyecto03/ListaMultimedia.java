package proyecto03;

import java.util.ArrayList;

public class ListaMultimedia {
	// creamos un ArrayList del objeto multimedia llamado listaMultimedia
	private ArrayList<Multimedia> listaMultimedia;

	// creamos el constructor por defecto
	public ListaMultimedia() {
		listaMultimedia = new ArrayList<Multimedia>();
	}

	//añadimos un objeto multimedia al ArrayList
	public void addMultimedia(Multimedia multimedia) {
		listaMultimedia.add(multimedia);
	}

	public void impLista() {
		System.out.println("Vamos a mostrar toda la lista de objetos multimedia\n");
		// vamos a recorrer cada objeto de la clase Multimedia que esté en
		// listaMultimedia
		for (Multimedia mm : listaMultimedia)
			// Gracias al polimorfismo, el método toString() será el correspondiente al de
			// cada objeto, he dejado preparado las cadenas para que quede bien formado
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

		for (Multimedia mm : listaMultimedia) { 	// rrecorrenmos el arraylist..
			if (mm instanceof Disco) { 				// comprobamos si es una instancia de disco
				if (((Disco) mm).getGenero().toLowerCase().contains("rock")) 	// Se hace un casteo del objeto Multimedia
					sumador++;														// a Disco, si getGenero contiene rock,
																				// añadimos 1	
			}
		}
		return sumador;
	}

	public int cuantaSinActriz() {
		int sumador = 0;
		for (Multimedia mm : listaMultimedia) {
			if (mm instanceof Pelicula) {
				if (((Pelicula) mm).getActrizP() == null)
					sumador++;
			}
		}
		return sumador;
	}
}
