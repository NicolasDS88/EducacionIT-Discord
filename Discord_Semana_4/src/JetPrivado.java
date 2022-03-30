
public class JetPrivado extends Avion {

	String nombrePiloto;

	public JetPrivado(String patente, String color, int asientos, Double combustible, boolean habilitadoAterrizar,
			String aerolinea, String nombrePiloto) {
		super(patente, color, asientos, combustible, habilitadoAterrizar, aerolinea);
		this.nombrePiloto = nombrePiloto;
	}

	@Override
	public void aterrizaje() {
		// TODO Auto-generated method stub

	}

	@Override
	public void aterrizajeEmergencia() {
		// TODO Auto-generated method stub

	}

	@Override
	public void quemarCombustible() {
		// TODO Auto-generated method stub

	}

}
