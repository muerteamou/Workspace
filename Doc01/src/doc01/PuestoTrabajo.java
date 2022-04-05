package doc01;

public class PuestoTrabajo {
	int horas;
	Persona trabajador;
	
	public PuestoTrabajo(int horas, Persona trabajador) {
		super();
		this.horas = horas;
		this.trabajador = trabajador;
		trabajador.setEdad(35);	}
}
