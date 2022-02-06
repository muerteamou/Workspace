package ejercicios;

public class ejercicio4 {

	public static void main(String[] args) {
		final byte ano=12;
		byte mes=9;
		System.out.println("Mes " + mes + " de " + ano);
		System.out.printf("Porcentaje transcurrido: %.4f%s", (((double) mes / ano) * 100), "%");
		
	}

}
