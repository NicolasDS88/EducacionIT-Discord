
public abstract class Avion extends Aeronave  {

	int asientos;
	 Double combustible;
	 boolean habilitadoAterrizar;
	 
	 String Aerolinea;
		
	

	public Avion(String patente, String color, int asientos, Double combustible, boolean habilitadoAterrizar,
			 String aerolinea) {
		super(patente, color);
		this.asientos = asientos;
		this.combustible = combustible;
		this.habilitadoAterrizar = habilitadoAterrizar;		
		Aerolinea = aerolinea;
		
	}
	 
	
	
	
	

}
