package arrays_alumnos;

public class ejercicio14 {
	/*
	 * Realiza un método que devuelva cierto si la matriz de dimensiones NxN que se
	 * le pasa como argumento es simétrica. Una matriz a es simétrica si a(i,j)=
	 * a(j,i).
	 */
	public static boolean esSimetrica(int[][] matriz) {
		int fila = 0, columna = 0, guardian = 0;
		for (fila = 0; fila < matriz.length; fila++) {
			for (columna = 0; columna < matriz[fila].length; columna++) {
				if (matriz[fila][columna] == matriz[columna][fila]) {

				} else {
					guardian++;
				}
			}
		}
		if (guardian == 0)
			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz[][] = { { 0, 1, -2 }, { 1, 3, 0 }, { -2, 0, 5 }, };
		int matriz2[][] = { { 2, 3, 0 }, { 1, 2 , 0 }, { 3, 5, 6 }, };
		System.out.println(esSimetrica(matriz));
	}

}
