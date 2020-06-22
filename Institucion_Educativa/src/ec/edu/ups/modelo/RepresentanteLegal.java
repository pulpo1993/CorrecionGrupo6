package ec.edu.ups.modelo;

import java.util.List;

public class RepresentanteLegal {

	private int id;
	private String cedula;
	private String nombres;
	private String apellidos;
	private String correo;
	private char estado;
	private List<Telefono> telefonos;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public List<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(List<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void agregarTelefono() {

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
		builder.append("RepresentanteLegal [id=").append(id).append(", cedula=").append(cedula).append(", nombres=")
				.append(nombres).append(", apellidos=").append(apellidos).append(", correo=").append(correo)
				.append(", estado=").append(estado).append(", telefonos=").append(telefonos).append("]");
		return builder.toString();
	}

}
