package EjerciciosPracticas;


/*Escribe un programa que a partir de una cadena formada por tu nombre completo, lo desglose y visualice
separadamente por nombre, apellido 1o y apellido 2o de dos formas:
a) Utilizando la clase StringTokenizer (averigua antes su funcionamiento).
b) el método split de la clase String visto en clase*/
public class Ejercicio03B {

	public static void main(String[] args) {
		String nCompleto = "Alejandro Piñero Medinilla";
		
		String [] nombre = nCompleto.split(" ");
		for(String trozo: nombre)
		System.out.println(trozo);
		
		for (int i=0; i<(nombre.length); i++)
			System.out.println(nombre[i]);
	}	

}
