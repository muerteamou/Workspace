package proyecto03;

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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Multimedia other = (Multimedia) obj;
		return (this.autor.equalsIgnoreCase(other.getAutor()) && this.titulo.equalsIgnoreCase(other.getTitulo()));
	}

	@Override
	public String toString() {
		return titulo + "\nAutor: " + autor + "\nFormato: " + formato + "\nDuracion: " + duracion;
	}
	
	
	
}
