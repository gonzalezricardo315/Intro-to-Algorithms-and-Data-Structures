// Basic node stored in unbalanced binary search trees
// Note that this class is not accessible outside
// of this package.

class BinaryNode<AnyType>
{
        // Constructor
    BinaryNode( AnyType theElement )
    {
        element = theElement;
        left = right = null;
    }

      // Data; accessible by other package routines
    AnyType             element;  // The data in the node
    BinaryNode<AnyType> left;     // Left child
    BinaryNode<AnyType> right;    // Right child
    
    
    @Override
    public String toString() {
    	if(left == null && right == null) {
    		return element.toString(); 
    	}
    	if(left == null) {
    		return element.toString() + right.toString();
    	}
    	if(right == null) {
    		return left.toString() + element.toString();
    	}
    	else {
    		return left.toString() + element.toString() + right.toString();
    	}
    }
    
    //TODO:  Override, and implement the toString method properly
    //In-order tree traversal
    //recursive
    
    
    public static void main(String [] args) {
    	BinarySearchTree<Integer> b = new BinarySearchTree<Integer>();
    	//Top
    	b.insert(4);

    	//Row 1
    	b.insert(2);
    	b.insert(6);

    	//Row 2
    	b.insert(1);
    	b.insert(3);
    	b.insert(5);
    	b.insert(7);

    	System.out.println("Tree B shows '" + b.toString() + "'");
    	
    	BinarySearchTree<Integer> c = new BinarySearchTree<Integer>();
    	//Top
    	c.insert(4);

    	//Row 1
    	c.insert(2);
    	c.insert(6);

    	//Row 2
    	c.insert(1);
    	c.insert(3);
    	c.insert(7);

    	System.out.println("Tree B shows '" + c.toString() + "'");
    	
    	BinarySearchTree<Integer> d = new BinarySearchTree<Integer>();
    	//Top
    	d.insert(4);

    	d.insert(6);

    	//Row 2
    	d.insert(3);
    	d.insert(7);

    	System.out.println("Tree B shows '" + d.toString() + "'");
    }
}
