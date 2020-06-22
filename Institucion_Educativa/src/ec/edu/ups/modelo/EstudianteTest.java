package ec.edu.ups.modelo;

import java.sql.Date;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;

public class EstudianteTest extends TestCase {

	
	@Test
	public void testGetApellido() {
		Estudiante estudiante = new Estudiante ();
		String c= "";
		estudiante.setApellido("");
		String result = estudiante.getApellido();
		assertEquals(result,c);
	}
	
	@Test
	public void testGetFecha() {
		Estudiante estudiante = new Estudiante ();
		Date result = (Date) estudiante.getFechaNac();
		Date s= null;
		assertEquals(result,s);
	}

	public void testGetNombre() {
		Estudiante estudiante = new Estudiante ();
		String c= "";
		estudiante.setNombre("");
		String result = estudiante.getNombre();
		assertEquals(result,c);
	}
	@Test
	public void testGetCorreo() {
		Estudiante estudiante = new Estudiante ();
		String result = estudiante.getCorreoInstintucional();
		String c= "";
		assertEquals(result,c);
	}
	
	@Test
	public void testGetContrasenia() {
		Estudiante estudiante = new Estudiante ();
		String result = estudiante.getContrasenia();
		String c= "";
		assertEquals(result,c);
	}

	@Test
	public void testGetDireccion() {
		Estudiante estudiante = new Estudiante ();
		String result = estudiante.getDireccion();
		String c= "";
		assertEquals(result,c);
	}
	
	@Test
	public void testGetEstado() {
		Estudiante estudiante = new Estudiante ();
		char result = estudiante.getEstado();
		String c= "";
		assertEquals(result,c);
	}
	@Test
	public void testGetrol() {
		Estudiante estudiante = new Estudiante ();
		Rol result = estudiante.getRol();
		String c= "";
		assertEquals(result,c);
	}
	
	@Test
	public void testGetTelefono() {
		Estudiante estudiante = new Estudiante ();
		ArrayList<Telefono> result = estudiante.getTelefonos();
		String c= "";
		assertEquals(result,c);
	}
}
