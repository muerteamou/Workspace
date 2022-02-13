package arrays_alumnos;

public class ejercicio02 {
//Crea un programa que permita almacenar en un array un conjunto de 20 números enteros
	// de valores comprendidos entre 0 y 99 generados aleatoriamente (utiliza el
	// método
	// Math.random()).
	public static void main(String[] args) {
		int []x= new int [20]; int i;
		for(i =0 ; i<20; i++) {
			x[i]=(int)(Math.random()*100);
			System.out.println(x[i]);
			
		}

	}

}
