package empleados;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
//
// Alberto Carrera Mart�n - Abril 2020
//

public class AccesoBdatos {
	private EntityManagerFactory emf;
	private EntityManager em;

	public void conectar() {
		emf = Persistence.createEntityManagerFactory("db/empleados.odb");
		em = emf.createEntityManager();
	}

	public void desconectar() {
		em.close();
		emf.close();
	}

	public DepartamentoEntity buscarDepartamento(int numDepartamento) {
		return em.find(DepartamentoEntity.class, numDepartamento);
	}// de m�todo buscarDepartamento
		//

	@SuppressWarnings("deprecation")
	public void imprimirDepartamento(int numDepartamento) {
		DepartamentoEntity d = buscarDepartamento(numDepartamento);
		if (d == null)
			System.out.println("No existe el Departamento " + numDepartamento);
		else {
			Set<EmpleadoEntity> empleados = d.getEmpleados();
			String datos = "Datos del departamento " + numDepartamento + ": ";
			datos += "Nombre: " + d.getNombre() + " - Localidad: " + d.getLocalidad() + "\n";
			if (empleados.isEmpty())
				datos += "No tiene empleados en este momento";
			else {
				datos += "Lista de empleados" + "\n";
				datos += "*******************";
			}
			for (EmpleadoEntity empleado : empleados) {
				datos += "\nNúmero de empleado: " + empleado.getEmpnoId() + "\n";
				datos += "Nombre: " + empleado.getNombre() + "\n";
				datos += "Oficio: " + empleado.getOficio() + "\n";
				if (empleado.getDirId() == null)
					datos += "Jefe: No tiene" + "\n";
				else
					datos += "Jefe: " + empleado.getDirId().getNombre() + "\n";
				datos += "Año de alta: " + (empleado.getAlta().getYear() + 1900) + "\n";
				datos += "Salario: " + empleado.getSalario() + "\n";
				if (empleado.getComision() == null)
					datos += "Comisión: No tiene" + "\n";
				else
					datos += "Comisión: " + empleado.getComision() + "\n";
			}

			System.out.println(datos);
		}
	} // de m�todo imprimirDepartamento

	public boolean insertarDepartamento(DepartamentoEntity d) {
		if (buscarDepartamento(d.getDptoId()) != null)
			return false;
		em.getTransaction().begin();
		em.persist(d);
		em.getTransaction().commit();
		return true;
	} // de insertarDepartamento

	public boolean modificarDepartamento(DepartamentoEntity d) {
		DepartamentoEntity departamentoBuscado = buscarDepartamento(d.getDptoId());
		if (departamentoBuscado == null)
			return false;
		em.getTransaction().begin();
		departamentoBuscado.setNombre(d.getNombre());
		departamentoBuscado.setLocalidad(d.getLocalidad());
		em.persist(departamentoBuscado);
		em.getTransaction().commit();
		return true;
	} // de modificarDepartamento

	// Si tiene empleados lo borrar�a igual, dejando en estos el n�mero de
	// Departamento
	// pero el resto de los atributos del departamento a null. Por eso no dejo
	// borrar

	public boolean borrarDepartamento(int numDepartamento) {
		DepartamentoEntity departamentoBuscado = buscarDepartamento(numDepartamento);
		if (departamentoBuscado == null || !departamentoBuscado.getEmpleados().isEmpty())
			return false;
		em.getTransaction().begin();
		em.remove(departamentoBuscado);
		em.getTransaction().commit();
		return true;
	} // de modificarDepartamento

	public int incrementarSalario(int cantidad) {
		int contador;
		em.getTransaction().begin();
		Query q1 = em.createQuery("UPDATE EmpleadoEntity SET salario = salario + :c");
		q1.setParameter("c", cantidad);
		contador = q1.executeUpdate();
		em.getTransaction().commit();
		return contador;
		
	}
	
	public int incrementarSalarioOficio(String oficio, int cantidad) {
		int contador;
		em.getTransaction().begin();
		Query query = em.createQuery("UPDATE EmpleadoEntity SET salario = salario + :c WHERE oficio = :o");
		query.setParameter("c", cantidad);
		query.setParameter("o", oficio);
		contador = query.executeUpdate();
		em.getTransaction().commit();
		return contador;
	}
	
	public int incrementarSalarioDepartamento (int numDepartamento, int cantidad) {
		int contador;
		em.getTransaction().begin();
		Query query = em.createQuery("UPDATE EmpleadoEntity SET salario = salario + :c WHERE departamento.getDptoId() = :d ");
		query.setParameter("c", cantidad);
		query.setParameter("d", numDepartamento);
		contador = query.executeUpdate();
		em.getTransaction().commit();		
		return contador;
	}
	
	public int borrarEmpleado (int numEmpleado) {
		int contador;
		em.getTransaction().begin();
		Query query = em.createQuery("DELETE FROM EmpleadoEntity WHERE empnoId = :c");
		query.setParameter("c", numEmpleado);
		contador = query.executeUpdate();
		em.getTransaction().commit();
		return contador;
	}
	
	public void demoJPQL() {

		/*
		 * Query q1 = em.createQuery("SELECT COUNT(d) FROM DepartamentoEntity d");
		 * System.out.println("Total Departamentos: " + q1.getSingleResult()); //
		 * TypedQuery<Long> tq1 = em.createQuery(
		 * "SELECT COUNT(d) FROM DepartamentoEntity d", Long.class);
		 * System.out.println("Total Departamentos: " + tq1.getSingleResult()); //
		 * TypedQuery<DepartamentoEntity>tq2 =
		 * em.createQuery("SELECT d FROM DepartamentoEntity d",
		 * DepartamentoEntity.class); List<DepartamentoEntity> l2 = tq2.getResultList();
		 * for (DepartamentoEntity r2 : l2) { System.out.println("Nombre :  " +
		 * r2.getNombre()+ ", Localidad: "+ r2.getLocalidad()); } //
		 * TypedQuery<Object[]>tq3 =
		 * em.createQuery("SELECT d.nombre, d.localidad FROM DepartamentoEntity  d",
		 * Object[].class); List<Object[]> l3 = tq3.getResultList(); for (Object[] r3 :
		 * l3) { System.out.println( "Nombre :  " + r3[0] + ", Localidad: " + r3[1]); }
		 * // TypedQuery<Object[]>tq4 =
		 * em.createQuery("SELECT d.nombre, d.localidad FROM DepartamentoEntity d" +
		 * " WHERE d.dptoId != :n", Object[].class); tq4.setParameter("n", 10);
		 * List<Object[]> l4 = tq4.getResultList(); for (Object[] r4 : l4) {
		 * System.out.println( "Nombre :  " + r4[0] + ", Localidad: " + r4[1]); }
		 */
		System.out.println("=====================================================================");
		System.out.println("1. Nombre y fecha de alta de todos los empleados");
		System.out.println("=====================================================================\n");
		
		TypedQuery<Object[]> tq1 = em.createQuery("SELECT e.nombre, e.alta FROM EmpleadoEntity e", Object[].class);
		List<Object[]> l1 = tq1.getResultList();
		for (Object[] r1 : l1) {
			System.out.println("Nombre : " + r1[0] + " - " + r1[1]);
		}
		
		System.out.println("\n=====================================================================");
		System.out.println(
				"2. Ídem de la anterior pero para aquellos que \"Carrera\" forma parte\rdel nombre. No distinguir mayúsculas de minúsculas");
		System.out.println("=====================================================================\n");

		TypedQuery<Object[]> tq2 = em.createQuery(
				"SELECT e.nombre, e.alta FROM EmpleadoEntity e WHERE UPPER(e.nombre) LIKE '%CARRERA%'", Object[].class);
		List<Object[]> l2 = tq2.getResultList();
		for (Object[] r2 : l2) {
			System.out.println(r2[0] + " - " + r2[1]);
		}
		System.out.println("\n=====================================================================");
		System.out.println("3. Empleados del Departamento I+D cuyo oficio es el de Empleado");
		System.out.println("=====================================================================\n");

		TypedQuery<Object[]> tq3 = em.createQuery(
				"SELECT e.nombre, e.oficio, e.departamento.nombre FROM EmpleadoEntity e WHERE e.oficio='Empleado' AND e.departamento.nombre='I+D'",
				Object[].class);
		List<Object[]> l3 = tq3.getResultList();
		for (Object[] r3 : l3) {
			System.out.println(r3[0] + " - " + r3[1] + " - " + r3[2]);
		}
		System.out.println("\n=====================================================================");
		System.out.println("4. Empleados contratados a partir del 2003");
		System.out.println("=====================================================================\n");
		
		TypedQuery<Object[]> tp4 =em.createQuery("SELECT e.nombre, e.alta FROM EmpleadoEntity e WHERE YEAR(e.alta)>= 2003", Object[].class);
		List<Object[]> l4 = tp4.getResultList();
		for (Object[] r4 : l4) {
			System.out.println(r4[0] + " - " + r4[1]);
		}
		
		System.out.println("\n=====================================================================");
		System.out.println("5. Empleados por orden alfabético de departamento");
		System.out.println("=====================================================================\n");

		TypedQuery<Object[]> tp5 =em.createQuery("SELECT e.departamento.nombre, e.nombre FROM EmpleadoEntity e ORDER BY e.departamento.nombre", Object[].class);
		List<Object[]> l5 = tp5.getResultList();
		for (Object[] r5 : l5) {
			System.out.println(r5[0] + " - " + r5[1]);
		}
		
		System.out.println("\n=====================================================================");
		System.out.println("6. Nombre, no de empleados, total y máximo salario de los departamentos con empleados");
		System.out.println("=====================================================================\n");
		
		TypedQuery<Object[]> tp6 =em.createQuery("SELECT e.departamento.nombre, COUNT(e.nombre), SUM(e.salario),"
				+ " MAX(e.salario) FROM EmpleadoEntity e GROUP BY e.departamento.nombre", Object[].class);
		
		List<Object[]> l6 = tp6.getResultList();
		for (Object[] r6 : l6) {
			System.out.println(r6[0] + " - " + r6[1] + " - " + r6[2] + " - " + r6[3]);
		}
		
		
		System.out.println("\n=====================================================================");
		System.out.println("7. Ídem de la anterior pero para departamentos a partir de 5 empleados");
		System.out.println("=====================================================================\n");
		
		TypedQuery<Object[]> tp7 = em.createQuery("SELECT e.departamento.nombre, COUNT(e.nombre), SUM(e.salario),"
				+ " MAX(e.salario) FROM EmpleadoEntity e GROUP BY e.departamento.nombre HAVING COUNT(e.nombre)>=5", Object[].class);
		List<Object[]> l7 = tp7.getResultList();
		for (Object[] r7 : l7) {
			System.out.println(r7[0] + " - " + r7[1] + " - " + r7[2] + " - " +r7[3]);
		}
		
		System.out.println("\n=====================================================================");
		System.out.println("8. Cada empleado junto con su jefe");
		System.out.println("=====================================================================\n");
		TypedQuery<Object[]> tp8 = em.createQuery("SELECT e.nombre, e.dirId.nombre, e.departamento.dptoId FROM EmpleadoEntity e", Object[].class);
		List<Object[]> l8 = tp8.getResultList();
		for (Object[] r8 : l8) {
			System.out.println(r8[0] + " - su jefe es - " + r8[1] + " - departamento - " + r8[2]);
		}
		
		
		System.out.println("\n=====================================================================");
		System.out.println("9. Nombre y total de empleados de los departamentos con algún empleado");
		System.out.println("=====================================================================\n");
		TypedQuery<Object[]> tp9 = em.createQuery("SELECT d.nombre, COUNT(e), FROM DepartamentoEntity d JOIN d.empleados e GROUP BY d.nombre", Object[].class);
		List<Object[]> l9 = tp9.getResultList();
		for (Object[] r9 : l9) {
			System.out.println(r9[0] + " - " + r9[1]);
		}
		
		
		System.out.println("\n=====================================================================");
		System.out.println("10. Nombre y total de empleados de TODOS los departamentos");
		System.out.println("=====================================================================\n");

		TypedQuery<Object[]> tp10 = em.createQuery("SELECT d.nombre, COUNT(e), FROM DepartamentoEntity d LEFT JOIN d.empleados e GROUP BY d.nombre", Object[].class);
		List<Object[]> l10 = tp10.getResultList();
		for (Object[] r10 : l10) {
			System.out.println(r10[0] + " - " + r10[1]);
		}
		
		System.out.println("\n=====================================================================");
		System.out.println("11. Ordenando descendentemente por departamento y ascendentemente por salario");
		System.out.println("=====================================================================\n");
		
		TypedQuery<Object[]> tp11 = em.createQuery("SELECT e.departamento.dptoId, e.nombre, e.salario FROM EmpleadoEntity e ORDER BY e.departamento.dptoId DESC, e.salario ASC", Object[].class);
		List<Object[]> l11 = tp11.getResultList();
		for (Object[] r11 : l11) {
			System.out.println(r11[0] + " - " + r11[1] + " - " + r11[2]);
		}
		
		System.out.println("\n=====================================================================");
		System.out.println("12. Empleados sin jefe.");
		System.out.println("=====================================================================\n");

		TypedQuery<Object[]> tp12 = em.createQuery("SELECT e.empnoId, e.nombre FROM EmpleadoEntity e WHERE e.dirId IS NULL", Object[].class);
		List<Object[]> l12 = tp12.getResultList();
		for (Object[] r12 : l12) {
			System.out.println(r12[0] + " - " + r12[1]);
		}
		
		System.out.println("\n=====================================================================");
		System.out.println("13. Departamento al que pertenece el empleado no 1039");
		System.out.println("=====================================================================\n");
		
		TypedQuery<Object[]> tp13 = em.createQuery("SELECT d.dptoId, d.nombre FROM DepartamentoEntity d JOIN d.empleados e WHERE e.empnoId=1039", Object[].class);
		List<Object[]> l13 = tp13.getResultList();
		for (Object[] r13 : l13) {
			System.out.println(r13[0] + " - " + r13[1]);
		}
	}// de demoJPQL
//--------------------------------------------------------------------------------------------------------------

} // de la clase
