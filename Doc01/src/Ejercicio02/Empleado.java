package Ejercicio02;

/*Generar el javadoc para todos los métodos*/

/**
 * Clase Empleado es para crear objetos que hacen referencia a empleados
 * 
 * Nuestras personas sólo tienen una edad y un nombre.
 * 
 * @author Alejandro Piñero Medinilla
 * @version 1.0
 * 
 *
 */

public class Empleado {
	private String nombre;
	private String apellidos;
	private int salario;
	private int depno;
	
	public Empleado() {}
	
	public Empleado(String nombre, String apellidos, int salario, int depno) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.salario = salario;
		this.depno = depno;
	}
	
	/**
	 * @return Devuelve un String con el nombre
	 * 
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * 
	 * @param nombre Establece el atributo nombre de la clase Empleado
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * 
	 * @return Devuelve un String con el apellido.
	 */
	public String getApellidos() {
		return apellidos;
	}
	
	/**
	 * 
	 * @param apellidos (String) Establece el atributo apellido del objeto de clase Empleado
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	/**
	 * 
	 * @return Devuelve el valor entero del salario
	 */
	public int getSalario() {
		return salario;
	}
	
	/**
	 * 
	 * @param salario (INT) Establece el salario del objeto de clase Empleado
	 */
	public void setSalario(int salario) {
		this.salario = salario;
	}
	/**
	 * 
	 * @return Devuelve el número (INT) del departamento del objeto de clase Empleado
	 */
	public int getDepno() {
		return depno;
	}
	
	/**
	 * 
	 * @param depno Establece el número (INT) de departamento del objeto de clase Empleado
	 */
	public void setDepno(int depno) {
		this.depno = depno;
	}
	
	
	@Override
	/**
	 * @return Devuelve un String con los los atributos del objeto de clase Empleado
	 */
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellidos=" + apellidos + ", salario=" + salario + ", depno=" + depno
				+ "]";
	}
	
}
