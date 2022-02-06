package ejercicios;
import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a;
		int b;
		int c;
		
		System.out.print("Dime el valor de x ");
	    a = s.nextInt();
	    System.out.print("Dime el valor de y ");
	    b = s.nextInt();
	    
	    c = b;
	    b = a;
	    a = c;
	    
	    System.out.println ("Ahora x vale " + a + " e y vale " + b);
	}	

}
