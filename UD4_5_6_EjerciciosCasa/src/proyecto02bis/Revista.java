package proyecto02bis;

public class Revista extends Texto{
	private int numero;
	
	
	public Revista(int isbn, String titulo,  int anyo, int numero) {
		super(isbn, titulo,  anyo);
		this.numero=numero;
	}


	@Override
	public String toString() {
		return "Revista: numero " + numero + "\n" + super.toString();
	}


	


	

	

	
	
}
