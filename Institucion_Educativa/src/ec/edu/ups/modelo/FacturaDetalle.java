package ec.edu.ups.modelo;

public class FacturaDetalle {

	private double precio;

	public FacturaDetalle() {
		// TODO Auto-generated constructor stub
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "FacturaDetalle [precio=" + precio + "]";
	}

}
