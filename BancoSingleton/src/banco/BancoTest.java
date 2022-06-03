package banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BancoTest {

	@Test
	void testBancoSigleton() {
		Banco b = Banco.getInstance();
		b.abrirCuenta(new Cuenta("Juanito123", 123.34));
		Banco b2 = Banco.getInstance();
		b2.abrirCuenta(new Cuenta("Pepito321", 321.32));
		assertEquals(b.getListaCuentas(), b2.getListaCuentas());
	}

}
