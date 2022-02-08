package repaso;

import java.util.Calendar;
import java.util.GregorianCalendar;

public final class Z extends B implements Comparable<Z>, Saludar{
	@Override
	public String toString() {
		return "i=" + i +", " + super.toString();
	}


	private int i;
	

	public Z(String s, int i) {
		super(s);
		this.i = i;
	}


	@Override
	public int compareTo(Z arg0) {
		return this.i - arg0.i;
	}


	@Override
	public void saludo() {
		GregorianCalendar horaHoy = new GregorianCalendar();
		int hora= horaHoy.get(Calendar.HOUR_OF_DAY);
		if (hora>=7 && hora<=14)
			System.out.println("Buenos dias");
		if (hora>=15 && hora <=20)
			System.out.println("Buenas tardes");
		else
			System.out.println("Buenas noches");
			
	}

}
