package repaso;

public abstract class B {
	private static int cuenta;
	private String s;
	
	public B(String s) {
		this.s = s;
		cuenta++;
	}
	@Override
	public String toString() {
		return "s=" + s + ", r=" + r +", ";
	}
	final int r=2;
	
	
	public final void metodoX() {
		System.out.println(r);
	}


	public static int getCuenta() {
		return cuenta;
	}


	public static void setCuenta(int cuenta) {
		B.cuenta = cuenta;
	}


	public String getS() {
		return s;
	}


	public void setS(String s) {
		this.s = s;
	}
	
}
