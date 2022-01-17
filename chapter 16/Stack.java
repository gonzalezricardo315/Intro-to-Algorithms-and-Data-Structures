//package weiss.nonstandard;

// Stack interface
//
// ******************PUBLIC OPERATIONS*********************
// void push( x )         --> Insert x
// void pop( )            --> Remove most recently inserted item
// AnyType top( )         --> Return most recently inserted item
// AnyType topAndPop( )   --> Return and remove most recent item
// boolean isEmpty( )     --> Return true if empty; else false
// void makeEmpty( )      --> Remove all items
// ******************ERRORS********************************
// top, pop, or topAndPop on empty stack

/**
 * Protocol for stacks.
 * @author Mark Allen Weiss
 */
public interface Stack<AnyType>
{
    /**
     * Insert a new item into the stack.
     * @param x the item to insert.
     */	
	
    void    push( AnyType x );

    /**
     * Remove the most recently inserted item from the stack.
     * @exception UnderflowException if the stack is empty.
     */
    void    pop( );
    
    /**
     * Get the most recently inserted item in the stack.
     * Does not alter the stack.
     * @return the most recently inserted item in the stack.
     * @exception UnderflowException if the stack is empty.
     */
    AnyType  top( );


    /**
     * Return and remove the most recently inserted item
     * from the stack.
     * @return the most recently inserted item in the stack.
     * @exception UnderflowException if the stack is empty.
     */
    AnyType  topAndPop( );
    
    /**
     * Test if the stack is logically empty.
     * @return true if empty, false otherwise.
     */
    boolean isEmpty( );

    /**
     * Make the stack logically empty.
     */
    void    makeEmpty( );
    
    public static int[] ranArray(int size) {
    	int [] a = new int[size];
    	for(int i = 0; i < a.length; i++) {
    	a[i] = (int)(Math.random()*Integer.MAX_VALUE/2);
    	}
    	return a;
    	}
    
    public static void main(String args[]) {
    	
    	//fill array with 100 random numbers
    	int[] a100;
    	a100 = ranArray(100);
    	int[] a1000;
    	a1000 = ranArray(1000);
    	int[] a10000;
    	a10000 = ranArray(10000);
    	int[] a100000;
    	a100000 = ranArray(100000);
    	
    	ArrayStack as = new ArrayStack();
    	ListStack ls = new ListStack();
    	
    	//array100
    	long startTime = System.nanoTime(); 
    	for(int i = 0; i < a100.length; i++) {
    		as.push(a100[i]);
    	}
    	for(int j = 0; j < a100.length; j++) {
    		as.pop();
    	}
    	long endTime   = System.nanoTime();
    	long totalTime = endTime - startTime;
    	System.out.println(totalTime);
    	
    	//array1000
    	startTime = System.nanoTime(); 
    	for(int i = 0; i < a1000.length; i++) {
    		as.push(a1000[i]);
    	}
    	for(int j = 0; j < a1000.length; j++) {
    		as.pop();
    	}
    	 endTime   = System.nanoTime();
    	 totalTime = endTime - startTime;
    	System.out.println(totalTime);
    	
    	//array10000
    	startTime = System.nanoTime(); 
    	for(int i = 0; i < a10000.length; i++) {
    		as.push(a10000[i]);
    	}
    	for(int j = 0; j < a10000.length; j++) {
    		as.pop();
    	}
    	 endTime   = System.nanoTime();
    	 totalTime = endTime - startTime;
    	System.out.println(totalTime);
    	
    	//array100000
    	startTime = System.nanoTime(); 
    	for(int i = 0; i < a100000.length; i++) {
    		as.push(a100000[i]);
    	}
    	for(int j = 0; j < a100000.length; j++) {
    		as.pop();
    	}
    	 endTime   = System.nanoTime();
    	 totalTime = endTime - startTime;
    	System.out.println(totalTime);
    	
    	//array100
    	startTime = System.nanoTime(); 
    	for(int i = 0; i < a100.length; i++) {
    		ls.push(a100[i]);
    	}
    	for(int j = 0; j < a100.length; j++) {
    		ls.pop();
    	}
    	 endTime   = System.nanoTime();
    	 totalTime = endTime - startTime;
    	System.out.println(totalTime);
    	
    	//array1000
    	startTime = System.nanoTime(); 
    	for(int i = 0; i < a1000.length; i++) {
    		ls.push(a1000[i]);
    	}
    	for(int j = 0; j < a1000.length; j++) {
    		ls.pop();
    	}
    	 endTime   = System.nanoTime();
    	 totalTime = endTime - startTime;
    	System.out.println(totalTime);
    	
    	//array10000
    	startTime = System.nanoTime(); 
    	for(int i = 0; i < a10000.length; i++) {
    		ls.push(a10000[i]);
    	}
    	for(int j = 0; j < a10000.length; j++) {
    		ls.pop();
    	}
    	 endTime   = System.nanoTime();
    	 totalTime = endTime - startTime;
    	 System.out.println(totalTime);
    	 
    	//array100000
     	startTime = System.nanoTime(); 
     	for(int i = 0; i < a100000.length; i++) {
     		ls.push(a100000[i]);
     	}
     	for(int j = 0; j < a100000.length; j++) {
     		ls.pop();
     	}
     	 endTime   = System.nanoTime();
     	 totalTime = endTime - startTime;
     	 System.out.println(totalTime);
   }
}