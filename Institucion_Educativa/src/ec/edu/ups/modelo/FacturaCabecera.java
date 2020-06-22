package ec.edu.ups.modelo;

import sun.util.calendar.LocalGregorianCalendar.Date;

public class FacturaCabecera {

	private int id;
	private Date fechaFactura;
	private RepresentanteLegal cliente;
	private MetodoDePago tipoPago;

	public FacturaCabecera() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFechaFactura() {
		return fechaFactura;
	}

	public void setFechaFactura(Date fechaFactura) {
		this.fechaFactura = fechaFactura;
	}

	public RepresentanteLegal getCliente() {
		return cliente;
	}

	public void setCliente(RepresentanteLegal cliente) {
		this.cliente = cliente;
	}

	public MetodoDePago getTipoPago() {
		return tipoPago;
	}

	public void setTipoPago(MetodoDePago tipoPago) {
		this.tipoPago = tipoPago;
	}

	@Override
	public String toString() {
		return "FacturaCabecera [id=" + id + ", fechaFactura=" + fechaFactura + ", cliente=" + cliente + ", tipoPago="
				+ tipoPago + "]";
	}

}
