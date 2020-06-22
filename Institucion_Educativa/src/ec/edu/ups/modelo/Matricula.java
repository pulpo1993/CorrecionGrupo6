package ec.edu.ups.modelo;

import java.util.Calendar;
import java.util.Date;

public class Matricula {

	private int id;
	private Date fechaMatricula;
	private Calendar horaMatricula;
	private double costoMatricula;
	private Estudiante estudiante;
	private PeriodoAcademico periodoAcademico;
	private Grupo grupo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFechaMatricula() {
		return fechaMatricula;
	}

	public void setFechaMatricula(Date fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}

	public Calendar getHoraMatricula() {
		return horaMatricula;
	}

	public void setHoraMatricula(Calendar horaMatricula) {
		this.horaMatricula = horaMatricula;
	}

	public double getCostoMatricula() {
		return costoMatricula;
	}

	public void setCostoMatricula(double costoMatricula) {
		this.costoMatricula = costoMatricula;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public PeriodoAcademico getPeriodoAcademico() {
		return periodoAcademico;
	}

	public void setPeriodoAcademico(PeriodoAcademico periodoAcademico) {
		this.periodoAcademico = periodoAcademico;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	@Override
	public String toString() {
		return "Matricula [id=" + id + ", fechaMatricula=" + fechaMatricula + ", horaMatricula=" + horaMatricula
				+ ", costoMatricula=" + costoMatricula + ", estudiante=" + estudiante + ", periodoAcademico="
				+ periodoAcademico + ", grupo=" + grupo + "]";
	}

}
