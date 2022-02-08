package proyecto02bis;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Texto> listat = new ArrayList<Texto>();

		Libros p1 = new Libros(1902, "batallitas", 2001);
		Revista p2 = new Revista(1911, "Galactica", 2002, 1);
		Libros l2 = new Libros(2003, "Mar adentro", 1979);
		// System.out.println(p1);
		// System.out.println(p2);
		listat.add(p1);
		listat.add(p2);
		listat.add(l2);
		listat.add(new Libros(2010, "Apocalipsis", 1968));
		listat.add(new Revista(1900, "Muy computer", 1979, 2));

		Revista rev3 = new Revista(1910, "Muy linux", 1979, 3);
		listat.add(rev3);
		System.out.println(listat);
		p1.prestar();
		l2.prestar();


		System.out.println(cuentaPrestados(listat));
		// cuentaPrestados(publicaciones);
		p1.devolver();
		// System.out.println(publicaciones.cuentaPrestados());
		l2.devolver();
		// System.out.println(publicaciones.cuentaPrestados());
		l2.devolver();
		System.out.println(cuentaPrestados(listat));

		int anyo = 1980;

		System.out.println("Hay " + publicacionesAnterioresA(listat, anyo) + " publicaciones anteriores al año " + anyo);

	}

	public static int cuentaPrestados(ArrayList<Texto> lista) {
		int sumador = 0;
		for (Texto txt : lista) {
			if (txt instanceof Libros) {
				if (((Libros) txt).prestado())
					sumador++;
			}
		}
		return sumador;
	}

	public static int publicacionesAnterioresA(ArrayList<Texto> lista, int anyo){
		int sumador=0;
		for (Texto txt : lista) {
			if(txt.getAnyo()<anyo)
					sumador++;
			}return sumador;
		}
	
}