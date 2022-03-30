
public class JetPrivado extends Avion {

	String nombrePiloto;

	public JetPrivado(String patente, String color, int asientos, Double combustible, boolean habilitadoAterrizar,
			String aerolinea, String nombrePiloto) {
		super(patente, color, asientos, combustible, habilitadoAterrizar, aerolinea);
		this.nombrePiloto = nombrePiloto;
	}

	public String getNombrePiloto() {
		return nombrePiloto;
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
	public void quemarCombustible(Double quemar) {
		// TODO Auto-generated method stub

	}

	@Override
	public void recargarCombustible() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void presentate() {
		// TODO Auto-generated method stub
		toString();
	}

	@Override
	public String toString() {
		return "Hola torre de contorl, aqui "+ nombrePiloto +" estoy manejando un un Jet Privado con patente " + patente + " de la empresa " + getAerolinea()+" Solicito permiso de aterrizaje";
				
	}

}
