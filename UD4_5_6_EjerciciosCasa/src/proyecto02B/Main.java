package proyecto02B;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<Papel> publicaciones = new ArrayList<Papel>();
		
		Iterator<Papel> it = publicaciones.iterator();
				
		Libro p1 = new Libro(1902, "batallitas", 2001);
		Revista p2 = new Revista(1911, "Galactica", 2002, 1);
		Libro l2 = new Libro(2003, "Mar adentro", 1979);
		//System.out.println(p1);
		//System.out.println(p2);
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
		//System.out.println(publicaciones.cuentaPrestados());
		System.out.println(cuentaPrestados(publicaciones));
		//cuentaPrestados(publicaciones);
		p1.devolver();
		//System.out.println(publicaciones.cuentaPrestados());
		l2.devolver();
		//System.out.println(publicaciones.cuentaPrestados());
		l2.devolver();
		
		System.out.println("Introduce un año: ");
		Scanner s = new Scanner(System.in);
		int anyo = s.nextInt();
		
		//System.out.println("Hay " + publicaciones.publicacionesAnterioresA(anyo) + " publicaciones anteriores a " + anyo);
	}
	private static int cuentaPrestados(Libro publi) {
		int contador=0;
		if (publi instanceof Libro) {
			for (Libro al : publi) {
				if(((Libro)al).esPrestado())
					contador++;
				}
			}
				return contador;		
				}
		}
								
		
			

		