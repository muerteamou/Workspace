package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import banco.Cuenta;

class CuentaTest {
	static Cuenta c;

	@BeforeEach
	void antesdecada() {
		c = new Cuenta("pepe", 200.0);
	}

	@Test
	void testCuenta() {
		Cuenta c2 = new Cuenta("pepe", 200.0);
		assertEquals(c.getNumero(), c2.getNumero());
		// fail("Not yet implemented");
	}

	@Test
	void testGetNumero() {
		String resultado = c.getNumero();
		assertEquals("pepe", resultado);
		// fail("Not yet implemented");
	}

	@Test
	void testSetNumero() {
		String resultado = c.getNumero();
		assertEquals("pepe", resultado);
		// fail("Not yet implemented");
	}

	@Test
	void testGetSaldo() {
		Double resultado = c.getSaldo();
		assertEquals(200.0, resultado);
		// fail("Not yet implemented");
	}

	@Test
	void testSetSaldo() {
		double resultado = c.getSaldo();
		assertEquals(200.0, resultado);
		// fail("Not yet implemented");
	}

	@Test
	void testToString() {
		Cuenta c2 = new Cuenta("pepe", 200.0);
		assertEquals(c.toString(), c2.toString());
		// fail("Not yet implemented");
	}

	@Test
	void testIngresarDinero() throws Exception {
		c.ingresarDinero(10.0);
		assertEquals(210, c.getSaldo());
		// fail("Not yet implemented");
	}

	@Test
	void testExtraerDinero() throws Exception {
		c.extraerDinero(10.0);
		assertEquals(190, c.getSaldo());
		// fail("Not yet implemented");
	}

	@Test
	void testIngresarDineroImporteNegativo() {
		try {
			c.ingresarDinero(-10.0);
			fail("Si hemos llegado hasta aqui es que no ha saltado la escepción.");
		} catch (Exception e) {
			assertEquals(e.getMessage(), "En un ingreso, el importe tiene que ser positivo.");
		}
	}

	@Test
	void testExtraerDineroSaldoInsuficiente() {
		try {
			c.extraerDinero(210);
			fail("Si hemos llegado hasta aqui es que no ha saltado la escepción.");
		} catch (Exception e) {
			assertEquals(e.getMessage(), "En una extracción el importe no puede ser mayor al saldo.");
		}
	}

	@Test
	void testExtraerDineroImporteNegativo() {
		try {
			c.extraerDinero(-10.0);
			fail("Si hemos llegado hasta aqui es que no ha saltado la escepción.");
		} catch (Exception e) {
			assertEquals(e.getMessage(), "En una extracción el importe a extraer debe ser positivo.");
		}
	}
}
