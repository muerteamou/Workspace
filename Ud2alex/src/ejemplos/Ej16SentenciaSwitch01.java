package ejemplos;

import java.util.Scanner;

public class Ej16SentenciaSwitch01 {
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
	  System.out.println(" C�LCULO DE �REAS");
    System.out.println(" ----------------");
    System.out.println(" 1. Cuadrado");
    System.out.println(" 2. Rect�nngulo");
    System.out.println(" 3. Tri�ngulo");
    System.out.print("\n Elija una opci�n (1-3): ");
  
    int opcion = s.nextInt();

    double lado;
    double base;
    double altura;
    
    switch (opcion) {
      case 1:
        System.out.print("\nIntroduzca el lado del cuadrado en cm: ");
        lado = s.nextDouble();
        System.out.println("\nEl �rea del cuadrado es " + (lado * lado) + " cm2");
        break;
    
      case 2:
        System.out.print("\nIntroduzca la base del rect�ngulo en cm: ");
        base = s.nextDouble();
        System.out.print("Introduzca la altura del rect�ngulo en cm: ");
        altura = s.nextDouble();
        System.out.println("El �rea del rect�ngulo es " + (base * altura) + " cm2");
        break;
    
      case 3:
        System.out.print("\nIntroduzca la base del tri�ngulo en cm: ");
        base = s.nextDouble();
        System.out.print("Introduzca la altura del tri�ngulo en cm: ");
        altura = s.nextDouble();
        System.out.println("El �rea del tri�ngulo es " + ((base * altura) / 2) + " cm2");
        break;
        
      default:
        System.out.print("\nLo siento, la opci�n elegida no es correcta.");
    }
  }
}
