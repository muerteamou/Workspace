package repasobis;

public class RepasoMain {

	public static void main(String[] args) {
		Lista l = new Lista();
		// B b = new B(); ----> Error, no se puede instanciar B
		// X x = new X(); ----> Error, no se puede instanciar X
		System.out.println(B.getCuenta()); // 0
		Z z1 = new Z("Soy z1", 10);
		Z z2 = new Z("Soy z2", 20);
		Z z3 = new Z("Soy z3", 30);
		Y y1 = new Y("Soy y1", " de la Clase Y");
		Y y2 = new Y("Soy y2", " de la Clase Y");
		System.out.println(B.getCuenta());// 5
		System.out.println(z1.compareTo(z2));// negativo, -10
		y1.metodoX();// El valor de la constante r es 2
		z2.metodoX();// El valor de la constante r es 2
		z3.saludo();// Buenas noches (Pues eran las 22 horas...)
		//
		l.insertar(z1); l.insertar(z2); l.insertar(z3);
		l.insertar(y1); l.insertar(y2);
		l.recorrer();
		/*
		 * i=10, s=Soy z1, r=2
		 * i=20, s=Soy z2, r=2
		 * i=30, s=Soy z3, r=2
		 * t= de la Clase Y, s=Soy y1, r=2
		 * t= de la Clase Y, s=Soy y2, r=2
		 */
		System.out.println(l.cuentaZ()); //3
		
		
	}

}
