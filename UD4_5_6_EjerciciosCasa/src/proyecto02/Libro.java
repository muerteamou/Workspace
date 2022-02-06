package proyecto02;

public class Libro extends Papel implements Prestable{
	private boolean prestado;
	
	public Libro(int isbn, String titulo, int anyo ) {
		super(isbn, titulo, anyo);
		prestado= false;
	}
	@Override
	public String toString() {
		return "Libro: " +  titulo + "\nISBN: " + getIsbn() + "\nAño de publicación: "
				+ getAnyo();
		
	}
	public boolean esPrestado() {
		if(prestado)
			return true;
		else
			return false;
	}
	public void prestar() {
		if(prestado)
			System.out.println("El libro ya está prestado");
		else
			prestado=true;
	}
	public void devolver() {
		if (prestado)
			prestado=false;
		else
			System.out.println("El libro no está prestado!");
	}
	
}
