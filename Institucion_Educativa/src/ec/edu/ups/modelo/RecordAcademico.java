package ec.edu.ups.modelo;

public class RecordAcademico {

	private int id;
	private String parcial;
	private double calificacion;
	private String estado;
	private Asignatura asignatura;

	public RecordAcademico() {
		// TODO Auto-generated constructor stub
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	public Asignatura getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getParcial() {
		return parcial;
	}

	public void setParcial(String parcial) {
		this.parcial = parcial;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RecordAcademico [id=").append(id).append(", parcial=").append(parcial).append(", estado=")
				.append(estado).append("]");
		return builder.toString();
	}

}
