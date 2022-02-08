package proyecto03;

public class DiscoPrestable extends Disco implements Prestable{
	private boolean prestado;
	
	public DiscoPrestable(String titulo, String autor, String formato, double duracion, String genero) {
		super(titulo, autor, formato, duracion, genero);
		prestado=false;
	}

	@Override
	public void prestar() {
		if (!prestado)
			prestado=true;;
		
	}

	@Override
	public void devolver() {
		if(prestado)
			prestado=false;		
	}

	@Override
	public boolean esPrestado() {
		if(prestado)
			return prestado;
		else
			return false;
	}
	
}
