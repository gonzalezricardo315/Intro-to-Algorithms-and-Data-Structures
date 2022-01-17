// MemoryCell class
//  AnyType read( )         -->  Returns the stored value
//  void write( AnyType x ) -->  x is stored

public class GenericMemoryCell<AnyType extends Comparable<? super AnyType>> implements Comparable<GenericMemoryCell>
{
        // Public methods
    public AnyType read( )         { return storedValue; }
    public void write( AnyType x ) { storedValue = x; }

    public int compareTo(GenericMemoryCell mem) {
    	return storedValue.compareTo((AnyType) mem.read());
    }
        // Private internal data representation
    private AnyType storedValue;


public static void main( String [ ] args ){
	GenericMemoryCell<Integer> s1 = new GenericMemoryCell<Integer>();
	GenericMemoryCell<Integer> s2 = new GenericMemoryCell<Integer>();
	
	s1.write(23);
	s2.write(3);
	
	System.out.println(s1.compareTo(s2));
}
}