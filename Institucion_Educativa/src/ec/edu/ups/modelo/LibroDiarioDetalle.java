package ec.edu.ups.modelo;

import sun.util.calendar.BaseCalendar.Date;

public class LibroDiarioDetalle {

	private int id;
	private Date fechaLibroDiarioDetalle;
	private String detalle;
	private double debe;
	private double haber;

	public LibroDiarioDetalle() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFechaLibroDiarioDetalle() {
		return fechaLibroDiarioDetalle;
	}

	public void setFechaLibroDiarioDetalle(Date fechaLibroDiarioDetalle) {
		this.fechaLibroDiarioDetalle = fechaLibroDiarioDetalle;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public double getDebe() {
		return debe;
	}

	public void setDebe(double debe) {
		this.debe = debe;
	}

	public double getHaber() {
		return haber;
	}

	public void setHaber(double haber) {
		this.haber = haber;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LibroDiarioDetalle [id=").append(id).append(", fechaLibroDiarioDetalle=")
				.append(fechaLibroDiarioDetalle).append(", detalle=").append(detalle).append(", debe=").append(debe)
				.append(", haber=").append(haber).append("]");
		return builder.toString();
	}

}
