package ec.edu.ups.modelo;

public class Calificacion {

	private int id;
	private String descripcion;
	private double nota;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Calificacion [id=" + id + ", descripcion=" + descripcion + ", nota=" + nota + "]";
	}

}
