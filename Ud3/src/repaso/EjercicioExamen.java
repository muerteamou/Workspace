package repaso;

public class EjercicioExamen {

	public static void main(String[] args) {
		String [] empleados = {"Alberto Carrera", "Luis Aldea", "Leticia García", "Ana Ereza", "Belén Carrera"};
		double [][] salarios = {{540, 540, 760},
				                {200, 220, 250},
				                {760, 760, 760},
				                {605, 799, 810},
				                {800, 800, 680}
							   };
		
		System.out.println(salarios[0].length);
		
		double [] sueldos = new double[empleados.length];
		
		double max =0;
		
		for (int i = 0; i < empleados.length; i++) {
			for (int j = 0; j < salarios[i].length; j++) {
	
				sueldos[i]= sueldos[i] + salarios[i][j];
			}
		}
		
		for (int i = 0; i < sueldos.length; i++) {
			max=sueldos[0];
			if(max<sueldos[i]) {
				max=sueldos[i];
			}
		}
		
		for (int i = 0; i < empleados.length; i++) {
			sueldos[i]=0;
			System.out.print(empleados[i] + " tiene estos sueldos : ");
			for (int j = 0; j < salarios[i].length; j++) {
				System.out.print(salarios[i][j] + " - ");
				sueldos[i]= sueldos[i] + salarios[i][j];
			}if(sueldos[i]==max) {
				System.out.print(" es/son los que más cobran");
			}System.out.println("");
		}
		
		
		System.out.println(max);
		
		

	}

	
	
	public static double [] sumarSueldos(double salarios[][]) {
		double [] sueldos = new double[salarios.length];
		for (int i = 0; i < salarios.length; i++) {
			for (int j = 0; j < salarios[i].length; j++) {
				sueldos[i]= sueldos[i] + salarios[i][j];
			}
		}
		return sueldos;
	}

}
