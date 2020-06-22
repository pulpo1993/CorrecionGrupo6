package ec.edu.ups.modelo;

public class EspacioFisico {

	private int id;
	private double coordenadasX;
	private double coordenadasY;
	private int numero;
	private String descripcion;
	private char estado;
	private boolean disponibilidad;

	public EspacioFisico() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCoordenadasX() {
		return coordenadasX;
	}

	public void setCoordenadasX(double coordenadasX) {
		this.coordenadasX = coordenadasX;
	}

	public double getCoordenadasY() {
		return coordenadasY;
	}

	public void setCoordenadasY(double coordenadasY) {
		this.coordenadasY = coordenadasY;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public char getEstado() {
		return estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}

	public boolean isDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	@Override
	public String toString() {
		return "EspacioFisico [id=" + id + ", coordenadasX=" + coordenadasX + ", coordenadasY=" + coordenadasY
				+ ", numero=" + numero + ", descripcion=" + descripcion + ", estado=" + estado + ", disponibilidad="
				+ disponibilidad + "]";
	}

}
