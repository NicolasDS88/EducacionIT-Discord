import java.lang.reflect.Array;
import java.util.Arrays;

public class CollectionCustom<T> {

	// T[] elements = new T[size]; //supuestamente asi creo un Array normal, pero es
	// generic y tengo que saber el dato que va a recibir
	// Object[] genericArray = new Object[size];
	private T[] unArrayT;
	private T unElementoDelArray; // <- solo para hacer un testeo
	private int lenght;

	/*--------------------CONSTRUCTORES USANDO REFLECTION----------------------------*/

	public T[] getUnArrayT() {
		return unArrayT;
	}

	// CONSTRUCTOR EN BASE A UN ARRAY ENVIADO Y UN TAMAÑO
	/**
	 * Constructor del array, va crear un array del tipo de Array que reciba o va a
	 * resultar en una adevertencia en tiempo de compilacion.
	 * 
	 * @param clazz-> Tipo de Array que va a crear en base al Array u Elemento que
	 *                enviemos
	 * 
	 */
	public CollectionCustom(Class<T[]> clazz) {
		// this.unArrayT = clazz.cast(Array.newInstance(clazz.getComponentType(),
		// length));
		this.unArrayT = (T[]) java.lang.reflect.Array.newInstance(clazz);
	}

	// CONSTRUCTOR EN BASE A UN TIPO DE OBJETO ENVIADO Y UN TAMAÑO
	// UTILIZO LA SOBRECARGA DE METODOS DEL CONSTRUCTOR, POR ESO DOY VUELTA LOS
	// PARAMETROS
	/**
	 * El primer parámetro especifica el tipo de objeto dentro del nueva Array. Él
	 * segundo parámetro especifica cuánto espacio crear para el Array. como el el
	 * resultado de Array#newInstance es de tipo Object, necesitamos convertirlo en
	 * T[] para crear nuestro Array genérico.
	 * 
	 * @param length -> Tamaño de nuestro Array de tipo T.
	 * @param clazz  -> Tipo de Objeto que enviamos y creara un Array de ese tipo.
	 * 
	 */
	public CollectionCustom(Class<T> clazz, int length) {
		// obviamente que si mando null explotaria todo
		// unArrayT = (T[]) Array.newInstance(clazz, length);
		this.unArrayT = (T[]) java.lang.reflect.Array.newInstance(clazz, length);

		// Testeando la copatibilidad de crear un Array BIEN GENERICO. Deberia estar en
		// el main. (Está)
		// T[] otroArray = (T[]) new Object[capacity];
		// T[] otroArray2 = (T[]) new String[capacity];
		// T[] otroArray3=(T[]) new Integer[capacity];
	}

	/**
	 * 
	 * @return Set the number of elements in this Array
	 * @param size
	 */
	public void setSize(int lenght) {
		this.lenght = lenght;
	}

	/**
	 * 
	 * @return the number of elements in this Array
	 * @param size
	 */
	public int size() {
		return unArrayT.length;
	}

	/**
	 * Asigna el valor T en el Array pos ->[i]
	 * 
	 * @param T -> Valor debe ser igual al tipo del Array
	 * @param i -> Posicion del array donde se va agregar.
	 */
	void set(int i, T t) {
		unArrayT[i] = t;
	}

	/**
	 * Agrega un elemento en la primera posicion siempre y cuando sea valido de lo
	 * contrario no lo agrega.
	 * 
	 * @param elemento
	 */
	public void addFirst(T elemento) {
		//chequeo que no sea null
		if (elemento != null) {
			// chequeo que lo que quiero agregar sea del mismo tipo donde lo quiero
			// "guardar"
			if (unArrayT.getClass().equals(elemento.getClass())) {
				if (unArrayT.length > 0) {
					if (unArrayT[0] == null) {
						unArrayT[0] = elemento;
					} else {
						T newArray[] = Arrays.copyOf(unArrayT, (unArrayT.length + 1));
					}

				}else {
					//Esto es debatible, si el array existe pero el lenght es 0 creo uno nuevo para poder agregarlo
					T newArray[] = Arrays.copyOf(unArrayT, (unArrayT.length + 1));
					this.unArrayT=newArray;
				}
			}
		}

	}

	public void addLast(T elemento) {

	}

	public void add(T elemento) {

	}

	/**
	 * T remueve el primer elemento indicado y lo retorna
	 *
	 * @param elemento
	 * @return
	 */
	public T remove(T elemento) {
		T algo = (T) "";
		return algo;
	}

	/**
	 * remueve todos los elementos.
	 * 
	 */
	public void removeAll() {

	}

	/**
	 * indica si la colección está vacía
	 * 
	 * @return
	 */
	public boolean empty() {
		return true;
	}

}