package ec.edu.ups.modelo;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante es = new Estudiante();
		es.setApellido("12");
		es.setCedula("2");
		es.setContrasenia("3");
		es.setCorreoInstintucional("@");
		es.setDireccion("d");
		es.setEstado('c');
		Date fechaNac = new GregorianCalendar(2020, Calendar.FEBRUARY, 20).getTime();
		es.setFechaNac(fechaNac);
		es.setId(1);
		es.setIdPersona(2);
		es.setNombre("name");
		es.setRol(null);
		System.out.println(es.toString());
	}
}
