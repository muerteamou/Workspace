package ejemplos;

public class Ej03SalidaFormateada02 {
  public static void main(String[] args) {
    System.out.println("  Art�culo      Precio/caja    N� cajas");
    System.out.println("-----------------------------------------");
    System.out.printf("%-10s      %8.2f      %6d\n",  "manzanas", 4.5, 10);
    System.out.printf("%-10s      %8.2f      %6d\n",  "peras", 2.75, 120);
    System.out.printf("%-10s      %8.2f      %6d\n",  "aguacates", 10.0, 6);
  }
}
