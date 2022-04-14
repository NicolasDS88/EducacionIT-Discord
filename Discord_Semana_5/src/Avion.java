
public abstract class Avion extends Aeronave {

	private final int asientos;
	private Double combustible;
	private boolean habilitadoAterrizar;
	private String Aerolinea;

	public Avion(String patente, String color, int asientos, Double combustible, boolean habilitadoAterrizar,
			String aerolinea) {
		super(patente, color);
		this.asientos = asientos;
		this.combustible = combustible;
		this.habilitadoAterrizar = habilitadoAterrizar;
		Aerolinea = aerolinea;

	}

	public boolean isHabilitadoAterrizar() {
		return habilitadoAterrizar;
	}

	public void setHabilitadoAterrizar(boolean habilitadoAterrizar) {
		this.habilitadoAterrizar = habilitadoAterrizar;
	}

	public void setCombustible(Double combustible) {
		this.combustible =+ combustible;
	}

	public int getAsientos() {
		return asientos;
	}

	public Double getCombustible() {
		return combustible;
	}

	public String getAerolinea() {
		return Aerolinea;
	}

}
