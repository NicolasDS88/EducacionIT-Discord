import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class TorreControl {

	private final int CANTIDADPISTAS = 5;
	private PistaAterrizaje[] pistas;
	private Aeronave[] muchasNaves;
	private Operador[] listaTrabajadores;
	private Operador[] operadoresActivosHoy;

	// CONTRUCTOR, cuando cree una torre va a ejecutar todo esto.....
	public TorreControl() {
		generandoPistas(); // crea las pistas con el tamaño FINAL
		generandoTamanioListaAeronaves(); //
		cargarListaAeronaves();
		crearListaTrabajadores();
		// TODO
		// la idea es pasar algunos Operadores randoms de una lista de "trabajadores"
		// a otra que van a trabajar HOY
		asignarOperadoresHoy();
		// este los muestra...
		quienTrabajaHoy();
		// ----Vamos a empezar a aterrizar naves
		operadorAterrizaNave();

	}

	private void operadorAterrizaNave() {
		// TODO Auto-generated method stub
		Random random = new Random();
		int auxOperador = random.nextInt((this.operadoresActivosHoy.length - 1) - 0 + 1) + 0; // genera un numero entre
																								// 0 y el largo
		int auxNave = random.nextInt((this.muchasNaves.length - 1) - 0 + 1) + 0;
		System.out.println("pssshhh... ruido de radio...");
		System.out.println(muchasNaves[auxNave]);
		System.out.println("-----............. ruido de radio...---------------");
		//muestra la clase
		System.out.println("Identificando objeto volador... es un " + muchasNaves[auxNave].getClass().getCanonicalName()); 
		System.out.println("pssshhh... ruido de radio...---------------");
		System.out.println(operadoresActivosHoy[auxOperador].presentate());
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		switch (muchasNaves[auxNave].getClass().getCanonicalName().toString()) {
		case "Boing":
			System.out.println("Anda a la  " + pistas[2]);
			muchasNaves[auxNave].aterrizaje();
			break;
		case "JetPrivado":
			System.out.println("Anda a la " + pistas[1]);
			muchasNaves[auxNave].aterrizaje();
			break;
		case "Helicoptero":
			System.out.println("Anda a la " + pistas[3]);
			muchasNaves[auxNave].aterrizaje();
			break;
		case "Ovni":
			System.out.println("Preparando sistema de defensa");
			break;
		case "Superman":
			System.out.println("Aguante Batman gato...");
			break;

		default:
			System.out.println("No identificado");
			break;
		}

	}

	private void crearListaTrabajadores() {
		int auxTrabajadores = 7;
		listaTrabajadores = new Operador[auxTrabajadores];
		// podria pedirlo por escanner, PERO NO, ODIO AL ESCANER SIEMPRE TIRA ALGUN
		// ERROR
		listaTrabajadores[0] = new Operador("33840919", true, "Nicolas", "da Silva");
		listaTrabajadores[1] = new Operador("45789321", false, "Juan", "Cualquiera");
		listaTrabajadores[2] = new Operador("45963258", false, "Carlos", "Profe");
		listaTrabajadores[3] = new Operador("32147852", true, "Ricardo", "Fulano");
		listaTrabajadores[4] = new Operador("36852789", false, "Jorge", "Mengano");
		listaTrabajadores[5] = new Operador("98741369", true, "Miguel", "El primo de Mengano");
		listaTrabajadores[6] = new Operador("58123321", false, "Dante", "Camina para Adelante");
		// listaTrabajadores[7] = new Operador("36852789", false, "Jorge", "Mengano");
	}

	//
	/**
	 * Este metodo asigna trabajadores random para que trabajen Los saca de la
	 * planilla y los asigna a otra
	 */
	private void asignarOperadoresHoy() {
		int auxTrabajadores = 3;
		int auxRepetido = -1;
		int auxComparar;
		Random rn = new Random();
		operadoresActivosHoy = new Operador[auxTrabajadores];
		// cargo la plantilla de trabajadores para hoy "seria random"
		for (int i = 0; i < operadoresActivosHoy.length; i++) { // voy a llenar una lista de operadoresActivosHoy
			do {
				auxComparar = rn.nextInt((listaTrabajadores.length - 1) - 0 + 1) + 0; // random
				if (auxComparar != auxRepetido) {
					// TODO
					// lo del cumpleaños es un if mas para desarrollar, hoy JODETE, EL PAIS SE SACA
					// LABURANDO LOCO
					operadoresActivosHoy[i] = listaTrabajadores[auxComparar];
				}
			} while (auxRepetido == auxComparar); // creo q es != true
			auxRepetido = auxComparar;
		}
	}

	private void quienTrabajaHoy() {
		if (operadoresActivosHoy.length > 0) {
			for (Operador operador : operadoresActivosHoy) {
				System.out.println(operador); // soy re capo y ya con llamar al objeto me devuelve el metodo tostring de
												// la clase operador.
			}
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
		int auxCantidadNavesVolandoHoy = 6; // podria pedirlo po0r scaner pero lo odio
		muchasNaves = new Aeronave[auxCantidadNavesVolandoHoy];

	}

	public void cargarListaAeronaves() {
		// TODO
		// podria hacer algo más elavorado pidiendo que quiero cargar por escaner
		// patente, color, asientos, combustible, habilitadoAterrizar, aerolinea,
		// nombrePiloto
		// la idea es cargarlos todos en FALSE que no esten habilitados a instalar hasta
		// que un operador le asigna la pista.
		muchasNaves[0] = new JetPrivado("SKU-789", "NEGRO", 10, 50.0d, false, "El Rapido", "Ricardo");
		muchasNaves[1] = new Boing("XIZ-123", "Blanco", 200, 20.0d, false, "Aerolineas Argentinas", "Fede");
		muchasNaves[2] = new Ovni("·$%&$·$%", "·$&%$%&", false, 100);
		muchasNaves[3] = new Superman("Secreto", "Rojo y Azul"); // mmmm nose q hacer
		muchasNaves[4] = new Boing("ZXF-978", "Gris", 100, 80.0d, false, "Alitalia", "Jorge");
		muchasNaves[5] = new Helicoptero("Tango-Fox", "Gris", "El Jhony", 80.0d, false);
		// muchasNaves[6] = new Boing("XIZ-123", "Blanco", 200, 20.0d, false,
		// "Aerolineas Argentinas", "Fede");
		//
	}

	public Aeronave getNavesPos(int pos) {
		Aeronave auxAeronave;
		if ((pos < muchasNaves.length) && (muchasNaves[pos] != null)) {
			auxAeronave = muchasNaves[pos];
		} else {
			// como lo que me pidieron no existe en mi lista devuelvo un ovni LOOOOOOOOL
			auxAeronave = new Ovni("$%&$%&$", "Gris", true, 100);
		}
		return auxAeronave;
	}

	public Aeronave[] getListamuchasNaves() {
		Aeronave[] auxListaDevolver;
		if (this.muchasNaves != null) {
			auxListaDevolver = this.muchasNaves;
		} else {
			auxListaDevolver = new Aeronave[0]; // devuelvo la lista vacia para que no explote.
		}
		return auxListaDevolver;
	}

	// TODO
	// esto estaria bueno si fueran listas y no vectores fijo inmutables GG
	// podria hacer que una vez que aterrizan los saco de la lista y los pongo
	// en una nueva llamada AeronavesAterrizadas[]
	/*
	 * public void agregarNave(Aeronave muchasNaves, int pos) {
	 * this.muchasNaves[pos] = muchasNaves; }
	 */

	// devuelve una pista en particular
	public String getPista(int pos) {
		return this.pistas[pos].getNombrePista();
	}

}
