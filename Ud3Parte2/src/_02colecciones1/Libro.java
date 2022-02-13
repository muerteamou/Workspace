package _02colecciones1;

/*Crea una clase Libro que modele la informaci�n que se mantiene en una biblioteca sobre cada libro:
 * t�tulo,autor(usa la clase Persona),ISBN,p�ginas,edici�n,editorial,lugar(ciudad y pa�s)y fecha de edici�n
 * (usa la clase Fecha).La clase debe proporcionar los siguientes servicios:getters y setters,m�todo para leer
 *  la informaci�n y m�todo para mostrar la informaci�n.Este �ltimo m�todo mostrar� la informaci�n del libro 
 *  con este formato:
*/
public class Libro {
	private String titulo;
	private Persona autor; 
	private String isbn;
	private int paginas;
	private int edicion;
	private String editorial;
	private String lugar;
	private Fecha fecha_edic;
	
	
	public void leer() {
		System.out.println("Introduce el T�tulo: ");
		titulo = MyInput.readString();
		System.out.println("Introduce el autor: ");
		autor.leerAutor();
		
		
	}
	
	public Libro() {
		titulo = new String ("");
		autor = new Persona();
		isbn= new String ("");
		paginas = 0;
		edicion =0;
		editorial = new String("");
		lugar = new String("");
		fecha_edic = new Fecha();
	}
	
	public Libro (String titulo, Persona autor, String isbn, int paginas, int edicion, String editorial, String lugar, Fecha fecha_edic) {
		this.titulo= titulo;
		this.autor= new Persona();
		this.isbn= isbn;
		this.paginas = paginas;
		this.edicion = edicion;
		this.editorial = editorial;
		this.lugar = lugar;
		this.fecha_edic = new Fecha();
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Persona getAutor() {
		return autor;
	}
	public void setAutor(Persona autor) {
		this.autor = autor;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public int getEdicion() {
		return edicion;
	}
	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public Fecha getFecha_edic() {
		return fecha_edic;
	}
	public void setFecha_edic(Fecha fecha_edic) {
		this.fecha_edic = fecha_edic;
	}

	
	
	public String toString() {
		return "T�tulo: " + titulo + "\n" + 
				edicion + " edici�n.\n" +
				"Autor: " + autor.nombreCompleto() + "\n" +
				"ISBN: " + isbn + "\n" + 
				 editorial + ", " + lugar + ", " + fecha_edic + 
				"\n" + paginas + " p�ginas" + "\n" ;
	}
	
}
