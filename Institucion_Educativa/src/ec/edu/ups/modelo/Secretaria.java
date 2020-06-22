package ec.edu.ups.modelo;

public class Secretaria extends Persona {
	private int id;

	public Secretaria() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Secretaria [id=" + id + "]" + super.toString();
	}

}
