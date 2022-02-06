package proyecto01;

public class Pelicula extends Multimedia {
	private String actorP, actrizP;

	public Pelicula(String titulo, String autor, String formato, double duracion, String actorP, String actrizP)
			throws Exception {
		super(titulo, autor, formato, duracion);
		this.actorP = actorP;
		this.actrizP = actrizP;
		if (actorP == null && actrizP == null)
			throw new Exception("No se admiten los argumentos");
	}

	@Override
	public String toString() {
		// voy a comprobar todos los casos para que se imprima según los atributos que
		// tenga el objeto pelicula.
		if (actorP == null)
			return "Pelicula: " + super.toString() + "\nActriz Protagonista: " + actrizP + "\n";
		if (actrizP == null)
			return "Pelicula: " + super.toString() + "\nActor Protagonista: " + actorP + "\n";
		else
			return "Pelicula: " + super.toString() + "\nActor Protagonista: " + actorP + "\nActriz Protagonista: "
					+ actrizP + "\n";
	}

	public String getActorP() {
		return actorP;
	}

	public String getActrizP() {
		return actrizP;
	}

}
