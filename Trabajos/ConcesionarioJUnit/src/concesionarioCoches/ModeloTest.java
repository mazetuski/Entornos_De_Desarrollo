package concesionarioCoches;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ModeloTest {

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
	public void testModelo() {
		//Existen estos modelos
				assertNotNull(Modelo.CORDOBA);
				assertNotNull(Modelo.IBIZA);
				assertNotNull(Modelo.SERIE1);
				assertNotNull(Modelo.SERIE2);
				assertNotNull(Modelo.SERIE3);
				assertNotNull(Modelo.SERIE5);
				assertNotNull(Modelo.TOLEDO);
	}

	@Test
	public void testGetMarca() {
		//Las marcas pertenecen a los modelos
				assertEquals(Modelo.CORDOBA.getMarca(), Marca.SEAT);
				assertEquals(Modelo.TOLEDO.getMarca(), Marca.SEAT);
				assertEquals(Modelo.IBIZA.getMarca(), Marca.SEAT);
				assertEquals(Modelo.SERIE1.getMarca(), Marca.BMW);
				assertEquals(Modelo.SERIE2.getMarca(), Marca.BMW);
				assertEquals(Modelo.SERIE3.getMarca(), Marca.BMW);
				assertEquals(Modelo.SERIE5.getMarca(), Marca.BMW);
		//Las marcas no pertenecen a los modelos
				assertNotEquals(Modelo.CORDOBA.getMarca(), Marca.BMW);
				assertNotEquals(Modelo.TOLEDO.getMarca(), Marca.BMW);
				assertNotEquals(Modelo.IBIZA.getMarca(), Marca.BMW);
				assertNotEquals(Modelo.SERIE1.getMarca(), Marca.SEAT);
				assertNotEquals(Modelo.SERIE2.getMarca(), Marca.SEAT);
				assertNotEquals(Modelo.SERIE3.getMarca(), Marca.SEAT);
				assertNotEquals(Modelo.SERIE5.getMarca(), Marca.SEAT);
	}

}
