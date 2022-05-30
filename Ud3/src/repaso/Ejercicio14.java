package repaso;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		int n=4;
		int matriz[][]=new int [n][n];
		rellena(matriz);
		pinta(matriz);
		if(esSimetrica(matriz))
			System.out.println("Es simetrica");
		else
			System.out.println("no es simetirca");
		
		invertir(matriz);
		pinta(matriz);
	}
	public static void rellena(int m[][]){
		Scanner s= new Scanner(System.in);
		System.out.println("introduce los numeros de la matriz");
		for(int i=0;i<m.length;i++) {
			for (int j=0;j<m[i].length;j++) {
				System.out.print("introduzca el siguiente numero=> ");
				m[i][j]=s.nextInt();		
			}
		}	
	}
	public static void pinta(int m[][]){
		for(int i=0;i<m.length;i++) {
			for (int j=0;j<m[i].length;j++) {
				System.out.print(m[i][j]+" ");	
			}
			System.out.println();
		}	
	}
	public static boolean esSimetrica(int m[][]) {
		for(int i=0;i<m.length;i++) {
			for (int j=0;j<m[i].length;j++) {
				if(m[j][i]!=m[i][j])
					return false;
			}
		}
		return true;

	}
	
	public static int[][] invertir(int m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = m[j][i];				
			}
		}
		return m;
	}

}
