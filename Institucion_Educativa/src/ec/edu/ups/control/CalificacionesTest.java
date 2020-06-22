package ec.edu.ups.control;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ec.edu.ups.modelo.Calificacion;
import ec.edu.ups.modelo.Estudiante;

public class CalificacionesTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testAgregarCalificacion() { 
		
	ControlCalificaciones calificacion = new ControlCalificaciones();
	    calificacion.agregarCalificacion();
		String c= "";
		assertEquals( calificacion.agregarCalificacion(),c);
	}

	@Test
	public final void testModificarCalificacion() {

		ControlCalificaciones calificacion = new ControlCalificaciones();
	    calificacion.modificarCalificacion();
		String c= "";
		assertEquals( calificacion.modificarCalificacion(),c);
	
	}

	@Test
	public final void testVerCalificaciones() {
		ControlCalificaciones calificacion = new ControlCalificaciones();
	    calificacion.verCalificaciones();
		String c= "";
		assertEquals( calificacion.verCalificaciones(),c);
	}

}
