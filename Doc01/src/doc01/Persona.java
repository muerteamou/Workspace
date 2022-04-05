package doc01;
/**
 * Clase Persona es para crear objetos que hacen referencia a personas
 * 
 * Nuestras personas sólo tienen una edad y un nombre.
 * 
 * @author Alejandro Piñero Medinilla
 * @version 1.0
 * 
 *
 */
public class Persona {
	
	int edad;
	String nombre;
	
	
	/**
	 * 
	 * @return Devuelve la edad como entero
	 */
	
	public int getEdad() {
		return edad;
	}
	/**
	 * Establece la edad pasada como entero. Esto solo hace {@code this.edad = edad;}
	 * @param edad es un entero y sin restricciones
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Persona [edad=" + edad + ", nombre=" + nombre + "]";
	}
	/**
	 * Método constructor con los parametros edad (entero) y nombre (String)
	 * @param edad es un entero y de momento no controlamos nada
	 * @param nombre sin restricciones.
	 */
	
	
	public Persona(int edad, String nombre) {
		super();
		this.edad = edad;
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
