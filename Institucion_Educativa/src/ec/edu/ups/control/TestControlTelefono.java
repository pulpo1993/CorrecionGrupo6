package ec.edu.ups.control;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ec.edu.ups.modelo.Telefono;

public class TestControlTelefono {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testAgregarTelefono() {
		ControlTelefono tele = new ControlTelefono();
	   
		Telefono t= new Telefono();
	
		tele.agregarTelefono(t);
		String c= "";
		assertEquals(t,tele);
	}

	@Test
	public final void testActualizarDatosTelefono() {
		ControlTelefono tele = new ControlTelefono();
		   
		Telefono t= new Telefono();
	
		tele.agregarTelefono(t);
		String c= "";
		assertEquals(t,tele);
	
	}

	@Test
	public final void testLeerTelefonosCedula() {
		ControlTelefono tele = new ControlTelefono();
		   
		Telefono t= new Telefono();
	
		tele.agregarTelefono(t);
		String c= "";
		assertEquals(t,tele);
	
	}

	@Test
	public final void testEliminarTelefono() {
		ControlTelefono tele = new ControlTelefono();
		   
		Telefono t= new Telefono();
	
		tele.agregarTelefono(t);
		String c= "";
		assertEquals(t,tele);
	}

	
}
