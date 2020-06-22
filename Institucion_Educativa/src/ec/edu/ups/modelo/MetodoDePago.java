package ec.edu.ups.modelo;

import java.util.ArrayList;
import java.util.List;

public class MetodoDePago {

	private int id;
	private double valorPagar;
	private List<String> tipoPago;

	public MetodoDePago() {
		// TODO Auto-generated constructor stub
		tipoPago = new ArrayList<>();
		tipoPago.add("Transferencia");
		tipoPago.add("Deposito");
		tipoPago.add("PayPal");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getValorPagar() {
		return valorPagar;
	}

	public void setValorPagar(double valorPagar) {
		this.valorPagar = valorPagar;
	}

	public java.util.List<String> getTipoPago() {
		return tipoPago;
	}

	public void setTipoPago(java.util.List<String> tipoPago) {
		this.tipoPago = tipoPago;
	}

	@Override
	public String toString() {
		return "MetodoDePago [id=" + id + ", valorPagar=" + valorPagar + ", tipoPago=" + tipoPago + "]";
	}

}
