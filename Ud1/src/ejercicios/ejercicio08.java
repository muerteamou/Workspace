package ejercicios;
import java.util.Scanner;

public class ejercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int x;
		int y;
		int aux;
		
		System.out.print("Dime el valor de x ");
	    x = s.nextInt();
	    System.out.print("Dime el valor de y ");
	    y = s.nextInt();
	    
	    aux = x;
	    x = y;
	    y = aux;
	    
	    System.out.println ("Ahora x vale " + x + " e y vale " + y);
	}	

}
