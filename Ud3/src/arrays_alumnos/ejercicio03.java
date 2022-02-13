package arrays_alumnos;

public class ejercicio03 {
//Define un array de 12 números enteros y asigna los valores según la tabla que se muestra
	// a continuación. Muestra el contenido de todos los elementos del array. ¿Qué
	// sucede con los valores de los elementos que no han sido inicializados? Indica
	// la
	// respuesta en forma de comentario.
	public static void main(String[] args) {
		int[] x = new int[12];
		int i;
		x[0] = 39;
		x[1] = -2;
		x[4] = 0;
		x[6] = 14;
		x[8] = 5;
		x[9] = 100;

		for (i = 0; i < 12; i++) {
			System.out.println(x[i]);
		}

	}

}
