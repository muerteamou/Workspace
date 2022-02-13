package arrays_alumnos;

public class ejercicio15 {
	/*
	 * Realiza un método que reciba una matriz de dimensiones NxN y almacene sobre
	 * ella su traspuesta. La matriz traspuesta es aquella que se obtiene cambiando
	 * ordenadamente las filas por las columnas.
	 */

	public static int[][] matrizTraspuesta(int[][] matriz) {
		int fila = 0, columna = 0;
		int giroMatriz[][] = new int[matriz[0].length][matriz.length];
		for (fila = 0; fila < matriz.length; fila++) {
			for (columna = 0; columna < matriz[fila].length; columna++) {
				giroMatriz[columna][fila] = matriz[fila][columna];
			}
		}
		return giroMatriz;

	}

	public static void leerMatriz(int[][] x) {
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j] + " ");
			}
			System.out.println("");
		}

	}

	public static void main(String[] args) {
		int matriz[][] = { { 2, 3, 0 }, { 1, 2, 0 }, { 3, 5, 6 }, };
		leerMatriz(matriz);
		leerMatriz(matrizTraspuesta(matriz));
		//leerMatriz(matrizTraspuesta(matrizTraspuesta(matrizTraspuesta(matriz))));
		
	}
}
