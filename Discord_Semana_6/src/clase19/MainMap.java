package clase19;

import java.util.Scanner;

import clase10.Libro;
import clase7.Articulo;
import packException.cantDeleteException;
import packException.cantGetValueException;
import packException.cantListAllException;
import packException.cantSaveException;
import packException.cantUpdateException;

public class MainMap {

	/**
	 * El usuario ingresa una opcion
	 * 1- alta
	 * 2- baja
	 * 3- modificar
	 * 4- listar
	 * @param args
	 */
	public static void main(String[] args) {
	
		Integer opcionIngresadaPorUsuario = 1;
		
		// Interface i = new ClaseQueImplementaLaInterface();		
		IAccion accion = AccionMap.getAccion(opcionIngresadaPorUsuario);//AltaAccion|BajaAccion|AccionDefault
		
		Articulo articulo = contruirArticulo();
		
		//ejecuto
		try {
			InMemoryDB.listAll();
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();					
		} catch (ClassCastException e) {
			
		} catch (cantListAllException e) {}
		
		try {
			accion.exec(articulo);
		} catch (cantGetValueException | cantDeleteException | cantListAllException | cantSaveException
				| cantUpdateException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			InMemoryDB.listAll();
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();					
		} catch (ClassCastException e) {
			
		} catch (cantListAllException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			InMemoryDB.delete(articulo.getId());
		} catch (UnsupportedOperationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassCastException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (cantDeleteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			InMemoryDB.listAll();
		} catch (cantListAllException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static Articulo contruirArticulo() {
		Scanner teclado = new Scanner(System.in);
		Articulo art = new Libro();
		System.out.println("Ingrese titulo ");
		art.setAutor(teclado.next());
		System.out.println("Ingrese id ");
		art.setId(teclado.nextLong());
		
		//downcating
		System.out.println("Ingrese isbn");
		((Libro)art).setIsbn(teclado.next());
		//completar los demas datos
		teclado.close();
		return art;
	}
}
