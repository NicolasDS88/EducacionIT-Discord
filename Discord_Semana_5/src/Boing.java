
public class Boing extends Avion {

	String nombrePiloto;

	public Boing(String patente, String color, int asientos, Double combustible, boolean habilitadoAterrizar,
			String aerolinea, String nombrePiloto) {
		super(patente, color, asientos, combustible, habilitadoAterrizar, aerolinea);
		this.nombrePiloto = nombrePiloto;
	}

	@Override
	public void aterrizaje() {
		System.out.println("Muchas gracias Torre de control (no le pase el operador por parametro)");
		System.err.println("Preparando sistema de aterrizaje");
		this.setHabilitadoAterrizar(true);
		quemarCombustible(-20.0);
	}

	@Override
	public void aterrizajeEmergencia() {
		// TODO Auto-generated method stub

	}

	@Override
	public void quemarCombustible(Double quemando) {
		// TODO Auto-generated method stub
		this.setCombustible(quemando);
	}

	@Override
	public void recargarCombustible() {
		// TODO Auto-generated method stub
		this.setCombustible(100.0);
	}

	@Override
	protected void presentate() {
		// TODO Auto-generated method stub
		toString();
	}

	@Override
	public String toString() {
		return "Hola torre de contorl, aqui "+ nombrePiloto +" estoy manejando un un Boing con patente " + patente + " de la empresa " + getAerolinea()+" Solicito permiso de aterrizaje";
				
	}

}
