package ec.edu.ups.modelo;

import java.util.ArrayList;
public class Asignatura {

	private int id;
	private String nombre;
	private String descripcion;
	private char estado;
	private ArrayList<Calificacion> calificaciones;

	public int getId() {
		return id;
	}
	
	

	public Asignatura() {
		super();
	}



	public Asignatura(int id, String nombre, String descripcion, char estado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.estado = estado;
		System.out.println("creado");
	}

	public boolean CrearAsignatura(int id, String nombre, String descripcion, char estado) {
		
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.estado = estado;
		System.out.println("creado");
		System.out.println("ID: "+id+" nombre: "+nombre+" descripcion: "+descripcion+" estado: "+estado);
		return true;
		
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public char getEstado() {
		return estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}

	public ArrayList<Calificacion> getCalificaciones() {
		return calificaciones;
	}

	public void setCalificaciones(ArrayList<Calificacion> calificaciones) {
		this.calificaciones = calificaciones;
	}

	@Override
	public String toString() {
		return "Asignatura [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", estado=" + estado
				+ ", calificaciones=" + calificaciones + "]";
	}



	

}
