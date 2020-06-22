package ec.edu.ups.modelo;

public class HorarioDocente {

	private Grupo grupo;
	private Asignatura asinagtura;

	public HorarioDocente() {
		// TODO Auto-generated constructor stub
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public Asignatura getAsinagtura() {
		return asinagtura;
	}

	public void setAsinagtura(Asignatura asinagtura) {
		this.asinagtura = asinagtura;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HorarioDocente [grupo=").append(grupo).append(", asinagtura=").append(asinagtura).append("]");
		return builder.toString();
	}

}
