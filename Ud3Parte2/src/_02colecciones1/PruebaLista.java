package _02colecciones1;

// PruebaLista.java: prueba de la clase Lista

public class PruebaLista {
  public static void main(String args[]) {
    Persona per1 = new Persona(435762, 31, "Javier", "Hernandez Perez");
    Lista lista = new Lista();
    lista.insertar(per1);
    Persona per2 = new Persona(1234567, 23, "Juan", "Lopez Segura");
    lista.insertar(per2);
    lista.insertar(per1);
    System.out.println(lista);
    Persona per3 = lista.recuperar(1);
    per3.ponNombre("Pedro");
    System.out.println(lista);
    //System.out.println(lista.borrarPersonaPosicion(2));
    //System.out.println(lista);
    //lista.borrarPersonaDni(1234567);
    System.out.println("prueba " + lista.recuperar(lista.buscarDni(435762)));
    //System.out.println(lista);
    //String encontrados = lista.buscarApellido("ez");
    //if (encontrados.isEmpty())
    //	System.out.println("No hay nadie con ese apellido");
//    else
    	//System.out.println(encontrados);
    Persona[] encontrados = new Persona[lista.length()];
    encontrados =lista.buscarApellido2("a");
    if (encontrados[0]== null)
    	System.out.println("No hay nadie con ese apellido");
    else {
    	int i=0;
    		while (encontrados[i] !=null) {
    			System.out.println(encontrados);
    			i++;
    		}
    }
    	
    
  }
}