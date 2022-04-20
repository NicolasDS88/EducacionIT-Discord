
public class MainArrayTprueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CollectionCustom<String> prueba1 = new CollectionCustom<>(String.class,4);
		
		//jugando con los construtores
		//CollectionCustom<String> prueba2 = new CollectionCustom<>(String[].class); //OJO QUE TENGO QUE MANDAR UN VALOR DE TIPO ARRAY[]
		//prueba2.setSize(8);
		//CollectionCustom<String> prueba3 = new CollectionCustom<>(String.class);// <-- NO FUNCIONA
		
		CollectionCustom<Integer>int_Array = new CollectionCustom(Integer.class,6); //PERO ACA SI FUNCIONA 
		//CollectionCustom<Integer>int_Array2 = new CollectionCustom(Integer[].class,3);
		
		//int_Array.set(0, 10);
		//int_Array.set(0, 11);
		System.err.println("La coleccion prueba1 esta vacia? "+prueba1.empty());
		prueba1.set(0, "Test");
		prueba1.add("algo");
		prueba1.add("mas");
		prueba1.add("algo");
		prueba1.add("mas");
		prueba1.addFirst("Primero");
		System.out.println(prueba1);
		
		int_Array.add(5);
		int_Array.add(6);
		int_Array.add(7);
		System.out.println(int_Array);
		System.err.println("Se eliminara el elemento "+int_Array.remove(6));
		int_Array.addLast(100);
		System.out.println(int_Array);
		int_Array.removeAll();
		System.out.println(int_Array);
	}

}
