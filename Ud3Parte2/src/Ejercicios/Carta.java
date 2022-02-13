package Ejercicios;

public class Carta {
	
	private String palo;
	private int valorNum;
	private String valor;
	
	public Carta() {
		
	}
	public Carta(String palo, int valorNum, String valor) {
		this.palo=palo;
		this.valorNum=valorNum;
		this.valor=valor;
	}
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}
	public int getValorNum() {
		return valorNum;
	}
	public void setValorNum(int valorNum) {
		this.valorNum = valorNum;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	
}
