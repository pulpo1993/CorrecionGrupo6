package ec.edu.ups.control;

import java.util.List;

import ec.edu.ups.modelo.LibroDiarioCabecera;

public class ControlCaja {

	private List<LibroDiarioCabecera> listaLibroDiario;

	public ControlCaja() {
		// TODO Auto-generated constructor stub
	}

	public List getListaLibroDiario() {
		return listaLibroDiario;
	}

	public void setListaLibroDiario(List listaLibroDiario) {
		this.listaLibroDiario = listaLibroDiario;
	}

	@Override
	public String toString() {
		return "ControlCaja [listaLibroDiario=" + listaLibroDiario + "]";
	}

}
