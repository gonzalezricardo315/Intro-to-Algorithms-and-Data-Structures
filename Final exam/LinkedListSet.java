import java.util.Scanner;
import java.io.*;


public class LinkedListSet<AnyType> extends LinkedList<AnyType> {
//	extending the LinkedList class
	
	//constructor
	public LinkedListSet() {
		super();
	}
	
	@Override
	 public void insert(AnyType x, LinkedListIterator<AnyType> p) {
		 //use my method to check if in the array if it isn't already i insert it.
		 if(!this.findX(x)) {
	        super.insert(x, p);
	     }
	 }
	 
	 //making the find method to see if the x is in the linked list 
	 public boolean findX(AnyType x) {
		 //make my iterator
	     LinkedListIterator<AnyType> head = this.first();
	     
	     //loop to go through the linked list if i find it then its true that is in the list if not false
	     while(head.current != null) {
	    	 if(head.current.element == null) {
	    		 return false;
	    	 }
	    	 if(head.current.element.equals(x)) {
	    		 return true;
	    	 }
	    	 head.advance();
	     }
		 return false;
	 }	
	 
	 public static <AnyType> int size(LinkedList<AnyType> l) {
		 LinkedListIterator<AnyType> head;
		 head = l.first();
		 int size = 0;
		 
		 while(head.isValid()) {
			 size++;
			 head.advance();
		 }
		 return size;
	 }
	 
	 //method for union
	 public static <AnyType> LinkedListSet<AnyType> union(LinkedListSet<AnyType> p1, LinkedListSet<AnyType> p2) {
		 LinkedListSet<AnyType> p3 = new LinkedListSet<AnyType>();
		 LinkedListIterator<AnyType> A = p1.first();
		 LinkedListIterator<AnyType> B = p2.first();
		 LinkedListIterator<AnyType> U = p3.zeroth();
		 
		 //going through both sets
		 while(A.isValid()) {
			 p3.insert(A.current.element, U);
			 A.advance();
		 }
		  while(B.isValid()) {
			 p3.insert(B.current.element, U);
			 B.advance();
		 }
		 
		 return p3; 
	 }
	 
	 //method for intersect
	 public static <AnyType> LinkedListSet<AnyType> intersect(LinkedListSet<AnyType> p1, LinkedListSet<AnyType> p2) {
		 LinkedListSet<AnyType> p3 = new LinkedListSet<AnyType>();
		 LinkedListIterator<AnyType> A = p1.first();
		 LinkedListIterator<AnyType> I = p3.zeroth();

		 //check intersect
		 while(A.isValid()) {
			 if(p1.findX(A.current.element) && p2.findX(A.current.element)) {
				 p3.insert(A.current.element, I);
			 }
			 A.advance();
		 }
		 return p3; 
	 }
	 
	 //method for difference
	 public static <AnyType> LinkedListSet<AnyType> difference(LinkedListSet<AnyType> p1, LinkedListSet<AnyType> p2) {
		 LinkedListSet<AnyType> p3 = new LinkedListSet<AnyType>();
		 LinkedListIterator<AnyType> A = p1.first();
		 LinkedListIterator<AnyType> D = p3.zeroth();

		 //check intersect
		 while(A.isValid()) {
			 if(p1.findX(A.current.element) && !p2.findX(A.current.element)) {
				 p3.insert(A.current.element, D);
			 }
			 A.advance();
		 }
		 return p3; 
	 }
	 
	 public static void main(String[] args) {
		try {
			File f = new File("Partial_Book.txt");
			Scanner in = new Scanner(f);
			
			//all sets made. A is words 5 or less
			LinkedListSet<String> A = new LinkedListSet<String>();
			//B is words 5 or greater
			LinkedListSet<String> B = new LinkedListSet<String>();
			//C is words exactly 5
			LinkedListSet<String> C = new LinkedListSet<String>();
			
			//initializing sets to the header position
			LinkedListIterator<String> setA = A.zeroth();
			LinkedListIterator<String> setB = B.zeroth();
			LinkedListIterator<String> setC = C.zeroth();
			
			String w;
			while(in.hasNext()) {
				w = in.next();
				
				//fill sets A, B and C
				if(w.length() <= 5) {
					A.insert(w, setA);
				}
				if(w.length() >= 5) {
					B.insert(w, setB);
				}
				if(w.length() == 5) {
					C.insert(w, setC);
				}
			}
			
			//making the sizes
			System.out.println("Size of set A: " + size(A));
			System.out.println("Size of set B: " + size(B));
			System.out.println("Size of set C: " + size(C));
			
			//test for the union 
			System.out.println("\nTest for Union: ");
			System.out.println("Size of A and B: " + size(union(A, B)));
			System.out.println("Size of A and C: " + size(union(A, C)));
			System.out.println("Size of B and C: " + size(union(B, C)));
			
			//test for the intersect
			System.out.println("\nTest for Intersect: ");
			System.out.println("Size of A and B: " + size(intersect(A, B)));
			System.out.println("Size of A and C: " + size(intersect(A, C)));
			System.out.println("Size of B and C: " + size(intersect(B, C)));
			
			//test for the difference
			System.out.println("\nTest for Difference: ");
			System.out.println("Size of A and B: " + size(difference(A, B)));
			System.out.println("Size of B and A: " + size(difference(B, A)));
			System.out.println("Size of A and C: " + size(difference(A, C)));
			System.out.println("Size of C and A: " + size(difference(C, A)));
			System.out.println("Size of B and C: " + size(difference(B, C)));
			System.out.println("Size of C and B: " + size(difference(C, B)));
			
		}catch(Exception bs) {
			System.out.println(bs);
		}
	}
	 
}
