import java.lang.reflect.Array;
import java.util.Arrays;


public class CollectionCustom<T> {

	// T[] elements = new T[size]; //supuestamente asi creo un Array normal, pero es
	// generic y tengo que saber el dato que va a recibir
	// Object[] genericArray = new Object[size];
	private T[] unArrayT;
	private T unElementoDelArray; // <- solo para hacer un testeo
	private int lenght;
	//private int contadorAdd = 0;

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

	// Esto es un poco debatible ya que no aclara si queremos agregar en la 1º
	// posicion guardando lo que ya tiene o sobre escribiendo, yo desarrolle como si
	// fuera una Queue desplasando el 1º elemento a la siguiente pos

	/**
	 * Agrega un elemento en la primera posicion siempre y cuando sea valido de lo
	 * contrario no lo agrega.
	 * 
	 * @param elemento
	 */
	public void addFirst(T elemento) {
		// chequeo que no sea null
		if (elemento != null) {
			// chequeo que lo que quiero agregar sea del mismo tipo donde lo quiero
			// "guardar"
			if (elemento.getClass().equals(unArrayT.getClass().getComponentType())) {
				if (unArrayT.length > 0) {
					// Si es null asumo que no hay nada agregado a la 1º pos y lo sobre escribo
					if (unArrayT[0] == null) {
						set(0, elemento);
						// unArrayT[0] = elemento;

					} else {
						// Caso contrario creo una copia y le agrego los valores PRE-existentes
						T newArray[] = Arrays.copyOf(unArrayT, (unArrayT.length + 1));
						// Aseguro de meter el primer elemento en 1º pos
						newArray[0] = elemento;
						// luego recorro el Array original agregando su contenido en el nuevo array
						for (int i = 0; i < unArrayT.length; i++) {
							newArray[i + 1] = unArrayT[i];

						}
						// finalmente lo convierto en el nuevo Array.
						unArrayT = newArray;
					}

				} else {
					// Esto es debatible, si el array existe pero el lenght es 0 creo uno nuevo para
					// poder agregarlo
					T newArray[] = Arrays.copyOf(unArrayT, (unArrayT.length + 1));
					newArray[0] = elemento;
					unArrayT = newArray;
				}
			}
		}

	}

	public void addLast(T elemento) {
		// chequeo que no sea null, en mi caso no quiero agregarlo, pero podria cambiar
		// de ser necesario
		if (elemento != null) {
			// chequeo que lo que quiero agregar sea del mismo tipo donde lo quiero
			// "guardar"
			if (elemento.getClass().equals(unArrayT.getClass().getComponentType())) {
				if (unArrayT.length > 0) {
					// Veo el ULTIMO valor del Array
					// Si es null asumo que no hay nada agregado a la ULTIMA pos y lo sobre escribo
					if (unArrayT[unArrayT.length - 1] == null) {
						set(unArrayT.length - 1, elemento);
						// unArrayT[0] = elemento;

					} else {
						// Caso contrario creo una copia y le agrego los valores PRE-existentes
						T newArray[] = Arrays.copyOf(unArrayT, (unArrayT.length + 1));
						// Aseguro de meter el ULTIMO elemento en unArrayT.length ya que seria la ultima
						// pos de mi nuevo array
						// unArrayT{0,1,2,3} length 4 ---> newArray[unArrayT.lenght+1] --->
						// {0,1,2,3,null} <- pos length
						newArray[unArrayT.length] = elemento;
						// luego recorro el Array original agregando su contenido en el nuevo array pero
						// con el largo del original
						for (int i = 0; i < unArrayT.length; i++) {
							newArray[i] = unArrayT[i];

						}
						// finalmente lo convierto en el nuevo Array.
						unArrayT = newArray;
					}

				} else {
					// Esto es debatible, si el array existe pero el lenght es 0 creo uno nuevo para
					// poder agregarlo y cumpliria ya que seria el 1º y Ultimo elemento
					T newArray[] = Arrays.copyOf(unArrayT, (unArrayT.length + 1));
					newArray[0] = elemento;
					unArrayT = newArray;
				}
			}
		}

	}

	/**
	 * Este metodo sirve para cargar un Array cuando este vacio Agrega elementos en
	 * la primera posicion disponible (=null) caso de estar lleno lo redimenciona y
	 * llama al metodo addFirst o addLast
	 * 
	 * @param elemento
	 */
	public void add(T elemento) {
		int auxContador = 0;
		boolean agregado = false;
		// chequeo que no sea null para ESTE ejemplo, quizas se pueda borrar
		if (elemento != null) {
			// chequeo que lo que quiero agregar sea del mismo tipo donde lo quiero
			// "guardar"
			if (elemento.getClass().equals(unArrayT.getClass().getComponentType())) {
				do {
					// minetras el aux sea menor al largo del array busco un lugar libre (=null)
					if (auxContador < unArrayT.length) {
						// pregunto si esa posicion es null
						if (unArrayT[auxContador]==null) {
							unArrayT[auxContador] = elemento;
							agregado = true;
						}
							//para poder salir del loop cuando llego al tamaño del array lo agrego llamando
					} else if (auxContador == unArrayT.length) {
						// ya que no hay lugar diponibles lo pongo en alguna posicion ultima o primera
						addLast(elemento);
						// addFirst(elemento);
						agregado = true; // para poder salir del loop
					}
					auxContador++;

				} while (!agregado);
			}
		}
	}

	/**
	 * T remueve el primer elemento indicado y lo retorna
	 *
	 * @param elemento
	 * @return
	 */
	public T remove(T elemento) {
		T algo = null;
		int auxIndex = 0;
		// chequeo que no sea null
		if (elemento != null) {
			// chequeo que lo que quiero BUSCAR sea del mismo tipo donde lo quiero BUSCAR
			if (elemento.getClass().equals(unArrayT.getClass().getComponentType())) {
				// Hago una busqqueda con un For/While
				for (int i = 0; i < unArrayT.length && !(algo == elemento); i++) {
					if (unArrayT[i].equals(elemento)) {
						// si son iguales lo asigno a la variable
						algo = unArrayT[i];
					}

					auxIndex++;
				}
				if (algo.equals(elemento)) {
					// significa que lo encontre entonces utilizo el aux para borrar lo que esta en
					// esa pos
					set(auxIndex-1, null);
					// unArrayT[auxIndex]=null;

				}

			}
		}

		return algo;
	}

	/**
	 * remueve todos los elementos.
	 * 
	 */
	public void removeAll() {
//Acá hay que definir un poco que es lo que hace el removeAll, pone a todos los elementos en Null o crea una lista de 0 length

		// T newArray[] = Arrays.copyOf(unArrayT, 0);
		// unArrayT = newArray;

		// O podria hacer lo siguiente:
		for (int i = 0; i < unArrayT.length; i++) {
			unArrayT[i]=null;
		}
		// mantiene el tamaño de la lista
	}

	/**
	 * Indica si la colección está vacía length == 0 y elementos != null
	 * 
	 * @return
	 */
	public boolean empty() {
		// Acá tmb entra en ambiguedad ya que vacia que significa, que tengo elemento y
		// son distintos de null?
		boolean vacia=false;
		if (0 == unArrayT.length) {
			vacia = true;
		} else {
			for (int i = 0; i < unArrayT.length && vacia; i++) {
				if (unArrayT[i] != null) {
					vacia = false;
				}
			}
		}

		return vacia;

	}

	 //@Override
	   // public String toStringggg() {
	    //    return Arrays.toString(unArrayT);
	    //}

	@Override
	public String toString() {
		return "Lista Collection unArrayT de tipo="+unArrayT.getClass().getCanonicalName() +"\nCon su contenido: "+ Arrays.toString(unArrayT) ;
	}

}