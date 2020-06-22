package ec.edu.ups.control;

import java.awt.List;

public class ControladorFactura {

	private List listaFacturas = new List();

	public ControladorFactura() {
		// TODO Auto-generated constructor stub
	}

	public List getListaFacturas() {
		return listaFacturas;
	}

	public void setListaFacturas(List listaFacturas) {
		this.listaFacturas = listaFacturas;
	}

	@Override
	public String toString() {
		return "ControladorFactura [listaFacturas=" + listaFacturas + "]";
	}

}
