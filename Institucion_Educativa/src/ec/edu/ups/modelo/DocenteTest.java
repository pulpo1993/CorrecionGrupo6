package ec.edu.ups.modelo;

import org.junit.Test;

import junit.framework.TestCase;

public class DocenteTest extends TestCase {

	
	@Test
	public void testGetApellido() {
		Docente docente = new Docente ();
		String c= "";
		docente.setApellido("");
		String result = docente.getApellido();
		assertEquals(result,c);
	}
	
	@Test
	public void testGetNombre() {
		Docente docente = new Docente ();
		String c= "";
		docente.setNombre("");
		String result = docente.getNombre();
		assertEquals(result,c);
	}
}
