package ec.edu.ups.modelo;

import java.util.ArrayList;
import java.util.Date;

public class Persona {

	private int idPersona;
	private String cedula;
	private String nombre;
	private String apellido;
	private Date fechaNac;
	private String correoInstintucional;
	private String contrasenia;
	private String direccion;
	private char estado;
	private Rol rol;
	
	

	

	public Persona() {
		super();
	}

	public Persona(int idPersona, String cedula, String nombre, String apellido, Date fechaNac,
			String correoInstintucional, String contrasenia, String direccion, char estado, Rol rol) {
		super();
		this.idPersona = idPersona;
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNac = fechaNac;
		this.correoInstintucional = correoInstintucional;
		this.contrasenia = contrasenia;
		this.direccion = direccion;
		this.estado = estado;
		this.rol = rol;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getCorreoInstintucional() {
		return correoInstintucional;
	}

	public void setCorreoInstintucional(String correoInstintucional) {
		this.correoInstintucional = correoInstintucional;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public char getEstado() {
		return estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido="
				+ apellido + ", fechaNac=" + fechaNac + ", correoInstintucional=" + correoInstintucional
				+ ", contrasenia=" + contrasenia + ", direccion=" + direccion + ", estado=" + estado + ", rol=" + rol
				+ "]";
	}

}
