package proyecto01;

public class Main {

	public static void main(String[] args) throws Exception {
		// Creamos un objeto de la clase Disco
		Disco d1 = new Disco("Thriller", "Michael Jackson", "mp3", 90.5, "Pop, R&B");
		
		// Creamos un objeto de la clsae Pelicula
		Pelicula p2 = new Pelicula("Interstellar", "Christopher Nolan", "mkv", 150, "Matthew McConaughey",
				"Anne Hathaway");
		
		// Creamos el ArrayList (lista de objetos)
		ListaMultimedia listaMM = new ListaMultimedia();
		
		//Añadimos los objetos ya creados
		listaMM.addMultimedia(d1);
		listaMM.addMultimedia(p2);
		
		//añadimos objetos añadiendo los parametros
		listaMM.addMultimedia(new Disco("Greatest Hits I", "Queen", "flac", 100, "Rock"));
		listaMM.addMultimedia(
				new Disco("Rage Against the machine", "Rage Against the machine", "mp3", 110, "Rock, Rap metal"));
		listaMM.addMultimedia(new Pelicula("Jurasic Park", "Steven Spielberg", "mp4", 125, "Sam Neill", null));
		listaMM.addMultimedia(new Pelicula("Regreso al futuro", "Robert Zemeckis", "mkv", 95, "Michael J Fox", null));

		listaMM.impLista(); // crear la clase ListaMultimedia con los metodos.

		listaMM.duracionTotal();

		System.out.println("Hay en total " + listaMM.cuantosRock() + " discos de Rock.");
		System.out.println("Hay un total de " + listaMM.cuantaSinActriz() + " peliculas sin actriz protagonista.");

	}

}
