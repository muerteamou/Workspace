package ejercicios;

public class ejercicio04 {

	public static void main(String[] args) {
		final byte meses=12;
		byte mes=5;
		System.out.println("Mes " + mes + " de " + meses);
		System.out.printf("Porcentaje transcurrido: %.4f%s", (double) mes / meses * 100, "%");
		
	}

}
