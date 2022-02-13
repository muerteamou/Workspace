package _8errores;

public class PruebaErrores {

	public static void main(String[] args) {
		int [] tabla = new int [10];
		int v;
		Integer x = null;
		
		try {
			
		v = 90/1;
		v = 90/x;
		tabla [9]= 45;
		System.out.println("Estoy en la linea 11");
		v = Integer.parseInt("2");
		System.out.println("Estoy en la linea 13");
		
		
		}catch (ArrayIndexOutOfBoundsException aiooe) {// catch sirve para atrapar el error
			System.out.println("La casilla a la que intentas acceder no existe");
			//System.out.println(aiooe.getMessage());
			//System.out.println(aiooe.getStackTrace());
		}catch (NumberFormatException nfe) {
			System.out.println("No se puede convertir a entero");
		}catch (ArithmeticException ae) {
			System.out.println("No se puede dividir por 0");
		}catch (NullPointerException npe) {
			System.out.println("No se puede trabajar con números nulos");
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
