package ec.edu.ups.modelo;

import java.awt.List;

public class Grupo {
	private int id;
	private String nivel;
	private String paralelo;
	private int numeroEstudiantes;
	private int cupoLimite;
	private boolean disponibilidadGrupo;
	private int cupoActual;
	private char estado;
	private List espaciosFisicos = new List();
	private List asignatura = new List();
	
	
	public Grupo() {
		
	}

	public Grupo(int id, String nivel, String paralelo, int numeroEstudiantes, int cupoLimite,
			boolean disponibilidadGrupo, int cupoActual, char estado) {
		super();
		this.id = id;
		this.nivel = nivel;
		this.paralelo = paralelo;
		this.numeroEstudiantes = numeroEstudiantes;
		this.cupoLimite = cupoLimite;
		this.disponibilidadGrupo = disponibilidadGrupo;
		this.cupoActual = cupoActual;
		this.estado = estado;
	}

	public boolean crearGrupo(int id, String nivel, String paralelo, int numeroEstudiantes, int cupoLimite,
			boolean disponibilidadGrupo, int cupoActual, char estado) {
		
		this.id = id;
		this.nivel = nivel;
		this.paralelo = paralelo;
		this.numeroEstudiantes = numeroEstudiantes;
		this.cupoLimite = cupoLimite;
		this.disponibilidadGrupo = disponibilidadGrupo;
		this.cupoActual = cupoActual;
		this.estado = estado;
		System.out.println("Grupo creado exitosamente");
		return true;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getParalelo() {
		return paralelo;
	}

	public void setParalelo(String paralelo) {
		this.paralelo = paralelo;
	}

	public int getNumeroEstudiantes() {
		return numeroEstudiantes;
	}

	public void setNumeroEstudiantes(int numeroEstudiantes) {
		this.numeroEstudiantes = numeroEstudiantes;
	}

	public int getCupoLimite() {
		return cupoLimite;
	}

	public void setCupoLimite(int cupoLimite) {
		this.cupoLimite = cupoLimite;
	}

	public boolean isDisponibilidadGrupo() {
		return disponibilidadGrupo;
	}

	public void setDisponibilidadGrupo(boolean disponibilidadGrupo) {
		this.disponibilidadGrupo = disponibilidadGrupo;
	}

	public int getCupoActual() {
		return cupoActual;
	}

	public void setCupoActual(int cupoActual) {
		this.cupoActual = cupoActual;
	}

	public char getEstado() {
		return estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}

	public List getEspaciosFisicos() {
		return espaciosFisicos;
	}

	public void setEspaciosFisicos(List espaciosFisicos) {
		this.espaciosFisicos = espaciosFisicos;
	}

	public List getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(List asignatura) {
		this.asignatura = asignatura;
	}

	@Override
	public String toString() {
		return "Grupo [id=" + id + ", nivel=" + nivel + ", paralelo=" + paralelo + ", numeroEstudiantes="
				+ numeroEstudiantes + ", cupoLimite=" + cupoLimite + ", disponibilidadGrupo=" + disponibilidadGrupo
				+ ", cupoActual=" + cupoActual + ", estado=" + estado + ", espaciosFisicos=" + espaciosFisicos
				+ ", asignatura=" + asignatura + "]";
	}

}
