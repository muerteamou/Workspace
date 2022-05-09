package Ejercicios;

public class Main {

	public static void main(String[] args) {
		Bd baloncesto = new Bd("baloncesto");
        //Crear un objeto de la clase View
        Vista vista  = new Vista();
        //Crear un objeto de la clase Controller
        Controller controlador  = new Controller(vista);
        //Vincular la vista y el controlador
        vista.conectaControlador(controlador);

	}

}
