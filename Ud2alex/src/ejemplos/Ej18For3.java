package ejemplos;
/*
 * Ampliaci�n ejemplos Alberto octubre 2019
 * Ver detr�s de Ej18For,  Ej18For2
 */
public class Ej18For3 {
  public static void main(String[] args) {
        
    for (int i=1; i<=1000 ; i++) {
    // Nooooor !!!!! . No recomendable. Se pierde legibilidad
    	System.out.println("Vuelta n�mero: " + i);
    	if (i==21)
    		break;
    
    }
  }
}
