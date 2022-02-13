package objetos;

import java.util.Date;

public class Caballo {
	private String nombre;
	private String raza;
	private double peso;
	private Date fechaNac;
	private double velocidad;
	
	
	public Caballo() {
	}


	public Caballo(String nombre, String raza, double peso, Date fechaNac, 
		double velocidad) {
		this.nombre = nombre;
		this.raza = raza;
		this.peso = peso;
		this.fechaNac = fechaNac;
		this.velocidad = velocidad;
	}

	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}


	public Date getFechaNac() {
		return fechaNac;
	}


	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	
	public void relincha() {
		System.out.println("hihihihihihihihihihi");
	}
	
	public Caballo compite(Caballo contrincante) {
		if (this.velocidad> contrincante.velocidad) {
			return this;
		}
		else
			return contrincante;
		
	}


	@Override
	public String toString() {
		return "Caballo [nombre=" + nombre + ", raza=" + raza + ", peso=" + peso + ", fechaNac=" + fechaNac
				+ ", velocidad=" + velocidad + " Km/h]";
	}

	
	}
	
	
	

