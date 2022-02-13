package _8errores;

public class PruebaErrores2 {

	public static void main(String[] args) {
		int [] tabla = new int [10];
		int v;
		Integer x = null;
		
		try {
			
		v = 90/0;
		//v = 90/x;
		tabla [9]= 45;
		System.out.println("Estoy en la linea 11");
		v = Integer.parseInt("2");
		System.out.println("Estoy en la linea 13");
		
		
		}
		catch (Exception e) {
			System.out.println("Se produjo un error inesperado");
		}
		/*finally { // finally es una herramienta para que la instruccion se ejecute siempre
			System.out.println("Esto se ejecuta siempre")
		};*/
		System.out.println("Estoy en la linea 26");

	}

}
