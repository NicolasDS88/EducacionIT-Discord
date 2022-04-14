
public class MainArrayTprueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CollectionCustom<String> prueba = new CollectionCustom<String>(String[].class, 5);
		String[] laColeccion = prueba.unArrayT;
		prueba.unArrayT[0] = "xyzzy";
		String unTexto = prueba.unArrayT[0];
	}

}
