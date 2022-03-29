package Ejercicios;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Cliente implements Serializable{

	private String nombre;
	private String telefono;
	private String direccion;
	private String nif;
	private Boolean moroso;
		
	public Cliente() {
	}

	public Cliente(String nombre, String telefono, String direccion, String nif, Boolean moroso) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.nif = nif;
		this.moroso = moroso;
	}

	public String getNombre() {
		return nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getNif() {
		return nif;
	}

	public Boolean getMoroso() {
		return moroso;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public void setMoroso(Boolean moroso) {
		this.moroso = moroso;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + ", nif=" + nif
				+ ", moroso=" + moroso + "]";
	}
	
	
	
}
