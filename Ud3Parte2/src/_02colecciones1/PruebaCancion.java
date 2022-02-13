package _02colecciones1;

public class PruebaCancion {

	public static void main(String[] args) {
		Cancion c1 = new Cancion();
		c1.ponTitulo("Bad");
		c1.ponAutor("Michael Jackson");
		System.out.println(c1);
		Cancion c2 = new Cancion("Thriller", "Michael Jackson");
		Cancion c3 = new Cancion("Billie Jean", "Michael Jackson");
		Cancion c4 = new Cancion("Levitating", "Dua Lipa");
		System.out.println(c2.dameTitulo());
		System.out.println(c4.dameAutor());
		System.out.println(c3);
	}

}
