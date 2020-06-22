package ec.edu.ups.modelo;

import java.util.ArrayList;

public class PersonalAdministrativo extends Persona {

	private int id;
	private ArrayList<Telefono> telefonos;
	
	

	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "PersonalAdministrativo [id=" + id + ", telefonos=" + telefonos + "]";
	}

}
