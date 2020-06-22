package ec.edu.ups.modeloTest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import ec.edu.ups.modelo.Asignatura;
import ec.edu.ups.modelo.Docente;
import ec.edu.ups.modelo.Grupo;
import ec.edu.ups.modelo.Rol;
import ec.edu.ups.modelo.Telefono;

// test para crear una asignatura
public class TestJunit {
	
	// test para crear una asignatura
	@Test
	public void testAsignatura() {
		Asignatura a = new Asignatura(1,"Matematicas","Mate",(char) 2);
		a.setId(23);
		a.setNombre("Mate");
		assertTrue(a.CrearAsignatura(1,"Matematicas","Mate",(char) 2)==true);
		assertTrue(a.CrearAsignatura(2,"Lenjuage","lengua",(char) 3)==true);
		assertTrue(a.CrearAsignatura(3,"ECA","no se",(char) 4)==true);
		
	}
	
	// test para crear una grupo
		@Test
		public void testGrupo() {
			
			Grupo g = new Grupo();
			
			assertTrue(g.crearGrupo(1,"noveno","A",20,30,true,27,(char)2)==true);
			assertTrue(g.crearGrupo(2,"decimo","B",30,50,true,35,(char)2)==true);
			assertTrue(g.crearGrupo(3,"octavo","C",20,40,true,45,(char)2)==true);
			
		}
		
	// test para crear una docente
		@Test
		public void testDocente() {
			
		ArrayList telf1= new ArrayList<>();	
		ArrayList asig1= new ArrayList<>();	
		ArrayList gr1= new ArrayList<>();	
			
		Telefono t = new Telefono(1,"4031739","fijo");
		Telefono t1 = new Telefono(2,"4031739","fijo");
		Telefono t2 = new Telefono(3,"4031739","fijo");
		Telefono t3 = new Telefono(4,"4031739","fijo");
		
		Asignatura a = new Asignatura(1,"Matematicas","Mate",(char) 2);
		Asignatura a1 = new Asignatura(2,"Matematicas","Mate",(char) 2);
		Asignatura a2 = new Asignatura(3,"Matematicas","Mate",(char) 2);
		Asignatura a3 = new Asignatura(4,"Matematicas","Mate",(char) 2);
		
		Grupo g = new Grupo(1,"noveno","A",20,30,true,27,(char)2);
		Grupo g1 = new Grupo(2,"decimo","A",20,30,true,27,(char)2);
		Grupo g2 = new Grupo(3,"matematicas","A",20,30,true,27,(char)2);
		Grupo g3 = new Grupo(4,"algebra","A",20,30,true,27,(char)2);
	
		
		Docente d = new Docente();
		d.agregarTelefono(t);
		d.agregarTelefono(t1);
		d.agregarTelefono(t2);
		d.agregarTelefono(t3);
		
		d.agregarAsignatura(a);
		d.agregarAsignatura(a1);
		d.agregarAsignatura(a2);
		d.agregarAsignatura(a3);
		
		d.agregarGrupo(g);
		d.agregarGrupo(g1);
		d.agregarGrupo(g2);
		d.agregarGrupo(g3);
		
		Rol r = new Rol(1,"Administrador");
		
		
		System.out.println("Telefono");
		for (Telefono telf : d.getTelefonos()) {
			telf1.add(d.getTelefonos());
			System.out.println(telf.toString());
		}
		
		System.out.println("Grupos");
		for ( Grupo telf : d.getGrupos()) {
			gr1.add(d.getGrupos());
			System.out.println(telf.toString());
		}
		
		System.out.println("Asignaturas");
		for (Asignatura telf : d.getAsignaturas()) {
			asig1.add(d.getAsignaturas());
			System.out.println(telf.toString());
		}
		
		assertTrue(d.crearDocente(1,"0105262434","Juanito","Perez",null,"tjuanito@ups.edu.ec","Karla",
				"Bella Union",(char)2,r,"Redes",telf1,asig1,gr1)==true);
				
					
		}	

}
