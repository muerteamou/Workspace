package proyecto01;

public class Main {

	public static void main(String[] args) throws Exception {
		Disco d1 = new Disco("Thriller", "Michael Jackson", "mp3", 90.5, "Pop, R&B");
		Pelicula p2 = new Pelicula("Interstellar", "Christopher Nolan", "mkv", 150, "Matthew McConaughey", "Anne Hathaway");
		ListaMultimedia listinMultimedia = new ListaMultimedia();
		listinMultimedia.addMultimedia(d1);
		listinMultimedia.addMultimedia(p2);
		listinMultimedia.addMultimedia(new Disco("Greatest Hits I", "Queen", "flac", 100, "Rock"));
		listinMultimedia.addMultimedia(
				new Disco("Rage Against the machine", "Rage Against the machine", "mp3", 110, "Rock, Rap metal"));
		listinMultimedia.addMultimedia(new Pelicula("Jurasic Park", "Steven Spielberg", "mp4", 125, "Sam Neill", null));
		listinMultimedia
				.addMultimedia(new Pelicula("Regreso al futuro", "Robert Zemeckis", "mkv", 95, "Michael J Fox", null));

		listinMultimedia.impLista();		// crear la clase ListaMultimedia con los metodos.

		listinMultimedia.duracionTotal();
		
		System.out.println("Hay en total " + listinMultimedia.cuantosRock() + " discos de Rock.");
		System.out.println(
				"Hay un total de " + listinMultimedia.cuantaSinActriz() + " peliculas sin actriz protagonista.");


	}

}
