package concesionarioCoches;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ConcesionarioTest {
	Concesionario concesionario;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		concesionario = new Concesionario();
        concesionario.annadir("1111BBB", Color.AZUL, Modelo.CORDOBA);
        concesionario.annadir("1111CCC", Color.ROJO, Modelo.CORDOBA);
        concesionario.annadir("1111VVX", Color.PLATA, Modelo.CORDOBA);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAnnadir() {
		//Añadir coche correctamente
				assertTrue(concesionario.annadir("1234BBC", Color.AZUL,Modelo.CORDOBA));
				assertTrue(concesionario.annadir("1234CCX", Color.AZUL,Modelo.CORDOBA));
				//añadir coches incorrectamente
				assertFalse(concesionario.annadir("1234BBC", null,null));
				assertFalse(concesionario.annadir("1234ABC", Color.AZUL, Modelo.CORDOBA));
				assertFalse(concesionario.annadir("1234AB", Color.AZUL, Modelo.CORDOBA));
				assertFalse(concesionario.annadir("123BBC", Color.AZUL, Modelo.CORDOBA));
				assertFalse(concesionario.annadir("1234_BBC", Color.AZUL, Modelo.CORDOBA));
				assertFalse(concesionario.annadir("1234ABCD", Color.AZUL, Modelo.CORDOBA));
				assertFalse(concesionario.annadir("1234&BC", Color.AZUL, Modelo.CORDOBA));
				assertFalse(concesionario.annadir("BBC1234", Color.AZUL, Modelo.CORDOBA));
				//Repetir coche
				assertFalse(concesionario.annadir("1234BBC", Color.AZUL,Modelo.CORDOBA));
	}

	@Test
	public void testEliminar() {
		//Eliminar coche
				assertTrue(concesionario.eliminar("1111BBB"));
				assertFalse(concesionario.eliminar("1111BBB"));
	}

	@Test
	public void testSize() {
		//Comprobar almacen del coche, ahora mismo esta creado "1234CCX"
				assertEquals(concesionario.size(), 3);
				assertNotEquals(concesionario.size(), 0);
	}

	@Test
	public void testGet() {
		//Mostrar coche
				assertNotNull(concesionario.get("1111BBB"));
		//Mostrar coche inexistente
				assertNull(concesionario.get("1234VVX"));
	}

	@Test
	public void testGetCochesColor() {
				assertNotNull(concesionario.getCochesColor(Color.AZUL));
				assertNotNull(concesionario.getCochesColor(Color.ROJO));
				assertNotNull(concesionario.getCochesColor(Color.PLATA));
	}

}
