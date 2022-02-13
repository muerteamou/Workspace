package _02colecciones1;

public class Cancion {
	private String titulo;
	private String autor;
	
	//este es el constructor predeterminado
	public Cancion() {
		titulo = new String("");
		autor = new String("");
	}
	
	// constructor parametrizado
	public Cancion (String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;				
	}
	
	//
	public String dameTitulo() {return titulo;}
	
	@Override
	public String toString() {
		return "Cancion: " + titulo + "\nAutor: " + autor;
	}

	public String dameAutor() {return autor;}
	
	public void ponTitulo(String titulo) { this.titulo= titulo;	}
	
	public void ponAutor(String autor) { this.autor = autor;}
}// de la clase cancion
