
public class Helicoptero extends Aeronave {
	private String nombrePiloto;
	private Double combustible;
	private boolean habilitadoAterrizar;

	public Helicoptero(String patente, String color, String nombrePiloto, Double combustible,
			boolean habilitadoAterrizar) {
		super(patente, color);
		this.nombrePiloto = nombrePiloto;
		this.combustible = combustible;
		this.habilitadoAterrizar = habilitadoAterrizar;
	}

	public Double getCombustible() {
		return combustible;
	}

	public void setCombustible(Double combustible) {
		this.combustible = combustible;
	}

	public boolean isHabilitadoAterrizar() {
		return habilitadoAterrizar;
	}

	public void setHabilitadoAterrizar(boolean habilitadoAterrizar) {
		this.habilitadoAterrizar = habilitadoAterrizar;
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
	public void quemarCombustible() {
		// TODO Auto-generated method stub

	}

}
