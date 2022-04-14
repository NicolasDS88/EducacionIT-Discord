
public class CollectionCustom<T> {

	
	//T[] elements = new T[size]; //supuestamente pero es generic y tengo que saber
	// Object[] genericArray = new Object[size]; 
	private T[] unArrayT;
	
	unArrayT = (E[]) Array.newInstance(clazz, capacity);

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
