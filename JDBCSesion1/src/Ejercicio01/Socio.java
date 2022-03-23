package Ejercicio01;

public class Socio {
	private int SocioID;
	private String nombre;
	private int estatura;
	private String localidad;
	private int edad;

	public Socio(int SocioID, String nombre, int estatura, int edad, String localidad) {
		this.SocioID = SocioID;
		this.nombre = nombre;
		this.estatura = estatura;
		this.edad = edad;
		this.localidad = localidad;
	}
	public Socio() {}

	public int getSocioID() {
		return SocioID;
	}

	public void setSocioID(int socioID) {
		SocioID = socioID;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEstatura() {
		return estatura;
	}

	public void setEstatura(int estatura) {
		this.estatura = estatura;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Socio nº " + SocioID + ". Nombre: " + nombre + " edad: " + edad + " estatura: " +estatura + " localidad: " + localidad;
	}
	
}
