package proyecto01bis;

public class Pelicula extends Multimedia{
	private String actorP, actrizP;

	public Pelicula(String titulo, String autor, String formato, double duracion, String actorP, String actrizP)throws Exception{
		super(titulo, autor, formato, duracion);
		this.actorP = actorP;
		this.actrizP = actrizP;		
		if (actorP==null && actrizP==null)
			throw new Exception("No se admiten los arguments");
	}

	@Override
	public String toString() {
		return "Pelicula: " + super.toString() + "Protagonista: " + actorP + ", actrizP=" + actrizP + "\n";
	}

	public String getActorP() {
		return actorP;
	}

	public String getActrizP() {
		return actrizP;
	}

	
	
	
	
}
