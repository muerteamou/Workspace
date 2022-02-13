package _02colecciones1;

public class PruebaCD {

	public static void main(String[] args) {
		Cancion c1 = new Cancion();
		c1.ponTitulo("Bad");
		c1.ponAutor("Michael Jackson");
		System.out.println(c1);
		Cancion c2 = new Cancion("Thriller", "Michael Jackson");
		Cancion c3 = new Cancion("Billie Jean", "Michael Jackson");
		Cancion c4 = new Cancion("Levitating", "Dua Lipa");
		
		CD bad = new CD();
		CD thriller = new CD();
		CD future_nostalgia= new CD();
		bad.agrega(c1);
		
		System.out.println(bad);
		System.out.println(bad.numeroCanciones());
		
		
		thriller.agrega(c2);
		thriller.agrega(c3);
		if (future_nostalgia.agrega(c4))
			System.out.println("Se añadió la canción " + c4.dameTitulo());
		else
			System.out.println("La cancion no se a podido añadir.");
		
		//int posicion=0;
		//if (bad.dameCancion(posicion)==null)
			//System.out.println("No existe la cancion en la posicion " + posicion) ;
		System.out.println(bad.dameCancion(1));
		System.out.println(thriller);
		System.out.println(future_nostalgia);
		
	}

}
