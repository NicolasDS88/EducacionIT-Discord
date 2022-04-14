import java.lang.reflect.Array;

public class CollectionCustom<T> {

	// T[] elements = new T[size]; //supuestamente pero es generic y tengo que saber
	// Object[] genericArray = new Object[size];
	T[] unArrayT;
	

	/**
	 * Constructor array will either give you back an Object array or result in
	 * warnings at compile time
	 * 
	 * @param Tipoo de la clase
	 * @param Largo del array
	 */
	public CollectionCustom(Class<T[]> clazz, int length) {
		this.unArrayT = clazz.cast(Array.newInstance(clazz.getComponentType(), length));
	}

	/**
	 * he first parameter specifies the type of object inside the new array. The
	 * second parameter specifies how much space to create for the array. As the
	 * result of Array#newInstance is of type Object, we need to cast it to E[] to
	 * create our generic array.
	 * 
	 * @param clazz    el
	 * @param capacity
	 */
	public void miArray(Class<T> clazz, int capacity) {
		unArrayT = (T[]) Array.newInstance(clazz, capacity);
		T[] otroArray = (T[]) new Object[capacity];
		T[] otroArray2 = (T[]) new String[capacity];
	}

	public Object[] getArray(int size) {
		Object[] genericArray = new Object[size];
		return genericArray;
	}

	/**
	 * 
	 * @return the number of elements in this Array
	 * @param size
	 */
	public int size() {
		return unArrayT.length;
	}

	public void addFirst(T elemento) {

	}

}
