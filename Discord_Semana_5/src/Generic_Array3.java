import java.lang.reflect.Array;
import java.util.Arrays;

public class Generic_Array3<E> {

	private final Object[] obj_array;
	public final int length;

	// class constructor
	public Generic_Array3(int length) {
		// instantiate a new Object array of specified length
		obj_array = new Object[length];
		this.length = length;
	}

	// get obj_array[i]
	E get(int i) {
		@SuppressWarnings("unchecked")
		final E e = (E) obj_array[i];
		return e;
	}

	// set e at obj_array[i]
	void set(int i, E e) {
		obj_array[i] = e;
	}

	@Override
	public String toString() {
		return Arrays.toString(obj_array);
	}
}