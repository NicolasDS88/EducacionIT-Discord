import java.util.Iterator;
import java.util.Random;

public class TorreControl {

	private  final int CANTIDADPISTAS = 5;
	private PistaAterrizaje[] pistas;
	private Aeronave[] muchasNaves;
	private Operador[] listaTrabajadores;
	private Operador[] operadoresActivosHoy;

	// CONTRUCTOR
	public TorreControl() {
		generandoPistas();
		generandoTamanioListaAeronaves();
		cargarListaAeronaves();
		crearListaTrabajadores();
		asignarOperadoresHoy();
		// TODO
		// la idea es pasar algunos Operadores randoms de una lista de "trabajadores"
		// a otra que van a trabajar HOY
		// asignarOperadores();
	}

	private void crearListaTrabajadores() {
		int auxTrabajadores = 5;
		listaTrabajadores = new Operador[auxTrabajadores];
		// podria pedirlo por escanner, PERO NO, ODIO AL ESCANER SIEMPRE TIRA ALGUN
		// ERROR
		listaTrabajadores[0] = new Operador("33840919", true, "Nicolas", "da Silva");
		listaTrabajadores[1] = new Operador("45789321", false, "Juan", "Cualquiera");
		listaTrabajadores[2] = new Operador("45963258", false, "Carlos", "Profe");
		listaTrabajadores[3] = new Operador("32147852", false, "Ricardo", "Fulano");
		listaTrabajadores[4] = new Operador("36852789", false, "Ricardo", "Mengano");
	}

	private void asignarOperadoresHoy() {
		int auxTrabajadores = 3;
		int auxRepetido = -1;
		int auxComparar;
		Random rn = new Random();
		operadoresActivosHoy = new Operador[auxTrabajadores];
		//cargo la plantilla de trabajadores para hoy "seria random"
		for (int i = 0; i < operadoresActivosHoy.length; i++) {
			do {
				auxComparar = rn.nextInt(listaTrabajadores.length - 0 + 1) + 0; //random
				if (auxComparar != auxRepetido) { 
					//TODO
					//lo del cumpleaños es un if mas, hoy JODETE
					operadoresActivosHoy[i] = listaTrabajadores[auxComparar];
					auxRepetido = auxComparar;
				}
			} while (auxRepetido != auxComparar); //creo q es !=
		}
	}

	public void generandoPistas() {
		pistas = new PistaAterrizaje[this.CANTIDADPISTAS];
		pistas[0] = new PistaAterrizaje("Pista 01"); // RESERVADAS PARA EMERGENCIAS
		pistas[1] = new PistaAterrizaje("Pista 02"); // PARA AVIONES
		pistas[2] = new PistaAterrizaje("Pista 03");// PARA AVIONES
		pistas[3] = new PistaAterrizaje("Pista 04"); // SOLO HELICOPTEROS
		pistas[4] = new PistaAterrizaje("Pista 05"); // SOLO SUPERMAN //ovnis no pueden son objetos no identificados
	}

	public void generandoTamanioListaAeronaves() {
		int auxCantidadNavesVolandoHoy = 5; // podria pedirlo po0r scaner pero lo odio
		muchasNaves = new Aeronave[auxCantidadNavesVolandoHoy];

	}

	public void cargarListaAeronaves() {
		// TODO 
		//podria hacer algo más elavorado pidiendo que quiero cargar por escaner	
		// patente,  color,  asientos,  combustible,  habilitadoAterrizar, aerolinea,  nombrePiloto	
		muchasNaves[0] = new JetPrivado("SKU-789", "NEGRO", 10, 50.0d, false, "El Rapido", "Ricardo");
		muchasNaves[1] = new Boing("XIZ-123", "Blanco", 200, 20.0d, false, "Aerolineas Argentinas", "Fede");
		muchasNaves[2] = new Ovni("·$%&$·$%", "·$&%$%&", false, 100);
		muchasNaves[3] = new Superman("Secreto", "Rojo y Azul"); //mmmm nose q hacer
		muchasNaves[4] = new Boing("ZXF-978", "Gris", 100, 80.0d, false, "Alitalia", "Jorge");
		//muchasNaves[5] = new Boing("XIZ-123", "Blanco", 200, 20.0d, false, "Aerolineas Argentinas", "Fede");
		//
	}

	public Aeronave getMuchasNavesPos(int pos) {
		return muchasNaves[pos];
	}

	//TODO
	//esto estaria bueno si fueran listas y no vectores fijo inmutables GG
	//podria hacer que una vez que aterrizan los saco de la lista y los pongo 
	//en una nueva llamada AeronavesAterrizadas[]
	/*public void agregarNave(Aeronave muchasNaves, int pos) {
		this.muchasNaves[pos] = muchasNaves;
	}*/

	// devuelve una pista en particular
	public PistaAterrizaje getPistas(int pos) {
		return this.pistas[pos];
	}

}
