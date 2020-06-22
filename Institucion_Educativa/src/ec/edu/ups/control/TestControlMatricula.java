package ec.edu.ups.control;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestControlMatricula {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testGenerarMatricula() {
		ControlMatricula matricula = new ControlMatricula();
	    matricula.generarMatricula();
		String c= "";
		assertEquals(matricula, c);
	}
}