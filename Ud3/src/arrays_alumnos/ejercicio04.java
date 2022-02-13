package arrays_alumnos;

public class ejercicio04 {
//Define un array de 10 caracteres y asigna valores a los elementos según la tabla que se
//	muestra a continuación. Muestra el contenido de todos los elementos del array. ¿Qué
//	sucede con los valores de los elementos que no han sido inicializados? Indica la respuesta
//	en forma de comentario.

	public static void main(String[] args) {
		char x[] = new char[10];
		int i;
		x[0] = 'a';
		x[1] = 'x';
		x[4] = '@';
		x[6] = ' ';
		x[7] = '+';
		x[8] = 'Q';

		for (i = 0; i < 10; i++) {
			System.out.println(x[i]);
			//System.out.println((int) x[i]);  al convertirlo a int veo el valor hexadecimal del caracter
		}

	}

}
