
public class Operador {

	private final String DNI;
	private boolean cumpleaniosHoy; //podria hacer algo que si hoy es su cumple no trabaja
	private String nombre;
	private String apellido;
	
	
	public Operador(String dNI, boolean cumpleaniosHoy, String nombre, String apellido) {
		super();
		DNI = dNI;
		this.cumpleaniosHoy = cumpleaniosHoy;
		this.nombre = nombre;
		this.apellido = apellido;
	}


	public String getDNI() {
		return DNI;
	}


	public boolean isCumpleaniosHoy() {
		return cumpleaniosHoy;
	}


	public String getNombre() {
		return nombre;
	}


	public String getApellido() {
		return apellido;
	}
	
	
	
	
	
}
