
public class Ovni extends Aeronave {
	private boolean objetoNoIdentificado=false;
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
	public void quemarCombustible() {
		// TODO Auto-generated method stub
		
	}

}
