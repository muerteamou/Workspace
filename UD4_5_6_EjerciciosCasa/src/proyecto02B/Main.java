package proyecto02B;

import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		ArrayList<Papel> publicaciones = new ArrayList<Papel>();

		Libro p1 = new Libro(1902, "batallitas", 2001);
		Revista p2 = new Revista(1911, "Galactica", 2002, 1);
		Libro l2 = new Libro(2003, "Mar adentro", 1979);
		// System.out.println(p1);
		// System.out.println(p2);
		publicaciones.add(p1);
		publicaciones.add(p2);
		publicaciones.add(l2);
		publicaciones.add(new Libro(2010, "Apocalipsis", 1968));
		publicaciones.add(new Revista(1900, "Muy computer", 1979, 2));

		Revista rev3 = new Revista(1910, "Muy linux", 1979, 3);
		publicaciones.add(rev3);
		System.out.println(publicaciones);
		p1.prestar();
		l2.prestar();
		l2.prestar();
		
		System.out.println(cuentaPrestados(publicaciones));
		// cuentaPrestados(publicaciones);
		p1.devolver();
		// System.out.println(publicaciones.cuentaPrestados());
		l2.devolver();
		// System.out.println(publicaciones.cuentaPrestados());
		l2.devolver();
		System.out.println(cuentaPrestados(publicaciones));

		int anyo = 1980;

		System.out.println("Hay "+ publicacionesAnterioresA(publicaciones, anyo)+ " publicaciones anteriores al año " + anyo);

		// System.out.println("Hay " + publicaciones.publicacionesAnterioresA(anyo) + "
		// publicaciones anteriores a " + anyo);
	}

	public static int cuentaPrestados(ArrayList<Papel> publi) {
		int contador = 0;
		for (Papel al : publi) {
			if (al instanceof Libro) {
				if (((Libro) al).esPrestado())
					contador++;
			}
		}
		return contador;
	}

	public static int publicacionesAnterioresA(ArrayList<Papel> publi, int anyo) {
		int contador = 0;
		for (Papel al : publi) {
			if (al.getAnyo() < anyo) {
				contador++;
			}
		}
		return contador;
	}

}
