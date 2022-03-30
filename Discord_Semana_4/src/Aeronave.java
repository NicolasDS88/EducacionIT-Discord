
public abstract class Aeronave implements Aterrizable {
	String patente;
	String color;
	
	public Aeronave(String patente, String color) {
		super();
		this.patente = patente;
		this.color = color;
	}
	
	public abstract void quemarCombustible();
	public abstract void recargarCombustible();
}
