
public class PistaAterrizaje {

	private String nombrePista;

	public PistaAterrizaje(String nombrePista) {
		setNombrePista(nombrePista);
	}

	@Override
	public String toString() {
		return "-----> " + nombrePista;
	}

	public String getNombrePista() {
		return nombrePista;
	}

	public void setNombrePista(String nombrePista) {
		this.nombrePista = nombrePista;
	}

}
