package ec.edu.ups.control;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestControlRecord {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testAgregarRecordAcademico() {
		ControlRecordAcademico record = new ControlRecordAcademico();
		record.agregarRecordAcademico(null);
		String c= null;
		assertEquals(record,c);
	}

	@Test
	public final void testGenerarRecordAcademico() {
		ControlRecordAcademico record = new ControlRecordAcademico();
		record.generarRecordAcademico();
		String c= null;
		assertEquals(record,c);
	}

	@Test
	public final void testModificarRecordAcademico() {
		ControlRecordAcademico record = new ControlRecordAcademico();
		record.modificarRecordAcademico();
		String c= null;
		assertEquals(record,c);
	}

	@Test
	public final void testEliminarRecordAcademico() {
		ControlRecordAcademico record = new ControlRecordAcademico();
		record.generarRecordAcademico();
		String c= null;
		assertEquals(record,c);
	}

	@Test
	public final void testLeerRecordAcademicos() {
		ControlRecordAcademico record = new ControlRecordAcademico();
		record.leerRecordAcademicos("sa");
		String c= null;
		assertEquals(record.leerRecordAcademicos("sa"),c);
	}

}


