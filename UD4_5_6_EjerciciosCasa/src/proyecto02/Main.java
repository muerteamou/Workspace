package proyecto02;

import java.util.Scanner;

public class Main {
	
	

	public static void main(String[] args) {
		ListaPapel listaPapel = new ListaPapel();
		
		Libro p1 = new Libro(1902, "batallitas", 2001);
		Revista p2 = new Revista(1911, "Galactica", 2002, 1);
		Libro l2 = new Libro(2003, "Mar adentro", 1979);
		//System.out.println(p1);
		//System.out.println(p2);
		listaPapel.addPapel(p1);
		listaPapel.addPapel(p2);
		listaPapel.addPapel(l2);		
		listaPapel.addPapel(new Libro(2010, "Apocalipsis", 1968));
		listaPapel.addPapel(new Revista(1900, "Muy computer", 1979, 2));
		
		Revista rev3 = new Revista(1910, "Muy linux", 1979, 3);
		listaPapel.addPapel(rev3);
		System.out.println(listaPapel);
		p1.prestar();
		l2.prestar();
		l2.prestar();
		System.out.println(listaPapel.cuentaPrestados());
		
		p1.devolver();
		System.out.println(listaPapel.cuentaPrestados());
		l2.devolver();
		System.out.println(listaPapel.cuentaPrestados());
		l2.devolver();
		
		System.out.println("Introduce un año: ");
		Scanner s = new Scanner(System.in);
		int anyo = s.nextInt();
		System.out.println("Hay " + listaPapel.publicacionesAnterioresA(anyo) + " publicaciones anteriores a " + anyo);
	}
	


}