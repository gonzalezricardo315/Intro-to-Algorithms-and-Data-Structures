public class Circle extends Shape implements Comparable<Circle>
{
    public Circle(double rad, double posx, double posy)
    { 
    	super(posx, posy);
    	if(rad < 0) {
    		throw new IllegalArgumentException ("cant be negative");
    	}
        radius = rad;
    }
    
    public double area( )
    {
        return Math.PI * radius * radius;
    }
    
    public double perimeter( )
    {
        return 2 * Math.PI * radius;
    }
    
    public String toString( )
    {
        return "Circle: " + radius;
    }
    
    @Override
    public int compareTo(Circle other){
    	if(this.radius == other.radius) {
    		return 0;
    	}
    	else if(this.radius > other.radius) {
    		return 1;
    	}
    	else if(this.radius < other.radius) {
    		return -1;
    	}
		return 0;
    }
    
    double radius;
}
