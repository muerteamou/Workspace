package ejemplos;

import java.util.Scanner;

public class Ej13SentenciaIf02 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un n�mero positivo mayor que 0: ");
    int n = Integer.parseInt(s.nextLine());
    if (n<=0) 
    	System.out.println("El n�mero que has introducido no es positivo");
    else
    	if (n<100)
    		System.out.println("El n�mero que es menor que 100");
    	else
    		System.out.println("El n�mero que es mayor o igual que 100");
    }
}
