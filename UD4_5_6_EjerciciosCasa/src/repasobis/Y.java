package repasobis;

public class Y extends B{
private String t;

public Y(String s, String t) {
	super(s);
	this.t = t;
}

public String getT() {
	return t;
}

public void setT(String t) {
	this.t = t;
}

@Override
public String toString() {
	return super.toString() + "Y [t=" + t + "]";
}


}
