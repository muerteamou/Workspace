package repaso;

public abstract class X extends B{
	
	private String v;
	
	public X(String s, String v) {
		super(s);
		this.v = v;
	}

	public String getV() {
		return v;
	}

	public void setV(String v) {
		this.v = v;
	}

	@Override
	public String toString() {
		return super.toString()+ "X [v=" + v + "]";
	}

	public abstract double ganancias();
	
}
