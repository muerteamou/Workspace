package arrays_alumnos;

import java.util.Scanner;

public class ejercicio13copia {

	/*
	 * a. Visualizar nota máxima, mínima y media de cada alumno. b. Visualizar nota
	 * máxima, mínima y media de cada asignatura. c. Visualizar nota máxima, mínima
	 * y media del curso. d. A partir de una nota que se pedirá por teclado,
	 * visualizar qué alumnos la han obtenido y en qué asignaturas (aunque en el
	 * ejemplo no se cumple, tened en cuenta que una misma nota podría aparecer
	 * repetida en distintas posiciones de la matriz…).
	 */
	public static void leerMatriz(double[][] x) {
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j] + " ");
			}
			System.out.println("");
		}
	}
	public static void calcularMatriz(double[][]notas) {
		int asignatura = 0,	alumno = 0;
		double min=notas[0][0], max = 0;
		double media = 0;

		for (alumno = 0; alumno < notas.length; alumno++) {
				//min = notas[0][0];
			for (asignatura = 0; asignatura < notas[alumno].length; asignatura++) {
				
				if (max < notas[alumno][asignatura]) {
					max = notas[alumno][asignatura];
				}

				if (min > notas[alumno][asignatura]) {
					min = notas[alumno][asignatura];
				}
				media = media + notas[alumno][asignatura];
			}
			
		
		}System.out.printf("%nLa nota media del curso es : %.2f, la nota minima es: %.1f y la nota máxima es: %.1f",
					media /(asignatura*alumno) , min, max);
		}
	
	public static void buscarNotas(double[][]notas) {
		int asignatura = 0,	alumno = 0, contador=0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce una nota: ");
		double busqueda=s.nextDouble();
		
		
		for (alumno = 0; alumno < notas.length; alumno++) {
			for (asignatura = 0; asignatura < notas[alumno].length; asignatura++) {
				
				if (busqueda==notas[alumno][asignatura]) {
					System.out.println(busqueda + " ha sacado el alumno " + asignatura + " en la signatura "+ alumno);
				}
				else
					contador++;
				
				}
				
			}
			if (contador==asignatura*alumno)
				System.out.println("La busqueda no coincide");
		
		}
	
	

	// Aqui quiero calcular media, minima y maxima de cada alumno
	public static void calculosAsignatura(double[][] notas) {
		int alumno = 0, asignatura = 0;
		double media = 0, max = 0, min = 0;
		double notasAsignatura[][] = new double[notas[0].length][notas.length];

		// notas[Alumno][Asignatura]
		// el primer indica la fila y el segundo indica la columna
		for (alumno = 0; alumno < notas.length; alumno++) {
			for (asignatura = 0; asignatura < notas[alumno].length; asignatura++) {
				notasAsignatura[asignatura][alumno] = notas[alumno][asignatura];
			}
		}

		for (asignatura = 0; asignatura < notasAsignatura.length; asignatura++) {
			max = notasAsignatura[asignatura][0];
			min = notasAsignatura[asignatura][0];
			media = 0;
			for (alumno = 0; alumno < notasAsignatura[asignatura].length; alumno++) {

				if (max < notasAsignatura[asignatura][alumno]) {
					max = notasAsignatura[asignatura][alumno];
				}
				if (min > notasAsignatura[asignatura][alumno]) {
					min = notasAsignatura[asignatura][alumno];
				}
				media = media + notasAsignatura[asignatura][alumno];

			}
			System.out.printf("%nAsignatura nº " + asignatura + ": media %.2f - nota minima: %.1f - nota máxima: %.1f",
					media / notasAsignatura[asignatura].length, min, max);

		}
	}

	public static void calculosAlumnos(double[][] notas) {
		int asignatura = 0,	alumno = 0;
		double min=0, max = 0;
		

		for (alumno = 0; alumno < notas.length; alumno++) {
			max = notas[alumno][0];
			min = notas[alumno][0];
			double media = 0;
			for (asignatura = 0; asignatura < notas[alumno].length; asignatura++) {
				
				if (max < notas[alumno][asignatura]) {
					max = notas[alumno][asignatura];
				}

				if (min > notas[alumno][asignatura]) {
					min = notas[alumno][asignatura];
				}
				media = media + notas[alumno][asignatura];
			}
			System.out.printf("%nAlumno nº " + alumno + ": media %.2f, - nota minima: %.1f - nota máxima: %.1f",
					media / notas[alumno].length, min, max);
		}

	}

	public static void main(String[] args) {
		double notas[][] = { { 5.6, 9.4, 6.8, 7 }, { 6.9, 5.2, 5.7, 6.3 }, { 9.8, 8, 7.6, 8.5 }, };
		leerMatriz(notas);
		calculosAsignatura(notas);
		System.out.println("");
		calculosAlumnos(notas);
		System.out.println("");
		calcularMatriz(notas);
		System.out.println("");
		buscarNotas(notas);
	}
}
