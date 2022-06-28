
public class MainCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class<String[]> listaNombres = null;
		Class<Integer[]> listaDni=null;
		Class<Boolean[]> listaVerdad=null;
		Class<Persona[]> persona1;
		
		
		CollectionCustom<String> arrayT = new CollectionCustom<String>(listaNombres, 5);
		
		
		arrayT.addFirst("algo");
	}

}
