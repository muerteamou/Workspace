package arrays_alumnos;

public class ejercicio16 {
	/*
	 * Una matriz de dimensiones NxN de enteros es mágica si: - Aparecen todos los
	 * números enteros desde 1 al N2. - La suma de los elementos de cada fila, cada
	 * columna, y las dos diagonales dan el mismo valor. Por ejemplo, la matriz
	 * siguiente de la derecha de dimensiones 5x5 contiene todos los elementos del 1
	 * al 25 y tiene como suma común 65. Desarrolla un programa que lea una matriz y
	 * nos indique si es mágica.
	 */
	public static boolean esColumna(int[][] matrix) {
		int fila = 0, columna = 0, sumacolumna = 0, referencia = 0;
		// Vamos a recorrer la primera columna(fila=0) para sumar sus valores en
		// referencia
		for (fila = 0; fila <= 0; fila++) {
			for (columna = 0; columna < matrix[fila].length; columna++) {
				referencia = referencia + matrix[columna][fila];
			}

		}
		// Ahora recorremos todas las columnas y vamos a comparar con la primera
		// en caso de no coincidir, devuelve false.
		for (fila = 0; fila < matrix.length; fila++) {
			sumacolumna = 0;
			for (columna = 0; columna < matrix[fila].length; columna++) {
				sumacolumna = sumacolumna + matrix[columna][fila];

			}
			if (sumacolumna != referencia) {
				return false;

			}
		}
		return true;
	}

	public static boolean esFila(int[][] matrix) {
		int fila = 0, columna = 0, sumafila = 0, referencia = 0;
		// Vamos a recorrer la primera fila para sumar sus valores en
		// referencia
		for (fila = 0; fila < matrix.length; fila++) {
			referencia = referencia + matrix[columna][fila];
		}
		// Ahora recorremos todas las filas y vamos a comparar con la primera
		// en caso de no coincidir, devuelve false.
		for (fila = 0; fila < matrix.length; fila++) {
			sumafila = 0;
			for (columna = 0; columna < matrix[fila].length; columna++) {
				sumafila = sumafila + matrix[fila][columna];

			}
			if (sumafila != referencia) {
				return false;

			}
		}
		return true;
	}

	public static boolean esDiagonal(int[][] matrix) {
		int fila = 0, columna = 0, sumadiag = 0, sumadiag1 = 0, referencia = 0;

		for (fila = 0; fila < matrix.length; fila++) {
			referencia = referencia + matrix[columna][fila];
		}
		for (fila = 0; fila < matrix.length; fila++) {
			for (columna = 0; columna < matrix[fila].length; columna++) {

				if (fila == columna)
					sumadiag = sumadiag + matrix[columna][fila];

				if (matrix[fila][columna] == matrix[fila][matrix.length - 1 - fila])
					sumadiag1 = sumadiag1 + matrix[columna][fila];
			}
		}
		if (referencia != sumadiag || referencia != sumadiag1) {
			return false;
		} else
			return true;
	}

	public static void esMagica(int[][] matrix) {
		int fila = 0, columna = 0, sumafila = 0, sumacolumna = 0, sumadiagonal = 0, sumadiagonal1 = 0, referencia = 0;

		for (fila = 0; fila < matrix.length; fila++) {
			sumafila = 0;
			sumacolumna = 0;
			for (columna = 0; columna < matrix[fila].length; columna++) {
				sumafila = sumafila + matrix[fila][columna];
				sumacolumna = sumacolumna + matrix[columna][fila];

				if (fila == columna)
					sumadiagonal = sumadiagonal + matrix[columna][fila];

				if (matrix[fila][columna] == matrix[fila][matrix.length - 1 - fila])
					sumadiagonal1 = sumadiagonal1 + matrix[columna][fila];
			}
			if (sumafila == sumacolumna)
				referencia = sumafila;
			else
				System.out.println("No es mágica");
		}
		if (sumadiagonal == sumadiagonal1) {
			System.out.println("La matriz es mágica");
		} else
			System.out.println("La matriz no es mágica");
	}

	/*
	 * public static boolean estanTodos(int[][] matrix) { int fila = 0, columna = 0,
	 * casilla = 1, contador = 0; int casillastotales = matrix.length *
	 * matrix.length; for (casilla = 1; casilla <= casillastotales; casilla++) { for
	 * (fila = 0; fila < matrix.length; fila++) { for (columna = 0; columna <
	 * matrix[fila].length; columna++) { if (matrix[fila][columna]==casilla) {
	 * contador++;
	 * 
	 * }
	 * 
	 * } } }if (casillastotales==contador) return true; else return false; }
	 */

	public static boolean estanTodos(int[][] matrix) {
		int fila = 0, columna = 0, casilla = 1;
		int casillastotales = matrix.length * matrix[0].length;
		boolean encontrado = false;
		for (casilla = 1; casilla <= casillastotales; casilla++) {
			encontrado = false;
			for (fila = 0; fila < matrix.length; fila++) {
				for (columna = 0; columna < matrix[fila].length; columna++) {
					if (casilla == matrix[fila][columna]) {
						encontrado = true;
					}
					if (encontrado)
						break;
				}
				if (encontrado)
					break;
			}
			if (!encontrado)
				break;
		}
		if (encontrado)
			return true;
		else
			return false;
	}

	public static void leerMatriz(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(" " + matrix[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		int matriz1[][] = { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 }, };
		int matriz2[][] = { { 16, 3, 2, 13 }, { 5, 10, 11, 8 }, { 9, 6, 7, 12 }, { 4, 15, 14, 1 } };

		System.out.println("Dada la matriz representada, vamos a comprobar si es una matriz mágica.");
		System.out.println("");

		leerMatriz(matriz1);

		if (estanTodos(matriz1))
			System.out.println("Están todos los elementos de 1 a n2 	[X]");
		else
			System.out.println("Están todos los elementos de 1 a n2 	[]");

		if (esFila(matriz1))
			System.out.println("Todas sus filas suman lo mismo 		[X]");
		else
			System.out.println("Todas sus filas suman lo mismo 		[]");

		if (esColumna(matriz1))
			System.out.println("Todas sus columnas suman lo mismo 	[X]");
		else
			System.out.println("Todas sus columnas suman lo mismo 	[]");

		if (esDiagonal(matriz1))
			System.out.println("Todas sus diagonales suman lo mismo 	[X]");
		else
			System.out.println("Todas sus diagonales suman lo mismo 	[]");

		if (estanTodos(matriz1) && esFila(matriz1) && esColumna(matriz1) && esDiagonal(matriz1))
			System.out.println("Cumple con todos los requisitos, la matriz es mágica.");
		else
			System.out.println("No cumple con los requisitos, luego no es mágica.");
	}

}
