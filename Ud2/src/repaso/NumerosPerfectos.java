package repaso;

public class NumerosPerfectos {

	public static void main(String[] args) {
		
		int perfectos =0, x=2;
		while(perfectos<4) {
			if(esPerfecto(x)) {
				perfectos++;
				System.out.println(perfectos + "º número perfecto - " + x);
				x++;
			}else
				x++;
		}

	}
	public static boolean esPerfecto(int x) {
		int suma=0;
		for (int i = 1; i < x; i++) {
			if(x%i==0) {
				suma = suma+i;
			}
		}if(suma==x) {
			return true;
		}else
			return false;
	}
}
