package ec.edu.ups.modelo;

import java.time.LocalTime;

public class Horario {

	private int id;
	private LocalTime hora;
	private String dia;
	private String lugar;
	private char estado;

	public Horario() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public char getEstado() {
		return estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Horario [id=").append(id).append(", hora=").append(hora).append(", dia=").append(dia)
				.append(", lugar=").append(lugar).append(", estado=").append(estado).append("]");
		return builder.toString();
	}

}
