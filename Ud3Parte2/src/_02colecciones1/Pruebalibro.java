package _02colecciones1;

public class Pruebalibro {

	public static void main(String[] args) {
		Persona persona1 = new Persona();
		Persona persona2 = new Persona(31000,56,"Joane","Rowling");
		Persona persona3 = new Persona (3200,75,"Charles","Perrault");
		
		
		Libro libro3 = new Libro("Caperucita roja ",persona3,"16456",500,20,"Desconocida","Desconocido",new Fecha(00,00,0000));
		Libro libro1 = new Libro();
		//System.out.println(libro1);
		Libro libro2 = new Libro("La sagrada biblia",persona1,"12356",400,9,"Desconocida","Desconocido",new Fecha(00,00,0000));
		//System.out.println(libro2);
		
		//System.out.println(persona2);
		//System.out.println(persona3.nombreCompleto());
		System.out.println(libro3);
		//libro3.leer();
		
		//System.out.println(libro3);
		
		
		
		

	}

}


