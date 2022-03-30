
public class Ovni extends Aeronave {
	private boolean objetoNoIdentificado;
	private int celdasCombustible;
	

	public Ovni(String patente, String color, boolean objetoNoIdentificado,int celdasCombustible) {
		super(patente, color);
		this.objetoNoIdentificado = objetoNoIdentificado;
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
		return "Ovni objetoNoIdentificado=" + objetoNoIdentificado + ", celdasCombustible=" + celdasCombustible + "vengo en zon de paz";
	}

}
