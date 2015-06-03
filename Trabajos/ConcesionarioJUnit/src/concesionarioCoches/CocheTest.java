package concesionarioCoches;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CocheTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInstanciarCocheStringColorModelo() {
		//Coches correctamente creados.
				assertNotNull(Coche.instanciarCoche("1234BBC", Color.AZUL, Modelo.CORDOBA));
				assertNotNull(Coche.instanciarCoche("1234 BBC", Color.AZUL, Modelo.CORDOBA));
				assertNotNull(Coche.instanciarCoche("1234-BBC", Color.AZUL, Modelo.CORDOBA));
		//Coches incorrectamente creados.
				assertNull(Coche.instanciarCoche("1234ABC", Color.AZUL, Modelo.CORDOBA));
				assertNull(Coche.instanciarCoche("1234AB", Color.AZUL, Modelo.CORDOBA));
				assertNull(Coche.instanciarCoche("123BBC", Color.AZUL, Modelo.CORDOBA));
				assertNull(Coche.instanciarCoche("1234_BBC", Color.AZUL, Modelo.CORDOBA));
				assertNull(Coche.instanciarCoche("1234ABCD", Color.AZUL, Modelo.CORDOBA));
				assertNull(Coche.instanciarCoche("1234&BC", Color.AZUL, Modelo.CORDOBA));
				assertNull(Coche.instanciarCoche("BBC1234", Color.AZUL, Modelo.CORDOBA));
				assertNull(Coche.instanciarCoche("1234ABC", null, null));
	}

	@Test
	public void testInstanciarCocheString() {
		//Instanciar matricula correctamente
				assertNotNull(Coche.instanciarCoche("1234BBC"));
				assertNotNull(Coche.instanciarCoche("1234 BBC"));
				assertNotNull(Coche.instanciarCoche("1234-BBC"));
		//Instanciar matricula incorrectamente
				assertNull(Coche.instanciarCoche("1234ABC"));
				assertNull(Coche.instanciarCoche("1234AB"));
				assertNull(Coche.instanciarCoche("123BBC"));
				assertNull(Coche.instanciarCoche("1234_BBC"));
				assertNull(Coche.instanciarCoche("1234ABCD"));
				assertNull(Coche.instanciarCoche("1234&BC"));
				assertNull(Coche.instanciarCoche("BBC1234"));
	}
}
