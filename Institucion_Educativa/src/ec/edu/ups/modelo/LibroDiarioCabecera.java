package ec.edu.ups.modelo;

import sun.util.calendar.LocalGregorianCalendar.Date;

public class LibroDiarioCabecera {

	private int id;
	private Date fechaInicio;
	private Date fechaFinal;
	private double saldoInicial;
	private double saldoActual;

	public LibroDiarioCabecera() {
		// TODO Auto-generated constructor stub
	}

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

	public Date getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public double getSaldoInicial() {
		return saldoInicial;
	}

	public void setSaldoInicial(double saldoInicial) {
		this.saldoInicial = saldoInicial;
	}

	public double getSaldoActual() {
		return saldoActual;
	}

	public void setSaldoActual(double saldoActual) {
		this.saldoActual = saldoActual;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LibroDiarioCabecera [id=").append(id).append(", fechaInicio=").append(fechaInicio)
				.append(", fechaFinal=").append(fechaFinal).append(", saldoInicial=").append(saldoInicial)
				.append(", saldoActual=").append(saldoActual).append("]");
		return builder.toString();
	}

}
