package _04ordenando_colecciones;
import java.util.ArrayList;
import java.util.Collections;
public class PruebaPerson {
    public static void main(String arg[]) {
        Person p1, p2, p3;
    	ArrayList<Person> listaPersonas = new ArrayList<Person>();
        listaPersonas.add(p1=new Person(1,"Maria",185));
        listaPersonas.add(p2=new Person(2,"Carla",190));
        listaPersonas.add(p3=new Person(3,"Yovana",170));
        //System.out.println(p1.compareTo(p2));
        
        //System.out.println("Juan".compareTo("Carrera"));
        Collections.sort(listaPersonas);  // Ejemplo uso ordenaci�n natural
        System.out.println("Personas Ordenadas por orden natural: "+listaPersonas);
      } 
}