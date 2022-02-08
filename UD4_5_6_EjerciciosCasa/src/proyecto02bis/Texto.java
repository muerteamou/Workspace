package proyecto02bis;

public class Texto {
		private String titulo;
		private int isbn, anyo;
		
		
		public Texto(int isbn,String titulo,  int anyo) {
			this.titulo = titulo;
			this.isbn = isbn;
			this.anyo = anyo;
		}
		public String getTitulo() {
			return titulo;
		}

		@Override
		public String toString() {
			return titulo + "\nIsbn: " + isbn + "\nAño: " + anyo + "\n";
		}
		public int getIsbn() {
			return isbn;
		}
		
		public int getAnyo() {
			return anyo;
		}
		
		
		

}
