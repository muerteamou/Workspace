package objetos;

public class PruebaLibro {

	public static void main(String[] args) {
		Libro l1 = new Libro();
		l1.setAutor("Alberto");
		Libro l2 = new Libro("1111", "Titulo 1", "Autor 1", 1111);
		System.out.println(l2);
	}

}
