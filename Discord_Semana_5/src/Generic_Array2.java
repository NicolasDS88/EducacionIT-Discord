import java.lang.reflect.Array;  

public class Generic_Array2<E> {  
    private E[] x;  

    public Generic_Array2(Class<E[]> cla, int len) {  //recibo por parametro un ARRAY de tipo E
        x = cla.cast(Array.newInstance(cla.getComponentType(), len));  
    }  

    public static void main(String[] args) {  
        Generic_Array2<String> foo = new Generic_Array2<String>(String[].class, 1);  
        String[] bar = foo.x;  
        foo.x[0] = "xyzzy";  
        String baz = foo.x[0];  
    }  
}