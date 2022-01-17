public class Square extends Shape implements Comparable<Square> {
	
    double side;
    
	 public Square(double side, double posx, double posy) {
		 super(posx, posy);
		if(side < 0 ) {
    		throw new IllegalArgumentException ("cant be negative");
    	}
      	this.side = side;
    }
     
    public double area( )
    {
        return side * side;
    }
    
    public double perimeter( )
    {
        return 2 * ( side + side );
    }
    
    public String toString( )
    {
    return "Square: " + side;
    }
    
    public double getSide( )
    {
        return side;
    }
    
 
    
    @Override
    public int compareTo(Square other){
    	if(this.side == other.side) {
    		return 0;
    	}
    	else if(this.side > other.side) {
    		return 1;
    	}
    	else if(this.side < other.side) {
    		return -1;
    	}
		return 0;
    }
}
