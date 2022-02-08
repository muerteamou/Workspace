package proyecto03;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception {
		// Creamos un objeto de la clase Disco
		ArrayList<DiscoPrestable> lista = new ArrayList<DiscoPrestable>();

		DiscoPrestable d1 = new DiscoPrestable("Thriller", "Michael Jackson", "mp3", 90.5, "Pop, R&B");
		DiscoPrestable d2 = new DiscoPrestable("Greatest Hits I", "Queen", "flac", 100, "Rock");
		DiscoPrestable d3 = new DiscoPrestable("Rage Against the machine", "Rage Against the machine", "mp3", 110,
				"Rock, Rap metal");

		// Añadimos los objetos ya creados
		lista.add(d1);
		lista.add(d2);
		lista.add(d3);
		// prestamos 2 discos
		d1.prestar();
		d2.prestar();
		// mostramos cuantos discos hay prestados
		System.out.println("Actualmente hay " + cuentaPrestados(lista) + " discos prestados");		
	}

	public static int cuentaPrestados(ArrayList<DiscoPrestable> mm) {
		int contador = 0;
		for (DiscoPrestable tmp : mm) {
			if (tmp.esPrestado())
				contador++;
		}
		return contador;
	}

}
