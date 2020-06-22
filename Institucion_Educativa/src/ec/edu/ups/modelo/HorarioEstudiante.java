package ec.edu.ups.modelo;

public class HorarioEstudiante {

	private Grupo grupoEstudiante;
	private Asignatura asignaturaEstudiante;

	public HorarioEstudiante() {
		// TODO Auto-generated constructor stub
	}

	public Grupo getGrupoEstudiante() {
		return grupoEstudiante;
	}

	public void setGrupoEstudiante(Grupo grupoEstudiante) {
		this.grupoEstudiante = grupoEstudiante;
	}

	public Asignatura getAsignaturaEstudiante() {
		return asignaturaEstudiante;
	}

	public void setAsignaturaEstudiante(Asignatura asignaturaEstudiante) {
		this.asignaturaEstudiante = asignaturaEstudiante;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HorarioEstudiante [grupoEstudiante=").append(grupoEstudiante).append(", asignaturaEstudiante=")
				.append(asignaturaEstudiante).append("]");
		return builder.toString();
	}

}
