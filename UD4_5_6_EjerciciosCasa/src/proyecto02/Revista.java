package proyecto02;

public class Revista extends Papel{
	private int numero;
	
	
	public Revista(int isbn, String titulo, int anyo, int numero) {
		super(isbn, titulo, anyo);
		this.numero=numero;
			
		}
		

	@Override
	public String toString() {
		return "Revista: " + numero + "\nTítulo: " + titulo + "\nISBN: " + getIsbn() + "\nAño de publicación: "
				+ getAnyo();
	}
	
	

}
