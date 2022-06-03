package banco;

public class Cuenta {
	private String numero; // aunque se llame número, es un String xq es un número de cuenta
	private double saldo;

	public Cuenta(String num, double saldo) {
		this.numero = num;
		this.saldo = saldo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cuenta [numero=" + numero + ", saldo=" + saldo + "]";
	}

	public void ingresarDinero(double importe) throws Exception {
		if (importe > 0) {
			this.saldo += importe;
		} else {
			throw new Exception("En un ingreso, el importe tiene que ser positivo.");
		}
	}

	public void extraerDinero(double importe) throws Exception {
		if (importe > 0) {
			if(this.saldo < importe) {
				throw new Exception("En una extracción el importe no puede ser mayor al saldo.");
			}else {
				this.saldo-=importe;
			}
		} else {
			throw new Exception("En una extracción el importe a extraer debe ser positivo.");
		}
		
	}
}
