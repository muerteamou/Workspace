package proyecto02;

public class Papel {
	private int isbn, anyo;
	
	String titulo;
	
	public Papel(int isbn, String titulo, int anyo) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.anyo = anyo;
	}

	public int getIsbn() {
		return isbn;
	}

	public int getAnyo() {
		return anyo;
	}
}
