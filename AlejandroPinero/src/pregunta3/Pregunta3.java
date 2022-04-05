package pregunta3;

public class Pregunta3 {

	public static void main(String[] args) {
		String patron ="$A1abf563"; //9 carácteres
		String patron2 = "$A1aabf563"; // 10 carácteres
		if(patron.length()==8 || patron.length()==10) {
			if(patron.matches("([$&_][a-zA-Z][a-zA-Z0-9]{6})|([$&_][a-zA-Z][a-zA-Z0-9]{8})")) {
				System.out.println("Contraseña válida");
			}else {
				System.out.println("Contraseña inválida");
			}
		}
		else {
			System.out.println("Contraseña inválida");
		}
		if(patron2.length()==8 || patron2.length()==10) {
			if(patron2.matches("[$&_][a-z A-Z][a-z A-Z 0-9]{6,8}")) {
				System.out.println("Contraseña válida");
			}else {
				System.out.println("Contraseña inválida");
			}
		}
		else {
			System.out.println("Contraseña inválida");
		}
	}

}
