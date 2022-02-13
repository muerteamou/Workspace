package objetos;

/*Crea la clase Pizza con los atributos y m�todos necesarios. Sobre cada pizza se necesita saber el 
 * tama�o - mediana o familiar - el tipo - margarita, cuatro quesos o funghi - y su estado - pedida o 
 * servida. La clase debe almacenar informaci�n sobre el n�mero total de pizzas que se han pedido y que 
 * se han servido. Siempre que se crea una pizza nueva, su estado es �pedida�. El siguiente c�digo del
 *  programa principal, que prueba la clase anterior, debe dar la salida que se muestra:
 * 
 */

public class Pizza {
	private static int totalpedidas;
	private static int totalservidas;

	private String tamanyo;
	private String tipo;
	private String estado;

	public Pizza(String tipo, String tamanyo) {
		this.tipo = tipo;
		this.tamanyo = tamanyo;
		this.estado = "pedida";
		totalpedidas++;

	}

	public String getTamanyo() {
		return tamanyo;
	}

	public void setTamanyo(String tamanyo) {
		this.tamanyo = tamanyo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void sirve() {
		if (estado.equals("pedida")) {
			estado = "servida";
			totalservidas++;
		} else
			System.out.println("esa pizza ya se ha servido");
	}

	public static int getTotalPedidas() {
		return totalpedidas;
	}
	
	public static int getTotalServidas() {
		return totalservidas;
	}

	@Override
	public String toString() {
		return "Pizza " + tipo + " " + tamanyo + ", " + estado;
	}
}
