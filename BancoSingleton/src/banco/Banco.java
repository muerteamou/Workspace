package banco;

import java.util.ArrayList;


public class Banco {
	//implementa para la clase banco un patrón singleton, de manera que sólo se pueda obtener una instancia del objeto de la clase Banco.
	// cuando el código esté bien, el test pasará
	private static Banco instancia;
	
	ArrayList<Cuenta> listaCuentas;
	
	private Banco() {
		this.listaCuentas= new ArrayList<Cuenta>();
	}
	
	public void abrirCuenta(Cuenta c) {
		listaCuentas.add(c);
	}
	public void consultarCuentas() {
		for (Cuenta cuenta : listaCuentas) {
			System.out.println(cuenta);
		}
	}
	public ArrayList<Cuenta> getListaCuentas(){
		return listaCuentas;
	}
	
	public static Banco getInstance() {
		if(instancia==null) {
			instancia=new Banco();
		}
		return instancia;
	}
}
