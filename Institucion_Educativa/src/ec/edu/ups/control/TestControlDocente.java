package ec.edu.ups.control;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ec.edu.ups.modelo.Docente;

public class TestControlDocente {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testRegistarDocente() {
		ControlDocente docente = new ControlDocente();
	    docente.registarDocente();
		String c= "";
		assertNotEquals(docente, c);
	}

	@Test
	public final void testActualizarDocente() {

		ControlDocente docente = new ControlDocente();
	    docente.actualizarDocente();
		String c= "";
		assertNotEquals(docente, c);
	}

	@Test
	public final void testLeerInformacion() {
		ControlDocente docente = new ControlDocente();
	    docente.leerInformacion();
		String c= "";
		assertEquals(docente.leerInformacion(), c);
	}

	@Test
	public final void testLostarDocentes() {
		ControlDocente docente = new ControlDocente();
	    docente.lostarDocentes();
		List<Docente>lista=docente.lostarDocentes();
		assertEquals(docente.lostarDocentes(), lista);
	}

}
