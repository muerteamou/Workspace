package repasobis;

import java.util.Calendar;
import java.util.GregorianCalendar;

public final class Z extends B implements Comparable<Z>, Saludar {
	private int i;

	public Z(String s, int i) {
		super(s);
		this.i = i;
	}

	@Override
	public String toString() {
		return super.toString() + "Z [i=" + i + "]";
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	@Override
	public void saludo() {
			GregorianCalendar horaHoy = new GregorianCalendar();
			if(horaHoy.get(Calendar.HOUR_OF_DAY)>=7 && horaHoy.get(Calendar.HOUR_OF_DAY)<=14)
				System.out.println("Buenos dias");
			if(horaHoy.get(Calendar.HOUR_OF_DAY)>14 && horaHoy.get(Calendar.HOUR_OF_DAY)<=20)
				System.out.println("Buenas tardes");
			else
				System.out.println("Buenas noches");
	}

	@Override
	public int compareTo(Z o) {
		return (this.getI() - o.getI());
	}

}
