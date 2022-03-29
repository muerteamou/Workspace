package Ejercicios;

import java.util.ArrayList;

public class ListaDepartamento {
	private ArrayList<Departamento> lista;
	
	
	public ListaDepartamento() {
		lista = new ArrayList<Departamento>();
	}
	
	public void add(Departamento dep) {
		lista.add(dep);
	}
	
	public ArrayList<Departamento> getLista(){
		return lista;
	}
}
