package packException;

public class cantDeleteException extends Exception {
	public cantDeleteException () {}
	public cantDeleteException (String msjError) {
		super(msjError);
	}
	/* @throws UnsupportedOperationException if the {@code remove} operation
     *         is not supported by this map
     * @throws ClassCastException if the key is of an inappropriate type for
     *         this map
     * (<a href="{@docRoot}/java.base/java/util/Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException if the specified key is null and this
     *         map does not permit null keys
     * (<a href="{@docRoot}/java.base/java/util/Collection.html#optional-restrictions">optional</a>)
     */
	

}