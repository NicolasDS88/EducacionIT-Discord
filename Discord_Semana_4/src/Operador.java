
public class Operador {

	private final String DNI;
	private boolean cumpleaniosHoy; // podria hacer algo que si hoy es su cumple no trabaja
	private String nombre;
	private String apellido;
	private String cumpleanios;

	public Operador(String dNI, boolean cumpleaniosHoy, String nombre, String apellido) {
		DNI = dNI;
		this.cumpleaniosHoy = cumpleaniosHoy;
		cumpleanios=isCumpleaniosHoy();
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getDNI() {
		return DNI;
	}

	public String isCumpleaniosHoy() {
		String auxTexto;
		if (cumpleaniosHoy) {
			auxTexto="Loco es mi cumpleaños, no me hagan laburar!!!";
		}else {
			auxTexto="No es mi cumple";
		}
		return auxTexto;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	@Override
	public String toString() {
		return "Operador DNI=" + DNI + ", Hoy cumplis Años?=" + cumpleanios + ", Nombre=" + nombre + ", Apellido="
				+ apellido;
	}
	
	

	public String presentate() {
		return "Hola soy el Operador "+ nombre + " y mi Apellido es "
				+ apellido+" en unos momentos te voy a dirigir a una pista.";
		
	}

	
}
