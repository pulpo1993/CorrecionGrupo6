package ec.edu.ups.modelo;

import java.util.Date;

public class PeriodoAcademico {

	private int id;
	private Date fechaInicio;
	private Date fechaFin;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	@Override
	public String toString() {
		return "PeriodoAcademico [id=" + id + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + "]";
	}

}
