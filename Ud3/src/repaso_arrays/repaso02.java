package repaso_arrays;

import java.util.Scanner;

public class repaso02 {
	
	
	public static void npositivos(int [] x) {
		int contador=0;
		for(int fila=0; fila < x.length; fila++) {
			if (x[fila]>0)
				contador++;
		}
		System.out.println("Hay " + contador + " n�meros positivos");
	}
	
	public static void nnegativos(int [] x) {
		int contador=0;
		for(int fila=0; fila < x.length; fila++) {
			if (x[fila]<0)
				contador++;
		}
		System.out.println("Hay " + contador + " n�meros negativos");
	}
	
	public static void nceros(int [] x) {
		int contador=0;
		for(int fila=0; fila < x.length; fila++) {
			if (x[fila]==0)
				contador++;
		}
		System.out.println("Hay " + contador + " ceros");
	}
	

	public static void main(String[] args) {
		/*
		 * Escribe un programa Java que guarda en un array 10 n�meros enteros le�dos por
		 * teclado. A continuaci�n indicar cu�ntos n�meros son positivos, cu�ntos
		 * negativos y cu�ntos ceros.
		 */
		
		int tamanyo=10;
		int [] x=new int [tamanyo];
		
		Scanner s = new Scanner(System.in);
		for (int i=0; i<tamanyo; i++) {
			System.out.println("Introduce un numero: ");
			x[i]=s.nextInt();
			
		}
		npositivos(x);
		nnegativos(x);
		nceros(x);
		
	}

}
