package _02colecciones1;

// Lista.java: una lista de Personas

public class Lista {
	private final static int MAX = 100;
	private Persona _array[];
	private int _cont = 0; // Indica la primera posici�n libre
	// del array. Igual al n�mero de elementos

	public Lista() {
		_array = new Persona[MAX];
	}

	public boolean llena() {
		return _cont == MAX;
	}

	public boolean vacia() {
		return _cont == 0;
	}

	public int length() {
		return _cont;
	}

	public boolean insertar(Persona p) {
		// Devuelve true si se inserta; false si lista llena
		if (_cont == MAX)
			return false;
		_array[_cont] = p;
		_cont++;
		return true;
	}

	public Persona recuperar(int pos) {
		// true si tiene �xito; false si posici�n no v�lida
		// pos variar� de 1 al n�mero de elementos
		if ((pos < 1) || (pos > _cont))
			return null;
		return _array[pos - 1];
	}

	public String toString() {
		String cad = "Elementos de la lista:\n\n";
		for (int i = 0; i < _cont; i++)
			cad += _array[i].toString() + "\n";
		return cad;
	}

	/****************************************************************************/

	public boolean borrarPersonaPosicion(int pos) {
		if (_cont == 0 || pos < 1 || pos > _cont)
			return false;
		for (int i = pos; i < _cont; i++) {
			_array[i - 1] = _array[i];
		}
		_cont--;
		return true;
	}

	public int buscarDni(long num) {
		for (int i = 0; i < _cont; i++) {
			if (_array[i].dameNif().dameDni() == num)
				return (i + 1);
		}
		return -1;
	}

	public boolean borrarPersonaDni(long num) {
		int encontrarPosicion = buscarDni(num);
		if (encontrarPosicion == -1)
			return false;
		return borrarPersonaPosicion(encontrarPosicion);

	}

	public String buscarApellido(String apellido) {
		String encontrados = "";
		for (int i = 0; i < _cont; i++) {
			if (_array[i].dameApellidos().toLowerCase().contains(apellido.toLowerCase())) {
				encontrados = encontrados + _array[i];
			}
		}
		return encontrados;

	}

	public Persona[] buscarApellido2(String apellido) {
		Persona[] encontrados = new Persona[_cont];
		int i2 = 0;
		for (int i = 0; i < _cont; i++) {
			if (_array[i].dameApellidos().toLowerCase().contains(apellido.toLowerCase())) {
				encontrados[i2] = _array[i];
				i2++;
			}
		}
		return encontrados;
	}

}// de la clase lista