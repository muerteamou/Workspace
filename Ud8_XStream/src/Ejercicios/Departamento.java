package Ejercicios;

import java.io.Serializable;

public class Departamento implements Serializable{
	
	private int Numdepartamento;
	private String Nombre;
	private String Localidad;
	
	
	public Departamento() {}

	public Departamento(int numdepartamento, String nombre, String localidad) {
		Numdepartamento = numdepartamento;
		Nombre = nombre;
		Localidad = localidad;
	}
	public int getNumdepartamento() {
		return Numdepartamento;
	}

	public void setNumdepartamento(int numdepartamento) {
		Numdepartamento = numdepartamento;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getLocalidad() {
		return Localidad;
	}
	public void setLocalidad(String localidad) {
		Localidad = localidad;
	}
	
	@Override
	public String toString() {
		return "Departamento: Número: " + Numdepartamento + ", Nombre: " + Nombre + ", Localidad: " + Localidad;
	}


}
