
public class MainArrayTprueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CollectionCustom<String> prueba1 = new CollectionCustom<>(String.class,4);
		
		//jugando con los construtores
		CollectionCustom<String> prueba2 = new CollectionCustom<>(String[].class);
		prueba2.setSize(8);
		
		CollectionCustom<Integer>int_Array = new CollectionCustom(Integer.class,6);
		CollectionCustom<Integer>int_Array2 = new CollectionCustom(Integer[].class,3);
		
		int_Array.set(0, 10);
		
		
		
		
		
		
	}

}
