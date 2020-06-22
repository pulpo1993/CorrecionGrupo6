package ec.edu.ups.modelo;

import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona {
	private int id;
	private RepresentanteLegal representanteLegal;
	private List<RecordAcademico> recordsAcademicos;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public RepresentanteLegal getRepresentanteLegal() {
		return representanteLegal;
	}

	public void setRepresentanteLegal(RepresentanteLegal representanteLegal) {
		this.representanteLegal = representanteLegal;
	}

	public List<Asignatura> verCalificaciones() {
		return null;
	}

	public void agregarRepresentante() {

	}

	public void agregarRecord() {

	}

	public List<RecordAcademico> getRecordsAcademicos() {
		return recordsAcademicos;
	}

	public void setRecordsAcademicos(List<RecordAcademico> recordsAcademicos) {
		this.recordsAcademicos = recordsAcademicos;
	}

	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", representanteLegal=" + representanteLegal + ", recordsAcademicos="
				+ recordsAcademicos + "]";
	}

	

}
