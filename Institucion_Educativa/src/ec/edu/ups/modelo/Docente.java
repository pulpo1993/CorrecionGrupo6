package ec.edu.ups.modelo;

import java.util.ArrayList;
import java.util.Date;

public class Docente extends Persona {

	private int id;
	private String especialidad;
	private ArrayList<Telefono> telefonos=new ArrayList<Telefono>();;
	private ArrayList<Asignatura> asignaturas=new ArrayList<Asignatura>();;
	private ArrayList<Grupo> grupos =new ArrayList<Grupo>();;

	
	
	public Docente(int id, String especialidad, ArrayList<Telefono> telefonos, ArrayList<Asignatura> asignaturas,
			ArrayList<Grupo> grupos) {
		super();
		this.id = id;
		this.especialidad = especialidad;
		this.telefonos = telefonos;
		this.asignaturas = asignaturas;
		this.grupos = grupos;
	}



	public Docente() {
		
	}
	
	

	public Docente(int id, String especialidad) {
		
		this.id = id;
		this.especialidad = especialidad;
	}

	
	public Docente(int idPersona, String cedula, String nombre, String apellido, Date fechaNac,
			String correoInstintucional, String contrasenia, String direccion, char estado, Rol rol,String especialidad, ArrayList<Telefono> telefonos, ArrayList<Asignatura> asignaturas,
			ArrayList<Grupo> grupos) {
		
		System.out.println("creado");
	}


	public boolean crearDocente(int idPersona, String cedula, String nombre, String apellido, Date fechaNac,
			String correoInstintucional, String contrasenia, String direccion, char estado, Rol rol,String especialidad, 
			ArrayList<Telefono> telefonos, ArrayList<Asignatura> asignaturas,
			ArrayList<Grupo> grupos) {
		
		
		System.out.println(" Docente creado");
		return true;
	}


	public ArrayList<Telefono> agregarTelefono(Telefono tel) {
	
		this.telefonos.add(tel); 
		System.out.println("agregado");
		return telefonos;
	}
	
	public ArrayList<Asignatura> agregarAsignatura(Asignatura asi) {
		
		this.asignaturas.add(asi); 
		System.out.println("agregado");
		return asignaturas;
	}
	
	public ArrayList<Grupo> agregarGrupo(Grupo g) {
		
		this.grupos.add(g); 
		System.out.println("agregado");
		return grupos;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public ArrayList<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}

	public ArrayList<Grupo> getGrupos() {
		return grupos;
	}

	public void setGrupos(ArrayList<Grupo> grupos) {
		this.grupos = grupos;
	}

	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	@Override
	public String toString() {
		return "Docente [id=" + id + ", especialidad=" + especialidad + ", telefonos=" + telefonos + ", asignaturas="
				+ asignaturas + ", grupos=" + grupos + "]";
	}

}
