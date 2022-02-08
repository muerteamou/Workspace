package proyecto01;

import java.util.Objects;

public class Multimedia {
	private String titulo, autor, formato;
	private double duracion;
	
	public Multimedia(String titulo, String autor, String formato, double duracion) {
		this.titulo = titulo;
		this.autor= autor;
		this.formato = formato;
		this.duracion = duracion;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public String getFormato() {
		return formato;
	}

	public double getDuracion() {
		return duracion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(autor, titulo);
	}

	public boolean equals(Multimedia obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		return (autor.equalsIgnoreCase(obj.getAutor()) && titulo.equalsIgnoreCase(obj.getTitulo()));
	}

	public String toString() {
		return titulo + "\nAutor: " + autor + "\nFormato: " + formato + "\nDuracion: " + duracion;
	}
	
	
	
}
