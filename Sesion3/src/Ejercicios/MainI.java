package Ejercicios;

public class MainI {

	public static void main(String[] args) {
		
		AccesoBdatos abd = new AccesoBdatos();
		abd.conectar();
		
		System.out.println("Subir un 20% el salario de los empleados del Departamento 30");
		System.out.println(abd.actualizarSalario(30, 0.2)); //→6
		//
		System.out.println("Subir un 15% el salario de los empleados del Departamento 44");
		System.out.println(abd.actualizarSalario(44, 0.15));//→0
		// No existe el departamento 44
	}

}
