
public class MainArrayTprueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CollectionCustom<String> prueba = new CollectionCustom<String>(String[].class, 5);
		String[] laColeccion = prueba.unArrayT;
		prueba.unArrayT[0] = "xyzzy";
		String unTexto = prueba.unArrayT[0];
		
		
		
		final int length = 5;
        // creating integer array 
		Generic_Array3<Integer>int_Array = new Generic_Array3(length);
        System.out.print("Generic Array <Integer>:" + " ");
        for (int i = 0; i < length; i++)
            int_Array.set(i, i * 2);
        System.out.println(int_Array);
        // creating string array
        Generic_Array3<String>str_Array = new Generic_Array3(length);
        System.out.print("Generic Array <String>:" + " ");
        for (int i = 0; i < length; i++)
            str_Array.set(i, String.valueOf((char)(i + 97)));
        System.out.println(str_Array);
	}

}
