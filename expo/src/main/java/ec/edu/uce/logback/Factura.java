package ec.edu.uce.logback;

public class Factura {

	private String nombre;
	private String Apellido;
	private int cedula;
	private int celular;

	// Metodos GET and SET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public int getCelular() {
		return celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}

	@Override
	public String toString() {
		return "Factura [nombre=" + nombre + ", Apellido=" + Apellido + ", cedula=" + cedula + ", celular=" + celular
				+ "]";
	}
}
