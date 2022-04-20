
import java.util.Arrays;

public class Generic_Array<E> {

	private final E[] objArray;
	public final int length;

	// constructor class
	public Generic_Array(Class<E> dataType, int length) { //recibo por parametro un valor y de ahi creo un Array de ese tipo de valor
		// creatting a new array with the specified data type and length at runtime
		// using reflection method.
		this.objArray = (E[]) java.lang.reflect.Array.newInstance(dataType, length); //pero recibo un Warning por que no se que valor viene
		this.length = length;
	}

	// get element at obj_Array[i]
	E get(int i) {
		return objArray[i];
	}

	// assign e to obj_Array[i]
	void set(int i, E e) {
		objArray[i] = e;
	}

	@Override
	public String toString() {
		return Arrays.toString(objArray);
	}
}
