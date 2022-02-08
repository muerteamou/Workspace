package repasobis;

public abstract class B {
	private static int cuenta=0;
	private String s;
	private final int r=2;
	
	
	public B(String s) {
		this.s = s;
		cuenta++;
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


	public int getR() {
		return r;
	}


	@Override
	public String toString() {
		return "B [s=" + s + ", r=" + r + "]";
	}
	
	public final void metodoX() {
		System.out.println(r);
	}
	
}
