package _02colecciones1;

public class CD {

	private Cancion[] canciones;
	private static final int max = 20;
	private int contador;

	public CD() {
		canciones = new Cancion[max];
		contador=0;
	}

	public int numeroCanciones() {
		return contador;
	}

	public Cancion dameCancion(int posicion) {
		if (posicion < 1 || posicion > contador)
			return null;
		else
			return canciones[posicion-1];
	}

	public boolean grabaCancion(int posicion, Cancion cancion) {
		if (posicion < 1 || posicion > contador)
			return false;
		else
			canciones[posicion - 1] = cancion;
		return true;
	}

	public boolean agrega(Cancion cancion) {
		if (contador == max)
			return false;
		else {
			canciones[contador] = cancion;
			contador++;
		}
		return true;
	}

	public boolean elimina(int posicion) {
		if (posicion < 1 || posicion > contador) {
			return false;
		}

		for (int i = posicion; i < contador; i++) {
			canciones[posicion - 1] = canciones[i];
		}
		contador--;
		return true;
	}
	
	public String toString() {
		String cadena="";
		for (int i=0; i<contador; i++)
			cadena = cadena + "Cancion: " + (i+1) + "º: " + canciones[i] + "\n";
			return cadena;
	}
}
