package proyecto02bis;

public class Libros extends Texto implements Prestable {
	private boolean prestado;

	public Libros( int isbn,String titulo, int anyo) {
		super(isbn, titulo, anyo);
		prestado = false;
	}

	@Override
	public void prestar() {
		prestado = true;

	}

	@Override
	public void devolver() {
		prestado = false;

	}

	@Override
	public String toString() {
		return "Libro: " + super.toString();
	}

	@Override
	public boolean prestado() {
		if (prestado)
			return true;
		else
			return false;
	}

}
